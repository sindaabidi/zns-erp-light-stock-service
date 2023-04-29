package com.zns.erplight.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zns.erplight.domain.Produit;

/**
 * Interface for managing methods linked to {@link Produit}.
 */
public interface IProduitService {

	 
	Produit save(Produit produit);
	 
	Page<Produit> findAll(Pageable pageable);
	
	List<Produit> findAll();
	
	Optional<Produit> findOne(Long id);
	
	void delete(Long id);
	
	List<Produit> saveMany(List<Produit> produit);

   
}
