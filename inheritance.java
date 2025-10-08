class inheritance
{
    public void methodA()
    {
        System.out.println("base of method");
    }
}class b extends inheritance{
    public void methodB()
    {
        System.out.println("child class of method");
    }
}
class demo
{
     public static void main(String[] args) {
        b obj=new b();
        obj.methodA();
        obj.methodB();
     }
}