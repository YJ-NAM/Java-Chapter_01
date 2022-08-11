package khie;

/*
 * 실수자료형 : 소수점이 존재하는 자료형
 * - float : 소수점 이하 6~7자리까지 표현 가능
 * - double(기본형) : 소수점 이하 15~16자리까지 표현 가능
 * - float 자료형의 변수에 실수값을 저장 시에는 반드시 실수값 뒤에 f를 붙여 주어야 함(생략 시 error)
 * 	 오류 발생 이유 : 실수형의 기본자료형은 double 형이기 때문
 * 	 그냥 실수 입력 시 double형(8byte)으로 인식됨
 * - 실수 자료형에서 명시적 형변환을 진행하더라도 자료의 손실은 거의 발생하지 않음
 */

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dNum = 123.45666;
		System.out.println("dNum >>> " + dNum);
		
		float fNum = (float)123.45666;
//		float fNum = 123.45666f; 둘 중 하나를 사용하면 됨
		System.out.println("fNum >>> " + fNum);

	}

}
