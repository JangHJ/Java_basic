package 미니프로젝트;

import java.sql.ResultSet;
import java.util.Date;

public class OrderVO {
	private String sname; //가게이름
	private int order_no;
	private String mname; //메뉴이름
	private int price; //가격
	private String addr; //주소
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "OrderVO [sname=" + sname + ", order_no=" + order_no + ", mname=" + mname
				+ ", price=" + price + "]";
	}	
}
