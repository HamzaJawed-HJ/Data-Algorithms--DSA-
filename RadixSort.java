public class RadixSort
{
    public static int getMax(int[] arr)
    {
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static void countingSort(int[] arr, int place)
    {
        int max = getMax(arr);

        for(place =1; max/place>0; place*=10) countingSort(arr,place);

        int[] output = new int[arr.length+1];
        int[] count = new int [10];

        for(int i=0; i<arr.length; i++) count[(arr[i]/place)%10]++;
        for(int i=1; i<10; i++) count[i]+=count[i-1];

        for(int i = arr.length-1; i>=0; i--)
        {
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0; i< arr.length; i++) arr[i] = output[i];
    }

}
