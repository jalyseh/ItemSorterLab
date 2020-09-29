package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import javax.naming.Name;
import java.util.Arrays;
import java.util.Comparator;

public class MainTest {

    public static void main(String[] args) {

        IdComparator idComparator = new IdComparator();
        NameComparator nameComparator = new NameComparator();
        PriceComparator priceComparator = new PriceComparator();


        Item item1 = new Item(1L,"item1",10.99);
        Item item2 = new Item(3L, "item2",12.99);
        Item item3 = new Item(2L,"item3",9.99);

        Item[] randomItems = {item1,item2,item3};
        ItemSorter itemSorter = new ItemSorter(randomItems);

        System.out.println("ID COMPARE");
        System.out.println(Arrays.toString(randomItems));
        itemSorter.sort(idComparator);

        System.out.println("NAME COMPARE");
        System.out.println(Arrays.toString(randomItems));
        itemSorter.sort(nameComparator);

        System.out.println("PRICE COMPARE");
        System.out.println(Arrays.toString(randomItems));
        itemSorter.sort(priceComparator);


    }




}
