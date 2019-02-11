package Repository;
import java.util.ArrayList;
import java.util.List;

import Exception.AccountException;
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
	public Account findbyphone(String phone) throws AccountException 
	{
		for(Account i:list)
		{
			if(Integer.parseInt(i.getPhone())==Integer.parseInt(phone))
			{
				return i;
			}
		}
		throw new AccountException("User does not Exists");
		
	}
	public int Recharge(String phone,double amt) throws AccountException{
		for(Account i:list)
		{
			if(Integer.parseInt(i.getPhone())==Integer.parseInt(phone))
			{
				i.setAccountBalance(i.getAccountBalance()+amt);
				break;
			}
			else
			{
				throw new AccountException("User does not Exists");
			}
		}
		return 0;
	}

}
