package com.sunbeam.exception;

public class ExceptionLineTooLong extends Exception {
	
	
	private String msg;
	
	public ExceptionLineTooLong(String msg){
		this.msg = msg;
		
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println(msg);
	}

}
