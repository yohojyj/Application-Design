package com.bit.weather;

public class Clothes {

	public String outfit(double a){
// 입력값이 들어오면, 온도의 인자를 받아서 넣으면..		
		double tem =  a;
	    String clo = null; 
		
	    if(tem>=27){ 
	    	   clo  = "민소매, 반팔, 반바지, 원피스";	
	    }else if(22<tem&&tem<=26){
	    	   clo  = "반팔, 얇은 셔츠, 얇은 긴팔, 면바지";
	    }else if(19<tem&&tem<=22){
	    	   clo  = "얇은 가디건, 긴팔, 면바지, 청바지";
	    }else if(16<tem&&tem<=19){
	    	   clo  = "니트, 가디건, 맨투맨, 청바지, 면바지, 슬랙스, 원피스";
	    }else if(11<tem&&tem<=16){
	    	   clo  = "자켓, 셔츠, 가디건, 간절기 야상, 스타킹";
        }else if(9<tem&&tem<=11){
        	   clo  = "트렌치 코트, 간절기 야상, 여러겹 껴입기";
        }else if(5<tem&&tem<=9){
        	   clo  = "코트, 가죽자켓, 히트텍";
        }else if(0<tem&&tem<=5){
        	   clo  = "패딩, 두꺼운 코트, 기모제품, 목도리 등";
        }else if(tem<=0){
        	   clo  = "두꺼운 패딩, 파카 코트 등 방한 아웃도어 제품";
        }		 
	    return clo; 	
	}//

	
	
}//class end
