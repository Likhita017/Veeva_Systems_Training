import java.util.*;
public class Problem2
{
static class employe
{
    String name;
    String job;
    int salary;
    String date;
    employe(String na,String j,int s,String d)
    {
        name=na;
        job=j;
        salary=s;
        date=d;
    }
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of employees");
    int n=sc.nextInt();
    ArrayList<employe> e=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter name,job,salary,date");
        e.add(new employe(sc.next(),sc.next(),sc.nextInt(),sc.next()));
    }
    int s;
    while(true)
    {
        System.out.println("1.Salary ascending order\n2.Salary descending order\n3.Date of joining ascending order\n4.Date of joining descending order\n5.Exit");
        s=sc.nextInt();
        if(s==5)
        break;
        if(s==1)
        {
            e.sort((a, b) -> a.salary - b.salary);
        }
        else if(s==2)
        {
            e.sort((a, b) -> b.salary - a.salary);
        }
        else if(s==3)
        {
            e.sort((a, b) -> a.date.compareTo(b.date)); 
        }
        else if(s==4)
        {
            e.sort((a, b) -> b.date.compareTo(a.date));
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(e.get(i).name+"  "+e.get(i).job+"  "+e.get(i).salary+"  "+e.get(i).date);
        }
    }
}
}