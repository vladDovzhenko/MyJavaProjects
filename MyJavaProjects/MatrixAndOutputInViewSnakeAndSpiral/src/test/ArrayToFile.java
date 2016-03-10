package test;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vlad on 24.01.2016.
 */
public class ArrayToFile {
    public static void main(String[] args) 77{
        Scanner sc = new Scanner(System.in);
        Random random = new Random(System.currentTimeMillis());
        boolean winner = false;
        int[][] matrix;
        int i = 0, j = 0, number = 0;
        do {
            System.out.print("Введите размер матрицы:");
            String size = sc.next();
            try {
                number = Integer.parseInt(size);
                if (number > 1) {
                    winner = true;
                }
                if(number>10){
                    winner=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте снова.");
                winner = false;
            }
        } while (winner != true);
        matrix = new int[number][number];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(201) - 100;
            }
        }
        System.out.println("Ваша матрица:");
        printArray(matrix, number);
        AdditionalFunctionality(matrix, number, winner);
        ArraySnake(number, matrix);
        Spiral(matrix,number);

    }

    private static void AdditionalFunctionality(int[][] matrix, int number, boolean winner) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Дополнительный функционал:");
        do {
            System.out.print("Сохранить матрицу в файл 1(да) /2(нет:)");
            String str = sc.next();
            try {
                int index = Integer.parseInt(str);
                if (index == 1) {
                    saveArrayToFile(matrix, "D:\\Matrix");
                    System.out.println("Матрица сохранена в файле(D:\\Matrix)!");
                    break;
                }
                if (index == 2) {
                    winner = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте снова.");
                winner = false;
            }
        } while (winner != true);
        winner = false;
        do {
            System.out.print("Вывести матрицу из файла 1(да) /2(нет:)");
            String str = sc.next();
            try {
                int index = Integer.parseInt(str);
                if (index == 1) {
                    int[][] nArr = loadArrayFromFile(number, "D:\\Matrix"); // читаем из файла в другой массив для проверки
                    printArray(nArr, number); // выводим новый массив на экран
                    break;
                }
                if (index == 2) {
                    winner = true;
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте снова.");
                winner = false;
            }
        } while (winner != true);
        winner = false;
        do {
            System.out.print("Выходим(2) или продолжаем(1):");
            String str = sc.next();
            try {
                int index = Integer.parseInt(str);
                if (index == 1) {
                    winner = true;
                }
                if (index == 2) {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте снова.");
                winner = false;
            }
        } while (winner != true);

    }

    private static void printArray(int[][] matrix, int number) {
        String str="";
        int a = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("   " + a + ") " + matrix[i][j] + "   ");
            }
            a++;
            System.out.println();
        }
        System.out.println();

    }


    private static void saveArrayToFile(int[][] matrix, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    bw.write(String.valueOf(matrix[i][j]) + " ");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[][] loadArrayFromFile(int number, String path) {
        int[][] matrix = new int[number][number];
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            for (int i = 0; i < matrix.length; i++) {
                String[] strArr = br.readLine().trim().split(" ");
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Integer.parseInt(strArr[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }

    private static void Spiral(int [][]matrix,int number) {
        int a = 1;
        boolean winner = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Вывести матрицу по возрастанию спиралью 1(да) /2(нет:)");
            String str = sc.next();
            try {
                int index = Integer.parseInt(str);
                if (index == 1) {
                    winner = true;
                }
                if (index == 2) {
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте снова.");
                winner = false;
            }
        } while (winner != true);
        sortingAndOutPut(matrix,number);
        int i,j,n,w=number-1,l=0;
        System.out.println();
        i=0;j=0;
        int index=1;
        System.out.println("Матрица требованой нам спиралью:");
        for (n=0;n<Math.pow(number,2);++n) {
            System.out.print((index++)+")"+matrix[i][j]+"   ");
            if ((i==(l+1))&&(j==l)) {w--;l++;} //условие перехода на внутреннюю спираль
            if ((j==w)&&(i<w)) {i++;continue;} //Движение по спирали вниз
            if ((j<w)&&(i==l)) {j++;continue;} //Вправо
            if ((i==w)&&(j>l)) {j--;continue;} //Влевo
            if ((j==l)&&(i>l)) {i--;continue;} //Вверх

        }

    }

    private static void ArraySnake(int n, int[][] matrix) {
        boolean winner = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Вывести матрицу змейкой 1(да) /2(нет:)");
            String str = sc.next();
            try {
                int index = Integer.parseInt(str);
                if (index == 1) {
                    winner = true;
                }
                if (index == 2) {
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте снова.");
                winner = false;
            }
        } while (winner != true);
        sortingAndOutPut(matrix,n);
        System.out.println("Матрица змейкой: ");
        int step=0,v=0,i,j;
            for (i = n-1; i >=0; i --) {
                for (j = n-1; j >=0; j--) {
                    System.out.print(matrix[i][j] + "\t");
                }
                if(i==0){
                    return;
                }
                i--;
                for(v=0;v<n;v++){
                    System.out.print(matrix[i][v] + "\t");
                }

            }
        System.out.println();

    }
    private static void sortingAndOutPut(int [][]matrix,int n){
   int i,j;
        System.out.println("матрица::");
        for (i = 0; i < n; i++) {
            for (j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}