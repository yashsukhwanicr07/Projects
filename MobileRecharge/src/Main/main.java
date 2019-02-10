package Main;

import java.util.Scanner;

import bean.Account;
import service.AccountServiceImpl;

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AccountServiceImpl accountserviceimpl=new AccountServiceImpl();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Press 1. Account Details Inquiry\n"+"Press 2. Recharge Account\n"+"Press 3. Exit");
		while(true)
		{
			System.out.println("Enter your choice");
			int ch=scanner.nextInt();
		switch(ch) 
		{
		case 1:
			System.out.println("Enter mobile no");
			String phno=scanner.next();
			if(accountserviceimpl.getAccountDetails(phno)!=null)
			{
				System.out.println(accountserviceimpl.getAccountDetails(phno).getAccountBalance()+" "+accountserviceimpl.getAccountDetails(phno).getAccountType()+" "+accountserviceimpl.getAccountDetails(phno).getCustomerName()+" " + accountserviceimpl.getAccountDetails(phno).getPhone());
		  }
			else {
				System.out.println("user doesnot exists");
			}
			break;
		case 2:
			System.out.println("Enter mobile no");
			String phNo=scanner.next();
			System.out.println("Enter recharge amount");
			int amount=scanner.nextInt();
			accountserviceimpl.rechargeAccount(phNo, amount);
			break;
		case 3:
			System.exit(0);
		}

	}
}
}