package Repository;
import java.util.ArrayList;
import java.util.List;

import bean.Account;

public class RepoImpl implements Repo 
{
	List<Account> list=new ArrayList<Account>();
	public RepoImpl()
	{
		list.add(new Account("prepaid","yash",2000.0,"121"));
		list.add(new Account("prepaid","shivam",2000.0,"123"));
		list.add(new Account("prepaid","akarsh",2000.0,"198"));
		list.add(new Account("prepaid","nagin",2000.0,"197"));
		list.add(new Account("prepaid","gajendra",2000.0,"125"));
	}
	public Account findbyphone(String phone) 
	{
		for(Account i:list)
		{
			if(Integer.parseInt(i.getPhone())==Integer.parseInt(phone))
			{
				return i;
			}
		}
		return null;
		
	}
	public int Recharge(String phone,double amt) {
		for(Account i:list)
		{
			if(Integer.parseInt(i.getPhone())==Integer.parseInt(phone)) {
				i.setAccountBalance(i.getAccountBalance()+amt);
			}
		}
		return 0;
	}

}
