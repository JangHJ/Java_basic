package 미니프로젝트;

import java.sql.ResultSet;
import java.util.Date;

public class OrderVO {
	private int order_no;
	private int menu_no;
	private Date time;
	private String id;
	private int price; //가격
	private String sname; //가게이름
	private String mname; //메뉴이름
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getMenu_no() {
		return menu_no;
	}
	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "OrderVO [order_no=" + order_no + ", menu_no=" + menu_no + ", id=" + id + ", price=" + price + ", sname="
				+ sname + ", mname=" + mname + "]";
	}
	
	
}
