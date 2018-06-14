package com.satyanarayanaswamytemple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PoojaRepository extends JpaRepository<Pooja,Long> {
	  @Query("SELECT t FROM Pooja t WHERE t.poojaName=:poojaName")
	    public Pooja findByName(@Param("poojaName") String poojaName);
	  
	  @Modifying
	    @Query("delete from  Pooja p  where pName=:poojaName")
	    public void deleteByPoojaName(@Param("poojaName") String poojaName);

}
