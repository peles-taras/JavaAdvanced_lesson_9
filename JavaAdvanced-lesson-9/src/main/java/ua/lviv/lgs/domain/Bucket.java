package ua.lviv.lgs.domain;

import java.sql.Date;
import java.util.Objects;

public class Bucket {
	private Integer id;
	private Integer user_id;
	private Integer product_id;
	private java.util.Date purchase_date;

	public Bucket(Integer id, Integer user_id, Integer product_id, Date purchase_date) {
		this.id = id;
		this.user_id = user_id;
		this.product_id = product_id;
		this.purchase_date = purchase_date;
	}

	public Bucket(Integer user_id, Integer product_id, java.util.Date date) {
		this.user_id = user_id;
		this.product_id = product_id;
		this.purchase_date = date;
	}
	
	public Bucket(Integer user_id, Integer product_id) {
		this.user_id = user_id;
		this.product_id = product_id;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public java.util.Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	@Override
	public String toString() {
		return "Bucket id=" + id + ", user_id: " + user_id + ", product_id: " + product_id + ", purchase_date: "
				+ purchase_date + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, product_id, purchase_date, user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bucket other = (Bucket) obj;
		return Objects.equals(id, other.id) && Objects.equals(product_id, other.product_id)
				&& Objects.equals(purchase_date, other.purchase_date) && Objects.equals(user_id, other.user_id);
	}

}
