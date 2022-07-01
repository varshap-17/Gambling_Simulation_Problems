//As a Gambler, would start with a stake of $100 every day and bet $1 every game.

package workshop.examples;
import java.util.Scanner;

public class Gamble {
	static Scanner scan = new Scanner(System.in);
	static String name;
	static String[] menu= {"1. Start Game", "2. Help"};
	static int money;
	static int betoption;
	static int betmoney;
	static int menuchoice;
	
	public static void display() {
		System.out.println("Please enter your name:");
		name=scan.nextLine();
		System.out.println("Welcome,"+name+"to this gambling game! \nPlease select one of the following numbers:");
		for(int i=0;i<menu.length; i++) {
			System.out.println(menu[i]);
		}
		menuchoice=scan.nextInt();
		startGame();
	}
	public static void startGame() {
		if(menuchoice==1) {
			money();
		}else if(menuchoice==2){
			help();
		}else {
			System.out.println("That is not a valid option");
			notValid();
		}
	}
	public static void startGame2() {
		for(int i=0;i<menu.length; i++) {
			System.out.println(menu[i]);
		}
		menuchoice=scan.nextInt();
		if(menuchoice==1) {
			System.out.println("you have rupee"+money+"to gamble with");
			betOption();
		}else if(menuchoice==2){
			help2();
		}else {
			System.out.println("That is not a valid option");
			notValid2();
		}
	}
	public static void money() {
		money=100;
		System.out.println("You have rupees"+money+"to gamble with.");
		betOption();
	}
	public static void notValid() {
		for(int i=0; i<menu.length; i++) {
			System.out.println(menu[i]);
		}
		menuchoice=scan.nextInt();
		startGame();
	}
	public static void notValid2() {
		for(int i=0; i<menu.length; i++) {
			System.out.println(menu[i]);
		}
		menuchoice=scan.nextInt();
		startGame2();
	}
	public static void betOption() {
		System.out.println("Please state which side you would like to pick \n rem: only 6 sides");
		betoption=scan.nextInt();
		if(betoption>=7) {
			System.out.println("that is not a valid options");
			money();
		}else {
			userBet();
		}
	}
	public static void userBet() {
		System.out.println("how much would you like to bet?");
		betmoney=scan.nextInt();
		if(betmoney>money) {
			System.out.println("you don't have enough ");
			userBet();
		}
		else if(money==0) {
			System.out.println("Sorry, you have lost your money");
		}else {
			money=money-betmoney;
			System.out.println("you bet rupees"+money+"on this game");
			game();
		}
	}
	public static void game() {
		int randomnum=(int)Math.round(Math.random()*5+1);
		int pot=(int)Math.round(Math.random()*249+1+betmoney);
		System.out.println("The side reveled was "+randomnum);
		if(betoption==randomnum) {
			System.out.println("Congrats! you won rupees" + pot);
			money=money+pot;
			startGame();
		}else {
			System.out.println("Sorry! you lost rupee"+betmoney+"\nyour money is now rupee"+money);
			if(money==0) {
				System.out.println("you have lost all money! Try again another time");
			}else {
				betOption();
			}
		}
	}
	public static void help() {
		System.out.println("Follow the instructions");
		money();
	}
	public static void help2() {
		System.out.println("Follow the instructions");
		betOption();
	}
	public static void main(String[] args) {
		display();
		startGame();
		game();
	}
}
