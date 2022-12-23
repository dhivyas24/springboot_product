package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saveproduct")
public class save {

@Autowired ProductRepo ob;

@PostMapping()
	public <S> String savetask(@RequestBody Product log)
	{
	Product a= new Product();
	String prodid=log.getProdid();
	String prodname=log.getProdname();
	String des=log.getDes();
	String qnty=log.getQnty();
	String price=log.getPrice();
	String type=log.getType();
	a.setDes(des);
	a.setPrice(price);
	a.setProdid(prodid);
	a.setProdname(prodname);
	a.setQnty(qnty);
	a.setType(type);
	
 Product first = new Product(prodid,prodname,des,qnty,price,type);
	ob.save(first);
	
return "saved successfully";
//return "saved successfully";
	
}
}
  