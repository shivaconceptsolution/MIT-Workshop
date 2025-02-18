public class StringExample {
    public static void main(String[] args) {
        String str = "welcome in java programming language java is oops based language";
        String arr[]= str.split(" ");

        for(int i=0; i<arr.length; i++)
        {
            String s = arr[i];
            char max=' ';
            for(int j=0;j<s.length();j++)
            {
                if(max<s.charAt(j))
                {
                    max=s.charAt(j);
                }
            }
            System.out.println(arr[i] + " max is " + max);
        }

    }
}
