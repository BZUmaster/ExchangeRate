using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Web.Services.Protocols;

namespace CurrencyConvertorClient
{
   
    public class CustomSoapExtension : SoapExtension
    {

        public override Stream ChainStream(Stream stream)
        {
            _oldStream = stream;
            _newStream = new MemoryStream();
            return _newStream;
        }
        public override object GetInitializer(LogicalMethodInfo methodInfo, SoapExtensionAttribute attribute)
        {
            return null;
        }

        public override object GetInitializer(Type serviceType)
        {
            return null;
        }

        public override void Initialize(object initializer)
        {
            _filename = "SoapTrace.txt";
        }

        public override void ProcessMessage(SoapMessage message)
        {

            switch (message.Stage)
            {
                case SoapMessageStage.BeforeSerialize:
                    break;
                case SoapMessageStage.AfterSerialize:
                    WriteOutput(message);
                    break;
                case SoapMessageStage.BeforeDeserialize:
                    WriteInput(message);
                    break;
                case SoapMessageStage.AfterDeserialize:
                    break;
                default:
                    throw new Exception("invalidstage");
            }

        }

        private Stream _oldStream;
        private Stream _newStream;
        private string _filename;
        public void WriteOutput(SoapMessage message)
        {

            _newStream.Position = 0;
            FileStream fs = new FileStream(_filename, FileMode.Append, FileAccess.Write);
            StreamWriter w = new StreamWriter(fs);
            string soapString = (message is SoapServerMessage) ? "SoapResponse" : "SoapRequest";
            w.WriteLine("-----" + soapString + " at " + DateTime.Now);
            w.Flush();
            Copy(_newStream, fs);
            w.Close();
            _newStream.Position = 0;
            Copy(_newStream, _oldStream);
        }

        public void WriteInput(SoapMessage message)
        {
            Copy(_oldStream, _newStream);
            FileStream fs = new FileStream(_filename, FileMode.Append, FileAccess.Write);
            StreamWriter w = new StreamWriter(fs);
            string soapString = (message is SoapServerMessage) ? "SoapRequest" : "SoapResponse";
            w.WriteLine("-----" + soapString + " at " + DateTime.Now);
            w.Flush();
            _newStream.Position = 0;
            Copy(_newStream, fs);
            w.Close();
            _newStream.Position = 0;
        }

        private void Copy(Stream from, Stream to)
        {
            TextReader reader = new StreamReader(from);
            TextWriter writer = new StreamWriter(to);
            var cnt = reader.ReadToEnd();
            writer.WriteLine(cnt);
            writer.Flush();
        }

       
    }


    [AttributeUsage(AttributeTargets.Method)]
    public class CustomSoapExtensionAttribute : SoapExtensionAttribute
    {
        public override Type ExtensionType
        {
            get { return typeof(CustomSoapExtension); }
        }

        public override int Priority { get; set; }
    }


}
