import java.util.Scanner;
public class Main {
    

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
            Echo.echo(input);
            break;
        case "type":
        input = input.replace("type ", "");
        Type.type(input);
        break;
        default:
            System.out.println(input+": command not found");
            break;
       }

       }
        }

    }
}
