package service;

import bean.Account;

public interface AccountService 
{
	public Account getAccountDetails(String phoneNo);
	public int rechargeAccount(String phoneNo,double rechargeAmount);
}
