package BankDetails;

public abstract class CurrentAcc extends BankAcc {
private final float creditLimit;

public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal);
	this.creditLimit = creditLimit;
}

public float getCreditLimit() {
	return creditLimit;
}

@Override
public String toString() {
	return "CurrentAcc ["+super.toString()+",creditLimit=" + creditLimit + "]";
}

}


