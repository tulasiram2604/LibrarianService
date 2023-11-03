package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book 
{
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int bookId;
private String bookName;
private String bookAuthor;
private String booktype;
public Book(int bookId, String bookName, String bookAuthor, String booktype) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
	this.booktype = booktype;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getBooktype() {
	return booktype;
}
public void setBooktype(String booktype) {
	this.booktype = booktype;
}

}
