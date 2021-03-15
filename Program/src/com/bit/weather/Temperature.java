package com.bit.weather;

public class Temperature {

	   public double temperature(int month) {

		      double[][] tem = new double[][] {
		            { -2.4, 0.4, 5.7, 12.5, 17.8, 22.2, 24.9, 25.7, 21.2, 14.8, 7.2, 0.4 }, // 평균온도
		            { 1.5, 4.7, 10.4, 17.8, 23.0, 27.1, 28.6, 29.6, 25.8, 19.8, 11.6, 4.3 }, // 최고온도
		            { -5.9, -3.4, 1.6, 7.8, 13.2, 18.2, 21.9, 22.4, 17.2, 10.3, 3.2, -3.2 } }; // 최저온도

		      System.out.println("오늘의 평균기온은 " + tem[0][month - 1] + "℃ (최고기온" + tem[1][month - 1] + 
		                       "℃, 최저기온 " + tem[2][month - 1] + "℃) 입니다.");

		      return tem[0][month - 1];

		   }

		}