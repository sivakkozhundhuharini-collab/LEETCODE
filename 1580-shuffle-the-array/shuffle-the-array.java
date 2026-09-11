 class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a=0,b=n;
        int[] temp = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                temp[i]=nums[a];
                a++;
            }
            else{
                temp[i]=nums[b];
                b++;
            }
        }
        return temp;
    }
}