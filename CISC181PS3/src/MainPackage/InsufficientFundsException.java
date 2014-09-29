package MainPackage;

//InsufficientFundsException class
public class InsufficientFundsException extends Exception 
{
	//Constructing an amount
	   public double amount;
	   
	   public InsufficientFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   
	   public double getAmount()
	   {
	      return amount;
	   }
	 }


