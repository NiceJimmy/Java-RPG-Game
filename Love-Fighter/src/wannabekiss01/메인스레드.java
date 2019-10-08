package wannabekiss01;

import java.util.Scanner;

public class 메인스레드 implements Runnable {

	
	public 메인스레드() {}
	
	
	public void run() {
		
		Music1 배경음악 = new Music1("jucy.mp3",true);
		배경음악.start();
		
		Scanner 스캐너 = new Scanner(System.in);
		주인공 주인공객체 = new 주인공();
		weaponshop 무기상점 = new weaponshop();
		drugstore 한약방 = new drugstore();
		HOF 호프집 = new HOF();
		cosmeticshop 화장품점 = new cosmeticshop();
		Shop 상점 = new Shop();
		
		
		System.out.println();
		System.out.println("                     "+"<< Love Hunter >>");
		System.out.println();
		System.out.println();
		System.out.println("나는 30년째 솔로이다.. 항상용기가 없어 시도도 못해봤지만");
		System.out.println("오늘 굳은 결심을 하고 마음에 드는 여성을 유혹하기로 맹세한다.");

		
		
		System.out.println("오늘밤 클럽으로 원정을 떠나려면 1을 입력하시오");
		
		
	         int  원정 = 스캐너.nextInt();
         		
		     if(원정==1) {
			  System.out.println();
			  System.out.println();
			  System.out.println("하고싶은 일의 번호를 입력하시오");
			  System.out.println("===========================================");
			  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
			  System.out.println();
			  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
			  System.out.println();
			  System.out.println("7.시작하기");
			  System.out.println("===========================================");
			  
			  

			  
			  
			  
			      int i;
				  while((i=스캐너.nextInt())!=7 ) {//1입력하면 인벤 반복, 2번 입력하면 while 빠져나감
				  
					  
					  if( i==1 ) {

						  주인공객체.나의상태();
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("하고싶은 일의 번호를 입력하시오");
						  System.out.println("===========================================");
						  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
						  System.out.println();
						  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
						  System.out.println();
						  System.out.println("7.시작하기");
						  System.out.println("===========================================");					      }
				  
					  if( i==2 ) {

						  주인공객체.돈벌기(주인공객체);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("하고싶은 일의 번호를 입력하시오");
						  System.out.println("===========================================");
						  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
						  System.out.println();
						  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
						  System.out.println();
						  System.out.println("7.시작하기");
						  System.out.println("===========================================");					      }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				  
					  if( i==3 ) {

						  주인공객체.한약구매하기(한약방);
						  
						  System.out.println();
						  System.out.println();
						  System.out.println("하고싶은 일의 번호를 입력하시오");
						  System.out.println("===========================================");
						  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
						  System.out.println();
						  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
						  System.out.println();
						  System.out.println("7.시작하기");
						  System.out.println("===========================================");					      }
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////			  
					  if( i==4  ) {

						  주인공객체.술먹으러가기(호프집);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("하고싶은 일의 번호를 입력하시오");
						  System.out.println("===========================================");
						  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
						  System.out.println();
						  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
						  System.out.println();
						  System.out.println("7.시작하기");
						  System.out.println("===========================================");					      }
					  
					  if( i==5  ) {

						  주인공객체.화장품점가기(화장품점);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("하고싶은 일의 번호를 입력하시오");
						  System.out.println("===========================================");
						  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
						  System.out.println();
						  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
						  System.out.println();
						  System.out.println("7.시작하기");
						  System.out.println("===========================================");					      }
					  
					  if( i==6  ) {

						  주인공객체.무기점가기(무기상점);
						  
					      
		               
						  System.out.println();
						  System.out.println();
						  System.out.println("하고싶은 일의 번호를 입력하시오");
						  System.out.println("===========================================");
						  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
						  System.out.println();
						  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
						  System.out.println();
						  System.out.println("7.시작하기");
						  System.out.println("===========================================");					      }
					  
				  }
				  
				  
				  
				  
				  
				  
				  
				  
				  
					  System.out.println();
					  System.out.println("===================================");
					  System.out.println("음 준비를 다 끝냈으니, 떠나볼까!");
					  System.out.println("요즘 물좋고 핫한 수유 '별이 빛나는 밤에'를 가볼까!");
					  System.out.println("클럽앞에 도착해서 입장하려고 합니다.");
					  System.out.println("앗! 그런데 가드가 가로막는군요!");
					  System.out.println("가드 왈 : 잠깐, 아.. 여기 젊은애들 오는덴데 아재가 오시면 어떡해요");
					  System.out.println("저기 길건너 관광나이트나 가세요");
					  System.out.println();
					  System.out.println("나 : 아니 내돈내고 내가 간다는데 왜!");
					  System.out.println("나 : 내가 어딜봐서 아재인데? 엉?");
					  System.out.println();
					  System.out.println("가드 : 아 이아저씨가 짜증나게하네, 맞을래? 돌아갈래?");
					  System.out.println();
					  System.out.println("매우 열받는다.. 싸울까 돌아갈까 고민을 시작한다.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////					  
					  
					  
					  System.out.println("싸움을 시작하려면 1번, 포기하려면 2번을 입력하시오.");
					  System.out.println();
					  int 싸움 = 스캐너.nextInt();
					  if(싸움==1) {
						  
						  System.out.println("싸움을 시작합니다.");
						 
						  
						  가드 가드객체 = new 가드();
						  for(int h =가드객체.악당P; h>=0; h--) {
							 
							  
							  if(주인공객체.P>100) {
								  if(가드객체.악당P>0) {
								  
								  System.out.println("");
								  System.out.println("==================");
							 
								  가드객체.가드테이저건공격(주인공객체);
								  System.out.println("=======================");
								  
								  System.out.println("질수야 없지! 공격방식을 선택하시오");
								  System.out.println("1. 쨉 2. 단검 3. 망치");
								      int 반격 = 스캐너.nextInt();
								          if(반격==1) {
								        	  System.out.println("==================");
											주인공객체.쨉공격(가드객체);
								            System.out.println("=======================");
								            
								            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								          
								          }
								          
								          if(반격==2) {
								        	  if(주인공객체.단검여부>10) {
								        		  주인공객체.단검공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 60 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        	  }
								        	  else {
								        		  System.out.println("단검를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
												주인공객체.쨉공격(가드객체);								        	 
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");  
								        	    }
      								          }
								          if(반격==3) {
								        	  if(주인공객체.망치여부>10) {
								        		  주인공객체.망치공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 70 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        	  }
								        	  else {
								        		  System.out.println("망치를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
												주인공객체.쨉공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        		  }
							                  }
						               
							  
								          if(주인공객체.P<200) {
											  System.out.println(" 젠장.. 너무 강해서 이길 수가 없습니다..");
												System.out.println();
												System.out.println(" 도망가자!!!!");
												System.out.println();
												System.out.println("---------------G A M E    O V E R-----------------");
										        }
							  
								  }
							  
								  
							  
						/////////////////////////////////////////////////////////////////////////////////////////////////////////////	  
							          
							  }
							  
							  
							  
							  
							  }
						  
						  
						  
						  
						  if(가드객체.악당P<0) {
						  
						  System.out.println();
						  System.out.println("=======================================");
						  System.out.println("가드를 이겼습니다! 깡따구 500과 보유재산 1000이 상승하였습니다!");
					      주인공객체.깡따구 = 주인공객체.깡따구 + 500;
					      주인공객체.보유재산 = 주인공객체.보유재산 + 1000;
					      System.out.println();
						  System.out.println("현재 인벤토리 상태");
						  System.out.println();
						  System.out.println("P :"+ 주인공객체.P);
						  System.out.println("깡따구 : "+주인공객체.깡따구);
						  System.out.println("매력도 : "+주인공객체.매력도);
						  System.out.println("보유재산 : "+주인공객체.보유재산);
						  }
		     ////////////////////////////////////////////////////////////////////////////////////////
						  System.out.println();
						  System.out.println("대단하네요! 가드를 꺾어버리다니.. 훌륭합니다.");
						  System.out.println("이제 본격적으로 마음에 드는 이성을 찾으러 가봅시다!");
						  System.out.println();
						  System.out.println("하고싶은 일을 선택하시오");
						  
						  System.out.println("===========================================");
						  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
						  System.out.println();
						  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
						  System.out.println();
						  System.out.println("7.시작하기");
						  System.out.println("===========================================");
						  System.out.println();
						  
						  int s;
						  while((s=스캐너.nextInt())!=7 ) {//1입력하면 인벤 반복, 2번 입력하면 while 빠져나감
						  
							  
							  if( s==1 ) {

								  주인공객체.나의상태();
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("하고싶은 일의 번호를 입력하시오");
								  System.out.println("===========================================");
								  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
								  System.out.println();
								  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
								  System.out.println();
								  System.out.println("7.시작하기");
								  System.out.println("===========================================");					      }
						  
							  if( s==2 ) {

								  주인공객체.돈벌기(주인공객체);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("하고싶은 일의 번호를 입력하시오");
								  System.out.println("===========================================");
								  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
								  System.out.println();
								  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
								  System.out.println();
								  System.out.println("7.시작하기");
								  System.out.println("===========================================");					      }
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				  
							  if( s==3 ) {

								  주인공객체.한약구매하기(한약방);
								  
								  System.out.println();
								  System.out.println();
								  System.out.println("하고싶은 일의 번호를 입력하시오");
								  System.out.println("===========================================");
								  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
								  System.out.println();
								  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
								  System.out.println();
								  System.out.println("7.시작하기");
								  System.out.println("===========================================");					      }
				/////////////////////////////////////////////////////////////////////////////////////////////////////////////			  
							  if( s==4  ) {

								  주인공객체.술먹으러가기(호프집);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("하고싶은 일의 번호를 입력하시오");
								  System.out.println("===========================================");
								  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
								  System.out.println();
								  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
								  System.out.println();
								  System.out.println("7.시작하기");
								  System.out.println("===========================================");					      }
							  
							  if( s==5  ) {

								  주인공객체.화장품점가기(화장품점);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("하고싶은 일의 번호를 입력하시오");
								  System.out.println("===========================================");
								  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
								  System.out.println();
								  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
								  System.out.println();
								  System.out.println("7.시작하기");
								  System.out.println("===========================================");					      }
							  
							  if( s==6  ) {

								  주인공객체.무기점가기(무기상점);
								  
							      
				               
								  System.out.println();
								  System.out.println();
								  System.out.println("하고싶은 일의 번호를 입력하시오");
								  System.out.println("===========================================");
								  System.out.println("1.주인공 상태    2.돈벌기        3.자양강장");
								  System.out.println();
								  System.out.println("4.한잔하기       5.이니숲의리      6.무기사기");
								  System.out.println();
								  System.out.println("7.시작하기");
								  System.out.println("===========================================");					      }
							  
						  }
						  
						  배경음악.close();
						  Music1 클럽음악 = new Music1("클럽입성.mp3",true);
							클럽음악.start();


							
						  
						  
						  
							System.out.println("===============================================");
						  System.out.println("클럽에 입성하였습니다!");
						  System.out.println("앗! 저쪽에 괜찮은 여자가 한명 보입니다!");
						  System.out.println();
						  System.out.println("유혹을 시작하려면 1번, 포기하려면 2번을 입력하시오");
						  int 결심 = 스캐너.nextInt();
						  if(결심==1) {
						  System.out.println("용기를 내어  스텝을 밟아봅니다.");
						  System.out.println("화살표 방향대로 한개씩 입력을 성공하여 스텝을 밟으면 매력도가 상승합니다!");
						  System.out.println("←:a , ↑:w , ↓:s , →:d");
						  System.out.println("스텝 밟을 준비가 됬으면 1을 입력하시오");
						  int 엔터 = 스캐너.nextInt();
						  if(엔터==1) {
						      ThreadTest 유혹미션 = new ThreadTest();
							    
						     
						      
						      try
						      {
						          유혹미션.getInput();
						      }
						      catch( Exception e )
						      {
						          System.out.println( e );
						      }
						      
						      
						      
						      System.out.println( "main exit..." );
						      						      
						      
	///////////////////////////////////////////////////////////////////////////////					      
						      
						      
						      
						      
						      
						      
						      
						      
							    
							    System.out.println("여자 : 어머 ! 춤 되게 잘추시네요~^^");
								 System.out.println("여자 : 혼자오셨어여? ");
								 System.out.println("남자 : 아 네, 스트레스좀 풀려구요~");
								 System.out.println("남자 : 혼자오셨으면 저랑 간단하게 한잔 하실래요?^^");
								 System.out.println("여자 : 음.... 그럴까요? ^^");
								 System.out.println();
								 System.out.println("둘은 테이블로가 술을 마시기 시작한다.");
						  }
						  }
						  
						 int 싸움2 = 스캐너.nextInt();
						 if(싸움2==1) {
							 
							 
							 
							 
							 
						  System.out.println("구웃!");
						  
						  
						  
						 }
						  }
		
		
	}
	
	}
	
	

			
		
	
	
	
	
}
