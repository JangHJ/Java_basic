package 상속기본;

public class 볼펜 extends 학용품 {
	double thick;

	public void write() {
		System.out.println("글을 쓰다");
	}

	@Override
	public String toString() {
		return "볼펜 [thick=" + thick + ", price=" + price + ", company=" + company + "]";
	}
}
