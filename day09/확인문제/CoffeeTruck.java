package 확인문제;

public class CoffeeTruck extends Truck {
	String menu;
	
	public void sale() {
		System.out.println(menu + "를 팔다.");
	}
	
	@Override
	public void load() {
		System.out.println("커피머신을 차에 싣다");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [menu=" + menu + ", ton=" + ton + ", tire=" + tire + ", color=" + color + "]";
	}
}
