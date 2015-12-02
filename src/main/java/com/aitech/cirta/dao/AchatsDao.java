package com.aitech.cirta.dao;

import java.util.List;

import com.aitech.cirta.model.Achats;

/**
 *  
 * Interface des achats
 * 
 * @author Nassim AIT BRAHAM - AITECH
 *
 */

public interface AchatsDao {
	
	/**
	 * Retourne toute la liste des objets achats
	 * 
	 * @return listes
	 */ 
	List<Achats> getAllAchats();
	

}
