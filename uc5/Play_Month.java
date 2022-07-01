//Each month would like to know the days won and lost and by how much.

package workshop.examples;

public class Play_Month extends Calculative_gambler{
	static int luckiest_day;
	static int unluckiest_day;
	static int profit=0;
	public static void gambledForMonth() {
		for(int day = 1; day <= 30; day++) {     
			System.out.println("\nDAY-" + day + " =");
			gambling();
		}
		
		if(Acc_bal == 150) {
			profit += 50;
		}
		else if(Acc_bal == 50) {
			profit -= 50;
		}
		System.out.println("Gambler profit : " + profit); 
		System.out.println("-----------------------------------------------------");
		System.out.println("Luckiest day = " + luckiest_day);
		System.out.println("Un-Luckiest day = " + unluckiest_day);
		System.out.println("-----------------------------------------------------");
		System.out.println("Gambler total number of wins in a month =" + num_of_wins_in_month);
		System.out.println("Gambler total number of looses in a month =" + num_of_losses_in_month);
		System.out.println("-----------------------------------------------------");
	}
	public static void main(String[] args) {
		gambledForMonth();
	}
}
