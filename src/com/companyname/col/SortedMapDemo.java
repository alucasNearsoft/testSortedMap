package com.companyname.col;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * TreeMap is an example of a sorted map, which is a map that maintains its entries in ascending order,
sorted according to the keys’ natural ordering or according to a comparator that is supplied when the
sorted map is created. Sorted maps are described by the SortedMap interface.
 *
 */
class SortedMapDemo
{
	public static void main(String[] args)
	{
		SortedMap<String, Integer> smsi = new TreeMap<>();
		String[] officeSupplies =
			{
				"pen", "pencil", "legal pad", "CD", "paper"
			};
		int[] quantities =
			{
				20, 30, 5, 10, 20
			};
		for (int i = 0; i < officeSupplies.length; i++)
			smsi.put(officeSupplies[i], quantities[i]);
		System.out.println(smsi);
		System.out.println(smsi.headMap("pencil"));
		System.out.println(smsi.headMap("paper"));
		SortedMap<String, Integer> smsiCopy;
		Comparator<String> cmp;
			cmp = new Comparator<String>() {
				public int compare(String key1, String key2)
				{
					return key2.compareTo(key1); // descending order
				}
			};
		smsiCopy = new TreeMap<String, Integer>(cmp);
		smsiCopy.putAll(smsi);
		System.out.println(smsiCopy);
	}
}