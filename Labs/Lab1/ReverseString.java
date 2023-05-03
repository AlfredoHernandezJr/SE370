public class ReverseString {
    public static void main(String[] args)
    {
        String string = "software engineering" ;
        System.out.println("Normal:  " + string) ;
        char[] arr = new char[string.length()] ;

        // Puts String in the array
        for(int a = 0 ; a < string.length() ; a++)
        {
            arr[a] = string.charAt(a) ;
        }

        System.out.print("Reverse: ");
        for(int a = 0 ; a < string.length() ; a++)
        {
            System.out.print(arr[string.length() - a - 1]) ;
        }
    }
}
