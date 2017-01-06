package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={50000,10000,5000,1000,500,100,50,10,5,1};
		System.out.print("금액 : ");
		int money=sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
			int num=money/arr[i];
			int num1=money%arr[i];
			money=num1;
			System.out.println(arr[i]+"원 : "+num+"개");
		}
	}
}