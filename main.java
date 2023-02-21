import java.util.Arrays;

public class main
{
    public static void main(String[] args)
    {
        int array[] = {6,7,3,1,2,8,4,9,5};

        JumpSearch js = new JumpSearch();
        LinearSearch ls =  new LinearSearch();
        BinarySearch bis = new BinarySearch();
        TernarySearch ts = new TernarySearch();
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();
        QuickSort qs = new QuickSort();
        MergeSort ms = new MergeSort();
        RadixSort rs = new RadixSort();

        int sorted[] = is.insertionSort(array);
        System.out.println(Arrays.toString(sorted));



    }
}
