package wannabekiss01;
import java.util.Random;
import java.util.Scanner;

public class mainstory extends Thread  {


	public static boolean 게임중지여부 = false;
	
	public static void main(String[] args) throws Exception{
		

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
		System.out.println("                     "+"<< Love Fighter >>");
		System.out.println();
		System.out.println();
		System.out.println("나는 30년째 솔로이다.. 항상용기가 없어 시도도 못해봤지만");
		System.out.println("오늘 굳은 결심을 하고 마음에 드는 여성을 유혹하기로 맹세한다.");

		
		
		System.out.println("오늘밤 클럽으로 원정을 떠나려면 1을 입력하시오");
		
		
	         int  원정 = 스캐너.nextInt();
	         System.out.println();
	       로딩스레드 로딩 = new 로딩스레드();

	       System.out.println("나갈 채비를 합니다. 조금만 기다려주세요!");	   
	       System.out.println();
	       로딩.start();
	       로딩.join();
	  	         
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
			  
			  

		     }
			  
			  
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
					  System.out.println();
					  로딩스레드 로딩1 = new 로딩스레드();
					  로딩1.start();
			    		 로딩1.join();
			    		 System.out.println();
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
					  
					  System.out.println("몸을 풀어줍니다. 잠시만 기다려주세요!");
					 로딩스레드 로딩2 = new 로딩스레드();
					  System.out.println();
					  
					  로딩2.start();
			    		 로딩2.join();
			    		 System.out.println();
			    		 배경음악.close();
						  Music3 싸움음악 = new Music3("싸움시.mp3",true);
							싸움음악.start();
					  
					  
					  if(싸움==1) {
						  
						  

						  
						  System.out.println("싸움을 시작합니다.");
						 
						  
						  가드 가드객체 = new 가드();
						  for(int h =가드객체.악당P; h>=0; h--) {
							 
							  
							  if(주인공.P>100) {
								  if(가드객체.악당P>0) {
								  
								  System.out.println("");
								  System.out.println("==================");
공격로딩 공격 = new 공격로딩();
System.out.println();
공격.start();
공격.join();
System.out.println("");
								  가드객체.가드테이저건공격(주인공객체);
								  System.out.println("=======================");
								  
								  System.out.println("질수야 없지! 공격방식을 선택하시오");
								  System.out.println("1. 쨉  2. 단검  3. 망치  4. 각목  5. 쇠파이프");
								      int 반격 = 스캐너.nextInt();
								          if(반격==1) {
								        	  System.out.println("==================");
								        	  System.out.println();
								        	  공격로딩 공격2 = new 공격로딩();
								        	  공격2.start();
								        	  공격2.join();
								        	  System.out.println("");
											주인공객체.쨉공격(가드객체);
								            System.out.println("=======================");
								            
								            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								          
								          }
								          
								          if(반격==2) {
								        	  if(주인공.단검여부>10) {
								        		  System.out.println();
								        		  공격로딩 공격3 = new 공격로딩();
								        		  공격3.start();
									        	  공격3.join();
									        	  System.out.println("");
								        		  주인공객체.단검공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 100 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        	  }
								        	  else {
								        		  System.out.println("단검를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
												주인공객체.쨉공격(가드객체);								        	 
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");  
								        	    }
      								          }
								          if(반격==3) {
								        	  if(주인공.망치여부>10) {
								        		  System.out.println();
								        		  공격로딩 공격4 = new 공격로딩();
								        		  공격4.start();
									        	  공격4.join();
									        	  System.out.println("");
								        		  주인공객체.망치공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 150 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        	  }
								        	  else {
								        		  System.out.println("망치를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
												주인공객체.쨉공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        		  }
							                  }
								          
						               
								          if(반격==4) {
								        	  if(주인공.각목여부>10) {
								        		  System.out.println();
								        		  공격로딩 공격5 = new 공격로딩();
								        		  공격5.start();
									        	  공격5.join();
									        	  System.out.println("");
								        		  주인공객체.각목공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 170 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        	  }
								        	  else {
								        		  System.out.println("각목을 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
												주인공객체.쨉공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        		  }
							                  }
								          if(반격==5) {
								        	  if(주인공.쇠파이프여부>10) {
								        		  System.out.println();
								        		  공격로딩 공격6 = new 공격로딩();
								        		  공격6.start();
									        	  공격6.join();
									        	  System.out.println("");
								        		  주인공객체.쇠파이프공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 200 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        	  }
								        	  else {
								        		  System.out.println("쇠파이프를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
												주인공객체.쨉공격(가드객체);
								        		  System.out.println("=======================");
										            System.out.println("가드의 체력이 20 만큼 감소하여"+가드객체.악당P+" 가 되었습니다.");
								        		  }
							                  }
								          if(주인공.P<200) {
											  System.out.println(" 젠장.. 너무 강해서 이길 수가 없습니다..");
												System.out.println();
												System.out.println(" 도망가자!!!!");
												System.out.println();
												System.out.println("---------------G A M E    O V E R-----------------");
										        System.exit(0);
								          }
							  
								  }
							  
								  
							  
						/////////////////////////////////////////////////////////////////////////////////////////////////////////////	  
							          
							  }
							  
							  
							  
							  
							  }
						  
					  
						  
						  
						  if(가드객체.악당P<0) {
						  공격로딩 공격7 = new 공격로딩();
						  
						  
						  
						  
						  System.out.println();
						  System.out.println("=======================================");
						  System.out.println("가드를 이겼습니다! 매력도 500과 보유재산 1000이 상승하였습니다!");
					      주인공.매력도 = 주인공.매력도 + 500;
					      주인공.보유재산 = 주인공.보유재산 + 1000;
					      System.out.println();
					      System.out.println();
			        	  공격7.start();
			        	  공격7.join();
			        	  System.out.println("");
						  System.out.println("현재 인벤토리 상태");
						  System.out.println();
						  System.out.println("P :"+ 주인공.P);
						  System.out.println("깡따구 : "+주인공.깡따구);
						  System.out.println("매력도 : "+주인공.매력도);
						  System.out.println("보유재산 : "+주인공.보유재산);
						  
						  }
		     ////////////////////////////////////////////////////////////////////////////////////////
						  싸움음악.close();
						  System.out.println();
						  System.out.println();
						  Music1 배경음악2 = new Music1("jucy.mp3",true);
						  배경음악2.start();
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
						  System.out.println();
						  System.out.println("클럽에 들어가기전 화장실에서  스타일을 점검합니다.");
						  System.out.println();
						  
					      
						  
						 로딩스레드 로딩b = new 로딩스레드();
						  로딩b.start();
					    		 로딩b.join();
					    		 System.out.println();
					    		 배경음악2.close();
						    Music1 클럽음악 = new Music1("클럽입성.mp3",true);
							클럽음악.start();

							
							System.out.println("===============================================");
						  System.out.println("클럽에 입성하였습니다!");
						  System.out.println("앗! 저쪽에 괜찮은 여자가 한명 보입니다!");
						  System.out.println();
						  System.out.println("유혹을 시작합니다.");
						  System.out.println("용기를 내어  스텝을 밟아봅니다.");
						  
									System.out.println();
									System.out.println();
									공격로딩 공격a = new 공격로딩();
									공격a.start();
									공격a.join();
									System.out.println();
									System.out.println("그여자와 합석에 성공하였습니다!");
									System.out.println();
									System.out.println("구구단 게임을 하면서 매력도를 10,000 이상 올려 이성의 마음을 얻으시오.");
									
								
									
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////									
									
									
							
									
									if(주인공.매력도>=10000) {
								          
										
										
										System.exit(0);
							                              }else {
									
							                            	 		  
					시비스레드 시비 = new 시비스레드();
					시비.start();
					구구단스레드 구구단 = new 구구단스레드();
					구구단.start();
					 양아치싸움 양아 = new 양아치싸움();	 
						
					 양아.setPriority(10);
   					양아.start();		    	
   					양아.join();	
   					
							    	
							
							}
								  
						}		  
								  
						
						}    
						      						      
						      
						      
							    
						  
						 
		    }
	     
