
public class Palindrome
{
    public static void main(String[] args){
       
        String str = args[0],s_str;
        int i=0,j=str.length()-1;
        int ans;
        s_str= str.toLowerCase();
        ans = S_Palindrome(s_str,i,j);
        if(ans==1)
            System.out.println(str +" is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

    public static int S_Palindrome(String str,int i,int j)
    {
        if(i>j)
            return 1;
        char x = str.charAt(i);
        char y= str.charAt(j);
        if(x==y)
            return S_Palindrome(str,i+1,j-1);
        else if(isSpecial(x))
            return S_Palindrome(str,i+1,j);
        else if(isSpecial(y))
            return S_Palindrome(str,i,j-1);
        return 0;
    }

    static boolean isSpecial(char ch)
    {
        if(ch>='0' || ch<='9')
            return true;
        else if((ch<'a' && ch>'z')||(ch<'A' && ch>'Z'))
            return true;
        return false;
    }
}