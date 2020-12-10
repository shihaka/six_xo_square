package com.company;

public class Main {

    public static void main(String[] args) {
	for (int i = 0; i < 9; i++) {
        System.out.println();
        for (int j = 0; j < 9; j++) {
            if (i == j || i == (8 - j))
                System.out.print('x');
            else
                System.out.print('o');
        }
    }
    }
}
