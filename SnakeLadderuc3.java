
public class SnakeLadderuc3 {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int start = 0;

	public static void main(String[] agrs) {
		int pos = 0;
		System.out.println("Starting Position of player is "+start);
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
			System.out.println("New Position is: "+pos);
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
		}
	}
}
