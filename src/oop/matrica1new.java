package oop;

public class matrica1new {
public static void main(String[] args) {
        int n = 7; // длина массива
        int[][] matrix = new int[n][n];
        int[] temp = new int[n]; //промежуточный массив для сортировки

        //рандоманый ввод в матрицу
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        matrix[i][j] = (int) ((Math.random() * (100 - 20)) + 20);
        }
        }

        //вывод на экран матрицы
        System.out.println("Исходная матрица");
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + "  ");
        }
        System.out.println();
        }

        //копируем последнюю строку в матрице в промежуточный массив

        for (int i = 0; i < n; i++) {
        temp[i] = matrix[n-1][i];
        }
        //сортируем промежуточный массив
        temp = bubbleSort(temp);

        //хаменяем отсортированную часть то есть промежуточный массив в
        // последнюю строку матрицы
        System.out.println("Ваш результат");
        for (int i = 0; i < n; i++) {
        matrix[n-1][i] = temp[i];
        }

        //вывод на экран результата
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + "  ");
        }
        System.out.println();
        }



        }

//сортировка пузырьком
private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
        boolean sorted = true;
        for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
        int buf = array[j];
        array[j] = array[j + 1];
        array[j + 1] = buf;
        sorted = false;
        }
        }
        if (sorted) {
        break;
        }
        }
        return array;
        }
        }
