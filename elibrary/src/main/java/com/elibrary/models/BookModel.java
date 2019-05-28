package com.elibrary.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class BookModel {

	 @javax.persistence.Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)   //cretating auto generated value for id.
	 private int id;
	 private String isbn;
	 private String title;
	 private String author;
	 private String publisher;
	 private String qty;
	 
	 public BookModel() {
		// TODO Auto-generated constructor stub
	}

	public BookModel(String isbn, String title, String author, String publisher, String qty) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.qty = qty;
	}  //constructor for Create and Update method in DAO,Facade,service lAyer

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}
	 
	 @Override
	public String toString() {   // to Print BookModel 
		// TODO Auto-generated method stub
		return getId()+" : "+ getIsbn()+" : "+getTitle()+" : "+getAuthor()+" : "+getPublisher()+" : "+getQty();
	}
}
