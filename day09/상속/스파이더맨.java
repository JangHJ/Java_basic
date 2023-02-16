package 상속;

public class 스파이더맨 extends 맨{
	boolean web;
	
	public void protect() {
		System.out.println("이름은 " + name);
		System.out.println("뉴욕을 지킨다");
	}
	
	public void climb() {
		System.out.println("벽을 탄다.");
	}
	
	@Override
	public void eat() {
		System.out.println("또래보다 많이 먹는 편이다");
	}
	
	@Override
	public String toString() {
		return "스파이더맨 [web=" + web + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}