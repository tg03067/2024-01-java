package com.green.day18;

public class ExamTest {
    int globalNum;

    public static void main(String[] args){
        int rVal = Exam.getRandomValue(1, 101); // 1 ~ 100사이의 랜덤값 리턴
//        rVal = Exam.getRandomValue(5, 21); // 5 ~ 20사이의 랜덤값 리턴
        int rVal2 = Exam.getRandomValue(1, 101);
        Exam.printOddEven(rVal); // ?는(은) 짝수입니다.
                                 // ?는(은) 홀수입니다.

        //
//        for(int i = 0; i < 100; i++){
//            int rVal2 = Exam.getRandomValue(1, 6); // 1 ~ 10사이의 랜덤값 리턴
//            System.out.println(rVal2);
//            if(rVal2 < 1 || rVal2 > 5){
//                System.out.println("1~5사이가 아님");
//                break;
//            }
//        }
//        //100, 99, 98, 97
//        for(int i = 100; i < 104 ; i++){
//              System.out.println(200 - i);
//        }
        System.out.println("-------");
        Exam.test(rVal, rVal2); //
        //rval1이 짝수면 (rval2도 짝수면 val2 - val1 값을 출력, 홀수면 val1값만 출력)
        //rval1이 홀수면 (rval2가 짝수면 val2 - 5 값을 출력, 홀수면 val2값만 그대로 출력)
        System.out.println("-------");
        Exam.printNumToNum(20, 20); // 2~20숫자로 세로로 출력.
        System.out.println("-------");
        int score = Exam.getRandomValue(-100, 200);
        System.out.println("score: " + score);
        String grade = Exam.getGrade(score);
        System.out.println("grade: " + grade);
        /*
        score값이 0~100사이가 아니라면 "점수가 잘못되었습니다." 리턴
        10의 자리 숫자가
        10, 9 > A
        8 > B
        7 > C
        6 > F

        1의 자리 숫자가
        0~2 -
        3~6 0
        7~9 +

        예를 들어
        100 > A+
        99 > A+
        82 > B-
        75 > C0

        단, F는 +-0가 없음 무조건 "F", A~C만 +-0가 있음, 100점은 A+
         */
        System.out.println("-------");
        int sum = Exam.getSumFromTo(8, 20);// 8 ~ 20까지 모두 더한 값을 리턴
        System.out.println("sum: " + sum);
    }
}

class Exam {
    static int getRandomValue(int n1, int n2){
        return (int)(Math.random() * (n2 - n1)) + n1;
    }
    static void printOddEven(int i){
        System.out.printf("%d는(은) %s수입니다.\n", i, i % 2 == 0 ? "짝" : "홀");
    }
    static void test(int rVal1, int rVal2){
        if(rVal1 % 2 == 0){
            if(rVal2 % 2 ==0){
                System.out.printf("rVal1: %d, rVal2: %d\n", rVal1, rVal2);
                System.out.println(rVal2 - rVal1);
            } else {
                System.out.printf("rVal1: %d, rVal2: %d\n", rVal1, rVal2);
                System.out.println(rVal1);
            }
        } else {
            if(rVal2 % 2 == 0){
                System.out.printf("rVal1: %d, rVal2: %d\n", rVal1, rVal2);
                System.out.println(rVal2 - 5);
            } else {
                System.out.printf("rVal1: %d, rVal2: %d\n", rVal1, rVal2);
                System.out.println(rVal2);
            }
        }
    }
    static void printNumToNum(int n1, int n2){
        for(int i = n1; i <= n2 ; i++){
            System.out.println(i);
        }
    }
    static String getGrade(int score){
        if(score > 100 || score < 0){ return "점수가 잘못되었습니다. "; }
        if(score == 100) { return "A+"; }
        else if(score < 70){ return "F"; }
        String gd = switch (score / 10){
            case 9 -> "A";
            case 8 -> "B";
            default -> "C";
        };
        String symbol = switch (score % 10) {
            case 0, 1, 2 -> "-";
            case 3, 4, 5, 6 -> "0";
            default -> "+";
        };
        return gd + symbol;
    }
    static int getSumFromTo(int sN, int eN){
        int sum = 0;
        for(int i = sN; i <= eN; i++){ sum += i; }
        return sum;
    }
}