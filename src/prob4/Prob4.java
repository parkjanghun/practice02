package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		char[] c = reverse( s );
		printCharArray( c );
		
		scanner.close();
	}
	
	public static char[] reverse(String str) {
		char[] c= str.toCharArray();
		char[] c1=str.toCharArray();
		for(int i=(c.length-1),j=0;i>=0;i--,j++){
			c1[j]=c[i];
		}
		return c1;				
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
