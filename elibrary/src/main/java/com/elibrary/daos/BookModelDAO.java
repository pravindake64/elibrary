package com.elibrary.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elibrary.models.BookModel;


public interface BookModelDAO {
	
	public int save(BookModel book);

	public int delete(int id);

	public int update(BookModel book, int id);

	public BookModel getById(int id);

	public List<BookModel> getall();
	
	public BookModel getByName(String name);

}
