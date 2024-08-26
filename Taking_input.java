import java.util.Scanner;

class Taking_input
   {
     public static void main(String args[])
   {
    Scanner sc= new Scanner(System.in);

    System.out.println("whats your salary:");
    long salary=sc.nextLong();
        System.out.println(" salary after tax:");
       double s=salary*0.95;
        System.out.println(s);
}
}


     