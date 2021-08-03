package os_project;

import java.sql.Time;
import java.time.Clock;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Employee extends Thread {
	
	private ArrayList<Integer> customers = 
			new ArrayList<Integer>()
			{{
				add(1);
				add(2);
				add(3);
			}};
	private HashMap<Integer, Integer> customers_money=
			new HashMap<Integer, Integer>()
			{{
				put(1, 1232347);
				put(2, 4596783);
				put(3, 1248042);
			}};
			
	private String bName;
	private int empid=0;
	private Thread t;
	
	public Employee(String bName) {
		this.setbName(bName);
		t=new Thread();
		t.start();
	}
	
	public void ID_Checker(int id) {
		Scanner scanner = new Scanner(System.in);
		int cmd=0;
		for (int i : customers) {
			if(i==id) {
				setEmpid(id);
				System.out.println("Hello "+id+"\n"
						+ "Welcome to your bank\n"
						+ "What can we do?\n"
						+ "1. Open an account\n"
						+ "2. Withdrawal\n"
						+ "3. Deposit money\n"
						+ "Please enter a number:");
				cmd = scanner.nextInt();
				if(cmd==1) {
					Open_An_Account(id);
				}else if(cmd==2) {
					Withdrawal(id);
				}else if(cmd==3) {
					Deposit_Money(id);
				}
			}
		}
		
		if(!customers.contains(id)) {
			Register();
		}
		
	}
	
	public void Register() {
		Scanner scanner= new Scanner(System.in);
		int newID=0;
		System.out.println("It's your first time in our Bank...\n"
				+ "Please enter an ID greater than "+customers.size());
		newID=scanner.nextInt();
		customers.add(newID);
		
	}
	
	@SuppressWarnings("deprecation")
	public void destroy(Employee emp) {
		emp.stop();
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		int id=0;
		System.out.println("{Customers turn}\n"
				+ "Hello Everyone\n"
				+ "Please enter you ID:");
		id=scanner.nextInt();
		ID_Checker(id);
	}
	

	public void Open_An_Account(int id) {
		//bs=new Boss(bs.getbId());
		System.out.println("Openning an account");
		int time=0;
		int r=0;
		while(true) {
			time++;
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Time "+ time);
			if(time==3) {
				RemoveUser(id);
				break;
			} else {
				r = (int)(Math.random()*(1000-20+1)+20);
				System.out.println("your new bank account ID is\n"
						+ r);
				run();
				break;
			}
		}
	}
	
	public void Withdrawal(int id) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Withdrawal");
		int time=0;
		int wd_money=0;
		int firstMoney=0;
		while(true) {
			time++;
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Time "+ time);
			
			if(time==3) {
				RemoveUser(id);
				break;
			} else {
				wd_money= scanner.nextInt();
				if(customers_money.containsKey(id)) {
					firstMoney=customers_money.get(id);
					System.out.println("you have "+firstMoney+"$\n");
					while(firstMoney<wd_money) {
						System.out.println("you don't have enough money\n");
						wd_money= scanner.nextInt();
					}
					firstMoney-=wd_money;
					customers_money.put(id, firstMoney);
				}
				System.out.println("Now you have "+customers_money.get(id)+" $\n");
				//break;
			}
		}
	}
	
	public void Deposit_Money(int id) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Deposit money");
		int time=0;
		int dp_money=0;
		int firstMoney=0;
		while(true) {
			time++;
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Time "+ time);
			if(time==3) {
				RemoveUser(id);
				break;
			} else {
				dp_money= scanner.nextInt();
				if(customers_money.containsKey(id)) {
					firstMoney=customers_money.get(id);
					firstMoney+=dp_money;
					customers_money.put(id, firstMoney);
				}
				System.out.println("Now you have "+customers_money.get(id)+" $\n");
				//break;
			}
		}
	}
	
	public void RemoveUser(int id) {
		int rUsr=0;
		for (int i : customers) {
			if(i==id) {
				//index
				rUsr=customers.indexOf(id);
				customers.remove(rUsr);
				for(int x=rUsr; x<customers.size(); x++)
				{
					int cid=customers.get(x);
					customers.set(x-1, cid);
				}
			}
		}
	}
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}

