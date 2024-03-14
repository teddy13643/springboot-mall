package com.teddy.springbootmall.constant;

public class MyTest {
    public static void main(String[] args) { //這啥意思阿？　只是舉例　還沒有實際產出
        ProductCategory category = ProductCategory.FOOD;
        String s = category.name();
        System.out.println(s); //FOOD

        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2);
    }
}
