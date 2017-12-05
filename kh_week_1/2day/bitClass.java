class bitClass
{
	public static void main(String[] args)
	{

		/*
			bit : 0, 1

			&	AND
			|	OR
			^	XOR			: bit가 다를 때 참
			<<	left shift
			>>	right shift
			~	not		0 -> 1  1 -> 0
		*/


		int num;

		// AND
		num = 0xD3 & 0xF0;

		/*	8421 8421

			1101 0011	0xD3
			1111 0000	0xF0
			1101 0000
			D	 0		-> 208
		*/

		System.out.println("num = " + num);
		System.out.printf("0x%x \n", num);
		System.out.printf("%d \n", num);

		// OR
		num = 0xD3 | 0xF0;

		/*	8421 8421

			1101 0011	0xD3
			1111 0000	0xF0
			1111 0011
			F	 3
		*/
		System.out.println("num = " + num);
		System.out.printf("0x%x \n", num);
		System.out.printf("%d \n", num);

		// XOR
		num = 0xD3 ^ 0xF0;

		/*	8421 8421

			1101 0011	0xD3
			1111 0000	0xF0
			0010 0011
			2	 3
		*/

		System.out.println("num = " + num);
		System.out.printf("0x%x \n", num);
		System.out.printf("%d \n", num);

		num = num ^ 0xF0;

		System.out.println("num = " + num);
		System.out.printf("0x%x \n", num);
		System.out.printf("%d \n", num);


		// ~ 반전
		// 0 -> 1 1 -> 0

		/*
			0x55

			8421 8421
			0101 0101

			1010 1010
			A	 A
		*/

		num = ~0x55;

		System.out.println("num = " + num);
		System.out.printf("0x%x \n", num);
		System.out.printf("%d \n", num);

		// left shift
		// <<		* 2 결과 취득
		// int n = 3;
		// n = n * 2;
		// n = n << 1; // low level

		// 0000 0001	1
		// 0000 0010	2
		// 0000 0100	4

		int b1;

		b1 = 0x1 << 2;
		System.out.println("b1 = " + b1);

		b1 = b1 << 5;
		System.out.println("b1 = " + b1);

		b1 = b1 << 1;
		System.out.println("b1 = " + b1);

		// right shift
		// >>

		b1 = b1 >> 3;
		// /2 /2 /2 한 결과 값이다
		System.out.println("b1 = " + b1);






	}
}
