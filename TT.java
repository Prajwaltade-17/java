import java.io.*;
import java.util.*;

class TT extends Thread
{

public void run()
 {
   System.out.println("Thread started");
 }
 public static void main(String args[])
{
 TT t1=new TT();
    t1.start();
}
}
