package com.bit.weather;

import java.util.Scanner;




public class Weather {



	public static void main(String[] args) {
		
		      System.out.println();
		      System.out.println("================▶ Hello ? Good Morning ! ◀================");
		      System.out.println();
		      System.out.println("안내에 따라 날짜를 숫자만 입력해주세요:)");
		      System.out.println("Ex) 2020 / 11 / 26");
		      System.out.println();
		      System.out.println("----------------------------------------------------------");
		   
		Scanner sc = new Scanner(System.in);
		Date output = new Date();
		int month = output.date();
		      System.out.println("----------------------------------------------------------");
		      
		      Temperature temp = new Temperature();

		      System.out.println();
		      Clothes clothing = new Clothes();
		      String result = clothing.outfit(temp.temperature(month));  //리턴 값을 받음
		      System.out.println();
		      System.out.println("오늘의 옷차림은 <" + result + "> 를 추천합니다."); // 인스턴스랑 동명
		      System.out.println();
		      System.out.println("=========================================");
		      System.out.println("추가기능을 고르시겠습니까?");
		      System.out.println();

		      boolean boo = true;
		      while (boo) {
		         System.out.println("1.오늘의 음악");
		         System.out.println("2.오늘의 생활 팁");
		         System.out.println("3.나가기");
		         int choice = sc.nextInt();
		         if (choice == 1) {
		            System.out.println("=========================================");
		            System.out.println();
		            Music bgm = new Music();
		            bgm.music(month);
		            System.out.println();
		            System.out.println("=========================================");
		         } else if (choice == 2) {
		            System.out.println("=========================================");
		            System.out.println();
		            LivingTip living = new LivingTip();
		            living.tip(month);
		            System.out.println();
		            System.out.println("=========================================");
		         } else if (choice == 3) {
		            break;
		         }
		         System.out.println("계속 하시겠습니까?");
		      }

		      sc.close();
		      System.out.println("좋은하루 보내세요:-)");
    }
}
		
