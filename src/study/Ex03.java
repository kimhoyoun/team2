package study;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		//랜덤한 값 10개가 들어간 배열 생성
		int[] arr;
		arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));

		//중복된 숫자 제거하기
		int[] temp = new int[5];
		int index = 0;
		for(int i = 0; i < arr.length; i++){
			boolean flag = false;
		    	for(int j = 0; j < temp.length; j++){
		    	if(arr[i] == temp[j]){
		        	flag = true;
		        }
		    }
		    if(!flag){
		    	temp[index++] = arr[i];
		    }
		}
		System.out.println(Arrays.toString(temp));

		//배열 길이 맞춰주기
		int[] result = new int[index];
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));

	}

}
