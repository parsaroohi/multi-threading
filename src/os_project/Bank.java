package os_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank extends Thread{

	private String name_of_bank;
	private int id=0;
	
	
	private ArrayList<Integer> customers =
			new ArrayList<Integer>();
	
	private ArrayList<Integer> bosses =
			new ArrayList<Integer>();
	
	
	public Bank(String name_of_bank) {	
		this.setName_of_bank(name_of_bank);	
		Check_Boss_Or_Customer();
	}
	
	
	
	public void Check_Boss_Or_Customer() {
		Scanner scanner=new Scanner(System.in);
		
		if(getName_of_bank()=="Royal Bank Canada") {
			System.out.println("Welcome to your Bank\n"
					+ "Please enter yout ID:");
			id=scanner.nextInt();
			if(customers.contains(id)) {
				Employee emp=new Employee("Royal Bank Canada");
			} else if(bosses.contains(id)) {
				Boss bs= new Boss(1);
			}
		} else if(getName_of_bank()=="GP Morgan USA") {
			System.out.println("Welcome to your Bank\n"
					+ "Please enter yout ID:");
			id=scanner.nextInt();
			if(customers.contains(id)) {
				Employee emp=new Employee("GP Morgan USA");
			} else if(bosses.contains(id)) {
				Boss bs= new Boss(2);
			}
		}else if(getName_of_bank()=="American Express") {
			System.out.println("Welcome to your Bank\n"
					+ "Please enter yout ID:");
			id=scanner.nextInt();
			if(customers.contains(id)) {
				Employee emp=new Employee("American Express");
			} else if(bosses.contains(id)) {
				Boss bs= new Boss(3);
			}
		}else if(getName_of_bank()=="National Bank Australia") {
			System.out.println("Welcome to your Bank\n"
					+ "Please enter yout ID:");
			id=scanner.nextInt();
			if(customers.contains(id)) {
				Employee emp=new Employee("National Bank Australia");
			} else if(bosses.contains(id)) {
				Boss bs= new Boss(4);
			}
		}
	}
	
	public String getName_of_bank() {
		return name_of_bank;
	}
	public void setName_of_bank(String name_of_bank) {
		this.name_of_bank = name_of_bank;
	}
}
