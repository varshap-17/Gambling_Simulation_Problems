//If won would like to continue playing next month or stop Gambling

package workshop.examples;

public class Play_next_time extends Play_Month{
	static int profit=0;
	public static void gamblerDecision() {
		do {
			gambledForMonth();    // the loop will continue untill the gambler profit becomes less than ZERO.
		}while(profit > 0);       // Gambler stops playing when he looses his investment money.
	}
	public static void main(String[] args) {
		gamblerDecision();
	}
}
