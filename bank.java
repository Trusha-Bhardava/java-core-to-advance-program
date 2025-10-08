public class bank {
    double p,r;
    int n;
    double simpleInterest()
    {
        return (p*r*n/100);
    }
}
class methods
{
    public static void main(String[] args) {
        bank b1=new bank();
        b1.p=5000;
        b1.r=12;
        b1.n=5;
        double si=b1.simpleInterest();
        System.out.println("simple interest is " + si);
    }
}