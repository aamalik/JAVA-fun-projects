// Bank class

import java.util.ArrayList;  //account represented as an array list
import java.util.Iterator;

public class Bank {
	private ArrayList<Account> account;
	public Bank(){
		ArrayList<Account> accounts = new ArrayList<Account>();
		this.account = accounts;
	}
	
	public void openAccount(Account account){
		this.account.add(account);
	}
	
	public void closeAccount(int accountNumber){
		Iterator<Account> iterator = this.account.iterator();
		int i = 0;
		
		while(iterator.hasNext()){
				Account element = iterator.next();
				int x = (int)element.getAccountNumber();
				if (x == accountNumber){
					this.account.remove(i);
				}
				i++;
			}		
	}
	

	public Account getAccount(int accountNumber){
		Iterator<Account> iterator = this.account.iterator();
		
		while(iterator.hasNext()){
			Account element = iterator.next();
			if(element.getAccountNumber() == accountNumber){
				return element;
			}
		}
		return null;
		
	}
	// method to pay dividend
	public void payDivident(double sum){
		Iterator<Account> iterator = this.account.iterator();
		
		while(iterator.hasNext()){
			Account element = iterator.next();
			element.deposit(sum);
		}
		
	}

	public void update(){
		Iterator<Account> iterator = this.account.iterator();
		
		while(iterator.hasNext()){
			Account element = iterator.next();
			if (element instanceof SavingAccount){
				double interest = ((SavingAccount) element).getInterest();
				((SavingAccount) element).add_Interest_money(interest);
			}
		}
	}
	
	// prints all the information 
	public void print(){
		Iterator<Account> iterator = this.account.iterator();
		
		while(iterator.hasNext()){
			Account element = iterator.next();
			element.print();
		}
	}
}
