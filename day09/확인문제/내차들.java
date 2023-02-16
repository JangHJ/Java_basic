package 확인문제;

public class 내차들 {
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "black";
		c.tire = 4;
		c.drive();
		c.gasup();
		System.out.println(c);
		
		System.out.println("------------");
		
		CoffeeTruck t1 = new CoffeeTruck();
		t1.color = "white";
		t1.tire = 6;
		t1.ton = 3;
		t1.menu = "아메리카노";
		t1.drive();
		t1.gasup();
		t1.load();
		t1.sale();
		System.out.println(t1);
		
		System.out.println("------------");
		
		CoffeeTruck t2 = new CoffeeTruck();
		t2.color = "orange";
		t2.tire = 4;
		t2.ton = 1.5;
		t2.menu = "카페라떼";
		t2.drive();
		t2.gasup();
		t2.load();
		t2.sale();
		System.out.println(t2);
	}
}
