public class MaxMin {
    static class Compare{
        int min;
        int max;

    }
    static Compare getMinMax( int arr[], int n) {
        Compare minmax = new Compare();
        int i;
        if (n==1){
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;

        }
        if (arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else{
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (i =2 ; i < n; i++){
            if (arr[i] > minmax.max){
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int arr_size = 6;
        Compare minmax = getMinMax(arr , arr_size);
        System.out.printf("\nMaximum element is %d" , minmax.max);
        System.out.printf("\nMinimum element is %d" , minmax.min);

    }
}
