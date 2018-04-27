package com.study.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        final double rate = 10;
        final int rateLevel = 6;
        final int years = 10;

        //得到第一行的利润率
        double[] interestRate = new double[rateLevel];
        for(int j = 0; j < interestRate.length; j++)
            interestRate[j] = (rate + j)/100.0;

        double[][] balances =new double[years][rateLevel];

        //设置第一行余额为1W
        for (int j = 0; j < rateLevel; j++){
            balances[0][j] = 10000;
        }

        //计算未来年的余额
        for(int i=1; i <balances.length; i++){
            for (int j = 0;j < balances[i].length; j++){
                double oldBalance = balances[i-1][j];
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }

        //打印第一行利润率
        for (int j = 0; j < interestRate.length; j++){
            System.out.printf("%9.0f%%",100*interestRate[j]);
        }

        System.out.println();

        //打印利润表格
        for (double[] row : balances){
            for(double b : row){
                System.out.printf("%10.2f", b);
            }
            System.out.println();
            
        }
    }
}
