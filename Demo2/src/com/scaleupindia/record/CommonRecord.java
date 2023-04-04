package com.scaleupindia.record;

/**
 * @author abhishekvermaa10
 *
 */
public class CommonRecord<E> {
	private E[] items;

	public void addItem(E item) {
		// logic to add item
	}

	public E getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}