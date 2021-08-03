package os_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Boss extends Thread {
	
	private ArrayList<Integer> bosses=
			new ArrayList<Integer>()
			{{
				add(1);
				add(2);
				add(3);
				add(4);
			}};
	private int bid=0;
	private Employee emp;
	public Boss(int bid) {
		this.setbId(bid);
	}
	
	
	public void Boss_ID_Checker(int id) {
		Scanner scanner = new Scanner(System.in);
		int cmd=0;
		for (int i : bosses) {
			if(i==id) {
				if(id==1) {
					System.out.println("{Royal Bank Canada}\n"
							+ "Welcome Home Boss\n"
							+ "When do you want to start the bank program?");
					Employee bnk=new Employee("Royal Bank Canda");
					bnk.getbName();
					System.out.println("What do you want BOSS?\n"
							+ "1. Start the program\n"
							+ "2. End of Work\n"
							+ "Please enter a number:");
					cmd=scanner.nextInt();
					emp=new Employee("Royal Bank Canada");
					if(cmd==1) {
						run(emp);
					}else if(cmd==2) {
						EndOfWorkingHour(emp);
					}
				}else if(id==2) {
					System.out.println("{GP Morgan USA}\n"
							+ "Welcome Home Boss\n"
							+ "When do you want to start the bank program?");
					Employee bnk=new Employee("GP Morgan USA");
					bnk.getbName();
					System.out.println("What do you want BOSS?\n"
							+ "1. Start the program\n"
							+ "2. End of Work\n"
							+ "Please enter a number:");
					cmd=scanner.nextInt();
					emp=new Employee("GP Morgan USA");
					if(cmd==1) {
						run(emp);
					}else if(cmd==2) {
						EndOfWorkingHour(emp);
					}
				} else if(id==3) {
					System.out.println("{American Express}\n"
							+ "Welcome Home Boss\n"
							+ "When do you want to start the bank program?");
					Employee bnk=new Employee("American Express");
					bnk.getbName();
					System.out.println("What do you want BOSS?\n"
							+ "1. Start the program\n"
							+ "2. End of Work\n"
							+ "Please enter a number:");
					cmd=scanner.nextInt();
					emp=new Employee("American Express");
					if(cmd==1) {
						run(emp);
					}else if(cmd==2) {
						EndOfWorkingHour(emp);
					}
				}else if(id==4) {
					System.out.println("{National Bank Australia}\n"
							+ "Welcome Home Boss\n"
							+ "When do you want to start the bank program?");
					Employee bnk=new Employee("National Bank Australia");
					bnk.getbName();
					System.out.println("What do you want BOSS?\n"
							+ "1. Start the program\n"
							+ "2. End of Work\n"
							+ "Please enter a number:");
					cmd=scanner.nextInt();
					emp=new Employee("National Bank Australia");
					if(cmd==1) {
						run(emp);
					}else if(cmd==2) {
						EndOfWorkingHour(emp);
					}
				}
			}
		}
	}
	
	
	public void EndOfWorkingHour(Employee emp) {
		System.out.println("------------------Goodbye------------------");
		emp.destroy(emp);
	}
	
	public void run(Employee emp) {
		Scanner scanner= new Scanner(System.in);
		int end=1;
		boolean fin=true;
		try {
			while(fin) {
				emp.run();
				emp.sleep(5000);
				//System.out.println("If you want to close the bank\n"
					//	+ "Enter 0\n");
				System.out.print("BOSS: ");
				end=scanner.nextInt();
				if(end==0) {
					fin=false;
					EndOfWorkingHour(emp);
				}
			}
			
			//System.out.println("Bye BOSS...\n"
				//	+ "Now it's time for customers to join us");
			
			//emp.ID_Checker(id);
		} catch (Exception e) {
			System.out.println("Boss: ");
			end=scanner.nextInt();
			if(end!=0) {
				run(emp);
			}else {
				System.out.println("Fine...\n"
						+ "Goodbye boss\n"
						+ "will see you next day.");
				fin=false;
				EndOfWorkingHour(emp);
			}
			System.out.println("running out of time");
		}
		
	}
	
	public void destroy() {
		System.out.println("Destroying the thread");
	}
	
	//public void start() {
		
	//}
	
	public int getbId() {
		return bid;
	}
	public void setbId(int bid) {
		this.bid = bid;
	}
}
