package task6;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private int maxWeight;
    private int maxCost;
    private List<Item> bestList = new ArrayList<>();

    public Pack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int calcWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item it : items) {
            sumWeight += it.getWeight();
        }
        return sumWeight;
    }

    public int calcCost(List<Item> items) {
        int sumCost = 0;
        for (Item it : items) {
            sumCost += it.getCost();
        }
        return sumCost;
    }

    public void checkSet (List<Item> items) {
        if (bestList.isEmpty()) {
            if (calcWeight(items) <= maxWeight) {
                bestList.addAll(items);
                maxCost = calcCost(items);
            }
        } else {
            if (calcWeight(items) <= maxWeight && calcCost(items) > maxCost) {
                bestList = items;
                maxCost = calcCost(items);
            }
        }
    }

    public void makeList(List<Item> items) {
        if (items.size() > 0) {
            checkSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> newList = items;
            newList.remove(i);
            makeList(newList);
        }
    }

    public List<Item> getBestList() {
        return bestList;
    }
}
