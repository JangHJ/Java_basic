package 상속;

public class 영웅사용 {
	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();
		p.sleep();
		맨 m = new 맨();
		m.run();

		System.out.println("------------");
		수퍼맨 sm = new 수퍼맨();
		sm.name = "클라크";
		sm.age = 25000;
		sm.power = 500000;
		sm.fly = true;
		sm.eat();
		sm.run();
		sm.space();
		
		System.out.println("------------");
		원더우먼 wm = new 원더우먼();
		wm.name = "다이애나";
		wm.age = 5000;
		wm.power = 800000;
		wm.heal = true;
		wm.eat();
		wm.run();
		wm.healing();
		wm.bling();

		System.out.println("------------");
		스파이더맨 sp = new 스파이더맨();
		sp.name = "피터 파커";
		sp.age = 18;
		sp.power = 500;
		sp.web = true;
		sp.eat();
		sp.run();
		sp.protect();
		sp.climb();
	}
}
