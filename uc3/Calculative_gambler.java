//As a Calculative Gambler if won or lost 50% of the stake, would resign for the day

package workshop.examples;

public class Calculative_gambler extends Bet {
	public static void gambling() {
		int temp_balance = Acc_bal;  
		
		
		int fifty_percent = (50/100)*temp_balance;
		
		while(Acc_bal <= (Acc_bal + fifty_percent) || Acc_bal >= (Acc_bal - fifty_percent)) {
			
			playerWinOrLoose();  //calling playerWinOrLoose method.
			
			if(Acc_bal == 150 || Acc_bal == 50) {  // if these conditions satisfied then loop will break.
				break;
			}
		}
		System.out.println("Gambler Account balance =" + Acc_bal);
 }
	public static void main(String[] args) {
		gambling();
	}
}