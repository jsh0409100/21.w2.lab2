package w2.lab1.Fruit;

import java.util.ArrayList;
import java.util.Collections;

import w2.lab1.Student.Student;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		
		list.add(new Student(1, "Apple", 1000));
		list.add(new Student(2, "Orange", 6000));
		list.add(new Student(3, "Pineapple", 15000));
		list.add(new Student(4, "Melon",  12000));
		list.add(new Student(5, "Banana", 4000));
		list.add(new Student(6, "Grapefriut",7000));
		list.add(new Student(7, "Strawberry", 10000));
		list.add(new Student(8, "Blueberry", 6000));
		list.add(new Student(9, "Peach", 2000));
		list.add(new Student(10, "Lemon", 5000));
		
		Collections.sort(list, new FruitComparator());
		
		for(int i = 0; i<list.size(); i++) {
			
			System.out.println(list.get(i).toString());	
		}
}

