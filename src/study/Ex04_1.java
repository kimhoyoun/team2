package study;

public class Ex04_1 {

	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } };
		
		int[][] sum = new int[score.length+1][score[0].length+1];
		
		for(int i = 0; i<score.length; i++) {
			for(int j =0; j<score[i].length; j++) {
				sum[i][j] = score[i][j];
				sum[i][score[i].length] +=score[i][j];
				sum[score.length][j] += score[i][j];
				sum[score.length][score[i].length] += score[i][j];
			}
		}
		
		for(int i = 0; i<sum.length; i++) {
			for(int j=0; j<sum[i].length; j++) {
				System.out.printf("%3d ",sum[i][j]);
			}
			System.out.println();
		}
	}

}
