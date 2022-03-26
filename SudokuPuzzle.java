package HW2;
import java.util.*;

public class SudokuPuzzle extends Thread implements Runnable {

    /*
    Cases:

    1. Check if each row of the board stores only unique values from the range of 1 - 9
    2. Check if each column of the board array stores unique values from the range 1 - 9
    3. Check if all possible 3 x 3 submatrices of the board stores unique values from the range 1 - 9 or not.
     */

    private int[][] arr;

    public SudokuPuzzle(int[][] arr) { //Default contructor

        this.arr = new int[9][9];
    }

    public static boolean isRowValid(int[][] arr) { //Checks for duplicates in each row
        for (int row = 0; row < arr.length; row++) {
            HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < 0 || arr[row][col] > 9) { //Check for unbounded ranges
                    return false;
                }
                if (map.contains(arr[row][col])) {
                    return false;
                }
                map.add(arr[row][col]);
            }

//                map.add(arr[row][col]);
//                if (arr[row][col] < 0 && arr[row][col] > 9) {
////                    if (!map.add(arr[row][row])) {
////                        return false;
////                    }
        }
        return true;
    }

    public static boolean isColValid(int[][] arr) {

        int row = 0;
        for (int col = 0; col < arr[0].length; col++) {
            HashSet<Integer> map2 = new HashSet<>(); //Hashset to store the ints and check after for duplicates
            for (row = 0; row < arr.length; row++) {
                if (arr[row][col] < 0 || arr[row][col] > 9) { //Check for unbounded ranges
                    return false;
                }
                if (map2.contains(arr[row][col])) {
                    return false;
                }
                map2.add(arr[row][col]);
            }

        }
        return true;
    }


//        for (int col = 0; col < arr[col].length; col++) {
//            HashSet<Integer> map = new HashSet<>();
//            for (int row = 0; row < arr.length; row++) {
//            if (arr[row][col] < 0 || arr[row][col] > 9) {
//                    return false;
//                }
//                if(map.contains(arr[row][col])) {
//                    return false;
//                }
//                map.add(arr[row][col]);
//            }
//        }
//        return true;


//                map.add(arr[row][col]);
//                if (arr[row][col] < 0 && arr[row][col] > 9) {
////                    if (!map.add(arr[row][row])) {
////                        return false;
////                    }

    public static boolean firstCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean secondCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 3; row < 6; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean thirdCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 6; row < 9; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
//                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean fourthCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 0; row < 3; row++) {
            for (int col = 3; col < 6; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
//                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean fifthCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 3; row < 6; row++) {
            for (int col = 3; col < 6; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
//                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean sixthCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 0; row < 3; row++) {
            for (int col = 3; col < 6; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
//                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean seventhCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 0; row < 3; row++) {
            for (int col = 6; col < 9; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
//                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean eighthCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 3; row < 6; row++) {
            for (int col = 6; col < 9; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
//                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

    public static boolean ninthCheck3x3(int[][] arr) {
        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
        for (int row = 6; row < 9; row++) {
            for (int col = 6; col < 9; col++) {
                System.out.print(arr[row][col] + " ");
                if (map.contains(arr[row][col])) {
//                    System.out.println(map);
                    return false;
                }
                map.add(arr[row][col]);
            }

        }
        return true;
    }

//    public static boolean thirdCheck3x3(int[][] arr) {
//        HashSet<Integer> map = new HashSet<>(); //Hashset to store the ints and check after for duplicates
//        for (int row = 6; row < 9; row++) {
//            for (int col = 6; col < 9; col++) {
//                System.out.println(arr[row][col]);
////                if (map.contains(arr[row][col])) {
//////                    System.out.println(map);
////                    return false;
//            }
//            map.add(arr[row][col]);
//        }
//
//    }
//        return true;
//}



    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("isRowValid")) {
            System.out.println("Valid Row " + isRowValid(arr));
        }
         else if (threadName.equals("isColValid")) {
            System.out.println("Valid Col " + isColValid(arr));
        }

        else if (threadName.equals("first3x3Grid")) {
            System.out.println("First Sub Grid is valid " + firstCheck3x3(arr));
        }

        else if (threadName.equals("second3x3Grid")) {
            System.out.println("Second Sub Grid is valid " + secondCheck3x3(arr));
        }

        else if (threadName.equals("third3x3Grid")) {
            System.out.println("Third Sub Grid is valid " + thirdCheck3x3(arr));
        }

        else if (threadName.equals("fourth3x3Grid")) {
            System.out.println("Fourth Sub Grid is valid " + fourthCheck3x3(arr));
        }

        else if (threadName.equals("fifth3x3Grid")) {
            System.out.println("Fifth Sub Grid is valid " + fifthCheck3x3(arr));
        }

        else if (threadName.equals("sixth3x3Grid")) {
            System.out.println("Sixth Sub Grid is valid " + sixthCheck3x3(arr));
        }

        else if (threadName.equals("seventh3x3Grid")) {
            System.out.println("Seventh Sub Grid is valid " + seventhCheck3x3(arr));
        }

        else if (threadName.equals("eighth3x3Grid")) {
            System.out.println("Eighth Sub Grid is valid " + eighthCheck3x3(arr));
        }

        else if (threadName.equals("ninth3x3Grid")) {
            System.out.println("Ninth Sub Grid is valid " + ninthCheck3x3(arr));
        }
    }

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 6, 7, 8, 9, 4, 5},
                {5, 8, 4, 2, 3, 9, 7, 6, 1},
                {9, 6, 7, 1, 4, 5, 3, 2, 8},
                {3, 7, 2, 4, 6, 1, 5, 8, 9},
                {6, 9, 1, 5, 8, 3, 2, 7, 4},
                {4, 5, 8, 7, 9, 2, 6, 1, 3},
                {8, 3, 6, 9, 2, 4, 1, 5, 7},
                {2, 1, 9, 8, 5, 7, 4, 3, 6},
                {7, 4, 5, 3, 1, 6, 8, 9, 2},
        };

        SudokuPuzzle sudokuPuzzleObj = new SudokuPuzzle(array);

        Thread rowValidThread = new Thread(sudokuPuzzleObj, "isRowValid");
        Thread colValidThread = new Thread(sudokuPuzzleObj, "isColValid");
        Thread firstCheck3x3Grid = new Thread(sudokuPuzzleObj, "first3x3Grid");
        Thread secondCheck3x3Grid = new Thread(sudokuPuzzleObj, "second3x3Grid");
        Thread thirdCheck3x3Grid = new Thread(sudokuPuzzleObj, "third3x3Grid");
        Thread fourthCheck3x3Grid = new Thread(sudokuPuzzleObj, "fourth3x3Grid");
        Thread fifthCheck3x3Grid = new Thread(sudokuPuzzleObj, "fifth3x3Grid");
        Thread sixthCheck3x3Grid = new Thread(sudokuPuzzleObj, "sixth3x3Grid");
        Thread seventhCheck3x3Grid = new Thread(sudokuPuzzleObj, "seventh3x3Grid");
        Thread eighthCheck3x3Grid = new Thread(sudokuPuzzleObj, "eighth3x3Grid");
        Thread ninthCheck3x3Grid = new Thread(sudokuPuzzleObj, "ninth3x3Grid");

        //--------------------------------------------------------------------------------------
        rowValidThread.start();
        colValidThread.start();
        firstCheck3x3Grid.start();
        secondCheck3x3Grid.start();
        thirdCheck3x3Grid.start();
        fourthCheck3x3Grid.start();
        fifthCheck3x3Grid.start();
        sixthCheck3x3Grid.start();
        seventhCheck3x3Grid.start();
        eighthCheck3x3Grid.start();
        ninthCheck3x3Grid.start();
//        System.out.println("\n");



        // ----------------------------------------------------//
        // To check if the sudoku puzzle is valid, please uncomment the thread start methods and run the lines below! Thank you

        System.out.println(isRowValid(array));
        System.out.println(isColValid(array));

        System.out.println(firstCheck3x3(array));
        System.out.println(secondCheck3x3(array));
        System.out.println(thirdCheck3x3(array));
        System.out.println(fourthCheck3x3(array));
        System.out.println(fifthCheck3x3(array));
        System.out.println(sixthCheck3x3(array));
        System.out.println(seventhCheck3x3(array));
        System.out.println(eighthCheck3x3(array));
        System.out.println(ninthCheck3x3(array));
    }
}