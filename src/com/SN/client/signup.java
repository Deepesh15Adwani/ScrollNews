package com.SN.client;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLink;



	public class signup extends Composite {

	private static signupUiBinder uiBinder = GWT.create(signupUiBinder.class);
	GreetingServiceAsync a2=GWT.create(GreetingService.class);

	interface signupUiBinder extends UiBinder<Widget, signup> {
	}

	public signup() {
		initWidget(uiBinder.createAndBindUi(this));
		
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method 
				
					
				
				String s3=t1.getText();
				String s4=t2.getText();
				String s5=t3.getText();
				String s6=t4.getText();
				
				a2.ins(s3, s4, s5, s6, new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						History.newItem("Logi");
						MYSPACE.getInstances().koifunction();
						Window.alert(result);
						
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
	MaterialTextBox t1;
	
	@UiField
	MaterialTextBox t2;
	
	@UiField
	MaterialTextBox t3;
	
	@UiField
	MaterialTextBox t4;
	
	@UiField
	MaterialButton b1;
		
}