
interface AIML
{
 void Div();
 void student_name();
}

class student implements AIML
{
   public void Div()
   {
       System.out.println("Div:B");
    }

    public void student_name()
    {
    System.out.println("Prajwal Tade");
    }
}

class main
{
 public static void main(String args[])
{
 student mystudent= new student();
 mystudent.Div();
 mystudent.student_name();
}
}
 
