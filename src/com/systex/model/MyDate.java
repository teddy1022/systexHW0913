package com.systex.model;

import java.util.Objects;

public class MyDate implements Comparable<MyDate>{
	private int day;
	private int month;
	private int year;
	
	
	public MyDate() {
		super();
	}
	
	public MyDate(int day, int month, int year) {
		//super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		 return String.format("MyDate [date = %2d, month = %2d, year = %d]", day, month, year);
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	public int compareMonth(MyDate o) {
		if(this.month > o.month) {
			return 1;
		}else if (this.month < o.month) {
			return -1;
		}else {
			return compareDate(o);
		}
	
	}
	
	public int compareDate(MyDate o) {		
		return this.day - o.day > 0 ? 1 : -1;
	}

@Override
	public int compareTo(MyDate o) {
		// TODO Auto-generated method stub
		if(this.year > o.year) {
			return 1;
		}else if (this.year < o.year) {
			return -1;
		}else{
			return compareMonth(o);
		}
	
	}

	
	
	
	
	
}
