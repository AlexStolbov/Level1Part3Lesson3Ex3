package ru.astolbov;

import java.util.Comparator;
import java.util.List;

public class ListCompare implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        int res;

        if (o1.size() > o2.size()) {
            res = 1;

        } else if (o1.size() < o2.size()) {
            res = -1;

        } else {
            int i = 0;
            do {
                res = o1.get(i).compareTo(o2.get(i));
                i++;
            } while (res == 0 & i < o1.size());
        }

        return res;
    }
}
