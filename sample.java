package test;

public class sample {

	public static void main(String[] args) {

char var1 = 'A';
char c1 = 65;
char var2 = '가';
char c2 = 0xD7A3;

 
System.out.println(var1);
System.out.println(c1);

System.out.println(var2);
System.out.println(c2);

double g1 = 10.5;

double d1 = 10.5;

double result = d1 / g1;
double f2 = 2147483648l;
float f3 = 2147483648f;
float f4 = 2147483648f;


System.out.println(f2);
System.out.println(f3);
System.out.println(f4);

String a = "최홍석";
String b = "나는\"최석호\"입니다";

System.out.println(a);
System.out.println(b);
// 자동 형변환

int intA = 10000;
byte byteB = 20;
System.out.println(intA);
System.out.println(byteB);
	
//강제형변환

System.out.println("-------강제형변환----------");


byteB = (byte)intA;

System.out.println(intA);
System.out.println(byteB);

System.out.println("-------실수형변환----------");

double dNum = 20.5;
int iNum = 10;

dNum = iNum; // 자동형변환 dNum = (double)iNum -> dNum = 10.0 실수는
 //정수다 라고 해두었더니 컴퓨터가 자동으로 10이라 안하고 10.0이라고함
System.out.println("dNum:"+ dNum);



dNum = 20.5;
iNum = (int)dNum; //강제형변환 실수를 정수로 강제 형변환했기 때문에 소수점이 잘림  
System.out.println("iNum:" + iNum);


System.out.println("-------정수 나누기---------");
/*
 * 정수 대 정수 연산 = 정수
 * 정수 대 실수 연산 = 실수
 * 실수 대 실수 연산 = 실수
 * 정수 대 문자열 = 문자열
 * 실수 대 문자열 = 문자열
 */
 int iNum2 = 5; 
	int iNum3 = 2;
	dNum = iNum2 / iNum3; //5 / 2 = 2 (정수이므로 소수점이 표시안됨) 
	
	System.out.println("dNum : " + dNum);
	
	dNum = (double)iNum2 / iNum3; //5 / 2 = 2.5
	
	System.out.println("dNum : " + dNum);
	//소수점을 표시하기위해 실수선언을 해준 모습
	
	/*
	 * 이름 명령
	 * 나이 : A <x>  age <o> 알아볼 수 있는 표시가 좋다
	 * 
	 * 클래스명 -> 사람 클래스다 하면 person 같이 직관적으로 알아볼 수 있는 네이밍중요
	 * 영문대소문자 숫자 특수문자( _ , $) 가능 단, 숫자는 맨앞에 올 수 없다
	 * 예약어도 사용불가 선언할 때 쓰는단어들
	 	 */
	
	
	
	}
	}
	