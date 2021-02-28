
public class App {

	public static void main(String[] args) {
		
		double itemPrice = 20.39;
		double moneyInWallet = 50.00;
		int numOfFriends = 5;
		int age = 28;
		String firstName = "Logan";
		String lastName = "Henning";
		char middleInitial = 'R';
		
		double moneyAfterPurchase = moneyInWallet - itemPrice;
		double friendsPerYear = numOfFriends / age;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		
		System.out.println(itemPrice);
		System.out.println(moneyInWallet);
		System.out.println(numOfFriends);
		System.out.println(age);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(middleInitial);
		
		System.out.println(moneyAfterPurchase);
		System.out.println(friendsPerYear);
		System.out.println(fullName);

	}

}
