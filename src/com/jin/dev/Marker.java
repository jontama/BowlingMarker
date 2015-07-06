package com.jin.dev;

/**
 * Created by jin on 2015. 7. 6..
 */
public class Marker {
    private static final int MAX_PIN = 10;
    private int loundPorint=0;

    Marker(){
        loundPorint=0;
    }

    public void ballthrow(int pinNum){
        //핀체크
        if(pinNum > MAX_PIN){

        }


    }


    public static void main(String[] args) {
        System.out.println("=====================================================================================");
        System.out.println("|   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |     10    |");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("=====================================================================================");
    }
}
