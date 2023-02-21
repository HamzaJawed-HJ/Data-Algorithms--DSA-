public class LinearSearch
{
    public int linearSearch(int[] array, int key)
    {
        for(int i=0; i<array.length; i++)
        {
            if(key==array[i]) {
                System.out.println("Found at Index: " + i);
                return i;
            }
        }
        return -1;
    }

    static int recSearch(int array[], int l, int r, int key)
    {
        if (r < l)
            return -1;
        if (array[l] == key)
            return l;
        if (array[r] == key)
            return r;
        return recSearch(array, l+1, r-1, key);
    }
}
