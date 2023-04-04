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
		CommonRecord<Book> bookRecord = new CommonRecord<Book>();
		bookRecord.addItem(new Book(1, "Java Basics"));
		bookRecord.addItem(new Book(2, "Java Advanced"));

		Book book = bookRecord.getItem(0);
		System.out.println(book);

		CommonRecord<Laptop> laptopRecord = new CommonRecord<Laptop>();
		laptopRecord.addItem(new Laptop(100, "HP"));
		laptopRecord.addItem(new Laptop(200, "Dell"));
		// laptopRecord.addItem(new Book(2, "Java Advanced"));

		Laptop laptop = laptopRecord.getItem(0);
		System.out.println(laptop);

		CommonRecord<Object> objectRecord = new CommonRecord<Object>();
		objectRecord.addItem(new Laptop(100, "HP"));
		objectRecord.addItem(new Book(2, "Java Advanced"));
		objectRecord.addItem("Java");
		objectRecord.addItem(2);

		Laptop laptop2 = (Laptop) objectRecord.getItem(1);
		System.out.println(laptop2);

		CommonRecord<Laptop> laptopRecord2 = new CommonRecord<>();
		laptopRecord2.addItem(new Laptop(100, "HP"));
		laptopRecord2.addItem(new Laptop(200, "Dell"));

		CommonRecord commonRecord = new CommonRecord();
		commonRecord.addItem(new Laptop(100, "HP"));
		commonRecord.addItem(new Book(1, "Java Basics"));
		commonRecord.addItem("Java");
		commonRecord.addItem(2);
		
		Laptop laptop3 = (Laptop) commonRecord.getItem(0);
		System.out.println(laptop3);
	}
}