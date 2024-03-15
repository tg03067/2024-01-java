package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args) {
        //삼항식, 조건식
        //식 ? true일 때 : false일 때; (식이 3개일때 ?, : 으로한다)

        String s = "짝";
        s = "홀";

        s = 10 % 2 == 0 ? "짝" : "홀";
        //     식         true    false
    }
}
