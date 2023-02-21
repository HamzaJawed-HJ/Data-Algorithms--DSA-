public class JumpSearch
{
    public int jumpSearch(int[] arr, int key)
    {
        double floor = Math.floor(Math.sqrt(arr.length));
        int step = (int) floor;
        int prev = 0;

        while (arr[Math.min(step, arr.length)-1] < key)
        {
            prev = step;
            step = step + (int) floor;
            if (prev >= arr.length)
                return -1;
        }
        while (arr[prev] < key)
        {
            prev++;
            if (prev == Math.min(step, arr.length))
                return -1;
        }

        if (arr[prev] == key)
            return prev;

        return -1;
    }

}
