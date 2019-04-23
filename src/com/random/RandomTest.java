package com.random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
      randomBall();
    }

    public  static int[] initBalls() {
        int[] balls=new int[32];
        for (int i=0;i<32;i++){
            balls[i]=i+1;
        }
        return balls;
    }
    public static void randomBall(){
        int[] balls=initBalls();
        Random random=new Random();
        int[] redBalls=new int[6];
        int blueBall;
        int index=0;
        String list="";
        while (true){
            int r=random.nextInt(32);
            String s=Integer.toString(r);
            if (list.contains(s)){
                continue;
            }
            list+=s+" ";
            redBalls[index++]=balls[r];
            if (index==6){
                break;
            }
        }
        Arrays.sort(redBalls);
        System.out.print("红球： ");
        for (int i:redBalls
             ) {
            System.out.print(i+" ");
        }
        System.out.print("蓝球： ");
        System.out.println(balls[random.nextInt(16)]);
    }
}
