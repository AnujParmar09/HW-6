package inheritence;
public class ForeignStockHolding extends StockHolding
{
	float conversionRate;
	
	ForeignStockHolding(float pp, float cp, int n, String name, float Rate) 
	{
		super(pp, cp, n, name);
		conversionRate = Rate;
	}
	
	float costInDollars()
	{
		return conversionRate*purchaseSharePrice*numberOfShares;
	}
	
	float valueInDollars()
	{
		return conversionRate*currentSharePrice*numberOfShares;
	}
	
	
}



