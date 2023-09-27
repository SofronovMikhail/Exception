import java.util.InputMismatchException;
import java.util.Scanner;
 
public class task1 {

    public static void main(String[] args) throws Exception{

        System.out.print("Input a number: ");
        MyMethod();
        System.out.println();
    }      

    public static void MyMethod() {
         Scanner in = new Scanner(System.in);
         Float num = null;
        try{
           num = in.nextFloat();
        }
        catch(InputMismatchException e){
            System.out.print("не правильное значение, попробуйте еще раз: ");
            MyMethod();
        }
        in.close();
        System.out.println(num);
        
    } 
}
