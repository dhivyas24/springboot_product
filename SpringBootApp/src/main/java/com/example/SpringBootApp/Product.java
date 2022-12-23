package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class Product {

	    @Id

	    @GeneratedValue(strategy = GenerationType.AUTO)
	   private int id;
		private String prodid,prodname,des,qnty,price,type;
		Product() {}

		Product(String prodid,String prodname,String des,String qnty,String price,String type)

		    {
		  

		this.setProdid(prodid);
		this.setProdname(prodname);
		this.setDes(des);
		this.setQnty(qnty);
		this.setPrice(price);
		this.setType(type);
		
	}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getQnty() {
			return qnty;
		}

		public void setQnty(String qnty) {
			this.qnty = qnty;
		}

		public String getProdname() {
			return prodname;
		}

		public void setProdname(String prodname) {
			this.prodname = prodname;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDes() {
			return des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public String getProdid() {
			return prodid;
		}

		public void setProdid(String prodid) {
			this.prodid = prodid;
		}

		
	}
