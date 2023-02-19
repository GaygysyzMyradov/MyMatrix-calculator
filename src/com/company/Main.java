package com.company;

import java.util.Scanner;

public class Main{
    public static Scanner input = new Scanner(System.in);

    public static void main (String[]args){

        int[] dimension = new int[2];
        double[][] array;

        getArrayDimension(dimension, 1);
        array = new double[dimension[0]][dimension[1]];
        MyMatrix matrix1 = new MyMatrix(dimension[0], dimension[1], array);

        getArrayDimension(dimension, 2);
        array = new double[dimension[0]][dimension[1]];
        MyMatrix matrix2 = new MyMatrix(dimension[0], dimension[1], array);

        System.out.println("Which Operation Would You Like to Perform? ");
        System.out.println("Input 1 for Addition.");
        System.out.println("Input 2 for Subtraction.");
        System.out.println("Input 3 for Multiplication.");
        System.out.println("Input 4 for Division.\n");
        System.out.print("Operation: ");

        int operation = input.nextInt();
        while (operation <= 0 || operation>4){
            System.out.print("Please Input Valid Operation Number: ");
            operation = input.nextInt();
        }

        if (operation == 1){
            MyMatrix.matrixAddition(matrix1, matrix2);
        }
        else if (operation == 2){
            MyMatrix.matrixSubtraction(matrix1, matrix2);
        }
        else if (operation == 3){
            MyMatrix.matrixMultiplication(matrix1, matrix2);
        }
        else{
            MyMatrix.matrixDivision(matrix1, matrix2);
        }
    }

    static void getArrayDimension(int[] dimension, int numb){
        System.out.print("Insert the Dimension of Matrix " + numb + ": ");
        dimension[0] = input.nextInt();
        dimension[1] = input.nextInt();
    }
}
