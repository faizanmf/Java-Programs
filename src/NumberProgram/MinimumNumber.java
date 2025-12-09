package NumberProgram;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int n=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<n)
            {
                n=arr[i];
            }
        }
        System.out.println(n);
    }
}
