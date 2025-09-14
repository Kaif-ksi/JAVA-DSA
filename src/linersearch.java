public class linersearch {
    public static void main(String[] args) {
        int[] nums = {34,35,33,5767,7,598,77};
        int target = 74;
        int done = LinearSearch(nums, target);
        System.out.println(done);
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0) {
            return -1;
        }

        // for loop for search
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
