package com.green.day17.ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args){
        int n1 = 10;
        Integer n2 = 10;
        System.out.println(n1 == n2);
        double d1 = 10.1;
        Double d2 = 10.1;
        char c1 = '1';
        Character c2 = '2';

        //리스트에 정해진 타입만 넣을 수 있게하는 기법 = 제네릭
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0);

        //list.add("우우우");
        int r1 = list.get(0);
        int r2 = list.get(1);

        System.out.println(list);
        // size = int형 리턴메소드
        for(int i = 0 ; i < list.size(); i++){
            System.out.printf("list.get(%d) >> %d\n", i, list.get(i));
        }
    }
}
