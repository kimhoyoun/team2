package study.day0109;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch08Ex10 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("phone.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		HashMap<String, String> map = new HashMap<>();
		String str = null;
		while ((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			map.put(st.nextToken(), st.nextToken());
		}
		
		br.close();
		// 파일 읽고 맵에 저장 끝
		
		
		
		System.out.printf("%d개의 전화번호를 읽었습니다.\n", map.size());
		
		while(true) {
			System.out.print("이름 >> ");
			String name = sc.next();
			
			if("그만".equals(name)) {
				break;
			}
			
			if(map.containsKey(name)) {
				System.out.println(map.get(name));
			}else {
				System.out.println(name+"은 없습니다.");
			}
		}
		
		
	}
}
