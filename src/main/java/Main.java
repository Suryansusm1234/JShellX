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
       String[] GC = input.split(" ",2);
       switch (GC[0]) {
        case "echo":
            Echo.echo(GC[1]);
            break;
        case "type":
        Type.type(GC[1]);
        break;
        default:
            ShellProcess.find(GC[0] , GC[1]);
            break;
       }

       }
        }

    }
}
