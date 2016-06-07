package com.company;

public class Main {

    public static boolean estIsocele(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean estEquilateral(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean estCommun(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return true;
        } else {
            return false;
        }

    }



    public static void main(String[] args) {
	// write your code here
        System.out.println("le triangle 2 2 3 est isocèle ?" + estIsocele(2,2,3));
        System.out.println("le triangle 2 2 3 est equilateral ?" + estEquilateral(2,2,3));
        System.out.println("le triangle 2 2 3 est commun ?" + estCommun(2,2,3));
    }
}
