
public class homeWork 
	{
		private int numRolls;
		
			public void Dice()
			{
				numRolls = 0;
			}
			public void Dice2()
			{
				numRolls = 0;
			}
			
			public int roll()
			{
				numRolls++;
				return numRolls = ((int)(Math.random()*6)+1);
			}
			public void reset()
			{
				numRolls = 0;
			}
			public int getCount()
			{
				return numRolls;
			}
			system.out.println("Dice 1 count: "+Dice/n+"Dice 2 count: "+Dice2);
}
