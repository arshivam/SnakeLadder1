
public class SnakeLadderuc7 {

	public static final int Ladder = 1;
	public static final int Snake =2;
	
	public static int game(int DiceRolled, int roll) {
		DiceRolled = 0;
		int Position = 0;
		while (Position < 100) {
			roll = (int) (Math.floor(Math.random()*10) % 6 + 1);
			DiceRolled += 1;
			int TempPosition = (int) Math.floor(Math.random() * 10) % 3;
			if(TempPosition == 1)
				DiceRolled -=1;
			switch (TempPosition) {
			case Ladder:
				Position += roll;
				if (Position > 100)
					Position -= roll;
				break;
			case Snake:
				Position -= roll;
				if (Position < 0)
					Position = 0;
				break;
			default:
				break;
			}
		}
		return DiceRolled;
	}
	public static void main(String[] args) {
		 int DiceRolled1 = 0, DiceRolled2 = 0;
	        int roll = 0;
	        System.out.println("welcome player1 and player2");
	        DiceRolled1 = game(DiceRolled1 , roll);
	        DiceRolled2 = game(DiceRolled2 , roll);
	        int Diff = DiceRolled1 - DiceRolled2;
	        if(Diff <= 0)
	            System.out.println("player1 is the winner");
	        else
	            System.out.println("player2 is the winner");
	}
}
