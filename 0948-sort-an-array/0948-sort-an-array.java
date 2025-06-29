class Solution {

    public static void merge(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            
            merge(arr, left, mid);
            merge(arr, mid+1, right);
            
            mergesort(arr, left, mid, right);
        }
    }
    
    public static void mergesort(int[] arr, int left, int mid, int right)
    {
        int n1 = mid - left+1;
        int n2 = right - mid;
        
        int[] Left = new int[n1];
        int[] Right = new int[n2];
        
        for(int i=0;i<n1;i++)
            Left[i] = arr[left+i];
        for(int i=0;i<n2;i++)
            Right[i] = arr[mid + 1 + i];
        
        int i = 0, j = 0, k = left;
        
        while(i<n1 && j<n2)
        {
            if(Left[i] < Right[j])
                arr[k++] = Left[i++];
            else 
                arr[k++] = Right[j++];
        }
        
        while(i<n1)
            arr[k++] = Left[i++];
        
        while(j<n2)
            arr[k++] = Right[j++];
        
    }

    public int[] sortArray(int[] nums) 
    {
        merge(nums, 0, nums.length-1);

        return nums; 
    }
}