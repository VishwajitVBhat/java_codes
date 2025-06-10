package bank_management;

class Bank {
    private double AccNo;
    String ACC_HolderName;
    private double initBal;
    private int pin;
    String Email;
	public double getAccNo() {
		return AccNo;
	}
	public void setAccNo(double accNo) {
		AccNo = accNo;
	}
	public double checkBalance() {
		return initBal;
	}
	public void setInitBal(double Bal) {
		this.initBal = Bal;
	}
	public int getPin() {
		return pin;
	}
	public void Changpin(int newpin) {
		pin = newpin;
	}
	
	double deposit(double ammont,double acc_no, int pin) {
		if (acc_no==getAccNo() && pin==getPin()){
		double a=checkBalance();
		a+=ammont;
		setInitBal(a);
		System.out.print("ammount is deposited /n balance is:");
		return checkBalance();
		}
		else {
			System.out.print("ammount not deposited /n balance is:");
			return checkBalance();
		}
	}
	
	double withdrow(double ammont,double acc_no, int pin) {
		if (acc_no==getAccNo() && pin==getPin()){
		  double a=checkBalance();
			if(a>ammont){
			a-=ammont;
			setInitBal(a);
			System.out.print("updated balence is: ");
			return checkBalance() ;
			}
			else {
				System.out.print("ammount withdrow is not possibal /n not suficent balance /n balance: " );
			return checkBalance();
			}
		}
		else {
			System.out.print("enter write account numbar and pin ");
			return 0;
		}
	  
	}
	
	
    
}
public class Main {

}
