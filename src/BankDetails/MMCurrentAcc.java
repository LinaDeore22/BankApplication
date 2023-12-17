package BankDetails;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(getAccBal() + getCreditLimit()>=amount) {
			setAccBal(getAccBal()- amount);
		}else {
			System.out.println("Withdrawal amount not available ");
		}
	}



	@Override
	public String toString() {
		return super.toString();
	}


		
	}


	



