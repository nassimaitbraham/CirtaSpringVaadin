package com.aitech.cirta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Model de la table atcm_achats
 * 
 * @author Nassim AIT BRAHAM - AITECH
 *
 */

@Entity
@Table(name = "atcm_achats")
public class Achats {

	/**
	 * 
	 * Attribut
	 * 
	 */
	@Id
	@Column(name = "atcm_achatid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "atcm_code")
	private String code;
	
	@Column(name = "atcm_article")
	private String article;
	
	@Column(name = "atcm_quantite")
	private int quantite;

	/**
	 * 
	 * Getter and Setter
	 * 
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
