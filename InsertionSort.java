public class InsertionSort

{
    public int[] insertionSort(int array[])
    {
        for (int j = 1; j < array.length; j++)
        {
            int last = array[j];
            int i = j - 1;
            while (i > -1 && array[i] > last)
            {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = last;
        }
        return array;
    }

    static int[] insertionSortRecursive(int array[], int n)
    {
        if (n <= 1)
            return array;

        insertionSortRecursive( array, n-1 );

        int last = array[n-1];
        int j = n-2;

        while (j >= 0 && array[j] > last)
        {
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = last;
        return array;
    }
}
