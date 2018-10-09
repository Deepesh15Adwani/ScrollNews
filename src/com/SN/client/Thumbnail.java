package com.SN.client;

import com.SN.server.GreetingServiceImpl;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.SN.client.Inbox;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class Thumbnail extends Composite {

	private static ThumbnailUiBinder uiBinder = GWT.create(ThumbnailUiBinder.class);
	
	GreetingServiceAsync aa=GWT.create(GreetingService.class);

	interface ThumbnailUiBinder extends UiBinder<Widget, Thumbnail> {
	}
	@UiField
	MaterialImage a1;
	@UiField
	MaterialTextBox k1;
	@UiField
	MaterialTextBox k2;
	@UiField
	MaterialTextBox k3;
	@UiField
	MaterialButton b11;
	
	int row=1;
	
	String emp;
	String abc;
	String arr[][];

	public Thumbnail() {
		initWidget(uiBinder.createAndBindUi(this));
		
		String tag= Inbox.getTag();
		MaterialToast.fireToast(tag);
		
		aa.checkk(tag, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
			
				
				//a1.setUrl("null/null/abcd.jpeg");
				
				
				
				int nos=Integer.parseInt(result.substring(0,result.indexOf(" ")));
				result=result.substring(result.indexOf(" ")+1);
				
				arr=new String[nos][3];
				int j=0,k=0;
				
				for(int i=0;i<result.length();i++)
				{
					char ch=result.charAt(i);
					if(ch!='@')
						{
						if(ch=='~')
						{
							j++;
							k=0;
							continue;
						}
						
						emp=emp+ch;
						
						}
					else
					{
						arr[j][k++]=emp;
						emp="";
					}
					
					k1.setText(arr[row][0]);
					abc=k1.getText();
					a1.setUrl("null/null/"+abc+".jpeg");
					k2.setText(arr[row][1]);
					k3.setText(arr[row][2]);
				}
				MaterialToast.fireToast("Button tak aarha hai");		
				RootPanel.get("kalu").add(b11);
				b11.addClickHandler(new ClickHandler() {
							
							@Override
							public void onClick(ClickEvent event) {
								// TODO Auto-generated method stub
								row++;
								if((row)==nos)
									Window.alert("News Over");
							
								
								k1.setText(arr[row][0]);
								abc=k1.getText();
								a1.setUrl("null/null/"+abc+".jpeg");
								k2.setText(arr[row][1]);
								k3.setText(arr[row][2]);
								
							}
						});
				
				
			}
		
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
				MaterialToast.fireToast("connectivity issue");
				
			}
		});

				
	}


	

}
