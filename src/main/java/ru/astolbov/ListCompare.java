package ru.astolbov;

import java.util.Comparator;
import java.util.List;

public class ListCompare implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        int res = 0;

        if (res == 0 & o1.size() > o2.size()) {
            res = 1;
        }

        if (res == 0 & o1.size() < o2.size()) {
            res = -1;
        }

        if (res == 0 & o1.size() == o2.size()) {
            int i = 0;
            do {
                res = o1.get(i).compareTo(o2.get(i));
            i++;
            } while (res == 0 & i < o1.size());
        }

        return res;
    }
}
