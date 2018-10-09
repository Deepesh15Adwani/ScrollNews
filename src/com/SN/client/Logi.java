package com.SN.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class Logi extends Composite {

	private static LogiUiBinder uiBinder = GWT.create(LogiUiBinder.class);
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	
	interface LogiUiBinder extends UiBinder<Widget, Logi> {
		
	}

	public Logi() {
		initWidget(uiBinder.createAndBindUi(this));
		
		b3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method 
				String s1=t5.getText();
				String s2=t6.getText();
				a1.check(s1, s2, new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						if(result.equals("Done")) {
							MaterialToast.fireToast("You are logged In",3000);
							History.newItem("News");
							MYSPACE.getInstances().koifunction();
						}
						else
						{
							MaterialToast.fireToast("katlo");
							Window.alert("Wrong Password");
						}
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}
				});
				
			}
		});
		
	}


	@UiField
	MaterialTextBox t5;
	
	@UiField
	MaterialTextBox t6;
	
	@UiField
	MaterialButton b3;
	

}
