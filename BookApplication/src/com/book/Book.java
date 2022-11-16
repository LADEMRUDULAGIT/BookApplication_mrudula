package com.book;

import java.util.*;

import com.book.exception.InvalidBookException;

public class Book {
   private String bookID;
   private String author;
   private String category;
   private float price;
   private String title;
public String getBookID() {
	return bookID;
}
public void setBookID(String bookID) {
    this.bookID = bookID;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Book(String bookId,String title,String author,String category,float price) throws InvalidBookException{
	String[] categories= {"Science", "Fiction", "Technology" ,"Others"};
	List<String>categorylist=new ArrayList<String>();
	for(String category1:categories ) {
		categorylist.add(category1);
	}
	String exec="";
	exec+=(bookId.length()==4 && bookId.charAt(0)=='B')?"":"The given BookId is not appropriate\n";
	exec+=(price>0)?"":"price should be greater than 0";
	exec+=(categorylist.indexOf(category)!=-1)?"":"Category should be in \"Science\", \"Fiction\", \"Technology\" ,\"Others\"";
	if(exec.trim().length()==0) {
			setBookID(bookId);
			setPrice(price);
			setTitle(title);
			setCategory(category);
			setAuthor(author);
	}
	else {
		throw new InvalidBookException(exec);
	}
		
	
}

}
