import java.util.*;
public class codechef3 {
   
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here)
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    String a=sc.next();
		    String b=sc.next();
		    int count[]=new int[n];
		    if((count[a.charAt(i)]++)!=(count[b.charAt(i)]++))
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
}
}
