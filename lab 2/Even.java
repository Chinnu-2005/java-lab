
public class Even {
    public static void main(String args[])
    {
        int arr[]={-2, 1, -4, 3, -6, 5, -8, 7};
        int i,x,y,temp,even=0,odd=arr.length-1;
        while(even<odd)
        {
            x=arr[even]%2;
            y=arr[odd]%2;
            if(x==0 && y==1)
            {
                even++;
                odd--;
            }
            else if(x==1 && y==0)
            {
                temp=arr[even];
                arr[even]=arr[odd];
                arr[odd]=temp;
                even++;
                odd--;
            }
            else if(x==0 && y==0)
                even++;
            else if(x==1 && y==1)
                odd--;
        }
        //printing array
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "   ");
        }
    }    
}