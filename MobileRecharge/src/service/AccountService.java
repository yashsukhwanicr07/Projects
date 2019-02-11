package service;

import Exception.AccountException;
import bean.Account;

public interface AccountService 
{
	public Account getAccountDetails(String phoneNo) throws AccountException;
	public int rechargeAccount(String phoneNo,double rechargeAmount) throws AccountException;
}
