package io.github.dudri63.dataStructure.ArrayStack;

import java.util.Scanner;

public class Ex_ArrayStack {
	public static void main(String[] args) {
		System.out.println("스택의 사이즈를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		ArrayStack as = new ArrayStack(input);	// arraystack 생성
		for(;;) {	
			System.out.println("1. push, 2. pop, 3. print, 4. 종료");
			Scanner sc1 = new Scanner(System.in);
			String input1 = sc1.next();
			if (input1.contentEquals("1")) {
				System.out.println("Stack에 삽입할 문자를 입력하시오.");
				Scanner sc11 = new Scanner(System.in);
				char input11 = sc11.next().charAt(0);
				as.push(input11);
			}
			else if (input1.contentEquals("2")) {
				as.pop();
			}
			else if (input1.contentEquals("3")) {
				as.printStack();
			}
			else if (input1.contentEquals("4")) {
				return;
			}
			else {
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}
	}
}
