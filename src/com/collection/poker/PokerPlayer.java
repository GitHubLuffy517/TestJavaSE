package com.collection.poker;



import java.util.Map;
import java.util.TreeSet;

public class PokerPlayer {
    private TreeSet<Integer> treeSet;
    public PokerPlayer(){
        treeSet=new TreeSet<>();
    }
    public TreeSet<Integer> getTreeSet() {
        return treeSet;
    }
    public void showPoker(Poker poker){
        Map<Integer,String> pokerMap=poker.getPokerMap();
        for (Integer i:treeSet
             ) {
            System.out.print(pokerMap.get(i)+" ");
        }
    }
}
