package com.aitech.cirta.view;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.aitech.cirta.model.Achats;
import com.aitech.cirta.service.AchatsService;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * 
 * IHM pour recherche un achats
 * 
 * @author Nassim AIT BRAHAM AITECH COMPANY
 *
 */

@UIScope
@SpringView(name = RechercheAchatsView.VIEW_NAME)

public class RechercheAchatsView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "rechercheachat";

	@Autowired
	private AchatsService achatsService;

	@PostConstruct
	void init() {
		setMargin(true);
		setSpacing(true);

		// layout principal
		VerticalLayout vVLroot = new VerticalLayout();
		vVLroot.setMargin(true);
		
		

		// Panel de recherche
		Panel vPLrecherche = new Panel("Critères de selection");

		GridLayout vGLrecherche = new GridLayout(10,10);
		vGLrecherche.setMargin(true);
		
		
		ComboBox vCBarticle = new ComboBox();
		vCBarticle.addItem("TRANSISTOR");
		vCBarticle.addItem("DIODE");
		
		vGLrecherche.addComponent(new Label("Article :"), 0, 0);	
		vGLrecherche.addComponent(vCBarticle, 1, 0);
		
		ComboBox vCBcode = new ComboBox();
		vCBcode.addItem("AET001");
		vCBcode.addItem("AET002");
		
		vGLrecherche.addComponent(new Label("Code :"), 2, 0);	
		vGLrecherche.addComponent(vCBcode, 3, 0);
		
		
		Button vBrecherche = new Button("Rechercher");
		vGLrecherche.addComponent(vBrecherche, 4, 0);
		
		vBrecherche.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				
				
			}
		});
		
	
		
		vPLrecherche.setContent(vGLrecherche);
		
		// Panel des resultats
		Panel vPLresultatRecherche = new Panel("Résultat");
		
		
		Table vTresultatRecherche = new Table();
		
		vTresultatRecherche.addContainerProperty("Code", String.class, null);
		vTresultatRecherche.addContainerProperty("Article",  String.class, null);
		vTresultatRecherche.addContainerProperty("Qt",  Integer.class, null);
		
		
		List<Achats> listAchats = achatsService.getAllAchats();
		
		for (Achats achats : listAchats) {
			vTresultatRecherche.addItem(new Object[]{achats.getCode(),achats.getArticle(),achats.getQuantite()}, achats.getId());
		}
				
		
		vPLresultatRecherche.setContent(vTresultatRecherche);
		

		// Ajout des composants au layout principal

		vVLroot.addComponent(vPLrecherche);
		vVLroot.addComponent(vPLresultatRecherche);
		
		
		
		
		//Ajout du layout principal
		addComponent(vVLroot);

		

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// This view is constructed in the init() method()
	}
}