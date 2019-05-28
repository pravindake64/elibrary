package com.elibrary.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elibrary.models.BookModel;
import com.elibrary.services.BookModelService;
@Service("bookModelFacade")  //Bean Name
public class BookModelFacadeImpl implements BookModelFacade{
@Autowired
private BookModelService bookModelService; // creating object to call methods in service layer
	@Override
	public int create(BookModel book) {
		// TODO Auto-generated method stub
		return bookModelService.create(book);  //Calling create method in BookModelService to add a new book in record.
	}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return bookModelService.remove(id);  //Calling remove method in BookModelService to delete damaged book using its id.
	}

	@Override
	public int modify(BookModel book, int id) {
		// TODO Auto-generated method stub
		return bookModelService.modify(book, id);  //Calling modify method in BookModelService to update a book information.
	}

	@Override
	public BookModel findById(int id) {
		// TODO Auto-generated method stub
		return bookModelService.findById(id);   //Calling findById method in BookModelService to search book by its id.
	}

	@Override
	public List<BookModel> fetchall() {
		// TODO Auto-generated method stub
		return bookModelService.fetchall();  //Calling fetchall method in BookModelService to fetch all the records
	}

	@Override
	public BookModel getByName(String name) {
		// TODO Auto-generated method stub
		return bookModelService.getByName(name);  //Calling getByName method in BookModelService to search for a book of specific name.
	}

}
