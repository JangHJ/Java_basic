package 확인문제;

public class Mask {
	String color; //색
	int price;	//가격
	int count;	//개수
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}
	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
}
