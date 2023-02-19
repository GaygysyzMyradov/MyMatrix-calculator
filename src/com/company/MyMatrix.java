package com.company;

import Jama.Matrix;

public class MyMatrix {
    private int row;
    private int column;
    private double[][] array;

    MyMatrix(int row, int column, double[][] array){
        setRow(row);
        setColumn(column);
        setArray(array);
        setElements(this.row, this.column, this.array);
    }

    private void setElements(int row, int column, double[][] array){
        System.out.println("Input the Elements of Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = Main.input.nextInt();
            }
        }
        System.out.println();
    }

    static void matrixAddition(MyMatrix matrix1, MyMatrix matrix2){
        if (matrix1.row == matrix2.row && matrix1.column == matrix2.column) {

            System.out.println();

            for (int i = 0; i < matrix1.row; i++) {
                for (int j = 0; j < matrix2.column; j++) {
                    System.out.print(matrix1.array[i][j] + matrix2.array[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("\nAddition Operation Can Not Be Performed");
    }

    static void matrixSubtraction(MyMatrix matrix1, MyMatrix matrix2){
        if (matrix1.row == matrix2.row && matrix1.column == matrix2.column) {

            System.out.println();

            for (int i = 0; i < matrix1.row; i++) {
                for (int j = 0; j < matrix2.column; j++) {
                    System.out.print(matrix1.array[i][j] - matrix2.array[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("\nSubtraction Operation Can Not Be Performed");
    }

    static void matrixMultiplication(MyMatrix matrix1, MyMatrix matrix2){
        if (matrix1.column == matrix2.row){

            System.out.println();

            int[][] temp = new int[matrix1.row][matrix2.column];

            for(int i = 0; i < matrix1.row; i++){
                for(int j=0; j < matrix2.column; j++){
                    temp[i][j]=0;
                    for(int k = 0; k < matrix1.column; k++) {
                        temp[i][j] += matrix1.array[i][k] * matrix2.array[k][j];
                    }
                    System.out.print(temp[i][j] + " ");
                }
                System.out.println();
            }
        } else
            System.out.println("\nMultiplication Operation Can Not Be Performed");
    }

    //For this operation I will be using JAMA library. For your reminder,
    //JAMA library is used only for Division operation.
    static void matrixDivision(MyMatrix matrix1, MyMatrix matrix2){
        if (matrix1.row == matrix2.row && matrix1.column == matrix2.column){

            //Matrix is a Class of JAMA Library
            Matrix matrixA = new Matrix(matrix1.array);
            Matrix matrixB = new Matrix(matrix2.array);

            //det method of Matrix class to determine the Determinant
            int determinant = (int) (Math.abs(Math.round(matrixB.det())));
            if (determinant == 0)
                System.out.println("\nDivision Operation Can Not Be Performed as Matrix 2 Does Not Have an Inverse");
            else{
                //inverse method of Matrix class to get the inverse of a matrix.
                matrixB = matrixB.inverse();
                //times method of Matrix class to multiply two Matrices.
                matrixA = matrixA.times(matrixB);
                //print method of Matrix class
                matrixA.print(matrix1.column, 1);
            }
        } else
            System.out.println("\nDivision Operation Can Not Be Performed");
    }

    private void setRow(int row){
        this.row = row;
    }

    private void setColumn(int column){
        this.column = column;
    }

    private void setArray(double[][] array){
        this.array = array;
    }

    void getElements(int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public String getDimension(){
        return "The Dimension: " + row + " x " + column;
    }

}
