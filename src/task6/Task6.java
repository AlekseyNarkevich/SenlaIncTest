/*Имеется набор вещей, которые необходимо поместить в рюкзак.
        Рюкзак обладает заданной грузоподъемностью.
        Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
        Цель задачи заполнить рюкзак не превысив его грузоподъемность и
        максимизировать суммарную ценность груза.*/

package task6;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Name1", 6, 60));
        items.add(new Item("Name2", 3, 30));
        items.add(new Item("Name3", 7, 70));
        items.add(new Item("Name4", 2, 20));
        items.add(new Item("Name5", 5, 50));

        Pack pack = new Pack(15);

        pack.makeList(items);

        for (Item it : pack.getBestList()) {
            System.out.println(it.getName());
        }

    }
}
