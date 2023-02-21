public class SelectionSort

{
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    static int minIndex(int a[], int i, int j)
    {
        if (i == j) return i;
        int k = minIndex(a, i + 1, j);
        return (a[i] < a[k])? i : k;
    }

    static int[] recurSelectionSort(int a[], int n, int index)
    {

        if (index == n)
            return a;
        int k = minIndex(a, index, n-1);

        if (k != index)
        {
            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }

        recurSelectionSort(a, n, index + 1);
        return a;
    }
}

