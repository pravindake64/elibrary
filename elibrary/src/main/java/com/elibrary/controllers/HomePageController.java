package com.elibrary.controllers;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.elibrary.App;
import com.elibrary.BookForm;
import com.elibrary.daos.BookModelDAO;
import com.elibrary.facade.BookModelFacade;
import com.elibrary.models.BookModel;


@Controller
public class HomePageController {
	
	@GetMapping("/home")    //Home page
	public String home() {
		return "home";
	}
	
	@GetMapping("/create")   //Create page
	public String create() {
		return "add";
	}
	@GetMapping("/delete")   //first fetching all the record from database
	public String delete(Model model) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		BookModelFacade b = (BookModelFacade) context.getBean("bookModelFacade");
		List<BookModel> books;
		books = b.fetchall();
		model.addAttribute("books", books);
		
		return "delete";
	}
	@GetMapping("/list")  //
	public String listall(Model model) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		BookModelFacade b = (BookModelFacade) context.getBean("bookModelFacade");
		List<BookModel> books;
		books = b.fetchall();
		model.addAttribute("books", books);
		
		return "elibrary";
	}
	@GetMapping("/search")
	public String searchbyname() {
		
		return "search";
	}
	
	 @RequestMapping(value = "/addbook", method = RequestMethod.POST) 
	 public String addbook(@RequestParam("isbn") String isbn,@RequestParam("title") String title,@RequestParam("author") String author,@RequestParam("publisher") String publisher,@RequestParam("qty") String qty, Model model) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		BookModelFacade b = (BookModelFacade) context.getBean("bookModelFacade");
		BookModel book = new BookModel(isbn, title, author, publisher, qty);
		b.create(book);
	   return "add";
	 }
	 
	 @RequestMapping(value = "/searchbook", method = RequestMethod.POST) 
	 public String searchbook(@RequestParam("title") String title,Model model) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
			BookModelFacade b = (BookModelFacade) context.getBean("bookModelFacade");
			BookModel book = b.getByName(title);
			model.addAttribute("books", book);
	   return "search";
	 }
	 
	 @RequestMapping(value = "/deletebook", method = RequestMethod.POST) 
	 public String deletebook(@RequestParam("del") int id,Model model) {
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
			BookModelFacade b = (BookModelFacade) context.getBean("bookModelFacade");
			b.remove(id);
			
	   return "delete";
	 }
}
