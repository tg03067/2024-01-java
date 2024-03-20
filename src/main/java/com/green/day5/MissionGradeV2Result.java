package com.green.day5;

public class MissionGradeV2Result {
    public static void main(String[] args) {
        //int score = -10 ~ 120점 사이의 랜덤값 나올 수 있도록 설정
//        int score = (int) (Math.random() * 131.0) -10;
        int score = 98;
        int d = score / 10; //0~9 10의 자리
        int i = score % 10; // 1의 자리
        String grade = "A";
        String symbol = "+";

        System.out.println("score: " + score);
        while(true){
//            String grade = "A";
//            String symbol = "+";
            if(score < 0 || score > 100){
                System.out.println("점수가 잘못되었습니다.");
                break;
            } else if(score < 100){ //0~99
//                int d = score / 10; //0~9
                grade = switch(d){
                    case 9 -> "A";
                    case 8 -> "B";
                    case 7 -> "C";
                    default -> {
                        symbol = "";
                        yield "F"; //yield 반환될때 사용
                    }
                };

                if(d > 6){//9 8 7
//                    int i = score % 10;
                    if(i < 3){ // 0 1 2
                        symbol = "-";
                    } else if(i < 7){ // 3 4 5 6
                        symbol = "0";
                    }

                }
            }
            System.out.printf("당신의 학점은 %s%s입니다\n", grade, symbol);
            break;
        }
        System.out.println("---종료---");
    }
}



