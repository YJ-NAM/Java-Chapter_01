package khie;

/*
 * 단일문자형 : char형 (0~65535) ==> 2 byte 
 * - java에서는 유니코드(UTF-8) 체계로 단일문자가 처리됨
 */

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A';
		
		System.out.println("ch >>> " + ch);
		System.out.println(ch + 1);
		System.out.println((char)(ch + 1)); // 66

	}

}
