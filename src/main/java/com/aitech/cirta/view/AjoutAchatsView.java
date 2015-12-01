package com.aitech.cirta.view;

import javax.annotation.PostConstruct;



import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * IHM pour ajouter des achats
 * 
 * @author Nassim AIT BRAHAM AITECH COMPANY
 *
 */

@UIScope
@SpringView(name = AjoutAchatsView.VIEW_NAME)

public class AjoutAchatsView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "ajouterAchat";

	@PostConstruct
	void init() {
		setMargin(true);
		setSpacing(true);
		addComponent(new Label("IHM pour ajouter un achats"));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// This view is constructed in the init() method()
	}
}