class castClass
{
	public static void main(String[] args)
	{
		/*
			boolean 1 byte

			byte	1 byte
			short	2 byte
			int		4 byte		129 -> byte
			long	8 byte

			float	4 byte
			double	8 byte

			char	2 byte
			String	--

			우선순위 ( 자료형변환 - 1.자동 2.강제(cast) )

			double	8

			float	4

			long	8

			int		4

			short	char 2

			byte	1
			더 작은 크기의 자료형으로 갈때는 강제 형변환 필요 ! 
		*/

		short sh = 10;
		int i;

		i = sh;	// 자동 형변환
		System.out.println("i = " + i);

		i = 123;

		sh = (short)i;	// 강제 형변환
		System.out.println("sh = " + sh);


		long l = 1223123123123L;
		float f = l;	// 자동 형변환
		System.out.println("l = " + l);
		System.out.println("f = " + f);

		// 1.22312314E12 -> E == 10	12승
		// 1.22312314 * 10의 12승

		double d = l;	// 자동 형변환
		System.out.println("d = " + d);

		//	12.34E2		12.34 * 10의 2승
		//	12.34E-2	12.34 * 10의 -2승

		float f1;

		f1 = (float)3 / 2;
		System.out.println("f1 = " + f1);


		double val = 123.4567;
		int j;

		j = (int)val;
		System.out.println("j = " + j);


	}
}
