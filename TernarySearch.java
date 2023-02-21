public class TernarySearch
{
    public int TernarySearch(int[] arr, int key, int right, int left)
    {
        if(right>=left)
        {
            int mid1 = left + ((right-left)/3);
            int mid2 = right - ((right-left)/3);

            if(arr[mid1]==key) return mid1;
            if(arr[mid2]==key) return mid2;

            if(key<arr[mid1]) return TernarySearch(arr,key,mid1-1,left);
            else if(key>arr[mid2]) return TernarySearch(arr,key,right,mid2+1);
            else return TernarySearch(arr,key,mid2-1,mid1+1);
        }
        return -1;

    }
}
