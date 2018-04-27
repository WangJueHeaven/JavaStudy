package com.study.chapter5.enums;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        //输入size同时将输入的内容转换为大写
        String input = in.next().toUpperCase();
        //通过toString的逆方法，由输入的String来获取枚举型常量
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE)
            System.out.println("Good job---you paid attention to the _.");
    }
}

@SuppressWarnings("ALL")
enum Size{
    //枚举构造
    SMALL("S"), MEDIUM("M"), LARGE("L"),EXTRA_LARGE("XL");
    //构造
    private Size(String abbreviation){this.abbreviation = abbreviation; }
    //get
    public String getAbbreviation(){return abbreviation;}
    //域名
    private String abbreviation;
}