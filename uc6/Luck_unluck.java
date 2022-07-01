//Would also like to know my luckiest day where I won maximum and my unluckiest day where I lost maximum

package workshop.examples;

public class Luck_unluck extends Calculative_gambler{
	static int day = 0;
	static int previous_day_win = 0;
	static int previous_day_loss = 0;
	static int luckiest_day;
	static int unluckiest_day;
	static int profit=0;
	public static void lucky_unlucky_day() {
		
		if(Acc_bal == 150) {
			profit += 50;
		}
		else if(Acc_bal == 50) {
			profit -= 50;
		}
		System.out.println("Gambler profit : " + profit); 

		num_of_wins_in_day = 0;  // making zero bcoz for next day. i want to count from fresh to print every day report.
		num_of_losses_in_day = 0; // making zero bcoz for next day. i want to count from fresh to print every day report
		Acc_bal = 100; 
		
		if(previous_day_win < num_of_wins_in_day) {
			previous_day_win = num_of_wins_in_day;    // finding day with maximum wins.
			luckiest_day = day;
		}
		if(previous_day_loss < num_of_losses_in_day) {  
			previous_day_loss = num_of_losses_in_day;   // finding day with maximum losses.
			unluckiest_day = day;
		}
		System.out.println("Luckiest day = " + luckiest_day);
		System.out.println("Un-Luckiest day = " + unluckiest_day);
	}
	public static void main(String[] args) {
		lucky_unlucky_day();
	}
}
