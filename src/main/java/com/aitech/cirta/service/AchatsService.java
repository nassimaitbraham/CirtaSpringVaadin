package com.aitech.cirta.service;

import java.util.List;

import com.aitech.cirta.model.Achats;

/**
 * 
 * Interface de service des achats
 * 
 * @author Nassim AIT BRAHAM - AITECH
 *
 */

public interface AchatsService {

	/**
	 * Service qui retourne la liste des achats
	 * 
	 * @return list
	 */

	List<Achats> getAllAchats();

}
