import java.util.*;
public class Problem1 {
   static  Scanner sc=new Scanner(System.in);
   public static void main(String args[])
   {
        HashMap<String,HashMap<String,Integer>> h=new HashMap<>();
        int s;
        while(true)
        {
            System.out.println("1.Store\n2.Queries\n3.Exit");
            s=sc.nextInt();
            if(s==1)
            Store(h);
            else if(s==2)
            {
                System.out.println("1.print all products and prices of given store ID\n2.Highest price product of given store ID\n3.print all stores which contains the product");
                int n=sc.nextInt();
                if(n==1)
                Query1(h);
                else if(n==2)
                Query2(h);
                else
                Query3(h);
            }
            else
            break;
        }
   }
   static void Store(HashMap<String,HashMap<String,Integer>> h)
   {
        System.out.println("Enter the Store ID");
        String s=sc.next();
        System.out.println("Enter the no. of products");
        int n=sc.nextInt();
        HashMap<String,Integer> h1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Product name and price");
            h1.put(sc.next(),sc.nextInt());
        }
        h.put(s,h1);
   } 
   static void Query1(HashMap<String,HashMap<String,Integer>> h)
   {
       
        System.out.println("Enter the Store ID");
        String s=sc.next();
        if(!h.containsKey(s))
        {
            System.out.println("Store not found");
            return;
        }
        HashMap<String,Integer> h1=h.get(s);
        System.out.println(h1);
   }
   static void Query2(HashMap<String,HashMap<String,Integer>> h)
   {
        System.out.println("Enter the Store ID");
        String s=sc.next();
         if(!h.containsKey(s))
        {
            System.out.println("Store not found");
            return;
        }
        HashMap<String,Integer> h1=h.get(s);
        int max=0;
        String r="";
        for(String s1:h1.keySet())
        {
            if(max<h1.get(s1))
            {
                max=h1.get(s1);
                r=s1;
            }
        }
        System.out.println(r+" has the highest price of "+max);
   }
   static void Query3(HashMap<String,HashMap<String,Integer>> h)
   {
        System.out.println("Enter the product name");
        String p=sc.next();
        for(String s:h.keySet())
        {
            HashMap<String,Integer> h1=h.get(s);
            if(h1.containsKey(p))
            System.out.println(s);
        }
   }
}
