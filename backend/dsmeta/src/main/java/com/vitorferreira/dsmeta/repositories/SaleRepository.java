package com.vitorferreira.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vitorferreira.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	
	@Query("SELECT obj from Sale obj where obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pegeable);

}
