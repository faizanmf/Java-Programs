package NumberProgram;

public class RotateArrayDigits {
    public static void main(String[] args) {

        int[] n = {1,2,3,4,5,6};
        int k=2;

        for(int i=0;i<k;i++)
        {
          int first = n[0];
          for(int j=0;j<n.length-1;j++)
          {
              n[j] = n[j+1];
          }
          n[n.length-1] = first;

        }

        for(int num : n)
        {
            System.out.print(num+" ");
        }
    }
}
