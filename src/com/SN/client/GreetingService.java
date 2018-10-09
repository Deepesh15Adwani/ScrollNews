package com.SN.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String checkk(String q4) throws IllegalArgumentException;
	String check(String s1, String s2) throws IllegalArgumentException;
	String ins(String s3,String s4,String s5,String s6) throws IllegalArgumentException;
	String data(String s8,String s9,String s10,String j1,String dt) throws IllegalArgumentException;
	String fu(String jk) throws IllegalArgumentException;
}
