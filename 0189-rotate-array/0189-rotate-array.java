import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums,0,n-k-1);
        rev(nums,n-k,n-1);
        rev(nums,0,n-1);
        }
        void rev(int[]A,int st,int end){
            while(st<end){
                int temp=A[st];
                A[st]=A[end];
                A[end]=temp;
                st++;
                end--;

            }
        }
    }
