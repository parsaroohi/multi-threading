package os_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public ArrayList<Integer> customers=
			new ArrayList<Integer>();
	
	public ArrayList<Integer> bosses=
			new ArrayList<Integer>();
	
	private int id;
	private String name_of_bank;
	public Client(int id) {
		this.setId(id);
	}
	
	public void Client_ID_Checker(int id) {
		Scanner scanner=new Scanner(System.in);
		int bnk=0;
		int cmd=0;
		System.out.println("Which bank do you have account?\n"
				+ "1. Royal Bank Canada"
				+ "2. GP Morgan USA"
				+ "3. American Express"
				+ "4. National Bank Australia"
				+ "Please enter a number:");
		bnk=scanner.nextInt();
		if(bnk==1) {
			System.out.println("Welcome to {Royal Bank Canada}"
					+ "Please enter your ID if you already have an account here:");
			if(customers.contains(id)) {
				System.out.println("What do you want?\n"
						+ "1. Open an account\n"
						+ "2. Withdrawal\n"
						+ "3. Deposit money\n"
						+ "Please enter a number:");
				cmd=scanner.nextInt();
			}
		}
		
		if(customers.contains(id)) {
			System.out.println("Welcome to your Bank");
		}
	}

	
	public void Bank_Services(int cmd){
		Employee emp=new Employee(name_of_bank);
		if(cmd==1) {
			System.out.println("Opening an account...");
			emp.Open_An_Account(emp.getEmpid());
		}else if(cmd==2) {
			System.out.println("Withdrawal");
			emp.Withdrawal(emp.getEmpid());
		}else if(cmd==3) {
			System.out.println("Deposit money");
			emp.Deposit_Money(emp.getEmpid());
		}
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
