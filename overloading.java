public class overloading{
    void sum(int a,int b)
    {
        System.out.println(a+b); 
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }
}
class caldemo
{
    public static void main(String args[])
     {
        overloading c=new overloading();
        c.sum(10,57);
        c.sum(50,4,3);
    }
}