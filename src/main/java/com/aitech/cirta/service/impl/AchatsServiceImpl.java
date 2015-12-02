package com.aitech.cirta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitech.cirta.dao.AchatsDao;
import com.aitech.cirta.model.Achats;
import com.aitech.cirta.service.AchatsService;

/**
 * 
 * Implementation du service des achats
 * 
 * @author Nassim AIT BRAHAM - AITECH
 *
 */

@Service
public class AchatsServiceImpl implements AchatsService  {
	
	
	@Autowired
	private AchatsDao achatsDao;

	@Override
	public List<Achats> getAllAchats() {
		
		return achatsDao.getAllAchats();
	}

	

}
