/*public class ramm {
   public static void main(String[] args) 
   {
         public int [] getConcatenation(int[] nums)
        {
             int ans[]=new int[2*nums.length];
             for(int i=0;i<nums.length; i++)
             {
                    ans[i] = nums[i];
             }

            int index = nums.length;
             for (int i = 0; i < nums.length; i++)
             {
                 ans[index] =nums[i];
                 index++;
             }
       }
   }
    return ans;
}
*/

public class ramm {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = getConcatenation(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
