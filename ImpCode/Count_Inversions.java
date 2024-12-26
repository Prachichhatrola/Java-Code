class Solution {
    static int inversionCount(int arr[]) {
        int n=arr.length;
        int count=0;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
           {
                if(arr[i]>arr[j]&&i<j)
                {
                    count++;
                    continue;
                }
            }
        }
        return count;
    }
}
