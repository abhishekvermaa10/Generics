package com.scaleupindia.record;

import com.scaleupindia.entity.Laptop;

/**
 * @author abhishekvermaa10
 *
 */
public class LaptopRecord {
	private Laptop[] items;

	public void addItem(Laptop item) {
		// logic to add item
	}

	public Laptop getItem(int index) {
		if (index < items.length)
			return items[index];
		else
			return null;
	}
}