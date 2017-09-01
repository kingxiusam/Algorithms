package com.company.sort;

import static com.company.sort.SortTemplate.*;

/**
 * Created by Administrator on 2017/9/1.
 * 插入排序
 */
public class InsertSort {

    private static void sort(Comparable[] comparables){
        int len = comparables.length;
        for (int i=1;i<len;i++){//从第2个元素起comparables[1],将其插入到前面比他大的数之前比他小的数之后

            for (int j=i;j>0&&less(comparables[j],comparables[j-1]);j--){//当comparables[j]<comparables[j-1]并满足j>0进行交换

                exchange(comparables,j,j-1);


            }



        }




    }



    public static void main(String[] args){

        Comparable[] comparables = (Comparable[]) input().toArray();
        sort(comparables);
        isSorted(comparables);
        show(comparables);
    }




}
