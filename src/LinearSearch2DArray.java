import java.util.Arrays;
public class LinearSearch2DArray {
    public static void main(String[] args){
        int[][] arr = {
                {54,32,44,322,54},
                {3,5,2,6},
                {100,211,55},
                {53,63},
        };
        int target = 6;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}