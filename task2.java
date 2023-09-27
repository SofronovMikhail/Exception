public class task2{
   public static void main(String[] args) throws Exception{

      int[] intArray = new int[9];
      for(int i = 0; i < intArray.length; i++){
         intArray[i] = i;
      }
       try {
         int d = 0;
         double catchedRes1 = d / intArray[8];
         System.out.println("catchedRes1 = " + catchedRes1);
      } catch (ArithmeticException e) {
         System.out.println("Catching exception: " + e);
      }
      System.out.println();
   }
}
    

