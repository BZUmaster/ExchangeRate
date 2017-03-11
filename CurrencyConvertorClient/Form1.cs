using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CurrencyConvertorClient
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnConvert_Click(object sender, EventArgs e)
        {
            try
            {
                cloud.bzu.Currency res;

                if (!Enum.TryParse<cloud.bzu.Currency>(txtFrom.Text, out res))
                    throw new ArgumentException("Please Fill a Valid Currency Simbole");
                if (!Enum.TryParse<cloud.bzu.Currency>(txtTo.Text, out res))
                    throw new ArgumentException("Please Fill a Valid Currency Simbole");


                var service = new cloud.bzu.ExService();
                var currencies = new cloud.bzu.currencies
                {
                    FromCurrency = (cloud.bzu.Currency)Enum.Parse(typeof(cloud.bzu.Currency), txtFrom.Text),
                    ToCurrency = (cloud.bzu.Currency)Enum.Parse(typeof(cloud.bzu.Currency), txtTo.Text)
                };
                var result = service.CalculateExRate(currencies);
                lblRate.Text = txtFrom.Text + "->" + txtTo.Text + "=" + result.ToString(CultureInfo.InvariantCulture);

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void btnReflect_Click(object sender, EventArgs e)
        {
            var tmp = txtTo.Text;
            txtTo.Text = txtFrom.Text;
            txtFrom.Text = tmp;
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            if (File.Exists("SoapTrace.txt"))
            {
                Process.Start("SoapTrace.txt");
            }

        }
    }
}
