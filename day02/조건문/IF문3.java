package 조건문;

public class IF문3 {
	public static void main(String[] args) {
		
		int myNum = 99;
		
		if (myNum >= 80) {//true
			System.out.println("최우수");
		} else if(myNum >= 70){
			System.out.println("우수");
		} else if(myNum >= 60){
			System.out.println("보통");
		} else{
			System.out.println("미달");
		}
		
		int myTour = 9; //올해 여행 횟수
		
		if (myTour == 10) {//true
			System.out.println("VVIP");
		} else if(myTour ==6){
			System.out.println("VIP");
		} else{
			System.out.println("Normal");
		}
		
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Normal");
			break;
		}
		
		
	}
}
