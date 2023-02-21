public class BubbleSort
{
    public int[] bubbleSort(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public int[] BubbleRec(int[] arr,int len)
    {
        if (len == 1)
            return arr;

        for (int i=0; i<len-1; i++)
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        BubbleRec(arr, len-1);
        return arr;
    }
}
