package com.SN.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;

public class FileUp extends Composite {

	private static FileUpUiBinder uiBinder = GWT.create(FileUpUiBinder.class);

	interface FileUpUiBinder extends UiBinder<Widget, FileUp> {
	}

	@UiField
	MaterialButton lol;
	
	public FileUp() {
		initWidget(uiBinder.createAndBindUi(this));
		
		lol.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("kalu").clear();
				RootPanel.get("kalu").add(new Logi());
				
			}
		});
		
	}


	

}
