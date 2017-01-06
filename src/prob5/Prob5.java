package prob5;

import java.util.Scanner;

public class Prob5 {
	//max와 min 변수 설정 후 계속 바꿔주기
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int score=1;
		int close=0;

		while(close==0){
			int random=(int)(Math.random()*101);
			int max=100,min=1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");

			while(true){
				System.out.println(min+"-"+max);
				System.out.print(score+">>");
				int num=sc.nextInt();
				score++;

				if(num==random){
					System.out.println("맞았습니다");
					System.out.print("다시하시겠습니까(y/n)>>");
					String answer=sc.next();
					score=1;

					if(answer.equals("n")){
						System.out.println("프로그램을 종료합니다.");
						close++; //무한루프를 정지시키기 위한 변수
						break;
					}
					
					else //random을 초기화 시키기위한 조건
						break;
				}

				else{
					if(num>random){//더 낮게를 외쳐야 될 경우
						max=num;
						System.out.println("더 낮게");						
					}

					else{ //더 높게를 외쳐야 될 경우
						min=num;
						System.out.println("더 높게");
					}
				}
			}
		}
	}
}