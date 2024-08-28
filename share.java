import java.util.Scanner;
class market
{ 
 Object info[]=new Object[4];

 String name;
 int price;
 float debt;
 float PE;
void setinfo()
{
Scanner sc=new Scanner(System.in);
 System.out.println("share name:");
 name=sc.next();
 System.out.println("share price:");
 price=sc.nextInt();
 System.out.println("share debt:");
 debt=sc.nextFloat();
 System.out.println("PE ratio:");
 PE=sc.nextFloat();
info[0]=name;
info[1]=price;
info[2]=debt;
info[3]=PE;
}
 void getinfo()
{
for(int i=0;i<4;i++)
{
 System.out.println(" "+info[i]);
}
}  
} 

class share
{
 public static void main(String args[])
 {
 market m=new market();
m.setinfo();
m.getinfo();
}
}
   