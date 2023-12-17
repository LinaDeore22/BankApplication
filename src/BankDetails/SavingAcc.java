package BankDetails;
public abstract class SavingAcc extends BankAcc{
   private boolean isSalaried;
   static final float MINBAL = 3000.0f;
public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal);
	this.isSalaried = isSalaried;
}
	public boolean isSalaried() {
		return isSalaried;
		
	}
	@Override
	public abstract void withdraw(float amount);
	@Override
	public String toString() {
		return "SavingAcc ["+super.toString()+" isSalaried=" + isSalaried + "]";
	}
	
	}
	

