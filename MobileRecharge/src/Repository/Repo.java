package Repository;

import bean.Account;

public interface Repo 
{
	public Account findbyphone(String phone);
	public int Recharge(String phone,double amt);

}
