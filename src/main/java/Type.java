import java.util.HashSet;
import java.util.Set;
import java.io.File;

public class Type {
    static Set<String> buildin = new HashSet<>();
    static{
        buildin.add("echo");
        buildin.add("exit");
    
    }

    public static void type(String input) {
        if (buildin.contains(input)) {
            System.out.println(input + " is a shell builtin");
            return;
        } else {
           String [] SearchDIR  = System.getenv("PATH").split(":");
           boolean wasfound = false;
            for(int i = 0; i < SearchDIR.length ; i++){
                String candidateString = SearchDIR[i]+"/"+input;
                File file = new File(candidateString);
                
                if (file.exists()&& file.isFile() && file.canExecute()) {
                    System.out.println(input + " is " + candidateString);
                    wasfound = true;
                    break;
                }
                
            }
            if (!wasfound) {
                System.out.println(input+": not found");
                }
            return;
        }

    }
}
