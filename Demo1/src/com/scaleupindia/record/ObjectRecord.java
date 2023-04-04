package com.scaleupindia.record;

/**
 * @author abhishekvermaa10
 *
 */
public class ObjectRecord {
	private Object[] items;

	public void addItem(Object item) {
		// logic to add item
	}

	public Object getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}