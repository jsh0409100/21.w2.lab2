package w2.lab1.Fruit;
import java.util.Comparator;

import w2.lab1.Fruit;

public class FruitComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.name.compareTo(o2.name);

    }
}