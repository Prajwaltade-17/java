class Calculate
{
    private double side;
    
    public Calculate()
    {
        side=9;
    }

    double calculatearea()
    {
        return side*side;
    }
     
    double calculateperimeter()
    {
        return 4*side;
    }
}
public class Square
{
    public static void main(String[]args)
    {
        Calculate c=new Calculate();
        System.out.println("area of square" + c.calculatearea());
        System.out.println("perimeter of square " +c.calculateperimeter());
    }
}
