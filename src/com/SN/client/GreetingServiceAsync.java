package com.SN.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void check(String s1,String s2,AsyncCallback<String> callback) throws IllegalArgumentException;
	void ins(String s3,String s4,String s5,String s6,AsyncCallback<String> callback) throws IllegalArgumentException;
	void data(String s8,String s9,String s10,String j1,String dt,AsyncCallback<String> callback) throws IllegalArgumentException;
	void fu(String jk,AsyncCallback<String> callback) throws IllegalArgumentException;
	void checkk(String q4, AsyncCallback<String> callback) throws IllegalArgumentException;

}
