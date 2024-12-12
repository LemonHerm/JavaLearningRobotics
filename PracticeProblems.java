package java101;
public class PracticeProblems {
    static int count0ccurances(int[] arr, int n) {
        int occurances = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == n) {
                occurances += 1;
            }
        }
        return occurances;
    }

    static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];
        int counter = 0;
        for (int i = arr.length - 1; i > 0; i --) {
            newArray[counter] = arr[i];
            counter ++;
            }   
        return newArray;
    }

    static int sumGrid(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i ++) {
            for (int i_2 = 0; i_2 < grid[i].length; i_2 ++)
                sum += grid[i][i_2];
        }
        return sum;
    }   
}