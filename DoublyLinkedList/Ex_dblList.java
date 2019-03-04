package io.github.dudri63.dataStructure.DoublyLinkedList;

import java.util.Scanner;

public class Ex_dblList {
	public static void main(String args[]) {
		System.out.println("현재 리스트는 공백입니다.");
		DblList DL = new DblList();
		for(;;) {
			System.out.println("원하시는 연산의 번호를 입력하십시오.");
			System.out.println("1. 삽입, 2. 삭제, 4. 출력, 5. 프로그램 종료");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			if(input.equals("1")) {
				System.out.println("원하는 삽입의 방식을 선택하십시오.");
				System.out.println("1. 앞으로 삽입, 2. 중간으로 삽입, 3. 뒤로 삽입");
				Scanner sc1 = new Scanner(System.in);
				String input1 = sc.next();
				if(input1.contentEquals("1")) {
					System.out.println("삽입할 데이터를 입력하십시오");
					Scanner sc11 = new Scanner(System.in);
					String input11 = sc11.next();
					DL.insertFirstNode(input11);
				}
				else if(input1.contentEquals("2")) {
					System.out.println("삽입할 위치 앞에 작성하였던 데이터를 입력하십시오");
					Scanner sc121 = new Scanner(System.in);
					String input121 = sc121.next();
					System.out.println("삽입할 데이터를 입력합십시오.");
					Scanner sc122 = new Scanner(System.in);
					String input122 = sc122.next();
					DblNode pre = DL.searchNode(input121);
					if(pre == null) {
						System.out.println("이전에 입력한 데이터가 아닙니다.");
					}
					else {
						DL.insertMiddleNode(pre, input122);
					}
				}
				else if(input1.equals("3")) {
					System.out.println("삽입할 데이터를 입력하십시오.");
					Scanner sc13 = new Scanner(System.in);
					String input13 = sc13.next();
					DL.insertLastNode(input13);
				}
			}
			else if(input.equals("2")) {
				System.out.println("원하는 삭제의 방식을 선택하십시오.");
				System.out.println("1. 중간 노드 삭제, 2. 마지막 노드 삭제");
				Scanner sc2 = new Scanner(System.in);
				String input2 = sc2.next();
				if(input2.contentEquals("1")) {
					System.out.println("삭제할 위치 앞에 작성하였던 데이터를 입력하십시오");
					Scanner sc21 = new Scanner(System.in);
					String input21 = sc21.next();
					DblNode pre = DL.searchNode(input21);
					if(pre == null) {
						System.out.println("이전에 입력한 데이터가 아닙니다.");
					}
					else {
						DL.deleteMiddleNode(pre);
					}
				}
				else if(input2.equals("2")) {
					DL.deleteLastNode();
				}
			}
			else if(input.contentEquals("4")) {
				System.out.println("현재 리스트 상태는 다음과 같습니다.");
				DL.printLinkedList();
			}
			else if(input.equals("5")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}		
	}
}
