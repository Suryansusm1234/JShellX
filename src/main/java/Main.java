import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        while(true){
            System.out.print("$ ");
        String input =  sc.next();
        if (input.length() != 0){
           System.out.println(input + ": command not found" );
       }
        }

    }
}
