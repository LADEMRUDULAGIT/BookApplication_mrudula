package com.book.exception;

@SuppressWarnings("serial")
public class InvalidBookException extends Exception{
	public InvalidBookException(String s){
			System.out.println("Exception is :\n"+s+".....!!!");
	}
}
