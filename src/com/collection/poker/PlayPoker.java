package com.collection.poker;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
public class PlayPoker {
//    洗牌
    public void shufflePoker(List<Integer> list){
        Collections.shuffle(list);
    }
//    发牌
    public TreeSet<Integer> getPoker(PokerPlayer player1,PokerPlayer player2,PokerPlayer player3,List<Integer> list){
        TreeSet<Integer> treeSet1=player1.getTreeSet();
        TreeSet<Integer> treeSet2=player2.getTreeSet();
        TreeSet<Integer> treeSet3=player3.getTreeSet();
        TreeSet<Integer> dipaiSet=new TreeSet<>();
        for (int i=0;i<list.size();i++){
            if (i>=list.size()-3){
                dipaiSet.add(list.get(i));
            }else {
                if (i%3==0){
                    treeSet1.add(list.get(i));
                }else if (i%3==1){
                    treeSet2.add(list.get(i));
                }else {
                    treeSet3.add(list.get(i));
                }
            }
        }
        return dipaiSet;
    }
    @Test
//    展示牌
    public void showPokers(){
//        初始化牌
        Poker poker=new Poker();
        poker.initPoker();
        Map<Integer,String> pokerMap=poker.getPokerMap();
        List<Integer> indexList=poker.getIndexList();
//        初始化游戏
        PlayPoker playPoker=new PlayPoker();
//        洗牌
        playPoker.shufflePoker(indexList);
//        创建玩家
        PokerPlayer player1=new PokerPlayer();
        PokerPlayer player2=new PokerPlayer();
        PokerPlayer player3=new PokerPlayer();
//        发牌
        TreeSet<Integer> dipaiSet=playPoker.getPoker(player1,player2,player3,indexList);
//        展示牌
        System.out.println("玩家一的牌：");
        player1.showPoker(poker);
        System.out.println();
        System.out.println("玩家二的牌：");
        player2.showPoker(poker);
        System.out.println();
        System.out.println("玩家三的牌：");
        player3.showPoker(poker);
        System.out.println();
        System.out.println("展示底牌：");
        for (Integer i:dipaiSet
             ) {
            System.out.print(pokerMap.get(i)+" ");
        }
    }

}
