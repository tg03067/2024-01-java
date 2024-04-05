package com.green.day17.ch11;

public class MyArrayListTest {
    public static void main(String[] args){
        MyArrayList list = new MyArrayList();
        list.add(10);
        //arr 기존 크기보다 1칸 더 큰 새로운 배열 만들고
        //그 배열에 마지막 칸에 넘어온 파라미터값을 집어 넣는다.
        //새로운 배열의 주소값을 전역변수 arr에 대입한다.
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);
        int size = list.size(); //8
        System.out.println("size: " + size);
        System.out.println(list.get(3)); //40
        System.out.println(list.get(0)); //10
    }
}

class MyArrayList{
    private int[] arr;

    MyArrayList(){
        this.arr = new int[0];
    }
    void add(int val){
        int[] temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        temp[arr.length] = val;
        this.arr = temp;
    }

    int get(int num) {
        return this.arr[num];
    }

    int size(){
        return this.arr.length;
    }

    @Override
    public String toString(){
//        String str = "";
//        str += "안녕";
//        str += "하세요"; //String을 써도 StringBuilder로 변환해줌. 그러나 for문에서는 직접쓸수 있게 만들어줌.
//
//        StringBuilder sb2 = new StringBuilder(); //성능이 더 좋음.
//        sb2.append("안녕");
//        sb2.append("하세요");

        if(arr.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0]));
        for(int i = 1; i < arr.length; i++){
            sb.append(String.format(", %d", arr[i]));
        }
        sb.append("]");
        return sb.toString();
    }


//    @Override
//    public String toString() {
//        String id = "";
//        for(int i = 0; i < arr.length; i++){
//            id += arr[i];
//            if(i < arr.length - 1){
//                id += ", ";
//            }
//        }
//        return "[" + id + "]";
//    }
}