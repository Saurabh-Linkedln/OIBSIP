import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Account Saurabh_Account = new Account("8840954521244", (long) (50000),
				"Saurabh Kushwaha", "Saurabhkushwaha7785@gmail.com", "8840958479");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Deposit Ammount : ");
		Saurabh_Account.DepositMoney(sc.nextLong());
		System.out.println("Plese Enter Your Withdrawl ammount : ");
		Saurabh_Account.Withdrawl(sc.nextLong());
		sc.close();
	}
}
