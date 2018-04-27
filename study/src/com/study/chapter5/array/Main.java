package com.study.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入抽奖的号码总数：");
        //输入抽奖的号码总数
        int allNum = in.nextInt();

        System.out.println("请输入中奖的号码个数：");
        //输入中奖的号码个数
        int drawNum = in.nextInt();

        //创建抽奖号码数组
        int [] all = new int[allNum];
        for (int i = 0;i<all.length;i++){
            all[i] = i+1;
        }

        //创建中奖号码数组
        int[] draw = new int[drawNum];
        for(int i = 0; i < draw.length; i++){
            //通过随机数获取中奖号码
            int random = (int) (Math.random() * allNum);
            draw[i] = all[random];
            //用最后一个号码替换已中奖号码防止再次选中
            all[random] = all[allNum-1];
            //将最大数组下标减1
            allNum--;
        }

        //将中奖号码排序
        Arrays.sort(draw);

        //遍历中奖号码
        Arrays.stream(draw).forEach(System.out::println);
    }
}
