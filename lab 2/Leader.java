
public class Leader {
    
    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        int leader=Integer.MIN_VALUE,i,max;
        for(i=arr.length-2;i>=0;i--)
        {
            max=arr[i];
            if(max>leader)
            {
                leader=max;
                System.out.println(leader + "   ");
            }
        }
        if(leader==Integer.MIN_VALUE)
            System.out.println("No Leader element");
    }
}
