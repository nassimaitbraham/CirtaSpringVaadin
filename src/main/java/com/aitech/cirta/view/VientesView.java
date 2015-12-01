package com.aitech.cirta.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * IHM des ventes
 * 
 * @author Nassim AIT BRAHAM AITECH COMPANY
 *
 */

@SpringView(name = VientesView.VIEW_NAME)
public class VientesView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "ventes";

	@PostConstruct
	void init() {
		setMargin(true);
		setSpacing(true);
		addComponent(new Label("IHM des ventes"));

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// This view is constructed in the init() method()
	}
}