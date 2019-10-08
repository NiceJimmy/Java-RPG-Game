package wannabekiss01;
import java.util.Scanner;
public class 주인공 extends 캐릭터{
	
	
	
   	public static int P = 1000;
	 static int 깡따구 = 500;
	 static int 매력도 = 500;
	 static int 보유재산=20000;
	 static int 송곳여부=5;
	 static int 단검여부=5;
	 static int 망치여부=5;
	 static int 각목여부=5;
	 static int 쇠파이프여부=5;
	 static int 참을성 = 150;
	 
	public 주인공() {
		// TODO Auto-generated constructor stub
	}

    
	
	public void 나의상태() {
		
		
		System.out.println("===================");
		System.out.println("이름 : 이광우");
		System.out.println("나이 : 29");
		System.out.println();
		System.out.println("HP : "+P);
		System.out.println("깡따구 : "+깡따구);
		System.out.println("매력도 : "+매력도);
		System.out.println("보유재산 : "+보유재산);
		System.out.print("- 무기1 : ");
	    if(송곳여부>10) {
	    	System.out.print("송곳"); 
	         }
	    System.out.println();
	    System.out.print("- 무기2 : ");
	    if(단검여부>10) {
			System.out.print("단검"); 
		    }
	    System.out.println();
	    System.out.print("- 무기3 : ");
	    if(망치여부>10) {
			System.out.print("망치"); 
		    }
	    System.out.println();
	    System.out.print("- 무기4 : ");
	    if(각목여부>10) {
	    	System.out.print("각목"); 
	         }
	    System.out.println();
	    System.out.print("- 무기5 : ");
	    if(쇠파이프여부>10) {
	    	System.out.print("쇠파이프"); 
	         }
	    System.out.println();
		System.out.println("===================");
	}	
	
	Scanner 스캐너 = new Scanner(System.in);
	game 곱셈게임 = new game();
	drugstore 한약방 = new drugstore();
	cosmeticshop 화장품 = new cosmeticshop();	
	HOF 호프집 = new HOF();
	mainstory 메인 = new mainstory();
	weaponshop 무기상점 = new weaponshop();


	public void 돈벌기(주인공 주인공객체) {
			
			곱셈게임.게임스타트();
	}	
///////////////////////////////////////////////////////////////////////////////////////////////////
   public void 한약구매하기(drugstore 한약방객체) {
		
	   한약방.제품소개();
	   
	   int 선택 = 스캐너.nextInt();
		
		if(선택==1) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(한약방객체.제품1+ 수량 +"개 구입하셨습니다.");
			System.out.println("체력이 "+수량*한약방객체.제품1효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*한약방객체.제품1가격+"원 만큼 감소하였습니다." );
		    P = 수량*한약방객체.제품1효과 +P;
		    보유재산 = 보유재산 - 수량*한약방객체.제품1가격;
		    }
 	
		if(선택==2) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(한약방객체.제품2+ 수량 +"개 구입하셨습니다.");
			System.out.println("체력이 "+수량*한약방객체.제품2효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*한약방객체.제품2가격+"원 만큼 감소하였습니다." );
		    P = 수량*한약방객체.제품2효과 +P;
		    보유재산 = 보유재산 - 수량*한약방객체.제품2가격;
		    }
   
		if(선택==3) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(한약방객체.제품3+ 수량 +"개 구입하셨습니다.");
			System.out.println("체력이 "+수량*한약방객체.제품3효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*한약방객체.제품3가격+"원 만큼 감소하였습니다." );
		    P = 수량*한약방객체.제품3효과 +P;
		    보유재산 = 보유재산 - 수량*한약방객체.제품3가격;
		    }
   
		if(선택==4) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(한약방객체.제품4+ 수량 +"개 구입하셨습니다.");
			System.out.println("체력이 "+수량*한약방객체.제품4효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*한약방객체.제품4가격+"원 만큼 감소하였습니다." );
		    P = 수량*한약방객체.제품4효과 +P;
		    보유재산 = 보유재산 - 수량*한약방객체.제품4가격;
		    }
   
		if(선택==5) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(한약방객체.제품5+ 수량 +"개 구입하셨습니다.");
			System.out.println("체력이 "+수량*한약방객체.제품5효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*한약방객체.제품5가격+"원 만큼 감소하였습니다." );
		    P = 수량*한약방객체.제품5효과 +P;
		    보유재산 = 보유재산 - 수량*한약방객체.제품5가격;
		    }
   }
	
////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	
	
    public void 화장품점가기(cosmeticshop 화장품점객체) {
	
	화장품.제품소개();
	
	 int 선택 = 스캐너.nextInt();
		
		if(선택==1) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(화장품점객체.제품1+ 수량 +"개 구입하셨습니다.");
			System.out.println("매력도가 "+수량*화장품점객체.제품1효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*화장품점객체.제품1가격+"원 만큼 감소하였습니다." );
		    매력도 = 수량*화장품점객체.제품1효과 +매력도;
		    보유재산 = 보유재산 - 수량*화장품점객체.제품1가격;
		    }
	
		if(선택==2) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(화장품점객체.제품2+ 수량 +"개 구입하셨습니다.");
			System.out.println("매력도가 "+수량*화장품점객체.제품2효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*화장품점객체.제품2가격+"원 만큼 감소하였습니다." );
		    매력도 = 수량*화장품점객체.제품2효과 +매력도;
		    보유재산 = 보유재산 - 수량*화장품점객체.제품2가격;
		    }

		if(선택==3) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(화장품점객체.제품3+ 수량 +"개 구입하셨습니다.");
			System.out.println("매력도가 "+수량*화장품점객체.제품3효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*화장품점객체.제품3가격+"원 만큼 감소하였습니다." );
		    매력도 = 수량*화장품점객체.제품3효과 +매력도;
		    보유재산 = 보유재산 - 수량*화장품점객체.제품3가격;
		    }

		if(선택==4) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(화장품점객체.제품4+ 수량 +"개 구입하셨습니다.");
			System.out.println("매력도가 "+수량*화장품점객체.제품4효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*화장품점객체.제품4가격+"원 만큼 감소하였습니다." );
		    매력도 = 수량*화장품점객체.제품4효과 +매력도;
		    보유재산 = 보유재산 - 수량*화장품점객체.제품4가격;
		    }

		if(선택==5) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(화장품점객체.제품5+ 수량 +"개 구입하셨습니다.");
			System.out.println("매력도가 "+수량*화장품점객체.제품5효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*화장품점객체.제품5가격+"원 만큼 감소하였습니다." );
		    매력도 = 수량*화장품점객체.제품5효과 +매력도;
		    보유재산 = 보유재산 - 수량*화장품점객체.제품5가격;
		    }
    }
    

    public void 술먹으러가기(HOF 호프집객체) {
	
	호프집.제품소개();
	
	 int 선택 = 스캐너.nextInt();
		
		if(선택==1) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(호프집객체.제품1+ 수량 +"개 구입하셨습니다.");
			System.out.println("깡따구가 "+수량*호프집객체.제품1효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*호프집객체.제품1가격+"원 만큼 감소하였습니다." );
		    깡따구 = 수량*호프집객체.제품1효과 +깡따구;
		    보유재산 = 보유재산 - 수량*호프집객체.제품1가격;
		    }
	
		if(선택==2) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(호프집객체.제품2+ 수량 +"개 구입하셨습니다.");
			System.out.println("깡따구가 "+수량*호프집객체.제품2효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*호프집객체.제품2가격+"원 만큼 감소하였습니다." );
		    깡따구 = 수량*호프집객체.제품2효과 +깡따구;
		    보유재산 = 보유재산 - 수량*호프집객체.제품2가격;
		    }

		if(선택==3) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(호프집객체.제품3+ 수량 +"개 구입하셨습니다.");
			System.out.println("깡따구가 "+수량*호프집객체.제품3효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*호프집객체.제품3가격+"원 만큼 감소하였습니다." );
		    깡따구 = 수량*호프집객체.제품3효과 +깡따구;
		    보유재산 = 보유재산 - 수량*호프집객체.제품3가격;
		    }

		if(선택==4) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(호프집객체.제품4+ 수량 +"개 구입하셨습니다.");
			System.out.println("깡따구가 "+수량*호프집객체.제품4효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*호프집객체.제품4가격+"원 만큼 감소하였습니다." );
		    깡따구 = 수량*호프집객체.제품4효과 +깡따구;
		    보유재산 = 보유재산 - 수량*호프집객체.제품4가격;
		    }

		if(선택==5) {
			System.out.println("수량을 입력하시오");
			int 수량 = 스캐너.nextInt();
			System.out.println(호프집객체.제품5+ 수량 +"개 구입하셨습니다.");
			System.out.println("깡따구가 "+수량*호프집객체.제품5효과+" 만큼 증가하였습니다.");
			System.out.println("보유재산이 "+수량*호프집객체.제품5가격+"원 만큼 감소하였습니다." );
		    깡따구 = 수량*호프집객체.제품5효과 +깡따구;
		    보유재산 = 보유재산 - 수량*호프집객체.제품5가격;
		    }
	
	
	
	
    }

    public void 무기점가기(weaponshop 무기상점객체) {
	
	무기상점.제품소개();

	 int 선택 = 스캐너.nextInt();
		
		if(선택==1) {
			System.out.println(무기상점객체.제품1+" 구입하셨습니다.");
		    송곳여부 = 무기상점객체.제품1효과 +송곳여부;
		    보유재산 = 보유재산 - 무기상점객체.제품1가격;
		    }
	
		if(선택==2) {
			System.out.println(무기상점객체.제품2 +" 구입하셨습니다.");
		    단검여부 = 무기상점객체.제품2효과 +단검여부;
		    보유재산 = 보유재산 - 무기상점객체.제품2가격;
		    }

		if(선택==3) {
			System.out.println(무기상점객체.제품3 +" 구입하셨습니다.");
		    망치여부 = 무기상점객체.제품3효과 +망치여부;
		    보유재산 = 보유재산 - 무기상점객체.제품3가격;
		    }

		if(선택==4) {
			System.out.println(무기상점객체.제품4+" 구입하셨습니다.");
		    각목여부 = 무기상점객체.제품4효과 +각목여부;
		    보유재산 = 보유재산 - 무기상점객체.제품4가격;
		    }

		if(선택==5) {
			System.out.println(무기상점객체.제품5+" 구입하셨습니다.");
		    쇠파이프여부 = 무기상점객체.제품5효과 +쇠파이프여부;
		    보유재산 = 보유재산 - 무기상점객체.제품5가격;
		    }
    
    
    
    }

		
	
	///////////////////////////////////////////////////////////(공격메소드 시작)
	
	
	public void 쨉공격(가드 가드객체) {
		System.out.println("잽을 날립니다!.");
 		가드객체.악당P =가드객체.악당P-20;
 		System.out.println("20 만큼의 데미지를 입혔습니다.");
     	}

 
    
     public void 단검공격(가드 가드객체) {
    	 System.out.println("단검을 찌릅니다!~.");
 	    가드객체.악당P =가드객체.악당P-100;
 		System.out.println("100 만큼의 데미지를 입혔습니다.");
        }

     
     public void 망치공격(가드 가드객체) {
 		System.out.println("망치를 휘두릅니다!");
 	    가드객체.악당P =가드객체.악당P-150;
 		System.out.println("150 만큼의 데미지를 입혔습니다.");
     	}
     
     public void 각목공격(가드 가드객체) {
    	 System.out.println("각목을 휘두릅니다!~.");
 	    가드객체.악당P =가드객체.악당P-170;
 		System.out.println("170 만큼의 데미지를 입혔습니다.");
        }

     
     public void 쇠파이프공격(가드 가드객체) {
 		System.out.println("쇠파이프를 휘두릅니다!");
 	    가드객체.악당P =가드객체.악당P-200;
 		System.out.println("200 만큼의 데미지를 입혔습니다.");
     	}
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////	
 	public static void 쨉공격(양아치 양아치객체) {
		System.out.println("잽을 날립니다!.");
 		양아치객체.악당P =양아치객체.악당P-20;
 		System.out.println("20 만큼의 데미지를 입혔습니다.");
     	}

    
     public static void 단검공격(양아치 양아치객체) {
    	 System.out.println("단검을 찌릅니다!~.");
 	     양아치객체.악당P =양아치객체.악당P-100;
 		System.out.println("100 만큼의 데미지를 입혔습니다.");
        }

     
     public static void 망치공격(양아치 양아치객체) {
 		System.out.println("망치를 휘두릅니다!");
 	    양아치객체.악당P =양아치객체.악당P-150;
 		System.out.println("150 만큼의 데미지를 입혔습니다.");
     	}
	
     public static void 각목공격(양아치 양아치객체) {
    	 System.out.println("각목을 휘두릅니다!~.");
 	    양아치객체.악당P =양아치객체.악당P-170;
 		System.out.println("170 만큼의 데미지를 입혔습니다.");
        }

     
     public static void 쇠파이프공격(양아치 양아치객체) {
 		System.out.println("쇠파이프를 휘두릅니다!");
 	    양아치객체.악당P =양아치객체.악당P-200;
 		System.out.println("200 만큼의 데미지를 입혔습니다.");
     	}
	
	}

