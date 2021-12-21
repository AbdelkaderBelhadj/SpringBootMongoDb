package tn.spring.mongo.entites;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data @NoArgsConstructor @ToString @AllArgsConstructor
public class Coli implements Serializable{
	@Id
	private String id;
	private String reference;
	
	
	private String user;
	private String destinataire;
	
	private int telephone;
	
	
	private String ville; 
	
	private String adresse;
	
	private double prix;
	private int qte=1;
	private String etat;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	
	private Date dateCreated;
	private Date dateUpdated;
	
	private String chauffeur;
	
}
