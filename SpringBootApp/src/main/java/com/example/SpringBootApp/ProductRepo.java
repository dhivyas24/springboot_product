package com.example.SpringBootApp;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
 

public interface ProductRepo extends JpaRepository<Product,Integer> {

	
	    List<Product> findAll();
	    
	    @Query(value = "SELECT * FROM product u where u.prodid= ?1", nativeQuery = true)
	    List<Product> findbyid(String id);
	    

@Transactional
@Modifying
@Query(value = "Update product u set u.prodid = ?1 , u.prodname =?2 , u.des = ?3  ,u.qnty=?4 ,u.price =?5 ,u.type =?6 where u.prodid = ?7 ", nativeQuery = true)
void update(String prodid,String prodname,String des,String qnty,String price,String type,String id);

@Modifying
@Transactional 
@Query(value = "DELETE FROM product t WHERE t.prodid= ?1 ", nativeQuery = true)
void deleteAllByIdInBatch(String id);

}