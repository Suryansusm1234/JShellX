import java.util.HashSet;
import java.util.Set;
import java.io.File;

public class Type {
    static Set<String> buildin = new HashSet<>();
    static{
        buildin.add("echo");
        buildin.add("exit");
    
    }
    public static String directory_Search(String input){
        String [] searchDIR  = System.getenv("PATH").split(":");
         for(int i = 0; i < searchDIR.length ; i++){
                String candidateString = searchDIR[i]+"/"+input;
                File file = new File(candidateString);
                
                if (file.exists()&& file.isFile() && file.canExecute()) {
                    return candidateString;
                }
                
            }
             return null;
    }
    public static void type(String input) {
        if (buildin.contains(input)) {
            System.out.println(input + " is a shell builtin");
            return;
        } else {
            String candidateString = directory_Search(input);
            if (candidateString != null) {
                System.out.println(input+" is "+ candidateString);
                }else{
                    System.out.println(input+": is not found");
                }
            return;
        }

    }
}
