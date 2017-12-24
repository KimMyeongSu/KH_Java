
public class Main {
	public static void main(String[] args) {
		
		char abcCode[] = {	// a ~ z 를 암호화할 문자가 들어있는 배열 
				'`', '~', '!', '@', '#', 
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		char numCode[] = {	// 0 ~ 9  를 암호화할 문자가 들어있는 배열 
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		
		String src = "dfs67dsf76";
		String result = "";
		
		
		//문자열의 길이만큼 반복해서 문자열을 하나씩 잘라서 int 형으로 변환하여 n 에 save 
		for (int i = 0; i < src.length(); i++) {	
			char ch = src.charAt(i);
			int n = (int)ch;
			
			// 알파벳의 경우(97 ~)  ASCII CODE 로 판단 
			if(n >= 97 && n <= 122) {
				n = n - 97; 
				result = result + abcCode[n]; //문자를 배열값에 맞춰서 판단후 누적 
			}			
			// 숫자일 경우(48 ~ 57) 
			else {
				n = n - 48;
				result = result + numCode[n]; 
			}			
		}
		
		System.out.println("원본:" + src);
		System.out.println("암호화 코드:" + result);	
		
		
		 String oriStr = "";
	      for (int i = 0; i < result.length(); i++) {
	         
	         char ch = result.charAt(i);
	         int n = (int)ch;
	         int index = 0;
	         
	         //알파벳의 경우
	         if(n >= 97 && n <=122) {
	            for (int j = 0; j < numCode.length; j++) {
	               if(ch == numCode[j]) {
	                  index = j;
	                  break;
	               }
	            }
	            index = index + 48;
	            oriStr = oriStr + (char)index;
	         }
	         //그 외의 경우
	         else {
	            for (int j = 0; j < abcCode.length; j++) {
	               if(ch == abcCode[j]) {
	                  index = j;
	                  break;
	               }
	            }
	            index = index + 97;
	            oriStr = oriStr + (char)index;
	         }
	      }
	      System.out.println("복원된 코드: " + oriStr);
		
	}
}
