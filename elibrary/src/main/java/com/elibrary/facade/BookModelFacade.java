package com.elibrary.facade;

import java.util.List;

import com.elibrary.models.BookModel;



public interface BookModelFacade {

	public int create(BookModel book);
	
	public int remove(int id);
	
	public int modify(BookModel book,int id);
	
	public BookModel findById(int id);
	
	public List<BookModel> fetchall();
	
	public BookModel getByName(String name);

}
