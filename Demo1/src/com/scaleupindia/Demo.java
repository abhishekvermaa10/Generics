package com.scaleupindia;

import com.scaleupindia.entity.Book;
import com.scaleupindia.entity.Laptop;
import com.scaleupindia.record.ObjectRecord;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		ObjectRecord bookRecord = new ObjectRecord();
		bookRecord.addItem(new Book(1, "Java Basics"));
		bookRecord.addItem(new Book(2, "Java Advanced"));

		Book book = (Book) bookRecord.getItem(0);
		System.out.println(book);

		ObjectRecord laptopRecord = new ObjectRecord();
		laptopRecord.addItem(new Laptop(100, "HP"));
		laptopRecord.addItem(new Laptop(200, "Dell"));

		Laptop laptop = (Laptop) laptopRecord.getItem(0);
		System.out.println(laptop);

		ObjectRecord objectRecord = new ObjectRecord();
		objectRecord.addItem(new Laptop(100, "HP"));
		objectRecord.addItem(new Book(2, "Java Advanced"));
		objectRecord.addItem("Java");
		objectRecord.addItem(2);

		Laptop laptop2 = (Laptop) objectRecord.getItem(1);
		System.out.println(laptop2);
	}
}