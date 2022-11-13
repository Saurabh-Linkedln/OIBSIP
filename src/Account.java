public class Account 
{
	private String Account_Number;
	private Long Balance;
	private String Name;
	private String Email;
	private String PhoneNumber;
	
	public Account(String Account_Number, Long Balance,String Name , String Email, String PhoneNumber)
	{
		System.out.println("-----------------------------------------------");
		System.out.println("      Account Details     ");
		System.out.println("                ");
		this.Account_Number=Account_Number;
		System.out.println("Account Number :"+Account_Number);
		this.Balance=Balance;
		System.out.println("Account Current Balance :"+Balance);
		this.Name=Name;
		System.out.println("Account Name :"+Name);
		this.Email=Email;
		System.out.println("Account Email Address :"+Email);
		this.PhoneNumber=PhoneNumber;
		System.out.println("Account Phone Number :"+PhoneNumber);
		System.out.println("-----------------------------------------------");
	}
	
	
	
	public void DepositMoney(Long DepositMoney)
	{
		this.Balance+=DepositMoney;
		System.out.println("Deposit Money Successfully, New Balance is : "+ this.Balance);
	}
	public void Withdrawl(Long Withdrawl)
	{
		if(this.Balance-Withdrawl<0)
		{
			System.out.println("Withdrawl Unsuccessfull Only"+this.Balance+"is Left : ");
		}
		else
		{
			this.Balance-=Withdrawl;
			System.out.println("Withdrawl Successfull Your Final Amount is : "+this.Balance );
		}
	}
	
	public String getNumber() {
		return Account_Number;
	}
	public void setNumber(String number) {
		Account_Number = number;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(Long balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
}
