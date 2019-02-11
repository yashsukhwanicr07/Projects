package Repository;

import Exception.AccountException;
import bean.Account;

public interface Repo 
{
	public Account findbyphone(String phone) throws AccountException;
	public int Recharge(String phone,double amt) throws AccountException;

}
