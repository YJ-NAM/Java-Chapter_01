package khie;

// 두 개의 변수에 있는 값을 서로 교환 해보자

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 선언 및 변수 초기화
		int su1 = 47;
		int su2 = 82; 
//		int su1 = 47, su2 = 82; // 자료형이 같을 시 이렇게 기입해도 됨
		System.out.println("변경 전");
		System.out.println("su1 >>> " + su1);
		System.out.println("su2 >>> " + su2);
		System.out.println();
		
		// 방법 1
		/*int tmp = su1;
		su1 = su2;
		su2 = tmp;
		
		System.out.println("변경 후");
		System.out.println("su1 >>> " + su1);
		System.out.println("su2 >>> " + su2);
		*/
//		System.out.println("tmp >>> " + tmp);
		
		// 방법 2
		int tmp = su2;
		su2 = su1;
		su1 = tmp;
		
		System.out.println("변경 후");
		System.out.println("su1 >>> " + su1);
		System.out.println("su2 >>> " + su2);

	}

}
