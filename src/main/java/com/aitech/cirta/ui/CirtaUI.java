package com.aitech.cirta.ui;


import org.springframework.beans.factory.annotation.Autowired;

import com.aitech.cirta.model.User;
import com.aitech.cirta.view.AjoutAchatsView;
import com.aitech.cirta.view.RechercheAchatsView;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *  User interface principal
 * 
 * @author Nassim AIT BRAHAM
 *
 */


@SuppressWarnings("serial")
@Theme("valo")
@SpringUI
public class CirtaUI extends UI {

	
	@Autowired
	private SpringViewProvider viewProvider;

	@Autowired
	private User user;

	@Override
	protected void init(VaadinRequest request) {

		//Layout principale
		final VerticalLayout cirtaRoot = new VerticalLayout();
		cirtaRoot.setSizeFull();
		cirtaRoot.setMargin(true);
		cirtaRoot.setSpacing(true);
		setContent(cirtaRoot);

		//Construction du menu principal 
		final CssLayout vCLmenuPrincipal = new CssLayout();
		MenuBar vMBbarmenu = new MenuBar();
		MenuItem vMIgestionCommercial = vMBbarmenu.addItem("Gestion commerciale", null, null);
		vCLmenuPrincipal.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
		vCLmenuPrincipal.addComponent(vMBbarmenu);

		// Navigation vers les vues a partir du menu principal
		MenuBar.Command command = new MenuBar.Command() {
			public void menuSelected(MenuItem selectedItem) {

				if (selectedItem.getText().equals("créer achat")) {
					
					getUI().getNavigator().navigateTo(AjoutAchatsView.VIEW_NAME);
				
				} else if (selectedItem.getText().equals("recherche achat")) {
				
					getUI().getNavigator().navigateTo(RechercheAchatsView.VIEW_NAME);
				}

			}
		};

		// Sous menu vente
		MenuItem ventes = vMIgestionCommercial.addItem("Ventes", null, null);
		
		// Sous menu achats
		MenuItem achats = vMIgestionCommercial.addItem("Achats", null, null);
		achats.addItem("créer achat", null ,   command);
		achats.addItem("recherche achat", null ,   command);

		// Ajout de la barre des menus dans le Layout principal
		cirtaRoot.addComponent(vCLmenuPrincipal);

		// Panel des vues		
		final Panel vPcontainerView = new Panel();
		vPcontainerView.setSizeFull();
		
		//Ajout du contenaire des vues dans le Layout principal
		cirtaRoot.addComponent(vPcontainerView);
		cirtaRoot.setExpandRatio(vPcontainerView, 1.0f);

		// Ajout du pied de pages
		HorizontalLayout vHLpiedPage = new HorizontalLayout();
		vHLpiedPage.addComponent(new Label("Copyright © AITECH by Nassim AIT BRAHAM"));
		cirtaRoot.addComponent(vHLpiedPage);
		
		//navigator
		Navigator cirtaNavigator = new Navigator(this, vPcontainerView);
		cirtaNavigator.addProvider(viewProvider);
	}

	}