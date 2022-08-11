package khie;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언 및 변수 초기화
		
		byte su = 127;
		
		System.out.println("su >>> " + su);
		
		// 자료형의 형변환 작업(묵시적 형변환)
		int su1 = su; // 노란색 밑줄: 변수 사용하지 않았을 때 나옴
		/*
		 * 이 부분에서도 형변환이 일어났음
		 * 자동형변환; su1이 int 형태로 4byte여서 더 큰 값이므로 자동으로 변환됨
		 */
		
//		System.out.println("su1 >>> " + su1);
		
		int su2 = 150;
		System.out.println("su2 >>> " + su2);
		
		// 자료형의 형변환 작업(명시적 형변환)
		byte su3 = (byte)su2;
		
		// Type mismatch 자료형 불일치/ su3 byte 타입(1 byte), su2 int type(4 byte)
		// casting(형변환)필요 byte 형태로 변경해주세요.
		
		System.out.println("su3 >>> " + su3);
		/*
		 * su3 변수의 값이 -106이 나온 이유
		 * - byte 자료형의 범위(-128~127)를 벗어났기 때문에 쓰레기 값이 나오게 되었음
		 */
		/*
		 * 형변환(casting) : 해당 데이터 값의 자료형을 다른 타입의 자료형으로 변환하는 것을 말함
		 *  - boolean 형을 제외한 7가지 자료형은 서로 형변환이 가능함
		 *  
		 *  1. 묵시적 형변환
		 *   ==> 자료형의 크기가 작은 데이터를 큰 자료형의 데이터에 저장
		 *   	 이 때는 형변환 작업을 안 해주어도 됨
		 *   
		 *  2. 명시적 형변환
		 *   ==> 자료형의 크기가 큰 데이터를 작은 자료형의 데이터에 저장
		 *   	 이 때는 반드시 형변환 작업 필요
		 *   	 형변환 작업 시 자료의 손실이 발생할 수 있음
		 *   
		 */
	}

}
