class star {
	public static void main(String args[]) {

		/*
		 *****
		 * j = 0 1 2 3
		 *****
		 *****
		 *****
		 *****
		 *****
		 *
		 */
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n\n");

		/*

		*
		**
		***
		****
		*****
		****
		***
		**
		*

		*/

		int k = 0;

		for (int j = 0; j < 9; j++) {
			if (j < 5)
				k++;
			else
				k--;

			for (int i = 0; i < k; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
