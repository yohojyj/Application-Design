package com.bit.weather;

public class Music {

	  public void music(int month) {

	      System.out.println("♩♪♬♪♬오늘의 날씨와 어울리는 음악은?♩♪♬♪♬");
	      System.out.println();
	      int i = month;
	      
	      int m = (int) (Math.random() * 3) + 1; // 최대3 최소1의 값이 나오도록 설정

	      if (i == 1) { // 1월을 선택했을 때,
	         switch (m) { // 미리 설정해둔 스위치로 값이 랜덤으로 들어가게끔 설정
	         case 1:
	            System.out.println("Jon Vinyl - Moments");
	            break; // break로 값이 1개 이상으로 나오면 종료될 수 있게끔 했습니다
	         case 2:
	            System.out.println("멜로망스 - 감사");
	            break;
	         case 3:
	            System.out.println("Bruno Major - Easily");
	            break;
	         }
	      }

	      else if (i == 2) {
	         switch (m) {
	         case 1:
	            System.out.println("멜로망스 - 선물");
	            break;
	         case 2:
	            System.out.println("UMI - Ordinary");
	            break;
	         case 3:
	            System.out.println("Pink Sweat$ - Honesty");
	            break;

	         }
	      } else if (i == 3) {
	         switch (m) {
	         case 1:
	            System.out.println("적재 - 별보러 가자");
	            break;
	         case 2:
	            System.out.println("Alt Bloom - October Eyes");
	            break;
	         case 3:
	            System.out.println("아이유 - 봄, 사랑, 벚꽃말고");
	            break;

	         }
	      } else if (i == 4) {
	         switch (m) {
	         case 1:
	            System.out.println("벚꽃엔딩 - 버스커버스커");
	            break;
	         case 2:
	            System.out.println("우연히 봄 - 로꼬, 유주");
	            break;
	         case 3:
	            System.out.println("나만 봄 - 볼빨간 사춘기");
	            break;
	         }
	      } else if (i == 5) {
	         switch (m) {
	         case 1:
	            System.out.println("봄날 - 방탄소년단");
	            break;
	         case 2:
	            System.out.println("Regent's Park - Bruno Major");
	            break;
	         case 3:
	            System.out.println("give love - 악동뮤지션");
	            break;
	         }

	      } else if (i == 6) {
	         switch (m) {
	         case 1:
	            System.out.println("유용민 - 사랑 앞에서");
	            break;
	         case 2:
	            System.out.println("싸이 - 예술이야");
	            break;
	         case 3:
	            System.out.println("JAWNY - Honeypie");
	            break;

	         }

	      } else if (i == 6) {
	         switch (m) {
	         case 1:
	            System.out.println("유용민 - 사랑 앞에서");
	            break;
	         case 2:
	            System.out.println("싸이 - 예술이야");
	            break;
	         case 3:
	            System.out.println("JAWNY - Honeypie");
	            break;

	         }
	      } else if (i == 7) {
	         switch (m) {
	         case 1:
	            System.out.println("여름아 부탁해 - 인디고");
	            break;
	         case 2:
	            System.out.println("헤이즈 - And July");
	            break;
	         case 3:
	            System.out.println("Clay And Friends - Going up the Coast");
	            break;
	         }
	      } else if (i == 8) {
	         switch (m) {
	         case 1:
	            System.out.println("쿨 - 해변의 연인");
	            break;
	         case 2:
	            System.out.println("잔나비 - 뜨거운 여름밤은 가고 남은 건 볼품없지만");
	            break;
	         case 3:
	            System.out.println("싹스리 - 여름안에서");
	            break;
	         }
	      } else if (i == 9) {
	         switch (m) {
	         case 1:
	            System.out.println("밤편지 - 아이유");
	            break;
	         case 2:
	            System.out.println("free love - honne");
	            break;
	         case 3:
	            System.out.println("백예린 - square");
	            break;
	         }
	      } else if (i == 10) {
	         switch (m) {
	         case 1:
	            System.out.println("성시경 - 영원히");
	            break;
	         case 2:
	            System.out.println("free love - honne");
	            break;
	         case 3:
	            System.out.println("Mac Ayres - Under");
	            break;
	         }
	      } else if (i == 11) {
	         switch (m) {
	         case 1:
	            System.out.println("Route 66 · George Benson");
	            break;
	         case 2:
	            System.out.println("백예린 - november song");
	            break;
	         case 3:
	            System.out.println("Joey Stamper Mashup - Lover / Earth Angel");
	            break;
	         }
	      } else if (i == 12) {
	         switch (m) {
	         case 1:
	            System.out
	                  .println("Yes Sir, That’s My Baby (Alternate Take) · Frank Sinatra");
	            break;
	         case 2:
	            System.out
	                  .println("Andrews Sisters - I'd Like To Hitch A Ride With Santa Claus");
	            break;
	         case 3:
	            System.out
	                  .println("All I Want for Christmas Is You - Mariah Carey");
	            break;
	         }
	      }
	   }

	}