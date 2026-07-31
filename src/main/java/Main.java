import java.util.Scanner;

public class Main {
    public static void Echofunction(String input){
        String result =  input.replace("echo ", "");
       System.out.println(result);
       return;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        while(true){
            System.out.print("$ ");
        String input =  sc.nextLine();
        if (input.equals("exit")){
           break;
       }else{  
        if (input.startsWith("echo")) {
            Echofunction(input);
        }else{
            System.out.println(input+": "+ "command not found");
        }

       }
        }

    }
}
