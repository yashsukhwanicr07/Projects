package Main;

import java.util.Scanner;

import Exception.AccountException;
import bean.Account;
import service.AccountServiceImpl;

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AccountServiceImpl accountserviceimpl=new AccountServiceImpl();
		Scanner scanner=new Scanner(System.in);
		System.out.println("----------------------Menu-------------------------");
		System.out.println("Press 1. Account Details Inquiry \n"+"Press 2. Recharge Account \n"+"Press 3. Exit");
		while(true)
		{
			System.out.println("\n-------------Enter your choice-------------------\n");
			int ch=scanner.nextInt();
		switch(ch) 
		{
		case 1:
			System.out.println("|---------------------------Enter your phone number-----------------------\n");
			String phno=scanner.next();
			try {
				if(accountserviceimpl.getAccountDetails(phno)!=null)
				{
					System.out.println("\n"+accountserviceimpl.getAccountDetails(phno).getAccountBalance()+" "+accountserviceimpl.getAccountDetails(phno).getAccountType()+" "+accountserviceimpl.getAccountDetails(phno).getCustomerName()+" " + accountserviceimpl.getAccountDetails(phno).getPhone()+"\n");
                }
			} catch (AccountException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
				
			}
			break;
		case 2:
			System.out.println("Enter mobile no");
			String phNo=scanner.next();
			System.out.println("Enter recharge amount");
			int amount=scanner.nextInt();
			try {
				accountserviceimpl.rechargeAccount(phNo, amount);
			} catch (AccountException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.exit(0);
		}

	}
}
}