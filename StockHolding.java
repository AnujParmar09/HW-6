package inheritence;
class StockHolding
{
	float purchaseSharePrice, currentSharePrice;
	int numberOfShares;
	String companyName;
	
	StockHolding(float pp, float cp, int n, String name)
	{
		purchaseSharePrice = pp;
		currentSharePrice = cp;
		numberOfShares = n;
		companyName = name;
	}
	
	float costInDollars()
	{
		return purchaseSharePrice*numberOfShares;
	}
	
	float valueInDollars()
	{
		return currentSharePrice*numberOfShares;
	}
}



