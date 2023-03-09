package 미니프로젝트;

import java.sql.ResultSet;

public class ReviewVO {
	private int order_no;
	private double rating;
	private String content;
	private String sname;
	private String mname;
	
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
		return "ReviewVO [order_no=" + order_no + ", rating=" + rating + ", content=" + content + ", sname=" + sname
				+ ", mname=" + mname + "]";
	}
	
}
