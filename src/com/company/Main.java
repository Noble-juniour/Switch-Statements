package com.company;

public class Main {

    public static void main(String[] args) {
      int x = 7;
        switch (x){
            case 1 : case 5: case 7:
                System.out.println("Red");
                break;
            case 2 :
                System.out.println("Blue");
                break;
            case 3 :
                System.out.println("Green");
                break;
            default:
                System.out.println("None");
      }
    }
}
