class array2Class
{
	public static void main(String[] args)
	{
		/*
			array : 같은 자료형의 묶음

			int *p; == p[]
			*(p + 1) == p[1]

			index로 관리된다.

			다른 자료형의 묶음 -> class == structure(구조체)
							초기화X
							private(개인적인)	 public(대중적인)

			int array[] = new int[5];  0 ~ 4

			int array[];
			int []array;
			int[] array;

			// 2차원배열
			int Array2[열][행];	// 열 == 세로 행 == 가로
		*/
		/*
		int Array2[][] = {	// Array2[3][4] int [4]Array2[3];
			{ 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 }
		};*/
		/*
		Array2[0][0]
		Array2[0][1]
		Array2[0][2]
		Array2[0][3]

		Array2[1][0]
		Array2[1][1]
		Array2[1][2]
		Array2[1][3]

		Array2[2][0]
		Array2[2][1]
		Array2[2][2]
		Array2[2][3]


		*/
		/*
			int Array2[][];
			int []Array2[];
		*/

		/*
		int Array2[][];
		Array2 = new int[3][];

		int data1[] = new int[4];
		data1[0] = 1;
		data1[1] = 2;
		data1[2] = 3;
		data1[3] = 4;

		int data2[] = new int[4];
		data2[0] = 5;
		data2[1] = 6;
		data2[2] = 7;
		data2[3] = 8;

		int data3[] = new int[4];
		data3[0] = 9;
		data3[1] = 10;
		data3[2] = 11;
		data3[3] = 12;

		Array2[0] = data1;
		Array2[1] = data2;
		Array2[2] = data3;
		*/
		/*
		// 각각의 값은 별도로 넣음
		int Array2[][] = new int[3][4];

		Array2[0][0] = 1;
		Array2[0][1] = 2;
		Array2[0][2] = 3;
		Array2[0][3] = 4;

		Array2[1][0] = 5;
		Array2[1][1] = 6;
		Array2[1][2] = 7;
		Array2[1][3] = 8;

		Array2[2][0] = 9;
		Array2[2][1] = 10;
		Array2[2][2] = 11;
		Array2[2][3] = 12;
		*/

		// 초기화 했을 경우
		int Array2[][] = {	// Array2[3][4] int [4]Array2[3];
			{ 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 }
		};

		for(int i = 0;i < Array2.length; i++){
			for(int j = 0;j < Array2[0].length; j++){
				System.out.print("Array2[" + i + "][" + j + "] = " + Array2[i][j] + " ");
			}
			System.out.println();
		}

	}
}
