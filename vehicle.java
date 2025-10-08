public class vehicle {
    vehicle()
    {
        System.out.println("this is vehicle");
    }
}
class car extends vehicle
{
    car()
    {
        System.out.println("this is car");
    }
}
class bus extends vehicle
{
    bus()
    {
        System.out.println("this is bus");
    }
}
class test
{
    public static void main(String[] args)
    {
       car obj1 = new car();
       bus obj2 = new bus();    
    }
}