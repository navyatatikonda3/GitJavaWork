package country;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

enum money {Rupee,Dollar,Yen,Dinar,Euro }

class Currency
{
	int currency;
	String countryName;
	money currencyType;
	money indianCurrency = money.Rupee;
	money usCurrency = money.Dollar;
	money kuwaitCurrency = money.Dinar;
	Currency(){
		
	}
	Currency(money currencyType)
	{
		this.currencyType=currencyType;
	}
	public String toString()
	{
		return "Currency is" +currencyType;
	}
	
	
}

public class EnumDemo {

	public static void main(String[] args) {
		
	  Map<String,Currency> countries = new HashMap<String,Currency>();
	  List<Country> countrylist = new ArrayList<Country>();
	  countries.put("India", new Currency(money.Rupee));
	  countries.put("USA", new Currency(money.Dollar));
	  countries.put("Kuwait", new Currency(money.Dinar));
	  
	  for(Map.Entry<String, Currency>country :countries.entrySet())
         {
	         System.out.println(country.getKey() +country.getValue());
	         countrylist.add(new Country(country.getKey(),country.getValue()));
          }
	  
	  
	  

	}

}
