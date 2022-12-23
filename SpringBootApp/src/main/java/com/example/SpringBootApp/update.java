package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





	@RestController
	@RequestMapping(path="/product/{id}")
	public class update {	
		@Autowired ProductRepo ob;
		@PutMapping()
		    public String updatecar(@RequestBody Product log,@PathVariable("id") String id)
		    {
			
			

			String prodid=log.getProdid();
			String prodname=log.getProdname();
			String des=log.getDes();
			String qnty= log.getQnty();
			String price = log.getPrice();
			String type=log.getType();
			ob.update(prodid,prodname,des,qnty,price,type,id);
			 
					 //ob.save(log);
			// return"success";
			return "successfully updated";
	}
		
	}


		