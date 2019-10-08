package wannabekiss01;

import java.util.Scanner;

public class 선택지 {

	Scanner 스캐너 = new Scanner(System.in);
	주인공 주인공객체 = new 주인공();
	weaponshop 무기상점 = new weaponshop();
	drugstore 한약방 = new drugstore();
	HOF 호프집 = new HOF();
	cosmeticshop 화장품점 = new cosmeticshop();
	Shop 상점 = new Shop();
	

		  
	
	public void 선택하기() {
		  
		  
		      int i;{
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
			  
		      }
	
	
	
		      }
}
