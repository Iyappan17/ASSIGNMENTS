package bank;

public class AxisBank extends BankInfo {
 public void deposit() {
	 System.out.println(" 500000");
 }
 public static void main(String[] args) {
	AxisBank bank=new AxisBank();
	bank.deposit();
	bank.fixed();
	bank.saving();
}
}
