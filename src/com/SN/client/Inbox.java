package com.SN.client;


import com.SN.client.GreetingService;
import com.SN.client.GreetingServiceAsync;
import com.SN.client.MYSPACE;
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

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;



public class Inbox extends Composite{

	private static InboxUiBinder uiBinder = GWT.create(InboxUiBinder.class);
	GreetingServiceAsync a1=GWT.create(GreetingService.class);

	interface InboxUiBinder extends UiBinder<Widget, Inbox> {
	}
	
	@UiField
	MaterialImage i1;
	@UiField
	MaterialImage i2;
	@UiField
	MaterialImage i3;
	@UiField
	MaterialImage i4;
	@UiField
	MaterialImage i5;
	@UiField
	MaterialImage i6;
	
	static String tag;
	
	
	public static String getTag()
	{
		return tag;
	}
	
	
	public Inbox() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		
		
		i1.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			tag="BOLLYWOOD";
			History.newItem("Thumbnail");
			MYSPACE.getInstances().koifunction();
			
		}
		});
			
		i2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				tag="ENTERTAINMENT";
				History.newItem("Thumbnail");
				MYSPACE.getInstances().koifunction();
				MaterialToast.fireToast("lalalala");
				
			}
		});
		
		i3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				tag="BUSINESS";
				History.newItem("Thumbnail");
				MYSPACE.getInstances().koifunction();
				
			}
		});
		
		i4.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				tag="POLITICS";
				History.newItem("Thumbnail");
				MYSPACE.getInstances().koifunction();
				
			}
		});
		
		i5.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				tag="SPORTS";
				History.newItem("Thumbnail");
				MYSPACE.getInstances().koifunction();
			}
		});
		
		i6.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				tag="TECHNOLOGY";
				History.newItem("Thumbnail");
				MYSPACE.getInstances().koifunction();
				
			}
		});
		
	

}
	
}
