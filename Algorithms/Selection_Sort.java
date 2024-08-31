class Solution
{
    int  select(int arr[], int i)
    {
        int min=i;
        // code here such that selectionSort() sorts arr[]
        for(int j=i;j<arr.length;j++){
            if(arr[j]<arr[min])min=j;
        }
        return min;
    }
    
    void selectionSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<=n-2;i++){
            int min=select(arr,i);
            int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
            
    }
}
