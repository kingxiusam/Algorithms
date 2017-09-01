package com.company;

//import java.lang.reflect.Array;
import java.util.Scanner;
    public class Main {
/*
此问题是经典的三维装箱问题
 */

        public static Model[] items;

/** 请完成下面这个process函数，实现题目要求的功能 **/
        /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/

        private static final int CUSTOMS_LIMIT_MONEY_PER_BOX=2000;
        private static int boxMinNum = 0;//最小的箱子数量
        private static Box boxTemplate;//箱子
        private static int itemNum;
        private static int temp_length = 0;
        private static int temp_width = 0;
        private static int temp_height = 0;
        private static int temp_price = 0;
        //临时变量index
        private static int index = 0;

        private static int process()
        {


            //有解返回箱子数量，对items进行操作

            if (itemNum <=10){



                //长宽高各项总和必须都要小于等于箱子的长宽高

                for (int i = index;i<items.length;i++){//对所有商品进行装箱

                    temp_length +=items[i].length;
                    temp_width += items[i].width;
                    temp_height +=items[i].height;
                    temp_price +=items[i].price;

                    if (temp_length>boxTemplate.length&&
                            temp_width>boxTemplate.width&&
                            temp_height>boxTemplate.height||temp_price>CUSTOMS_LIMIT_MONEY_PER_BOX){

                        boxMinNum++;//增加箱子继续装箱
                        //从前一个装满后的商品之后开始装箱


                    }
                }


                //商品被装完
                return boxMinNum;
            }




            //无解输出-1
            return -1;
        }


       // 输入箱子长宽高
       // 输入购买商品数
       // 输入每个商品长宽高
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            boxTemplate = new Box();
            boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

            while (scanner.hasNext()){
                boxTemplate.length = scanner.nextInt();
                boxTemplate.width = scanner.nextInt();
                boxTemplate.height = scanner.nextInt();

                itemNum = scanner.nextInt();

                items = new Model[itemNum];
                for(int i=0; i<itemNum; i++){
                    Model item = new Model();
                    item.price = scanner.nextInt();
                    item.length = scanner.nextInt();
                    item.width = scanner.nextInt();
                    item.height = scanner.nextInt();
                    items[i] = item;
                }
                long startTime = System.currentTimeMillis();
                boxMinNum = Integer.MAX_VALUE;
                System.out.println (process());

            }
        }


         static class Box {
            private int price;
            private int length;
            private int width;
            private int height;


            public Box() {
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public Box(int price, int length, int width, int height) {
                this.price = price;
                this.length = length;
                this.width = width;
                this.height = height;
            }
        }

            static class Model{
            private int price;
            private int length;
            private int width;
            private int height;

                public Model() {
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getLength() {
                    return length;
                }

                public void setLength(int length) {
                    this.length = length;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }
    }



