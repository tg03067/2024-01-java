package com.green.day5;

public class MissionGradeV2 {
    public static void main(String[] args) {
        //int score = -10 ~ 120점 사이의 랜덤값 나올 수 있도록 설정
//        int score = (int) (Math.random() * 131.0) -10;
//        int score = 100;
        //score값이 0~100사이의 값이 아니면 "점수가 잘못되었습니다." 출력 > 끝!

        //10의 자리 숫자가 10,9 > A
        //                  8 > B
        //                  7 > C
        //                  6 > F

        //1의 자리 숫자가 0~2 -
        //1의 자리 숫자가 3~6 0
        //1의 자리 숫자가 7~9 +

        //단, F는 +-가 없음 무조건 "F", A~C만 +-가 있음, 100점은 A+

/*        String grade = "F";
        String a = "0";
        if(score > 100 || score < 0){
            System.out.println("점수가 잘못되었습니다");
        } else {
            if (score / 10 >= 9) {
                grade = "A";
            } else if (score / 10 >= 8) {
                grade = "B";
            } else if (score / 10 >= 7) {
                grade = "C";
            }
            if (score % 10 >= 7){
                a = "+";
            } else if(score % 10 >= 3){
                a = "0";
            } else if(score % 10 > 0){
                a = "-";
            } else if(score % 10 == 0) {
                a = "+";
            }
        }
        System.out.println("당신의 학점은" + grade + a + "입니다.");*/

        //10의 자리 숫자가 10,9 > A
        //                  8 > B
        //                  7 > C
        //                  6 > F

        //1의 자리 숫자가 0~2 -
        //1의 자리 숫자가 3~6 0
        //1의 자리 숫자가 7~9 +

        //단, F는 +-가 없음 무조건 "F", A~C만 +-가 있음, 100점은 A+
        int score = 55;
        int val1 = score / 10; //10의자리
        int val2 = score % 10; //1의자리
        String grade = "A";
        String symbol = "+";

        if (score > 100 || score < 0) {
            System.out.println("점수가 잘못 입력되었습니다.");
        } else {
            if (val1 >= 0) {
                grade = switch (val1) {
                    case 10, 9 -> "A";
                    case 8 -> "B";
                    case 7 -> "C";
                    default -> {
                        symbol = "";
                        yield "F";
                    }
                };
                if(val2 > 0 || score != 100){
                    symbol = switch (val2){
                        case 0, 1, 2 ->"-";
                        case 3, 4, 5, 6 -> "0";
                        default -> {
                            yield "";
                        }
                    };
                }
            }
//            if(val2 > 0 || score != 100){
//                symbol = switch (val2){
//                  case 0, 1, 2 ->"-";
//                  case 3, 4, 5, 6 -> "0";
//                    default -> {
//                        yield "";
//                    }
//                };
//            }
            System.out.printf("당신의 학점은 %s%s입니다.\n", grade, symbol);
        }
    }
}

