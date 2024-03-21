package com.green.day6.ch3;
//p.131
public class OperatorEx32 {
    public static void main(String[] args){
        int x, y, z;
        int absX, absY, absZ;
        char sighX, sighY, sighZ;

        x = 10;
        y = -5;
        z = 0;

        //absX = 식 ? true였을때 : false였을때
        absX = x < 0 ? -x : x;
        absY = y < 0 ? -y : y;
        absZ = z < 0 ? -z : z;

        sighX = (x == 0) ? ' '
                         : (x < 0) ? '-' : '+';
        sighY = (y == 0) ? ' '
                         : (y < 0) ? '-' : '+';
        sighZ = (z == 0) ? ' '
                         : (z < 0) ? '-' : '+';

        System.out.printf("x= %c%d\n", sighX, absX);
        System.out.printf("y= %c%d\n", sighY, absY);
        System.out.printf("z= %c%d\n", sighZ, absZ);


    }
}
