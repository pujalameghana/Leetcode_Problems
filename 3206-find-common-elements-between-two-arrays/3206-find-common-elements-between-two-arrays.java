class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1=0,count2=0;
        ArrayList arr1=new ArrayList<>();
        ArrayList arr2=new ArrayList<>();
        for(int i:nums1){
            arr1.add(i);
        }
        for(int j:nums2){
            arr2.add(j);
        }
        for(int i:nums1){
            if(arr2.contains(i)) count1++;
        }
         for(int i:nums2){
            if(arr1.contains(i)) count2++;
        }
        return new int[]{count1,count2};

    }
}