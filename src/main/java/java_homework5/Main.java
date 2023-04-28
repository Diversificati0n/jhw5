//ЦП | Разработчик. Программист | 19.11.22 | 3775
//Cтарцев Андрей

package java_homework5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class Main {
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//что 1 человек может иметь несколько телефонов.
//Пусть дан список сотрудников:
//    Иван Иванов
//    Светлана Петрова
//    Кристина Белова
//    Анна Мусина
//    Анна Крутова
//    Иван Юрин
//    Петр Лыков
//    Павел Чернов
//    Петр Чернышов
//    Мария Федорова
//    Марина Светлова
//    Мария Савина
//    Мария Рыкова
//    Марина Лугова
//    Анна Владимирова
//    Иван Мечников
//    Петр Петин
//    Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.


//    public static void main(String[] args) {
//        Map<String, List<String>> phoneBook = new HashMap<>();
//
//        phoneBook.put("Иван Иванов", Arrays.asList("+71111111111", "+72222222222"));
//        phoneBook.put("Светлана Петрова", Collections.singletonList("+73333333333"));
//        phoneBook.put("Кристина Белова", Collections.singletonList("+74444444444"));
//        phoneBook.put("Анна Мусина", Arrays.asList("+75555555555", "+76666666666", "+76666665677"));
//        phoneBook.put("Анна Крутова", Arrays.asList("+77777777777", "+78888888888"));
//        phoneBook.put("Иван Юрин", Collections.singletonList("+79999999999"));
//        phoneBook.put("Петр Лыков", Collections.singletonList("+71222222222"));
//        phoneBook.put("Павел Чернов", Collections.singletonList("+71122222222"));
//        phoneBook.put("Петр Чернышов", Arrays.asList("+71112222222", "+75748309586"));
//        phoneBook.put("Мария Федорова", Collections.singletonList("+71111222222"));
//        phoneBook.put("Марина Светлова", Collections.singletonList("+71111122222"));
//        phoneBook.put("Мария Савина", Arrays.asList("+71111112222", "+7113456462222"));
//        phoneBook.put("Мария Рыкова", Collections.singletonList("+71111111222"));
//        phoneBook.put("Марина Лугова", Arrays.asList("+71111111122", "+71145611122"));
//        phoneBook.put("Анна Владимирова", Arrays.asList("+71111111112", "+7114536112"));
//        phoneBook.put("Иван Мечников", Collections.singletonList("+7233333333"));
//        phoneBook.put("Петр Петин", Collections.singletonList("+72233333333"));
//        phoneBook.put("Иван Ежов", Collections.singletonList("+72223333333"));
//
//        Map<String, Integer> nameCount = new HashMap<>();
//        for (String name : phoneBook.keySet()) {
//            List<String> phones = phoneBook.get(name);
//            for (String phone : phones) {
//                if (nameCount.containsKey(name)) {
//                    nameCount.put(name, nameCount.get(name) + 1);
//                } else {
//                    nameCount.put(name, 1);
//                }
//            }
//        }
//
//        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCount.entrySet());
//        Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });
//
//        System.out.println("Повторяются: ");
//        for (Map.Entry<String, Integer> entry : sortedList) {
//            if (entry.getValue() > 1 || phoneBook.get(entry.getKey()).size() == 1) {
//                System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
//            }
//        }
//    }
//}
//_______________________________________________________________________________________________________________


//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.


//    private static final int boardSize = 8;
//    public static void main(String[] args) {
//        int[][] board = new int[boardSize][boardSize];
//
//        if (solveQueensProblem(board, 0)) {
//            printBoard(board);
//        } else {
//            System.out.println("Ошибка");
//        }
//    }
//
//    private static boolean solveQueensProblem(int[][] board, int col) {
//        if (col >= boardSize) {
//            return true;
//        }
//
//        for (int row = 0; row < boardSize; row++) {
//            if (isSafe(board, row, col)) {
//                board[row][col] = 1;
//                if (solveQueensProblem(board, col + 1)) {
//                    return true;
//                }
//                board[row][col] = 0;
//            }
//        }
//
//        return false;
//    }
//
//    private static boolean isSafe(int[][] board, int row, int col) {
//        for (int i = 0; i < col; i++) {
//            if (board[row][i] == 1) {
//                return false;
//            }
//        }
//
//        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//            if (board[i][j] == 1) {
//                return false;
//            }
//        }
//
//        for (int i = row, j = col; i < boardSize && j >= 0; i++, j--) {
//            if (board[i][j] == 1) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private static void printBoard(int[][] board) {
//        for (int i = 0; i < boardSize; i++) {
//            for (int j = 0; j < boardSize; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//_______________________________________________________________________________________________________________


//Реализовать алгоритм пирамидальной сортировки (HeapSort).


    public static void main(String[] args) {
        int[] arr = {5, 8, 10, 7, 1, 9, 2, 6, 4, 3};
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
//_______________________________________________________________________________________________________________

//ЦП | Разработчик. Программист | 19.11.22 | 3775
//Cтарцев Андрей