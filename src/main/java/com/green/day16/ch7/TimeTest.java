package com.green.day16.ch7;

//setter naming = set + 전역변수 명(첫글자는 대문자)
//set은 리턴타입은 void타입으로 작성.

//getter naming = get + 전역변수 명(첫글자는 대문자)
//getter 는 파라미터가 없음. 타입은 전역변수의 타입을 따라서 작성. 리턴은 전역변수명을 이용하면됨.

public class TimeTest {
    public static void main(String[] args){
        Time time= new Time(10, 11, 12);
        System.out.printf("hour: %d\n", time.getHour());
        time.setHour(22);
        System.out.printf("hour: %d\n", time.getHour());
    }
}

class Time { //캡슐화, 은닉화
             //캡슐화된 전역변수에 값을 넣는 방법 = 1. 생성자를 이용해서 넣는다. / 2. 메소드를 이용해서 넣는다.
             //캡슐화된 전역변수에 값을 빼는 방법 = 메소드를 이용해서 빼낸다.
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
}