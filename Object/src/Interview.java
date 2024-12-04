public class Interview {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 5, 5, 6, 6};

        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(index);
    }
}
