package com.study.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        //获取当前日期
        LocalDate date = LocalDate.now();
        //获取当前月份的整型数值
        int month = date.getMonthValue();
        //获取当前月份的日子
        int today = date.getDayOfMonth();

        //将当前日期减去（当前日期-1）获取得到1号
        date = date.minusDays(today-1);
        //获取得到1号的时候是星期几的枚举型变量值
        DayOfWeek weekDay = date.getDayOfWeek();
        //获取得到当前星期几的整型表示
        int value = weekDay.getValue();

        //打印日历表头
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        //当星期数小于当前星期数时打印空格
        for(int i = 1; i < value; i++)
            System.out.print("    ");
        //当月份没有增加时进行循环
        while(date.getMonthValue() == month){
            //将月份的天数格式化输出，格式为三位的十进制整数
            System.out.printf("%3d", date.getDayOfMonth());
            //如果当前天数是今天，在后方加入*号,否则打印空格
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            //将当前日+1
            date = date.plusDays(1);
            //如果当前日子是星期一则换行
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        //如果当前日子不是星期一则换行
        if(date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
