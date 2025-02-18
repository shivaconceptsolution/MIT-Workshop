public class RepeatedElementArr {
    public static void main(String[] args) {

                int arr[] = {1,2,3,3,3,3,3,4,5,6,5,5,5,5,5,5,5};
                for (int i = 0; i < arr.length; i++) {
                    boolean flag = false,flag1=true;
                    for(int k=0;k<i;k++)
                    {
                        if(arr[i]==arr[k])
                        {
                            flag1=false;
                            break;
                        }
                    }
                    for (int j = i + 1; j < arr.length && flag1 ; j++) {
                        if (arr[i] == arr[j]) {
                           flag = true;
                        }
                    }
                    if (flag) {
                        System.out.println(arr[i]);
                    }
                }


        }


}
