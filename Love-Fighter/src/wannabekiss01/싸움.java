package wannabekiss01;

import java.util.Scanner;

public class 싸움 {

	
	synchronized void 파이팅() {
		System.out.println("더이상은 참을 수 없군요...");
		System.out.println("");
	 System.out.println("싸움을 시작합니다.");
	 System.out.println("");
	 
	  양아치 양아치객체 = new 양아치();
	  Scanner 스캐너 = new Scanner(System.in);
	  
	  
	  for(int h =양아치객체.악당P; h>=0; h--) {
		 
		  
		  if(주인공.P>100) {
			  if(양아치객체.악당P>0) {
			  구구단스레드.입력중지=true;
			  System.out.println();
			  공격로딩 공격9 = new 공격로딩();
			  공격9.start();
			  try {
				공격9.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
			  양아치객체.양아치침뱉기();
			  System.out.println("=======================");
			  
			  System.out.println("질수야 없지! 공격방식을 선택하시오");
			  System.out.println("1. 쨉 2. 단검 3. 망치  4. 각목  5. 쇠파이프");
			      int 반격 = 스캐너.nextInt();
			          if(반격==1) {
			        	  System.out.println();
						  공격로딩 공격z = new 공격로딩();
						  공격z.start();
						  try {
							공격z.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        	  System.out.println();
			        	  주인공.쨉공격(양아치객체);
			            System.out.println("=======================");
			            
			            System.out.println("양아치의 체력이 20 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			          
			          }
			          
			          if(반격==2) {
			        	  if(주인공.단검여부>10) {
			        		  System.out.println();
			    			  공격로딩 공격j = new 공격로딩();
			            	  
			    			  공격j.start();
			    			  try {
								공격j.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  주인공.단검공격(양아치객체);
			        		  System.out.println("=======================");
					            System.out.println("양아치의 체력이 100 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			        	  }
			        	  else {
			        		  System.out.println("단검를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
							주인공.쨉공격(양아치객체);								        	 
			        		  System.out.println("=======================");
					            System.out.println("양아치의 체력이 20 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");  
			        	    }
					          }
			          if(반격==3) {
			        	  if(주인공.망치여부>10) {
			        		  System.out.println();
			    			  공격로딩 공격h = new 공격로딩();
			            	  공격h.start();
			            	  try {
								공격h.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  주인공.망치공격(양아치객체);
			        		  System.out.println("=======================");
					            System.out.println("양아치의 체력이 150 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			        	  }
			        	  else {
			        		  System.out.println("망치를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
							주인공.쨉공격(양아치객체);
			        		  System.out.println("=======================");
					            System.out.println("가드의 체력이 20 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			        		  }
		                  }
			          if(반격==4) {
			        	  if(주인공.각목여부>10) {
			        		  System.out.println();
			    			  공격로딩 공격p = new 공격로딩();
			            	  공격p.start();
			            	  try {
								공격p.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  주인공.각목공격(양아치객체);
			        		  System.out.println("=======================");
					            System.out.println("양아치의 체력이 170 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			        	  }
			        	  else {
			        		  System.out.println("망치를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
							주인공.쨉공격(양아치객체);
			        		  System.out.println("=======================");
					            System.out.println("가드의 체력이 20 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			        		  }
		                  }           
			          if(반격==5) {
			        	  if(주인공.쇠파이프여부>10) {
			        		  System.out.println();
			    			  공격로딩 공격o = new 공격로딩();
			            	  공격o.start();
			            	  try {
								공격o.join();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            	  System.out.println();
			        		  주인공.쇠파이프공격(양아치객체);
			        		  System.out.println("=======================");
					            System.out.println("양아치의 체력이 200 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			        	  }
			        	  else {
			        		  System.out.println("망치를 보유하고 있지 않습니다ㅜ 그냥 쨉을 날립니다!");
							주인공.쨉공격(양아치객체);
			        		  System.out.println("=======================");
					            System.out.println("가드의 체력이 20 만큼 감소하여"+양아치객체.악당P+" 가 되었습니다.");
			        		  }
		                  }
			          if(주인공.P<200) {
						  System.out.println(" 젠장.. 너무 강해서 이길 수가 없습니다..");
							System.out.println();
							System.out.println(" 도망가자!!!!");
							System.out.println();
							System.out.println("---------------G A M E    O V E R-----------------");
					        System.exit(0);}
		  
			 
	
			  }
			  
			  
			  
			  
		  }
		  
	  }
	  
	
	
	
	
	
	
	
	}
	
}
