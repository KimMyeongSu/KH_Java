import java.util.Random;

class randomClass
{
	public static void main(String[] args)
	{
		/*
			random	-> 무작위
					1 2 3 ->
			0 ~ 9
		*/

		int r;

		// 0 ~ 9
		r = (int)(Math.random() * 10);
		//System.out.println("r = " + r);

		// 10 ~ 20
		r = (int)(Math.random() * 11) + 10;

		// 10 20 30 40 50
		r = ((int)(Math.random() * 5) + 1) * 10;
			//	0 1 2 3 4 + 1 -> 1 2 3 4 5
		System.out.println("r = " + r);

		// -1 0 1
		r = (int)(Math.random() * 3) - 1;
			//	0 1 2 -> -1

		int x, y;
		x = (int)(Math.random() * 3) - 1;	// -1 0 1
		y = (int)(Math.random() * 3) - 1;	// -1 0 1




	}
}
