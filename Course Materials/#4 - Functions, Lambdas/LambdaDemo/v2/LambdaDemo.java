public class LambdaDemo
{
   public static void main(String[] args)
   {
      Runnable r = new Runnable()
                   {
                      @Override
                      public void run()
                      {
                         System.out.println("Hello");
                      }
                   };
      new Thread(r).start();
   }
}