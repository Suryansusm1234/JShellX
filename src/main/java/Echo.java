public class Echo {
    public static void echo(String input){
        input= input.trim();
        String result =  input.replace("echo ", "");
       System.out.println(result);
       return;
    }
}
