//After 20 days of playing every day would like to know the total amount won or lost.

package workshop.examples;

public class Play_20_days extends Calculative_gambler{
	static int luckiest_day;
	static int unluckiest_day;
	public static void gambledForDays() {
		for(int day = 1; day <= 20; day++) {     
			System.out.println("\nDAY-" + day + " :-");
			gambling(); //calling gambling() method
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("Luckiest day = " + luckiest_day);
		System.out.println("Un-Luckiest day = " + unluckiest_day);
		System.out.println("-----------------------------------------------------");
		System.out.println("Gambler total number of wins in a month =" + num_of_wins_in_day);
		System.out.println("Gambler total number of looses in a month = " + num_of_losses_in_day);
		System.out.println("-----------------------------------------------------");
	}
	public static void main(String[] args) {
		gambledForDays();
	}
}
