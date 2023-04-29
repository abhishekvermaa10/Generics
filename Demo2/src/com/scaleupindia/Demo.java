package com.scaleupindia;

import com.scaleupindia.entity.Book;
import com.scaleupindia.entity.Laptop;
import com.scaleupindia.record.CommonRecord;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Book book1 = new Book(1, "Java Basics");
		Book book2 = new Book(2, "Java Advanced");
		Laptop laptop1 = new Laptop(100, "HP");
		Laptop laptop2 = new Laptop(200, "Dell");
		
		CommonRecord<Book> bookRecord = new CommonRecord<Book>();
		bookRecord.addItem(book1);
		bookRecord.addItem(book2);

		Book book = bookRecord.getItem(0);
		System.out.println(book);

		CommonRecord<Laptop> laptopRecord = new CommonRecord<Laptop>();
		laptopRecord.addItem(laptop1);
		laptopRecord.addItem(laptop2);
		// laptopRecord.addItem(book1); // Not allowed

		Laptop laptop = laptopRecord.getItem(0);
		System.out.println(laptop);
		
		CommonRecord<Object> objectRecord = new CommonRecord<Object>(); // Bad code
		objectRecord.addItem(book1);
		objectRecord.addItem(laptop2);
		objectRecord.addItem("Java");
		
		Laptop o = (Laptop) objectRecord.getItem(1);
		
		Object laptop3 = new Laptop(300, "Apple");
		
		// CommonRecord<Object> objectRecord2 = new CommonRecord<Laptop>(); // Not allowed
		
		CommonRecord<Laptop> laptopRecord2 = new CommonRecord<>();  // since java 7 // best practice
		laptopRecord2.addItem(laptop1);
		laptopRecord2.addItem(laptop2);
		// laptopRecord.addItem(book1);
		
		// CommonRecord<> laptopRecord3 = new CommonRecord<>(); // Not allowed
		// CommonRecord<> laptopRecord3 = new CommonRecord<Laptop>(); // Not allowed
		
		CommonRecord commonRecord = new CommonRecord(); // Backawrd compatibility 
		commonRecord.addItem(book1);
		commonRecord.addItem(laptop2);
		commonRecord.addItem("Java");
	}
}