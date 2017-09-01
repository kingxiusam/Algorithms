package com.company.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Administrator on 2017/9/1.
 */
public class SortTemplate {

    private static ArrayList<Comparable> comparables = new ArrayList<Comparable>();
    //比较两者大小，升序排序表示为<0
    public static boolean less(Comparable num, Comparable minNum){
        return num.compareTo(minNum)<0;
    }

    //交换数组间两个数的位置

    public static void exchange(Comparable[]comparables,int index,int min){//通过索引交换

        Comparable temp=comparables[index];
        comparables[index]=comparables[min];
        comparables[min]=temp;

    }

    //判断数组是否有序
    public static boolean isSorted(Comparable[] comparable){

        for (int i=1;i<comparable.length;i++){

            if (less(comparable[i],(comparable[i-1]))) return false;

        }

        return true;

    }


    public static List<Comparable> input(){

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()){
            comparables.add(scanner.next());
        }

        return comparables;

    }

    public static void show(Comparable[] comparables){

        for (int i=0;i<comparables.length;i++){

            System.out.println(comparables[i]);




        }


    }






}
