package lab1;
import java.util.Scanner;
/*
Name : Samuel Williams
StudentId : 21001277
Computer Science and Software Engineering.
 */
public class MatrixOperation {
    public static void main(String[] args) {
        //Prompting user to select operation
        System.out.println("Matrix Calculator");
        System.out.println("Select Operation");
        System.out.println("Press '+' for Addition");
        System.out.println("Press '*' for Multiplication");

        Scanner scan = new Scanner(System.in);
        char opr = scan.nextLine().charAt(0);

        switch (opr) {
            case '+':
                System.out.println("~~~~Matrix Addition~~~~");
                System.out.println("Matrix A and Matrix B must be of same Dimensions.");
                System.out.println("Enter dimension for Matrix A:");
                int rowA, columnA;
                System.out.println("Enter Number of Rows");
                rowA = scan.nextInt();
                System.out.println("Enter Number of Columns");
                columnA = scan.nextInt();
                int[][] matrixA = new int[rowA][columnA];
                System.out.println("Enter dimension for Matrix B :");
                int rowB, columnB;
                System.out.println("Enter Number of Rows");
                rowB = scan.nextInt();
                System.out.println("Enter Number of Columns");
                columnB = scan.nextInt();
                int[][] matrixB = new int[rowB][columnB];

                try {
                    if (rowA == rowB && columnA == columnB) {
                        for (int i = 0; i < matrixA.length; i++) {
                            for (int j = 0; j < matrixA[i].length; j++) {
                                System.out.printf("Enter Matrix A element of position[%s][%s] %n ", i, j);
                                matrixA[i][j] = scan.nextInt();
                            }
                        }
                        for (int i = 0; i < matrixB.length; i++) {
                            for (int j = 0; j < matrixB[i].length; j++) {
                                System.out.printf("Enter Matrix B element of position[%s][%s] %n ", i, j);
                                matrixB[i][j] = scan.nextInt();
                            }
                        }
                        // Since the rows and columns are the same , I can use either rowA or columnB etc. for the size of Matrix C.
                        int[][] matrixC = new int[rowA][columnB];

                        for (int i = 0; i < matrixC.length; i++) {
                            for (int j = 0; j < matrixC[i].length; j++) {
                                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                            }
                        }

                        for (int i = 0; i < matrixC.length; i++) {
                            for (int j = 0; j < matrixC[i].length; j++) {
                                System.out.print(matrixC[i][j] + " ");
                            }

                            System.out.println();

                        }
                    } else {
                        throw new RuntimeException();

                    }
                } catch (RuntimeException e) {
                    System.out.println("Matrix A and B do not have same dimensions for Addition Operation");
                }
                break;
            case '*':
                System.out.println("~~~~Matrix Multiplication~~~~");
                System.out.println("Make sure when inputting values, the number of columns in Matrix A1 must be the same as the number of rows in Matrix B2");
                System.out.println("Enter dimension for Matrix A1:");
                int rowA1, columnA1;
                System.out.println("Enter Number of Rows");
                rowA1 = scan.nextInt();
                System.out.println("Enter Number of Columns");
                columnA1 = scan.nextInt();
                int[][] matrixA1 = new int[rowA1][columnA1];
                System.out.println("Enter dimension for Matrix B2 :");
                int rowB2, columnB2;
                System.out.println("Enter Number of Rows");
                rowB2 = scan.nextInt();
                System.out.println("Enter Number of Columns");
                columnB2 = scan.nextInt();
                int[][] matrixB2 = new int[rowB2][columnB2];

                try {
                    if (columnA1 == rowB2) {
                        for (int i = 0; i < matrixA1.length; i++) {
                            for (int j = 0; j < matrixA1[i].length; j++) {
                                System.out.printf("Enter Matrix A1 element of position[%s][%s] %n ", i, j);
                                matrixA1[i][j] = scan.nextInt();
                            }
                        }
                        for (int i = 0; i < matrixB2.length; i++) {
                            for (int j = 0; j < matrixB2[i].length; j++) {
                                System.out.printf("Enter Matrix B2 element of position[%s][%s] %n ", i, j);
                                matrixB2[i][j] = scan.nextInt();
                            }
                        }

                        int[][] matrixC2 = new int[rowA1][columnB2];

                        for (int i = 0; i < matrixC2.length; i++) {
                            for (int j = 0; j < matrixC2[i].length; j++) {
                                int sum = 0;
                                for (int k = 0; k < columnA1; k++) {
                                    sum += matrixA1[i][k] * matrixB2[k][j];
                                }

                                matrixC2[i][j] = sum;

                            }
                        }

                        for (int i = 0; i < matrixC2.length; i++) {
                            for (int j = 0; j < matrixC2[i].length; j++) {
                                System.out.print(matrixC2[i][j] + " ");
                            }

                            System.out.println();

                        }

                    }
                } catch (RuntimeException e) {
                    System.out.println("Matrix A1 column and Matrix B2 rows are not the same numbers.");
                }

        }
    }
}