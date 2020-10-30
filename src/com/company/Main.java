package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] A = {{1,1,0},{1,0,1},{0,0,0}};
        pprint(A);

        System.out.println("========");
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <A[i].length/2 ; j++) {
                int temp=A[i][j];
                System.out.println("i:"+i+" j:"+j+ " A:"+A[i][j]);
                A[i][j]=A[i][A[i].length-1-j];
                A[i][A[i].length-1-j]=temp;
                System.out.println("i:"+i+" j:"+j+ " A:"+A[i][j]);

            }
        }
        pprint(A);
        System.out.println("========");

        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j < A[i].length ; j++) {
                A[i][j] = 1 - A[i][j];
            }
        }
        pprint(A);

    }

    private static void pprint(int[][] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j] + " ,");
            }
            System.out.println();
        }
    }
}
