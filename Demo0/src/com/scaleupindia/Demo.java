package com.scaleupindia;

import com.scaleupindia.entity.Book;
import com.scaleupindia.entity.Laptop;
import com.scaleupindia.record.BookRecord;
import com.scaleupindia.record.LaptopRecord;

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

		BookRecord bookRecord = new BookRecord();
		bookRecord.addItem(book1);
		bookRecord.addItem(book2);

		Book book = bookRecord.getItem(0);
		System.out.println(book);

		LaptopRecord laptopRecord = new LaptopRecord();
		laptopRecord.addItem(laptop1);
		laptopRecord.addItem(laptop2);

		Laptop laptop = laptopRecord.getItem(0);
		System.out.println(laptop);
	}
}