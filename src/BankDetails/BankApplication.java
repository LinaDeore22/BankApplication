package BankDetails;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankFactory bankfactory = new MMBankFactory();
SavingAcc savingacc = new MMSavingAcc(123,"Lina",20000,true);
CurrentAcc currentacc=new MMCurrentAcc(123,"Neha",30000,30000);
savingacc.withdraw(1000);
currentacc.withdraw(3000);

System.out.println(savingacc.toString());
System.out.println(currentacc.toString());
	}

}
