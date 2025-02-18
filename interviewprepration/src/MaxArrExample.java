public class MaxArrExample {
    public static void main(String[] args) {
        int arr[] = {12,34,67,89,77,11,54};
        int max = 0;
        int smax=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                smax=max;
                max = arr[i];
            }
            else if(smax<arr[i]){
                smax=arr[i];
            }
        }
        System.out.println("Maximum element is "+max);
        System.out.println("Second Maximum element is "+smax);

    }
}
