import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Team11SortCompetition
{
    public int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = arr[left - 1];
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }
    public void  quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr , left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot +1, right);
        }
    }
    public int challengeOne(int[] arr)
    {
        if(arr.length % 2 != 0)
        {
            return arr[arr.length / 2];
        }
    }
}
