package com.elibrary.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.elibrary.models.BookModel;

@Service("bookmodelDAO")  //Bean name
public class BookModelDAOImpl implements BookModelDAO {

	@Autowired
	@Qualifier("jdbcTemplate")     
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(BookModel book) {    
		final String Query = "insert into book(isbn,title,author,publisher,qty) values(?,?,?,?,?)";
		Object param[] = { book.getIsbn(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getQty() };
		int n = jdbcTemplate.update(Query, param);
		return n;   //returning 0/1 for success
	}

	@Override
	public int delete(int id) {
		final String Query = "delete from book where id= ?";
		Object param[] = { id };
		int n = jdbcTemplate.update(Query, param);
		return n; //returning 0/1 for success
	}

	@Override
	public int update(BookModel book, int id) {
		final String Query = "update book set isbn=?,title=?,author=?,publisher=?,qty=? where id= ?";
		Object param[] = { book.getIsbn(),book.getTitle(),book.getAuthor(),book.getPublisher(),book.getQty(), id };
		int n = jdbcTemplate.update(Query, param);
		return n;  //returning 0/1 for success
	}

	@Override
	public BookModel getById(int id) {
		final String Query = "Select * from book where id=?";
		Object param[] = { id };
		BookModel book = jdbcTemplate.queryForObject(Query, param, new BeanPropertyRowMapper<BookModel>(BookModel.class));
		return book ;  //returning an book object for success
	}

	@Override
	public List<BookModel> getall() {
		final String sql = "select * from book";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<BookModel>(BookModel.class));
		//returning list of type BookModel for success
	}

	@Override
	public BookModel getByName(String name) {
		final String Query = "select * from book where title=?";
		Object param[] = { name };   
		BookModel book = jdbcTemplate.queryForObject(Query, param, new BeanPropertyRowMapper<BookModel>(BookModel.class));
		return book ;   //returning BookModel object for success
		
	}

}
