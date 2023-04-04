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
		BookRecord bookRecord = new BookRecord();
		bookRecord.addItem(new Book(1, "Java Basics"));
		bookRecord.addItem(new Book(2, "Java Advanced"));

		Book book = bookRecord.getItem(0);
		System.out.println(book);

		LaptopRecord laptopRecord = new LaptopRecord();
		laptopRecord.addItem(new Laptop(100, "HP"));
		laptopRecord.addItem(new Laptop(200, "Dell"));

		Laptop laptop = laptopRecord.getItem(0);
		System.out.println(laptop);
	}
}