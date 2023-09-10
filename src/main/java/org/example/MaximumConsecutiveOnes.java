package org.example;

public class MaximumConsecutiveOnes {
    public static int maximumConsecutiveOnes(int []nums,int k){
        int ans=0;
        int j=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                j++;
                if(nums[j]==0){
                    count--;
                }
            }
            int len=i-j;
            ans=Math.max(len,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(maximumConsecutiveOnes(arr,k));
    }
}