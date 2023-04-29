package com.zns.erplight.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zns.erplight.domain.Produit;

 
/**
 * Spring Data  repository for the Produit entity.
 */
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

	/**
	 * 
	 * NOTA:  
		* Remember that Spring Data systematically manages classic CRUDs without having
		* to implement them such as save, update, delete find All and find by ID.
		* However, we can overload them as we wish (if needed)
		* Query, Query Native
	 */
		
/**
 * Queries (Methods) relating to the main Business Rules (search)
 */
	
public Page<Produit> findByMarque(String marque, Pageable pageable);
public Page<Produit> findByModele(String modele, Pageable pageable);	


public List<Produit> findByMarqueLike(String marque);

public List<Produit> findByModeleLike(String modele);

public List<Produit> findByCaracteristiquesLike( String caracteristique);

public List<Produit> findByPrixUnitaireLessThanAndPrixUnitaireGreaterThan(BigDecimal prixMax, BigDecimal prixMin);

 
/**
 * Finders
 */

public List<Produit>  findByCategorieId(Long categorieId);

public List<Produit>  findByQuantiteGreaterThan(Long qte);
public List<Produit>  findByQuantiteLessThan(Long qte);

public List<Produit> findByPrixUnitaireGreaterThan(BigDecimal puProduit);
public List<Produit> findByPrixUnitaireLessThan(BigDecimal puProduit);


/**
 * Just an example in case we want to appeal
  * to the query (which is not recommended for Spring Data performace)
 */

@Query("SELECT p FROM Produit p WHERE p.prixUnitaire > :maxprice")
public List<Produit> findProduitExpensive(@Param("maxprice") BigDecimal prixMax);


public List<Produit> findByQuantiteLessThanAndQuantiteGreaterThan(BigDecimal qteMin, BigDecimal qteMin2);
 





}