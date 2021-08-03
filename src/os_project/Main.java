package os_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Thread {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Welcome_To_Bank();
		int bnk = scanner.nextInt();
		Check_Bank(bnk);
		ID_of_person(bnk);
	}

	public static void Welcome_To_Bank() {
		System.out.println("Hello! Wolcome to our city...\n"
				+ "We have 4 banks here\n"
				+ "Which one do you want to work with?\n"
				+ "1. Royal Bank Canada\n"
				+ "2. GP Morgan USA\n"
				+ "3. American Express\n"
				+ "4. National Bank Australia\n"
				+ "Enter a number please:");
	}
	
	public static void Check_Bank(int id) {
		if(id==1) {
			Employee bnk= new Employee("Royal Bank Canada");
			System.out.println(bnk.getbName());
		} else if(id==2) {
			Employee bnk= new Employee("GP Morgan USA");
			System.out.println(bnk.getbName());
		}else if(id==3) {
			Employee bnk= new Employee("American Express");
			System.out.println(bnk.getbName());
		}else if(id==4) {
			Employee bnk= new Employee("National Bank Australia");
			System.out.println(bnk.getbName());
		}
	}

	public static void ID_of_person(int bnk) {
		Scanner scanner = new Scanner(System.in);
		int b_c;
		System.out.println("Boss or Customer\n"
				+ "1. Boss\n"
				+ "2. Customer\n"
				+ "Please enter a number:");
		b_c=scanner.nextInt();
		Check_Boss_Or_Customer(b_c, bnk);
	}
	
	public static void Check_Boss_Or_Customer(int b_c, int bnk) {
		Scanner scanner= new Scanner(System.in);
		Employee emp;
		int bsid=0;
		int cid=0;
		if(b_c==1) {
			Boss bs=new Boss(bnk);
			System.out.println("Please enter your id:");
			bsid=scanner.nextInt();
			bs.Boss_ID_Checker(bsid);
		} else if(b_c==2) {
			if(bnk==1) {
				emp= new Employee("Royal Bank Canada");
				System.out.println("Please enter your id:");
				cid=scanner.nextInt();
				emp.ID_Checker(cid);
			} else if(bnk==2) {
				emp= new Employee("GP Morgan USA");
				System.out.println("Please enter your id:");
				cid=scanner.nextInt();
				emp.ID_Checker(cid);
			}else if(bnk==3) {
				emp= new Employee("American Express");
				System.out.println("Please enter your id:");
				cid=scanner.nextInt();
				emp.ID_Checker(cid);
			}else if(bnk==4) {
				emp= new Employee("National Bank Australia");
				System.out.println("Please enter your id:");
				cid=scanner.nextInt();
				emp.ID_Checker(cid);
			}
		}
	}
}
