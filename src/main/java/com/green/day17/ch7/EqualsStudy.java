package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args){
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(10);

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n1));
        System.out.println(n1.equals(n2));
    }
}

class Numbox {
    private int num;

    Numbox(int num){
        this.num = num;
    }
//    @Override
//    public boolean equals(Object obj){
//        return true;
//    }

//    public boolean equals(Object obj) {
////        if (this == obj) {
////            return true;
////        }
////        if (obj == null || getClass() != obj.getClass()) {
////            return false;
////        }
//        Numbox n = (Numbox) obj;
//        return num == n.num;
//    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Numbox)){
            return false;
        }
        Numbox numbox = (Numbox) obj;
        return this.num == numbox.num;
    }
}
