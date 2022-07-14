package com.vitorferreira.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitorferreira.dsmeta.entities.Sale;
import com.vitorferreira.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;

	
	public List<Sale> findSales(){
		return repository.findAll();
	}
}
