package com.scaleupindia.record;

import com.scaleupindia.entity.Book;

/**
 * @author abhishekvermaa10
 *
 */
public class BookRecord {
	private Book[] items;

	public void addItem(Book item) {
		// logic to add item
	}

	public Book getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}
