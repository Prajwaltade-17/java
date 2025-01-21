class Circle
{
  static double pi=3.14;
   float radius;

   public Circle()
   {
    radius=5;
   }

   double areaofcircle()
   {
    return pi*radius*radius;
   }
   double circumferenceofcircle()
   {
    return 2*pi*radius;
   }

}
public class Area
{

    public static void main(String[]args)
  {
   Circle c =new Circle();
   System.out.println("area of circle" +  c.areaofcircle());
   System.out.println("circumference" + c.circumferenceofcircle ());

  }
}
