package com.elibrary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elibrary.daos.BookModelDAO;
import com.elibrary.models.BookModel;

@Component
public class BookModelServiceImpl implements BookModelService {
@Autowired
 private BookModelDAO bookdao;   //creating object of DAO layer to call its methods.
	@Override
	public int create(BookModel book) {
		// TODO Auto-generated method stub
		return bookdao.save(book);  //calling save method in DAO to insert record.
	}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return bookdao.delete(id);  //calling remove method in DAO to delete a book record.
	}

	@Override
	public int modify(BookModel book, int id) {
		// TODO Auto-generated method stub
		return bookdao.update(book, id);   //calling update method in DAO to  update a book information using its id.
	}

	@Override
	public BookModel findById(int id) {
		// TODO Auto-generated method stub
		return bookdao.getById(id);     //calling getnyid() method in DAO layer to fetch a book record.
	}

	@Override
	public List<BookModel> fetchall() {
		// TODO Auto-generated method stub
		return bookdao.getall();     //calling getall method in DAO to get all the book records an returnini a list of BookModel
	}

	@Override
	public BookModel getByName(String name) {
		// TODO Auto-generated method stub
		return bookdao.getByName(name);    //calling getbyname method in DAO  to get record of book.
	}

}
