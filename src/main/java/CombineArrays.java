import org.eclipse.jetty.util.ArrayUtil;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int[] combinedArrays = new int[arr1Len + arr2Len];

        System.arraycopy(arr1, 0, combinedArrays, 0, arr1Len);
        System.arraycopy(arr2, 0, combinedArrays, arr1Len, arr2Len);
        return combinedArrays;
    }
}
