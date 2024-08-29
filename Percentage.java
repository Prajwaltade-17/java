import java.util.Scanner;
class Percentage
   {
     public static void main(String args[])
   {
    float total;
    double percentage;
    Scanner sc= new Scanner(System.in);

    System.out.println("subject 1 marks:");
    int mark1=sc.nextInt();
        System.out.println("subject 2 marks:");
    int mark2=sc.nextInt();
        System.out.println("subject 3 marks:");
    int mark3=sc.nextInt();

        System.out.println("subject 4  marks:");
    int mark4=sc.nextInt();

        System.out.println("subject 5 marks:");
    int mark5=sc.nextInt();
    total=mark1+mark2+mark3+mark4+mark5;

    percentage=(total/500)*100;
        System.out.println("percentage :");
        System.out.println(percentage);

}
}

