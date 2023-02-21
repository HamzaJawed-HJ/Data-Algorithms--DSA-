public class BinarySearch
{
    public int BinarySearch(int arr[], int key)
    {
        int left=0; int right = arr.length-1;

        while(left<=right)
        {
            int middle = (right+left)/2;

            if(key==arr[middle])
                return middle;
            else if(key>arr[middle])
                left = middle+1;
            else if(key<arr[middle])
                right = middle-1;
        }
        return -1;
    }

    public int BinaryRecursive(int arr[], int key, int left, int right)
    {
        int mid;

        if (left > right) return -1;
        else mid = (right + left) / 2;

        if (key == arr[mid]) return mid;
        else if(key > arr[mid]) return BinaryRecursive(arr, key, mid + 1, right);
        else if(key < arr[mid]) return BinaryRecursive(arr, key, left, mid - 1);

        return -1;
    }
}
