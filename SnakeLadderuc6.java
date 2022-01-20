
public class SnakeLadderuc6 {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int start = 0;

	public static void main(String[] agrs) {
		int pos = 0, count = 0;
		System.out.println("Starting Position of player is "+start);
		while (pos < 100) {
			int roll = (int) (Math.floor(Math.random()*10) % 6 + 1);
			count++;
			int condition = (int) (Math.floor(Math.random()*10)%3);

			switch (condition) {
			case NO_PLAY:
				System.out.println("New Position is: "+pos);
				break;
			case LADDER:
				pos = pos + roll;
				if (pos > 100) {
					pos = pos - roll;
				}
				else {
					System.out.println("New Position is: "+pos);
				}
				break;
			case SNAKE:
				pos = pos - roll;
				if (pos >= 0) {
					System.out.println("New Position is: "+pos);
				}
				else {
					pos = 0;
					System.out.println("New Position is: "+pos);                           
				}
				break;
			default:
				System.out.println("Default");
				break;
			}
		}
		System.out.println("No of time dice rolled is "+ count);
		System.out.println("your current position is "+pos);
		if (pos == 100) {
			System.out.println("-----------");
			System.out.println("PLAYER WON");
			System.out.println("-----------");
		}
	}
}