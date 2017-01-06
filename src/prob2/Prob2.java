package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5];
		double sum = 0;
		int count= 0;
		
		System.out.println(intArray.length+"개의 숫자를 입력하세요.");
		for(int i=0;i<5;i++){
			intArray[i]=scanner.nextInt();
			sum+=intArray[i];
			count++;
		}
		System.out.println("평균은 "+(sum/count)+" 입니다.");
		
		

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */

		/* 배열에 저장된 정수 값 더하기 */

		/* 출력 */

		/* 자원정리 */
		scanner.close();
	}
}
