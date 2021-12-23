package study;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
			int answer[][] = {
			{ 1, 3, 2, 4, 3, 1, 4, 2, 2, 1 },
			{ 3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
			{ 2, 4, 3, 2, 1, 2, 1, 3, 3, 4 },
			{ 2, 3, 3, 1, 1, 3, 2, 2, 4, 4 },
			{ 3, 1, 1, 2, 4, 1, 2, 3, 1, 3 }};
			
			int canswer[] = new int[10];
			Scanner stdin = new Scanner(System.in);
			
			System.out.print("정답을 입력하세요(10개) : ");
			for (int i = 0; i < canswer.length ; i++) {
				canswer[i] = stdin.nextInt();
			}
			if ( canswer.length != 10 ) {
				System.out.println("정답의 개수가 맞지 않습니다");
				return;
			}
			for(int i = 0 ; i < 5 ; i++ ) {
				int score = 0;
				for (int j = 0 ; j < answer[i].length ; j++ ) {
					if (answer[i][j] == canswer[j])
						score++;
				}
			System.out.println("학생 " + ( i + 1 ) + "의 점수 : " +score + "점" );
			}
			}
	}


