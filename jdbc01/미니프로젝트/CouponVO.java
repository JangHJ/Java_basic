package 미니프로젝트;

import java.sql.ResultSet;
import java.util.Date;

public class CouponVO {
	private String store_name;
	private int min_order;
	private String use_date;
	private int price;
	private String id;
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public int getMin_order() {
		return min_order;
	}
	public void setMin_order(int min_order) {
		this.min_order = min_order;
	}
	public String getUse_date() {
		return use_date;
	}
	public void setUse_date(String use_date) {
		this.use_date = use_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CouponVO [store_name=" + store_name + ", min_order=" + min_order + ", use_date=" + use_date + ", price="
				+ price + ", id=" + id + "]";
	} 
}
