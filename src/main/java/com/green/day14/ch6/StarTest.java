package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args){
        Star star = new Star();
        star.singlePrint(5); //*****(개행)
        star.singlePrint(7); //*******(개행)
        System.out.println("------------");
        star.squarePrint(5);
        /*
            *****
            *****
            *****
            *****
            *****
        */
        System.out.println("------------");
        star.trianglePrint(4);
        /*
        *
        * *
        * **
        * ***
         */
        System.out.println("------------");
        star.underbarTrianglePrint(6);
    }
}

class Star{
    void singlePrint(int i){
        for(int z = 0; z < i; z++){
            System.out.print("*");
        }
        System.out.println();
    }

    void underbarTrianglePrint(int i){
        for(int a = 0; a < i; a++) {
            for(int z = i - 1; z > a; z--){
                System.out.print("-");
            }
            singlePrint(a + 1);
        }
    }

    void trianglePrint(int i){
        for(int z = 1; z <= i; z++){
            singlePrint(z);
        }
    }

    void squarePrint(int i){
//        for(int z = 0; z < i; z++){
//            for(int n = 0; n < i; n++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int z = 0; z < i; z++){
            singlePrint(i);
        }
    }
}
