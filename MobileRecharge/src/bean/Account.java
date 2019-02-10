package bean;

public class Account 
{
	private String accountType;
	private String customerName;
	private double accountBalance;
	private String phone;
	
	public Account(String accountType, String customerName, double accountBalance,String phone) {
		super();
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", customerName=" + customerName + ", accountBalance="
				+ accountBalance + ", phone=" + phone + "]";
	}

}
