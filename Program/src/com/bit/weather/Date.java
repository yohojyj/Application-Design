package com.bit.weather;

import java.util.Scanner;

public class Date {

	public int date() {

		int year = 0, month = 0, day = 0;

		Scanner sc = new Scanner(System.in);

		boolean boo = true;
		while (boo) {
			System.out.println("년도를 입력하세요");

			year = sc.nextInt();
			try {

				if ((year >= 2010) && (year <= 2020)) {
					System.out.println("월을 입력하세요.");
					boo = false;

				} else {
					year = year / 0;
				}

			} catch (Exception e) {
				System.out.println("형식에 맞춰서 입력해주세요.");

			}
		}

		boo = true;
		while (boo) {
			month = sc.nextInt();

			try {
				if (month >= 1 && month <= 12) {
					System.out.println("날짜를 입력하세요");
					boo = false;
				} else {
					month = month / 0;
				}
			} catch (Exception e) {
				System.out.println("형식에 맞춰서 입력해주세요.");

			}
		}
		boo = true;
		while (boo) {
			day = sc.nextInt();

			try {
				if (day >= 1 && day <= 31) {
					System.out.println("오늘은 " + year + "년 " + month + "월 " + day
							+ "일 입니다.");
					boo = false;
				} else {
					day = day / 0;
				}
			} catch (Exception e) {
				System.out.println("형식에 맞춰서 입력해주세요.");
			}

		}

		return month;
  
	}

}
