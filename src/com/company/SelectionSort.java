package com.company;

import static com.company.SortTemplate.*;

/**
 * Created by Administrator on 2017/9/1.
 */
public class SelectionSort {



    public static void sort(Comparable[]comparables){//comparables按升序排序
        int len =comparables.length;
        for (int i=0;i<len;i++){//进行len趟排序

            //第len趟初始最小值下标为i
            int min = i;
            for (int j=i+1;i<len;i++) {//从剩下的无序区找最小值与初始最小值比较

                if (less(comparables[j],comparables[min])) min = j;

                exchange(comparables,j,min);//交换记录
            }

        }
    }


//主程序入口

    public static void main(String[] args){


        //获取输入数据
        //input();

        //将输入转化为数组
        Comparable[] comparableList= (Comparable[]) input().toArray();

        //对数组进行选择排序
        sort(comparableList);

        //判断是否排序
        isSorted(comparableList);

        show(comparableList);
    }

}
