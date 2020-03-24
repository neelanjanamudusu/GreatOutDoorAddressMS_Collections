package com.cg.go.dao;

@SuppressWarnings("serial")
public class InvalidUser extends Exception {
	public InvalidUser(final String msg){
        super(msg);
    }
}
