package com.green.day7.ch4;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FlowEx2 {
    public static void main(String[] args){
        /*
        Scanner 객체를 이용하여 콘솔에서 문자열값을 받는다.
        받은 문자열을 숫자로 파싱한다.
        파싱한 숫자가 0이라면 >> "입력하신 숫자는 0입니다. (출력)
                    0이 아니라면 >> 입력하신 숫자는 0이 아닙니다.
                               >> 입력하신 숫자는 ?입니다. (출력)
         */
        System.out.print("숫자를 입력해 주세요. >> ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int str2 = Integer.parseInt(str);

        if (str2 == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.printf("입력하신 숫자는 0이 아닙니다.\n입력하신 숫자는 %d입니다.\n", str2);
        }
    }
}
