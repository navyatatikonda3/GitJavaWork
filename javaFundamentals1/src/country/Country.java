package country;



public class Country {
	private String countryName;
	private Currency currency;
	Country()
	{
		
	}
	
	//constructor overloading
	public Country(String countryName,Currency currency)
	{
		super();
		this.countryName=countryName;
		this.currency =currency;
	}
	@Override
	public String toString()
	{
		return countryName +"" +currency;
	}

}
