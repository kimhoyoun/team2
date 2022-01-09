package study.day0109;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}


class Ex10{
	public Vector<Shape> v = new Vector<>();
	public Scanner sc = new Scanner(System.in);
	
	
	public Ex10() {
		run();
	}

	private void run() {
		System.out.println("그래픽 에디터 실행");
		System.out.print("삽입, 삭제, 모두보기, 종료 >> ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:	input(); break;
		case 2: delete(); break;
		case 3: print(); break;
		case 4: 
			System.out.println("종료");
			System.exit(0);
		default: System.out.println("해당사항 없습니다."); run();
		}
		run();
	
	}

	private void input() {
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		int no = sc.nextInt();
		
		switch(no) {
		case 1: v.add(new Line()); break;
		case 2: v.add(new Rect()); break;
		case 3: v.add(new Circle()); break;
		}
	}

	private void delete() {
		System.out.print("삭제할 도형의 위치 >>");
		int idx = sc.nextInt() -1;
		
		if(idx > v.size()) {
			System.out.println("삭제할 수 없습니다.");
			return;
		}
		
		v.remove(idx);
		
	}

	private void print() {
		Iterator<Shape> i = v.iterator();
		while(i.hasNext()) {
			i.next().draw();
		}
	}
	
	
}
public class Ex10Main {

	public static void main(String[] args) {
		new Ex10();
	}

}
