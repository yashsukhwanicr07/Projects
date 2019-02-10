package service;

import Repository.RepoImpl;
import bean.Account;

public class AccountServiceImpl implements AccountService 
{
	RepoImpl repo=new RepoImpl();

	@Override
	public Account getAccountDetails(String phoneNo) 
	{
		// TODO Auto-generated method stub
		Account acc=repo.findbyphone(phoneNo);
		return acc;
	}

	@Override
	public int rechargeAccount(String phoneNo, double rechargeAmount) {
		// TODO Auto-generated method stud
		repo.Recharge(phoneNo, rechargeAmount);
		
		return 0;
		
	}

}
