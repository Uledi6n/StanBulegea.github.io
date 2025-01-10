import java.util.*;
class BankAccount{
        private double balance;
	public BankAccount(){
	        this.balance=5000000;
	}
	public double getbalance(){
		return balance;
	}	
	public void deduct(double amount){
		if(amount>balance){
			System.out.println("Amount is not sufficient:");
		}else{
			balance-=amount;
			System.out.println("\ncost of oils is: "+amount);
		}
	}
}
class Vehicle{
	private double amount;
								
	public Vehicle(double amount){
		this.amount=amount;
	}
	public double getamount(){
		return amount;
	}
	public void setamount(double amount){
		if (amount>0){
			this.amount=amount;
		}else{
			this.amount=0.0;
			System.out.println("Nothing entered");
		}
	}
}
class Ownerofoilstation{
				private String accountname;
				private double balanceofowner;
				
				public Ownerofoilstation(){
								this.accountname="Stanslaus Account:";
				  this.balanceofowner=3000000;
				}
				public String getname(){
								return accountname;
				}
				public double amount(){
								return balanceofowner;
				}
				public void setamountofowner(double amountadd){
								this.balanceofowner+=amountadd;
				}
}

public class Oilstation {
				public static void main(String[] args) {
								Scanner scan=new Scanner(System.in);
								
								System.out.print("Enter amount of oils in littres: ");
								int littres=scan.nextInt();
								
								double amountofmoney=littres*2500;
								BankAccount obj1=new BankAccount();
								Vehicle obj2=new Vehicle(amountofmoney);
								
								Ownerofoilstation obj3=new Ownerofoilstation();
								obj3.setamountofowner(amountofmoney);
								obj1.deduct(obj2.getamount());
								if(amountofmoney<obj1.getbalance()){
												System.out.println("New balance of :"+obj3.getname()+" is "+obj3.amount());
								  System.out.println("new balance of your balance is:"+obj1.getbalance());
								}
								
								
				}
				
}
