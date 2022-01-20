
public class SnakeLadderuc5 {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;

	public static void main(String[] agrs) {
		int pos = 0;
		System.out.println("Starting Position of player is "+START);
		while (pos <= 100) {
			int roll = (int) (Math.floor(Math.random()*10) % 6 + 1);
			System.out.println("Number on die is "+roll);
			int condition = (int) (Math.floor(Math.random()*10)%3);
			System.out.println("Condition is "+condition);

			switch (condition) {
			case NO_PLAY:
				System.out.println("New Position is: "+pos);
				break;
			case LADDER:
				pos = pos + roll;
				if (pos <=100) {
					System.out.println("New Position is: "+pos);
				}
				else {
					pos = pos - roll;


					System.out.println("New Position is: "+pos);
				}
				break;
			case SNAKE:
				pos = pos - roll;
				if (pos <= 100) {
					if (pos >= 0) {
						System.out.println("New Position is: "+pos);
					}
					else {
						pos = 0;
						System.out.println("New Position is: "+pos);
					}
				}else {
					System.out.println("New Position is: "+pos);
				}
				break;
			default:
				System.out.println("Default");
			}
		}
		System.out.println();
		if (pos == 100) {
			System.out.println("-----------");
			System.out.println("PLAYER WON");
			System.out.println("-----------");
		}
	}
}
