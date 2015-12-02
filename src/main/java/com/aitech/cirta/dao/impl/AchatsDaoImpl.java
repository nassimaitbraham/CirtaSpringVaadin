package com.aitech.cirta.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aitech.cirta.configs.CirtaDao;
import com.aitech.cirta.dao.AchatsDao;
import com.aitech.cirta.model.Achats;

/**
 * 
 * 
 * @author Nassim AIT BRAHAM - AITECH
 *
 */

@Repository
public class AchatsDaoImpl extends CirtaDao implements AchatsDao {

	@Override
	public List<Achats> getAllAchats() {
		
		List<Achats> liste =  entityManager.createQuery("from Achats").getResultList();

		return liste;
		
		

	}

}
