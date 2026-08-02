import java.io.File;
import java.io.IOException;
public class ShellProcess {
    public static void  find(String commandname , String args) throws IOException, InterruptedException {
       String path = Type.directory_Search(commandname);
       path =  path + " " + args;
       String [] argsList =  path.split(" ") ;
       if (path != null) {
        ProcessBuilder pb = new ProcessBuilder(argsList);
        pb.inheritIO();
        Process process = pb.start();
       process.waitFor();
       }

    }
}
