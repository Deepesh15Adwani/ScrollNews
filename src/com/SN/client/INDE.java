package com.SN.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialLink;

public class INDE extends Composite{

	private static INDEUiBinder uiBinder = GWT.create(INDEUiBinder.class);

	interface INDEUiBinder extends UiBinder<Widget, INDE> {
	}
	
	@UiField
	MaterialLink a;

	@UiField
	MaterialLink a2;
	
	public INDE()
	{
		initWidget(uiBinder.createAndBindUi(this));
		
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				// TODO Auto-generated method stub
				
				MYSPACE.getInstances().koifunction();
				
			}
		});
		
		RootPanel.get("kalu").add(new Logi());
		
		a.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("Logi");

				MYSPACE.getInstances().koifunction();
			}
		});
		a2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("signup");
				MYSPACE.getInstances().koifunction();
			}
		});
		
		
	}


}
