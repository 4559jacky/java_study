package com.gn.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		// 1. ArrayList에 초기좌석 A2, A1, B2, B1를 추가합니다.
		// 2. ArrayList의 초기 좌석 정보를 추가한 후(1) 출력하세요.
		seats.add("A2");
		seats.add("A1");
		seats.add("B2");
		seats.add("B1");
		
		System.out.println("초기 좌석 목록: "+seats);
		
		// 3. 영화관 좌석중에서 3번째 좌석에 A3 좌석을 추가합니다.
		seats.add(2, "A3");
		// 4. 그 다음, 영화관 좌석 목록을 출력하세요.
		System.out.println("A3 좌석 추가 후: "+seats);
		
		// 5. 예약하고 싶은 좌석의 정보를 키보드로 입력받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("예약 좌석 : ");
		String zzimSeat = sc.nextLine();
		// 6. 만일 사용자가 입력한 좌석이 존재하는 좌석이라면
		// 해당 좌석의 정보뒤에 (예약)이라는 문자열을 추가해주세요.
		if(seats.contains(zzimSeat)) {
			int num = seats.indexOf(zzimSeat);
			seats.set(num, zzimSeat+"(예약)");
		} else {
			System.out.println(zzimSeat+"은(는) 존재하지 않는 좌석입니다.");
		}
		System.out.println("좌석 예약 후: "+seats);
		// 7. 삭제하고 싶은 좌석의 정보를 키보드로 입력받습니다.
		System.out.print("삭제 좌석 : ");
		String removeSeat = sc.nextLine();
		
		// 8. 만일 사용자가 입력하는 좌석이 존재하는 좌석이라면
		// 해당 좌석을 제거한 후 목록을 출력해주세요.
		if(seats.contains(removeSeat)) {
			seats.remove(removeSeat);
			System.out.println("좌석 삭제 후: "+seats);
		} else {
			System.out.println(removeSeat+" 좌석은 목록에 없습니다.");
			System.out.println("좌석 삭제 후: "+seats);
		}

		
		Collections.sort(seats);
		System.out.println("좌석 정렬 후: "+seats);
	}
}
