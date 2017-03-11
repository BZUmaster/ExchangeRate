package cloud.bzu.ExProj.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CurrenyRates {

	static double getExchangeRate(String base, String to) {
        
		URL oracle;
		String out ="";
		if(base.equals(to)) {
			return 1;
		}
		try {
			oracle = new URL("http://api.fixer.io/latest?base=" + base);

			BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null)
				out+= inputLine;
			in.close();
			System.out.println(out);
			String result = out.split("\"" + to + "\":")[1].split(",")[0];
			System.out.println(result);
			return Double.parseDouble(result);
			
		} catch (Exception e) {
			
		}  
		
		
		return getValueFromDefault(   base,   to ) ;
	}

	static double getValueFromDefault( String base, String to ) {
		if (base == "USD"){
			return Double.parseDouble( defaultValues.split("\"" + to + "\":")[1].split(",")[0]);
		}
		else {
			double  baseVal =  Double.parseDouble( defaultValues.split("\"" + base + "\":")[1].split(",")[0]);
			double  toVal = Double.parseDouble( defaultValues.split("\"" + to + "\":")[1].split(",")[0]) ;
			 
			return toVal/baseVal;
		
		}
	}
	public static void main(String[] args) {
		double rate = getExchangeRate("JPY","ILS");
		System.out.println(rate);

	}
	static String defaultValues = "{\"AUD\":1.3311,\"BGN\":1.8537,\"BRL\":3.169,\"CAD\":1.3527,\"CHF\":1.015,\"CNY\":6.9104,\"CZK\":25.61,\"DKK\":7.0455,\"GBP\":0.82128,\"HKD\":7.7669,\"HRK\":7.0431,\"HUF\":294.89,\"IDR\":13398.0,\"ILS\":3.6905,\"INR\":66.724,\"JPY\":114.63,\"KRW\":1158.6,\"MXN\":19.787,\"MYR\":4.4547,\"NOK\":8.5734,\"NZD\":1.4479,\"PHP\":50.343,\"PLN\":4.0917,\"RON\":4.3123,\"RUB\":59.34,\"SEK\":9.0536,\"SGD\":1.4203,\"THB\":35.34,\"TRY\":3.7535,\"ZAR\":13.267,\"USD\":1,\"EUR\":0.94778,}}";


}
