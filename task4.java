import java.util.Scanner;

public class task4{
    public static void main(String[] args) throws Exception{
        
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in); 
        String str = in.nextLine();
        if(str.length() == 0){
            throw new Exception("Пустые строки вводить нельзя");
            }
            
    }
    
}
    
