import java.util.Scanner;

class asciiTerms
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// 숫자 입력 -> 문자열	"1234"
		// 숫자로만 이루어져 있는지를 판단
		// 숫자 -> 숫자입니다
		// 문자 -> 문자열입니다.

		//char numChar[] = { '0', '1', '2', '3', '4',
		//					'5', '6', '7', '8', '9' };

    // ******  ASCII ******

    // 48 == '0'   57 == '9'
		// 65 == 'A'   90 == 'Z'
    // 97 == 'a'   122 == 'z'



		while(true){

			System.out.print("숫자 입력 = ");
			String strNum = sc.next();

			// strNum = "12212";

			boolean numTrue = true;

			for(int i = 0;i < strNum.length(); i++){
				char c = strNum.charAt(i);
				System.out.println("c = " + c);

				int n = (int)c;	// ASCII	'0' == 48 '9' == 57
				if(n < 48 || n > 57){
					numTrue = false;
					break;
				}
			}

			if(numTrue){
				System.out.println("모두 숫자로 되어 있습니다");
			}
			else{
				System.out.println("문자가 섞여 있습니다");
			}


		}






	/*
			String str = "a wolf is a member of the dog family";
			a 대문자로 바꿔주는 코드 구현


		String str = "a wolf is a member of the dog family";
		String result = "";

		for(int i = 0;i < str.length(); i++){
			char c = str.charAt(i);
			if(c == 'a'){
				// A == 65	32
				// a == 97
			//	int n = (int)c;
			//	n = n - 32;

				result = result + 'A'; //(char)n;
			}
			else{
				result = result + c;
			}
		}

		System.out.println("result = " + result);
	*/




	}
}
