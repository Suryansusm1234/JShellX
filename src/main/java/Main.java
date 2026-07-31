import java.util.Scanner;

public class Main {
    public static void Echofunction(String input){
        input= input.trim();
        String result =  input.replace("echo ", "");
       System.out.println(result);
       return;
    }
    public static void typefuction(String input){
        String [] buildin = {"echo", "exit" , "type"};
        boolean isbuildin = false;
        for(int i = 0 ; i< buildin.length;i++){
            if (input.equals(buildin[i])) {
                System.out.println(input+" is a shell builtin");
                isbuildin = true;
                break;
            }
        }
        if (!isbuildin) {
            System.out.println(input+": not found");
        }
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
       String GC = input.substring(0,4);
       switch (GC) {
        case "echo":
            Echofunction(input);
            break;
        case "type":
        input = input.replace("type ", "");
        typefuction(input);
        break;
        default:
            System.out.println(input+": command not found");
            break;
       }

       }
        }

    }
}
