package com.bit.weather;

public class LivingTip {

	   public void tip(int month) {

		      int i = (int) ((Math.random()*3)+1);
		      
		      System.out.println("*-*-*-*-*-*오늘의 한마디*-*-*-*-*-*");
		      System.out.println();

		      if (month == 1) {
		         
		         if(i == 1){
		         System.out.println("-온수 사용 후 수도꼭지를 냉수 쪽으로 돌려놓으면 난방비를 절약할 수 있답니다.");
		         }else if(i == 2){
		         System.out.println("-무작정 웃어보세요. 때론 웃는 것만으로도 즐거워지는 때가 있습니다.");
		         }else {
		         System.out.println("가장 어두운 밤도 언젠간 끝나고 해는 떠오를 것이다.-반 고흐-");
		         }
		         
		      } else if (month == 2) {
		         if(i == 1){
		         System.out.println("-겨울철 정전기 방지를 위해 머리를 빗을 때 빗을 물에 적셔서 사용해주면 도움이 많이 된대요!");
		         }else if(i == 2){
		         System.out.println("-야채는 건강을 좋게하고 고기는 기분을 좋게 만들어준답니다.");
		         }else {
		         System.out.println("당신이 포기할 때, 나는 시작한다-엘론 머스크-");
		         }
		      } else if (month == 3) {
		         if(i == 1){
		         System.out.println("-겨울옷을 넣을 때가 왔네요. 패딩은 눕힌 후 접어서 직사광선이 없고 통풍이 잘 되는 곳에 보관해주세요. ");
		         }else if(i == 2){
		         System.out.println("-눈이 너무 피로하신가요? 그렇다면 자기전에 한번씩 눈을 온 찜질해주는 것도 많은 도움이 되실거에요: )");
		         }else {
		         System.out.println("아무리 괴로운 시간이라 해도 한 시간은 60분을 넘지 못한다.-모리스 맨덜-");
		         }
		      } else if (month == 4) {
		         if(i == 1){
		         System.out.println("-황사가 불어오는 4월, 외출 전 창문 확인은 하셨나요?");
		         }else if(i == 2){
		         System.out.println("-한 번 포기하면 습관이 된다. 절대 포기하지 말아라");
		         }else {
		         System.out.println("서두르지 말고, 그러나 쉬지도 말고-요한 볼프강 폰 괴테-");
		         }
		      } else if (month == 5) {
		         if(i == 1){
		         System.out.println("-따듯한 봄, 가벼운 스트레칭으로 춘곤증을 날려보세요. 하루에 5~10분정도의 가벼운 운동만으로도 충분하답니다.");
		         }else if(i == 2){
		         System.out.println("-눈건강 생활수칙 지나친 근접작업 피하기, 컴퓨터를 사용할 때는 40-50분정도를 사용하고 10분정도 휴식을 취해주세요!");
		         }else {
		         System.out.println("한 번 포기하면 습관이 된다. 절대 포기하지 말아라-마이클 조던-");
		         }
		      } else if (month == 6) {
		         if(i == 1){
		         System.out.println("-슬슬 더워지기 시작하는 날씨에 기력이 없으시죠? 오늘 점심은 시원한 냉면이 어떠신가요?");
		         }else if(i == 2){
		         System.out.println("-오메가3 성분이 풍부한 고등어, 참치등의 등푸른 생선은 눈 건강에 도움이 된다고해요!");
		         }else {
		         System.out.println("성공한 사람이 아니라 가치있는 사람이 되기 위해 힘쓰라-알버트 아인슈타인-");
		         }
		      } else if (month == 7) {
		         if(i == 1){
		         System.out.println("-낮이 긴 여름, 자외선 차단을 위해서 자외선차단제 꼭 챙겨바르세요!");
		         }else if(i == 2){
		         System.out.println("-어느날 예고없이 힘듦이 찾아왔다면 또, 어느날 예고없이 힘듦이 당신을 떠나갈 거라고 믿어요.");
		         }else {
		         System.out.println("물어보는 사람은 잠시 바보가 된다. 그러나 묻지 않는 사람은 영원히 바보가 된다.-중국 격언-");
		         }
		      } else if (month == 8) {
		         if(i == 1){
		         System.out.println("-장마철 습기로 인한 불쾌지수 해소법, 잠깐의 환기는 습기제거에 도움이 된답니다.");
		         }else if(i == 2){
		         System.out.println("-눈의 피로를 풀어줄 안구운동 같이 시작해볼까요? 집게손가락을 눈높이에 맞춰 눈앞 15cm 거리에 두고 3초간 응시해주세요. 그다음  손가락을 30cm 거리로 멀리 두고 동일하게 3초간 응시해주세요!");
		         }else {
		         System.out.println("아는 것을 안다 하고, 모르는 것을 모른다 하는 것이 말의 근본이다.-순자-");
		         }
		      } else if (month == 9) {
		         if(i == 1){
		         System.out.println("-가을철 건조해지는 피부에 수분공급을 위해 오늘 하루 8컵 이상의 충분한 양의 물을 섭취해주세요! ");
		         }else if(i == 2){
		         System.out.println("-가을은 일광욕하기 좋은 계절이예요. 하루에 30분정도 일광욕을 하면 체내 비타민d 합성으로 면역력과 뼈건강 증진에 도움이 된답니다!");
		         }else {
		         System.out.println("과거가 영원히 변하지 않는다는 것은 나쁜 소식이지만 미래가 아주 다양한 모습으로 우리 손 안에 있다는 것은 좋은 소식이다-앤디 앤드루스-");
		         }
		      } else if (month == 10) {
		         if(i == 1){
		         System.out.println("-미세먼지 농도가 높아지는 가을철, 외출 후 손과 얼굴을 꼭 깨끗이 씻어주세요.");
		         }else if(i == 2){
		         System.out.println("-선선날씨에 따뜻한 차 한잔 어떠세요? 보이차, 국화차, 대추차, 감잎차를 추천드려요");
		         }else {
		         System.out.println("앞으로 20년 후에 당신은 저지른 일보다는 저지르지 않은 것에 더 실망하게 될 것이다.-마크 트웨인-");
		         }
		      } else if (month == 11) {
		         if(i == 1){
		         System.out.println("-11월은 겨울의 초입으로 난방기 사용이 시작되는만큼 화재 예방에 각별한 주의를 기울여주세요. ");
		         }else if(i == 2){
		         System.out.println("-야채는 건강을 좋게하고 고기는 기분을 좋게 만들어준답니다.");
		         }else {
		         System.out.println("게으름뱅이의 손에 누가 권력이나 명예를 안겨줄까-힐티-");
		         }
		      } else if (month == 12) {
		         if(i == 1){
		         System.out.println("-겨울철 실내 적정온도 알고계신가요? 겨울철 실내 적정온도는 19-21도랍니다!");
		         }else if(i == 2){
		         System.out.println("메리크리스마스");
		         }else {
		         System.out.println("무례한 사람의 행위는 내 행실을 바로 잡게 해주는 스승이다.-공자-");
		         }
		      }
		   }

	  
	}