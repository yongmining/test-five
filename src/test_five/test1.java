package test_five;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/* 영민이는 프로그램을 이용하여 계산기를 만들려고 한다.
		하지만 영민이는 프로그램을 얼마 배우지 않아 어려워하고있다.
		우리가 영민이를 위해 계산기 프로그램을 만들어주자.
		입력
		연산식이 한줄로 입력된다.
		연산식의 형식은 정수+정수 또는 정수-정수 또는 정수*정수 또는 정수/정수의 형태이다.
		출력
		계산 결과를 정수로 출력한다.
		나눗셈일 경우 실수로 출력하되 소수 둘째자리까지 출력한다.
		(0으로 나누는 경우는 입력되지 않는다.)
		입력 예시 
		10  (정수로 입력받음)
		+   (문자로 입력받음)
		10  (정수로 입력받음)
		출력 예시
		20
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요>");
		int a = sc.nextInt();
		System.out.print("연산자를 입력해 주세요>");
		String cal = sc.next();
		System.out.print("숫자를 입력해 주세요>");
		int b = sc.nextInt();
		
		switch(cal) {
		
		case "+":
			System.out.println(a+"+"+b+"="+a+b);
			break;
		case "-":
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*":
			System.out.println(a+"x"+b+"="+(a*b));
			break;
		case "/":
			System.out.println(a+"/"+b+"="+((float)a/(float)b));
			break;
			
		}
		
	}

}
