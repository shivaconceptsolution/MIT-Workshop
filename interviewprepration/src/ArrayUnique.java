public class ArrayUnique {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,3,4,5,6,5};
        for(int i=0; i<arr.length; i++)
        {
            boolean flag= true;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j)
                {
                   flag=false;
                   break;
                }
            }
            if(flag)
            {
                System.out.println(arr[i]);
            }

        }
    }
}
