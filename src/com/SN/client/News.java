package com.SN.client;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
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

import gwt.material.design.addins.client.fileuploader.MaterialFileUploader;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class News extends Composite {

	private static NewsUiBinder uiBinder = GWT.create(NewsUiBinder.class);
	GreetingServiceAsync a3=GWT.create(GreetingService.class);
	static String s1=null;

	interface NewsUiBinder extends UiBinder<Widget, News> {
	}
	

	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextArea t2;
	@UiField
	MaterialTextBox t3;
	@UiField
	MaterialCheckBox t4;
	@UiField
	MaterialCheckBox t5;
	@UiField
	MaterialCheckBox t6;
	@UiField
	MaterialCheckBox t7;
	@UiField
	MaterialTextBox t8;
	@UiField
	MaterialTextBox t9;
	@UiField
	MaterialCheckBox t11;
	@UiField
	MaterialCheckBox t12;
	@UiField
	MaterialButton bb;
		
	public News() {
		initWidget(uiBinder.createAndBindUi(this));
		
	
		bb.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				a3.fu(t1.getText(),new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("fu chalgya");
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("chal ni rah salle");
						
					}
				});

				
				if(t4.getValue()==true)
				{
					MaterialToast.fireToast("kar ra h");
					
					a3.data(t1.getText(), t2.getText(), t8.getText(),t4.getText(),null, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							History.newItem("Logi");
							MYSPACE.getInstances().koifunction();
							MaterialToast.fireToast(result,1000);
							RootPanel.get("kalu").clear();
							RootPanel.get("kalu").add(new FileUp());
							
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							
						}
					});
				}
				
				if(t5.getValue()==true)
				{
					MaterialToast.fireToast("kar ra h");
					
					a3.data(t1.getText(), t2.getText(), t8.getText(),t5.getText(),null, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							History.newItem("Logi");
							MYSPACE.getInstances().koifunction();
							MaterialToast.fireToast(result,1000);
							RootPanel.get("kalu").clear();
							RootPanel.get("kalu").add(new FileUp());
							
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							
						}
					});
				}
				
				if(t6.getValue()==true)
				{
					MaterialToast.fireToast("kar ra h");
					
					a3.data(t1.getText(), t2.getText(), t8.getText(),t6.getText(),null, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							History.newItem("Logi");
							MYSPACE.getInstances().koifunction();
							MaterialToast.fireToast(result,1000);
							RootPanel.get("kalu").clear();
							RootPanel.get("kalu").add(new FileUp());
							
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							
						}
					});
				}
				
				if(t7.getValue()==true)
				{
					MaterialToast.fireToast("kar ra h");
					
					a3.data(t1.getText(), t2.getText(), t8.getText(),t7.getText(),null, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							History.newItem("Logi");
							MYSPACE.getInstances().koifunction();
							MaterialToast.fireToast(result,1000);
							RootPanel.get("kalu").clear();
							RootPanel.get("kalu").add(new FileUp());
							
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							
						}
					});
				}
				
				if(t11.getValue()==true)
				{
					MaterialToast.fireToast("kar ra h");
					
					a3.data(t1.getText(), t2.getText(), t8.getText(),t11.getText(),null, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							History.newItem("Logi");
							MYSPACE.getInstances().koifunction();
							MaterialToast.fireToast(result,1000);
							RootPanel.get("kalu").clear();
							RootPanel.get("kalu").add(new FileUp());
							
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							
						}
					});
				}
				
				if(t12.getValue()==true)
				{
					MaterialToast.fireToast("kar ra h");
					
					a3.data(t1.getText(), t2.getText(), t8.getText(),t12.getText(),null, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							History.newItem("Logi");
							MYSPACE.getInstances().koifunction();
							MaterialToast.fireToast(result,1000);
							RootPanel.get("kalu").clear();
							RootPanel.get("kalu").add(new FileUp());
							
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							
						}
					});
				}
				
							
				
			
				
			}
		});
	
	}


	
}
