package com.SN.client;
import com.SN.client.Logi;
import com.SN.client.News;
import com.SN.client.signup;
import com.SN.client.Inbox;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class MYSPACE {
	static MYSPACE me=null;
	Thumbnail kj=null;
	Inbox kk=null;
	Logi ab=null;
	signup bc=null;
	News cd=null;
	
	private MYSPACE() {
		
	}
	
	static MYSPACE getInstances() {
		if(me==null)
			me=new MYSPACE();
		return me;
		
	}
	public void koifunction() {
		if(History.getToken()=="Thumbnail")
		{
			RootPanel.get("kalu").clear();
			RootPanel.get("kalu").add(getThumbnail());
			
		}
		if(History.getToken()=="Inbox")
		{
			RootPanel.get("kalu").clear();
			RootPanel.get("kalu").add(getInbox());
			
		}
		if(History.getToken()=="Logi")
		{
			RootPanel.get("kalu").clear();
			RootPanel.get("kalu").add(getLogi());
			
		}
		if(History.getToken()=="signup")
		{
			RootPanel.get("kalu").clear();
			RootPanel.get("kalu").add(getsignup());
			
		}
		
		if(History.getToken()=="News")
		{
			RootPanel.get("kalu").clear();
			RootPanel.get("kalu").add(getNews());
			
		}
		
	}
	
	Thumbnail getThumbnail() {
		if(kj==null) {
			kj=new Thumbnail();
		}
		return kj;
	}
	
	Inbox getInbox() {
		if(kk==null) {
			kk=new Inbox();
		}return kk;
	}
	Logi getLogi() {
		if(ab==null) {
			ab=new Logi();
		}
		return ab;
	}
	
	signup getsignup() {
		if(bc==null) {
			bc=new signup();
		}return bc;
	}
	News getNews() {
		if(cd==null) {
			cd=new News();
		}return cd;
	}
	
	


}
