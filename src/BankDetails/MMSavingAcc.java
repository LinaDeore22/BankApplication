package BankDetails;

 class MMSavingAcc extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	private static  float MINBAL = 4328.0f;

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(getAccBal() - amount >= MINBAL) {
			setAccBal(getAccBal() - amount);
		}else {
			System.out.println("Insufficient Balanced for withdraw..");
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
	
