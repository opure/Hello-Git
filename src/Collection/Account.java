package Collection;
import java.util.*;

public class Account {
	private int no;
	private Date openDate;
	private double balance;
	public static void showCollection(Collection c){
		Iterator i=c.iterator();
		while (i.hasNext()){
			Object o=i.next();
			if(o instanceof Account){
				Account a=(Account)o;
				System.out.println("Account info"+a.getNo()+"balance"+a.getBalance());
			}
		}
	}
	public Account (int no,double balance){
		setNo(no);
		setBalance(balance);
		openDate=new Date();
		
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		openDate =new Date();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

   public static void main(String args[]){
	  Account a1=new Account(100,55.88);
	  Account a2=new Account(100,55.85);
	  Account a3=new Account(100,55.88);
	  Account a4=new Account(1000,55.88);
	  Account a5=new Account(100,65.88);
	  Account a6=a1;
	  Set set=new HashSet();
	  set.add(a1);
	  set.add(a2);
	  set.add(a3);
	  set.add(a4);
	  set.add(a5);
	  System.out.println(set.size());
	  set.remove(a2);
	  showCollection(set);

	 }
}