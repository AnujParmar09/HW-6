package inheritence;
import java.util.*;

public class Stock 
{
	//display StockHolding in ascending order
	static void displayAscending(StockHolding array[])
	{
		//selection sorting
		for(int i=0; i<array.length; i++)
		{
			
			StockHolding sh;
			for(int j=i+1; j<array.length; j++)
			{
			
				if((array[j].companyName.compareTo(array[i].companyName)) < 0)
				{
					sh = array[j];
					array[j]=array[i];
					array[i]=sh;
				}
			}
		}
		
		
		System.out.println("Display of stock in ascending order by name : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println();
		}
		
	}
	
	// display ForeignStockHolding in decending order
	static void displayDescending(ForeignStockHolding array[])
	{
		//selection sort
		for(int i=0; i<array.length; i++)
		{
			ForeignStockHolding fsh;
			for(int j=i+1; j<array.length; j++)
			{
				
				if((array[j].companyName.compareTo(array[i].companyName)) > 0)
				{
				     fsh = array[j];
					array[j]=array[i];
					array[i]=fsh;
				}
			}
		}
		
		
		System.out.println("Display of stock in descending order by name : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate : "+array[i].conversionRate);
			System.out.println();
		}
		
	}
	
	// display ForeignStockHolding in ascending order
	static void displayAscending(ForeignStockHolding array[])
	{
		//selection sort
		for(int i=0; i<array.length; i++)
		{
			ForeignStockHolding fsh;
			for(int j=i+1; j<array.length; j++)
			{
				
				if((array[j].companyName.compareTo(array[i].companyName)) < 0)
				{
					fsh = array[j];
					array[j]=array[i];
					array[i]=fsh;
				}
			}
		}
		
		
		System.out.println("Display of stock in ascending order by name : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate : "+array[i].conversionRate);
			System.out.println();
		}
		
	}	
	
	//display minimum value stock
	static void displayMinValue (ForeignStockHolding array[])
	{
		
		ForeignStockHolding fsh = array[0];
		
		//traversing the array to find the min value stock
		for(int i=1; i<array.length; i++)
		{
			if(fsh.valueInDollars() > array[i].valueInDollars())
			{
				fsh = array[i];
			}
		}
		
		//printing the minimum value stock
		System.out.println("Minimum Value Stock :");
		System.out.println("Company Name : "+fsh.companyName);
		System.out.println("Purchase Share Price : "+fsh.purchaseSharePrice);
		System.out.println("Current Share Price : "+fsh.currentSharePrice);
		System.out.println("Number of Shares : "+fsh.numberOfShares);
		System.out.println("Conversion Rate : "+fsh.conversionRate);
		System.out.println();
	}
	
	static void displayMaxValue (ForeignStockHolding array[])
	{
		
		ForeignStockHolding max = array[0];
		
		//traversing the array to find the max value stock
		for(int i=1; i<array.length; i++)
		{
			if(max.valueInDollars() < array[i].valueInDollars())
			{
				max = array[i];
			}
		}
		
		//printing the maximum value stock
		System.out.println("Maximum Value Stock :");
		System.out.println("Company Name : "+max.companyName);
		System.out.println("Purchase Share Price : "+max.purchaseSharePrice);
		System.out.println("Current Share Price : "+max.currentSharePrice);
		System.out.println("Number of Shares : "+max.numberOfShares);
		System.out.println("Conversion Rate : "+max.conversionRate);
		System.out.println();
	}
	
	static void displayMaxProfitableStock(ForeignStockHolding array[])
	{
		
		ForeignStockHolding p= array[0];
		
		//traversing the array to find the max profitable stock
		for(int i=1; i<array.length; i++)
		{
			if((p.valueInDollars()-p.costInDollars()) < (array[i].valueInDollars()-array[i].costInDollars()))
			{
				p= array[i];
			}
		}
		
		//printing the maximum profitable stock
		System.out.println("Maximum Profitable Stock :");
		System.out.println("Company Name : "+p.companyName);
		System.out.println("Purchase Share Price : "+p.purchaseSharePrice);
		System.out.println("Current Share Price : "+p.currentSharePrice);
		System.out.println("Number of Shares : "+p.numberOfShares);
		System.out.println("Conversion Rate : "+p.conversionRate);
		System.out.println();
	}
	
	static void displayMinProfitableStock(ForeignStockHolding array[])
	{
		
		ForeignStockHolding min = array[0];
		
		
		for(int i=1; i<array.length; i++)
		{
			if((min.valueInDollars()-min.costInDollars()) > (array[i].valueInDollars()-array[i].costInDollars()))
			{
				min = array[i];
			}
		}
		
		//printing the minimum profitable stock
		System.out.println("Minimum Profitable Stock :");
		System.out.println("Company Name : "+min.companyName);
		System.out.println("Purchase Share Price : "+min.purchaseSharePrice);
		System.out.println("Current Share Price : "+min.currentSharePrice);
		System.out.println("Number of Shares : "+min.numberOfShares);
		System.out.println("Conversion Rate : "+min.conversionRate);
		System.out.println();
	}
	
	static void displayInSortedValueOrder (ForeignStockHolding array[])
	{
		//selection sort
		for(int i=0; i<array.length; i++)
		{
			ForeignStockHolding temp;
			for(int j=i+1; j<array.length; j++)
			{
				
				if(array[j].valueInDollars() < array[i].valueInDollars())
				{
					temp = array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		
		
		System.out.println("Display of stock in ascending order by value : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate : "+array[i].conversionRate);
			System.out.println();
		}		
	}
	
	public static void main (String[] args)
	{
		//array of StockHolding
				StockHolding stockHoldingArray[] = new StockHolding[3];
				stockHoldingArray[0] = new StockHolding((float)2.30, (float)4.50, (int)40, "anuj limited");
		             stockHoldingArray[1] = new StockHolding((float)12.19, (float)10.56, (int)90, "anurag Pvt Limited");
				stockHoldingArray[2] = new StockHolding((float)45.10, (float)49.51, (int)210, "pankush Limited");
				
		            //function to display in alphabetical order
				displayAscending(stockHoldingArray);
				 
		            //array of ForeignStockHolding
				ForeignStockHolding foreignStockHoldingArray[] = new ForeignStockHolding[3];
				foreignStockHoldingArray[0] = new ForeignStockHolding((float)2.30, (float)4.50, (int)40, "anuj limited", (float)0.94);
				foreignStockHoldingArray[1] = new ForeignStockHolding((float)12.19, (float)10.56, (int)90, "anurag Pvt Limited", (float)1.10);
				foreignStockHoldingArray[2] = new ForeignStockHolding((float)45.10, (float)49.51, (int)210, "pankush Limited", (float)1.25);
				

		//function to display in reverse alphabetical order
		displayDescending(foreignStockHoldingArray);
		
		
		//modifying the application according to the user 
		
		//taking  input of the no of stock from user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter no of stocks(not more than 8) : ");
		
		//no of stock user want to access
		int noOfStocks = input.nextInt();
		
		 
		ForeignStockHolding userStockHoldingArray[] = new ForeignStockHolding[noOfStocks];
		
		for(int i=0; i<noOfStocks; i++)
		{
			//to take the type of stock user want to enter
			int typeOfStock;
			
			System.out.print("Press 1 for StockHolding \n 2 for ForeignStockHolding \n");
			
			//taking  input of the type of stock
			typeOfStock = input.nextInt();
			
			
			float purchasePrice,currentPrice, conRate;
			
		
			int noOfShare;
			
			
			String cname;
			
			//taking input from user for each field specified in stock
			System.out.print("Enter the purchaseSharePrice for stock : ");
			purchasePrice = input.nextFloat();
			System.out.print("Enter the currentSharePrice for stock : ");
			currentPrice = input.nextFloat();
			System.out.print("Enter the noOfShares for stock : ");
			noOfShare = input.nextInt();
			System.out.print("Enter the companyName for stock : ");
			cname = input.next();
			
			//if the stock is of type StockHolding then conversion rate is 1 else take input from user
			if(typeOfStock == 1)
			{
				conRate = 1;
			}
			else 
			{
				System.out.print("Enter the conversion Rate for foreign stock");
				conRate = input.nextFloat();
			}
			
			
			userStockHoldingArray[i] = new ForeignStockHolding(purchasePrice, currentPrice, noOfShare, cname, conRate);
		}
		
		
		boolean value = true;
		
		//continue until user wants
		while(value)
		{
			System.out.println("Enter your choice : \n    1) Print stock information with the lowest value\r\n" + 
					"    2) Printstock with the highest value\r\n" + 
					"    3) rint the most profitable stock\r\n" + 
					"    4) Print the least profitable stock\r\n" + 
					"    5) Sort stocks by company name (A-Z)\r\n" + 
					"    6) List  stocks sorted in increasing order\r\n" + 
					"    7) Exit");
			
			//variable to take choice of user
			int choice = input.nextInt();
			
			switch(choice)
			{
				case 1: 
				{
					displayMinValue(userStockHoldingArray);
					break;
				}
				case 2:
				{
					displayMaxValue(userStockHoldingArray);
					break;
				}
				case 3:
				{
					displayMaxProfitableStock(userStockHoldingArray);
					break;
				}
				case 4:
				{
					displayMinProfitableStock(userStockHoldingArray);
					break;
				}
				case 5:
				{
					displayAscending(userStockHoldingArray);
					break;
				}
				case 6:
				{
					displayInSortedValueOrder(userStockHoldingArray);
					break;
				}
				case 7:
				{
					value = false;
				}
			}
			
		}
	
		System.out.println("OVER");
	
	input.close();
	}

}



