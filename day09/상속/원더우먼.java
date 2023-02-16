package 상속;

public class 원더우먼 extends 맨{
	boolean heal;
	
	public void healing() {
		System.out.println("이름은 " + name);
		System.out.println("광속의 절반 속도로 날다.");
	}
	
	public void bling() {
		System.out.println("팔찌에서 빛이 난다.");
	}
	@Override
	public void eat() {
		System.out.println("밥을 먹을 필요가 없다.");
	}
	@Override
	public String toString() {
		return "원더우맨 [heal=" + heal + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}