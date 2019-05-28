package com.elibrary;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.elibrary.daos.BookModelDAO;
import com.elibrary.facade.BookModelFacade;
import com.elibrary.models.BookModel;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class ElibraryApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(App.class, args);
		BookModelDAO bookModeldao = (BookModelDAO) context.getBean("bookmodelDAO");
		BookModelFacade b = (BookModelFacade) context.getBean("bookModelFacade");
		//b.fetchall();
		//List<BookModel> books;
		//books = b.fetchall();
		//books.stream().forEach(System.out::println);
		//BookModel b1 = bookModeldao.getById(1);
		//System.out.println(b1);
	}

}
