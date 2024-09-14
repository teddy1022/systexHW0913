package com.systex.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//import com.systex.model.DayComparator;
//import com.systex.model.MonthComparator;
import com.systex.model.MyDate;

public class TestSorting {

	public static void main(String[] args) {
		if (args.length < 1) {
            System.out.println("0 for descending order.");
            System.out.println("1 for ascending order.");
            System.out.println("Example: java TestSorting 0");
            return;
        }
		// TODO Auto-generated method stub
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(13, 9, 2024));
		dates.add(new MyDate(11, 8, 2024));
		dates.add(new MyDate(11, 10, 2024));
		dates.add(new MyDate(11, 1, 2024));
		dates.add(new MyDate(12, 1, 2024));
		dates.add(new MyDate(1, 1, 2024));
		dates.add(new MyDate(1, 1, 2024));
		dates.add(new MyDate(5, 12, 2019));
		dates.add(new MyDate(8, 10, 2025));
		dates.add(new MyDate(25, 2, 2030));
		dates.add(new MyDate(30, 1, 2008));
		dates.add(new MyDate(22, 3, 2004));
		dates.add(new MyDate(17, 7, 2012));
		dates.add(new MyDate(19, 6, 2015));
		
		System.out.println("=====================Before Sorted======================");
		dates.forEach(d->System.out.println(d));
		System.out.println("=====================After Sorted======================");

		switch(args[0]) {
			case "0" : 
				Collections.sort(dates,Comparator.reverseOrder());
				break;
			case "1" : 
				Collections.sort(dates);
				break;
		}
		
		dates.forEach(d->System.out.println(d));

	}

}