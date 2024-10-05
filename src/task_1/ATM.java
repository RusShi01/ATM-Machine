package task_1;

public class ATM {
	private int balance;
	private int pin;
	
	public ATM(int balance, int pin) {
		this.balance = balance;
		this.pin = pin;
	}
	
	public void displayOptions () {
		System.out.println("1: Check_balance: ");
		System.out.println("2: Deposit: ");
		System.out.println("3: Withdraw: ");
		System.out.println("4: Change_pin: ");
		System.out.println("5: Exit: ");
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void Withdraw(int amount) {
		if(balance < amount) {
			System.out.println("Insufficient balance");
			return;
		}
		balance -= amount;
	}
	
	public int getbalance() {
		return balance;
	}
	
	public boolean validatePin(int pin) {
		return this.pin == pin;
	}
	
	public void changePin (int newPin) {
		pin = newPin;
	}	
	
	public String Exit(){
		return Exit();
	}
	public static void main(String[] args) {
		ATM atm = new ATM(10000, 817467);
		System.out.println("Enter the pin: ");
		int pin = Integer.parseInt(System.console().readLine());
		if(atm.validatePin(pin)) {
			int option = 0;
			while(option != 5) {
				atm.displayOptions();
				option =  Integer.parseInt(System.console().readLine());
				
				switch (option) {
				case 1:
					System.out.println("Balance: "+atm.getbalance());
					break;
					
				case 2:
					System.out.print("EnterAmount: ");
					int amount = Integer.parseInt(System.console().readLine());
					atm.deposit(amount);
					break;
					
				case 3:
					System.out.print("EnterAmount: ");
					amount = Integer.parseInt(System.console().readLine());
					atm.Withdraw(amount);
					break;
					
				case 4:
					System.out.println("Enter New Pin: ");
					int newPin = Integer.parseInt(System.console().readLine());
					atm.changePin(newPin);
					break;
					
				case 5:
					System.out.println("Thank You for using ATM, Visit again");
					break;
					
				default:
					break;
				}	
			}
		}
		else {
			System.out.println("You have entered Invalid Pin");
		}
	}
}
