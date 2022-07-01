//As a Gambler make $1 bet so either win or loose $1

package workshop.examples;

public class Bet {
	static int num_of_wins_in_month=0;
	static int num_of_wins_in_day=0;
	static int num_of_losses_in_month=0;
	static int num_of_losses_in_day=0; 
	static int Acc_bal=100;
	static final int BET=1; 
	public static void playerWinOrLoose() {
		
		int random_Check = (int)Math.floor(Math.random()*2);
		switch(random_Check) {
			case 1 :
				num_of_wins_in_month++;  
				num_of_wins_in_day++;     
				Acc_bal += BET; // increasing stake/account_balance by 1 if player won the bet.
				System.out.println("player won");
				break;
			case 2:
				num_of_losses_in_month++;   
				num_of_losses_in_day++;     
				Acc_bal -= BET;
				System.out.println("player lost");
				break;          // decreasing stake/account_balance by 1 if player loose the bet.
		}	
	}
	public static void main(String[] args) {
		playerWinOrLoose();
	}
}
