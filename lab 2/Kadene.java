
public class Kadene {
    public static void main(String[] args)
    {
        
        int arr[]={-2,1,-3,4,1,-1,2,-5,4};
        int max=Integer.MIN_VALUE;
        int i,sum=0,start=0,end=0;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum>max)
            {
                max=sum;
                end=i;
            }
            if(sum<0)
            {
                sum=0;
                start=i+1;
            }
        }
        //printing array
        for(i=start;i<=end;i++)
            System.out.print(arr[i] + "   ");


    }
}
