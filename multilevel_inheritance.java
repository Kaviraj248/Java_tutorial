import java.util.*;
class Different
{
    public double div(int n1 ,int n2)
    {
        return n1/n2;
    }
}
class Decrease extends Different            //multilevel inheritance
{
    public int sub(int num){
        return num * num;
    }
    public int add(int num1, int num2)    //method overriding
   {
       return  num1 * num2;
   }
}


class Increase extends Decrease
{   int num;
   public Increase(int num)
   {
       this.num = num;
   }
  public int add(int num1, int num2)
  {
      return num * num1 * num2;
       
  }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner ak = new Scanner(System.in);
        int num = ak.nextInt();
        Increase obj = new Increase(num);
        System.out.println(obj.add(10,10));
        System.out.println(obj.sub(num));
         System.out.println(obj.div(50,10));
        
    }
}