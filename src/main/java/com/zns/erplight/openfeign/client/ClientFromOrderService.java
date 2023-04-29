package com.zns.erplight.openfeign.client;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClientFromOrderService implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

 
    private Long id;

 
    private String code;

  
    private String nom;

 
    private String prenom;

   
    private LocalDate dateNaissance;

 
    private String adresse;

  
    private String ville;

  
    private Long codePostal;

  
    private String tel;

 
    private String fax;

   
    private String gsm;

  
    private String email;

	

}
