package ex04controlstatement;

public class QuUpgradeGugudan {
	
	public static void main(String[] args) {
		
		int result;

		for (int x = 2; x < 10; x++)
		{	
			result = x * 1;
			System.out.printf("%d x 1 = %d\n", x, result);

			for (int y = 2; y < 10; y++)
			{
				result = x;
				System.out.printf("%d", x);

				for (int z = 2; z <= y; z++)
				{
					result *= x;
					System.out.printf(" X %d", x);
				} 
				System.out.printf(" = %d", result);
				System.out.println();
			}
			System.out.println();
		}
	
	}
}
