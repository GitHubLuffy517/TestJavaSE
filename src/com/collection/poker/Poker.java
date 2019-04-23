package com.collection.poker;

import org.junit.Test;

import java.util.*;

public class Poker {
    private List<Integer> indexList ;
    private Map<Integer, String> pokerMap ;

    public Poker() {
        indexList = new ArrayList<>();
        pokerMap = new HashMap<>();
    }

    public List<Integer> getIndexList() {
        return indexList;
    }

    public Map<Integer, String> getPokerMap() {
        return pokerMap;
    }
@Test
    public void initPoker() {
        int index = 0;
        String[] colors = {"黑桃", "红桃", "方块", "梅花"};
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String s1 : colors) {
            for (String s2 : nums
            ) {
                indexList.add(index);
                pokerMap.put(index++, s1 + s2);
            }
        }
        indexList.add(index);
        pokerMap.put(index++,"大王");
        indexList.add(index);
        pokerMap.put(index,"小王");
    }
}
