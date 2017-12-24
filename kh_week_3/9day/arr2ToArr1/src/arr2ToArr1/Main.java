package arr2ToArr1;

public class Main {
	
	
	public static void main(String[] args) {
		
		//2차원 배열 선언 & 초기화  
		int arr2[][] = {
				{ 11, 12, 13, 14 },
				{ 21, 22, 23, 24 },
				{ 31, 32, 33, 34 }
		};
		System.out.println(arr2.length);
		System.out.println(arr2[2].length);
		// 1차원 배열 생성  arr2.length = 3 arr2.length = 3 가로 길이  arr2[0].length = 4 세로길이  
		int arr1[] = new int[arr2.length * arr2[0].length];
		
		/*
		 * 						3:  arr2.length
		 * 						
		arr2[0][0] = arr1[0]	4:	arr2[0].length
		arr2[0][1] = arr1[1]	0
		arr2[0][2] = arr1[2]
		arr2[0][3] = arr1[3]
		
		arr2[1][0] = arr1[4]	1 * 4 == arr2[0].length
		arr2[1][1] = arr1[5]	
		arr2[1][2] = arr1[6]	
		arr2[1][3] = arr1[7]	
		
		arr2[2][0] = arr1[8]		
		arr2[2][1] = arr1[9]
		arr2[2][2] = arr1[10]
		arr2[2][3] = arr1[11]
		
		*/
			int a = 0; 
		for (int i = 0; i <arr2.length; i++) {
			for (int j = 0; j <arr2[i].length; j++) {
			//   arr1[arr2[0].length * i + j] = arr2[i][j];
				arr1[a] = arr2[i][j]; 
				a++;
				
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
	}
}
