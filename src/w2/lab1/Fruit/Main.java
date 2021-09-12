package w2.lab1.Fruit;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		
		list.add(new Fruit(1, "Apple", 1000));
		list.add(new Fruit(2, "Orange", 6000));
		list.add(new Fruit(3, "Pineapple", 15000));
		list.add(new Fruit(4, "Melon",  12000));
		list.add(new Fruit(5, "Banana", 4000));
		list.add(new Fruit(6, "Grapefriut",7000));
		list.add(new Fruit(7, "Strawberry", 10000));
		list.add(new Fruit(8, "Blueberry", 6000));
		list.add(new Fruit(9, "Peach", 2000));
		list.add(new Fruit(10, "Lemon", 5000));
		
		Collections.sort(list, new FruitComparator());
		
		for(int i = 0; i<list.size(); i++) {
			
			System.out.println(list.get(i).toString());	
		}
	}
}

