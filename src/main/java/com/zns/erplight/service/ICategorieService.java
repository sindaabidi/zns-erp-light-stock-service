package com.zns.erplight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zns.erplight.domain.Categorie;
import com.zns.erplight.domain.Produit;

 
/**
 * Interface for managing methods linked to {@link Categorie}.
 */
public interface ICategorieService {

	
	Categorie save(Categorie categorie);
	 
	Page<Categorie> findAll(Pageable pageable);
	
	Optional<Categorie> findOne(Long id);
	
	void delete(Long id);
	
	List<Produit>  getByCategorieId(Long categorieId);

	List<Categorie> findAll();

	List<Categorie> saveMany(List<Categorie> categories);

	void deleteMany(List<Categorie> categorieList);


   
}