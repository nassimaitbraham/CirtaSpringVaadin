package com.aitech.cirta.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;


/**
 * 
 * IHM d'acceuil
 * 
 * @author Nassim AIT BRAHAM AITECH COMPANY
 *
 */
@SpringView(name = Acceuil.VIEW_NAME)
public class Acceuil extends VerticalLayout implements View {
    public static final String VIEW_NAME = "";

    @PostConstruct
    void init() {
        addComponent(new Label("Page d'acceuil"));
    }

    @Override
    public void enter(ViewChangeEvent event) {
        
    }
}
