import java.util.Scanner;
import java.lang.Math;
public class CaptureCalculator {

	public static void main(String[] args) {


		// Create a Scanner.
		Scanner input = new Scanner(System.in);


		System.out.println("Hello and welcome to the Monster Capture Possibility Calculator.");

		// Receive inputs information about the monster.
		System.out.println("Please enter the latitude of the monster (1-10): ");
		int monsterLatitude = input.nextInt();
		System.out.println("Please enter the longitude of the monster (1-10): ");
		int monsterLongitude = input.nextInt();
		System.out.println("Please enter the time of the monster appear (1-1440): ");
		int Ta = input.nextInt();
		System.out.println("Please enter the possible time of the monster will exist (10-59): ");
		int Te = input.nextInt();

		// Receive inputs information about the player.
		System.out.println("Please enter the player's ID (8 digits): ");
		int playerID = input.nextInt();
		System.out.println("Please enter the time of the player noticing monster (1-1440 and greater than the time the monster appears): ");
		int Tn = input.nextInt();
		System.out.println("Please enter the latitude of the player (1-10): ");
		int playerLatitude = input.nextInt();
		System.out.println("Please enter the longitude of the player (1-10): ");
		int playerLongitude = input.nextInt();
		System.out.println("Please enter the player's walking speed (10-200): \n");
		int S = input.nextInt();

		// Distance calculation.
		double distance = Math.sqrt((monsterLongitude - playerLongitude) * (monsterLongitude - playerLongitude) + (monsterLatitude - playerLatitude) * (monsterLatitude - playerLatitude));
		double d = Math.round(distance * 1000 * 10) / 10.0;
		double Tg = Math.round((Tn + (d / S))* 10) / 10.0;

		int monsterDisappearTime = Ta + Te;

		// Output Results
		if (playerID % 100 >= 00 && playerID % 100 < 50){
			System.out.println("Player " + playerID + " who is on the lucky list, ");
		}
		if (playerID % 100 >= 50 && playerID % 100 < 100){
			System.out.println("Player " + playerID + " who is on the normal list, ");
		}

		System.out.println("noticed the monster at time " + Tn + ",");
		System.out.println("is " + d + " m away from the monster,");
		System.out.println("and will arrive at time " + Tg + ".");
		System.out.println("The monster's disappear time is about " + monsterDisappearTime + ".");


		// Determine the likelihood of the player capturing the monster.
		if (Tg <= Ta + Te){
			System.out.println("So the player will capture this monster with definitely possibility.");
		}

		if ((Tg > Ta + Te) && (playerID % 100 >= 00 && playerID % 100 < 50) && ((Tg - (Ta + Te))/Te) * 100 >= 0 && ((Tg - (Ta + Te))/Te) * 100 <= 10) {
			System.out.println("So the player will capture this monster with highly likely possibility.");
		}
		if ((Tg > Ta + Te) && (playerID % 100 >= 50 && playerID % 100 < 100) && ((Tg - (Ta + Te))/Te) * 100 >= 0 && ((Tg - (Ta + Te))/Te) * 100 <= 5) {
			System.out.println("So the player will capture this monster with highly likely possibility.");
		}

		if ((Tg > Ta + Te) && (playerID % 100 >= 00 && playerID % 100 < 50) && ((Tg - (Ta + Te))/Te) * 100 > 10 && ((Tg - (Ta + Te))/Te) * 100 <= 30) {
			System.out.println("So the player will capture this monster with likely possibility.");
		}
		if ((Tg > Ta + Te) && (playerID % 100 >= 50 && playerID % 100 < 100) && ((Tg - (Ta + Te))/Te) * 100 > 5 && ((Tg - (Ta + Te))/Te) * 100 <= 20) {
			System.out.println("So the player will capture this monster with likely possibility.");
		}

		if ((Tg > Ta + Te) && (playerID % 100 >= 00 && playerID % 100 < 50) && ((Tg - (Ta + Te))/Te) * 100 > 30 && ((Tg - (Ta + Te))/Te) * 100 <= 40) {
			System.out.println("So the player will capture this monster with unsure possibility.");
		}
		if ((Tg > Ta + Te) && (playerID % 100 >= 50 && playerID % 100 < 100) && ((Tg - (Ta + Te))/Te) * 100 > 20 && ((Tg - (Ta + Te))/Te) * 100 <= 35) {
			System.out.println("So the player will capture this monster with unsure possibility.");
		}

		if ((Tg > Ta + Te) && (playerID % 100 >= 00 && playerID % 100 < 50) && ((Tg - (Ta + Te))/Te) * 100 > 40 && ((Tg - (Ta + Te))/Te) * 100 <= 50) {
			System.out.println("So the player will capture this monster with unlikely possibility.");
		}
		if ((Tg > Ta + Te) && (playerID % 100 >= 50 && playerID % 100 < 100) && ((Tg - (Ta + Te))/Te) * 100 > 35 && ((Tg - (Ta + Te))/Te) * 100 <= 40) {
			System.out.println("So the player will capture this monster with unlikely possibility.");
		}

		if ((Tg > Ta + Te) && (playerID % 100 >= 00 && playerID % 100 < 50) && ((Tg - (Ta + Te))/Te) * 100 > 50) {
			System.out.println("So the player will capture this monster with highly unlikely possibility.");
		}
		if ((Tg > Ta + Te) && (playerID % 100 >= 50 && playerID % 100 < 100) && ((Tg - (Ta + Te))/Te) * 100 > 40) {
			System.out.println("So the player will capture this monster with highly unlikely possibility.");
		}

	}

}
