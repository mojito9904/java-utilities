import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mojito{

    //////////////////////////////////////////////////
    ///////////for int type 
    public static int IntPut(String information ){
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader keybord= new BufferedReader(input);
        System.out.println(information);
        int data=0;
        boolean error=true;
        while (error) {
            try {
                String read=keybord.readLine();
                data=Integer.parseInt(read);
                error=false;
            } catch (Exception e) {
                System.err.println("error"+e );
                error=true;
            }
        }
        return data;
    }

    //////////////////////////////////////////////////
    ///////////for float type 

    public static float FloatPut (String information ){
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader keybord= new BufferedReader(input);
        System.out.println(information);
        float data =0;
        boolean error=true;
        while (error) {
            try {
                String read=keybord.readLine();
                data=Float.parseFloat(read);
                error=false;
            } catch (Exception e) {
                System.err.println("error"+e );
                error=true;
            }
        }
        return data;
    }

    //////////////////////////////////////////////////
    //////////  for String type 

    public static String StringPut(String information){
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader keybord= new BufferedReader(input);
        System.out.println(information );
        String data="";
        boolean error=true;
        while (error) {
            try {
                data=keybord.readLine();
                error=false;
            } catch (Exception e) {
                System.err.println("error"+e );
                error=true;
            }
        }
        return data;
    }

    //////////////////////////////////////////////////
    ///////////for double type 
    public  static double DoublePut(String infromation ){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keybord = new BufferedReader(input);
        System.out.println(infromation );
        double data =0f;
        boolean error=true;
        while (error) {
            try {
                String read=keybord.readLine();
                data=Double.parseDouble(read);
                error=false;
            } catch (Exception e) {
                System.err.println("error"+e );
                error=true;
            }
        }
        return data ;
    }

    //////////////////////////////////////////////////
    ///////////for boolean type 

    public static boolean getBoolean(String information ){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        System.out.println(information);
        String data="";
        boolean result = true;
        boolean error=true;
        while (error) {
            try {
                System.out.println("yes/no");
                String read=tastiera.readLine();
                data=read.toUpperCase();
                if ((data.equals("YES ")) || (data.equals("NO"))){
                    if(data.equals("YES")){
                        result=true;
                        error=false;
                    }
                    else {
                        result = false;
                        error=false;
                    }
                }
                else {
                    System.out.println(" data error ");
                }
            }
            catch (Exception e) {
                System.err.println("error"+e );
                error=true;
            }
        }
        return result;
    }
    //////////////////////////////////////////////////
    ///////////option menu  

    public static int menu (String... args){
        int data=-1;
        while ((data<0) || (data>=args.length)){
            for (int i=0;i<args.length;i++){
                System.out.println("["+(i+1)+"]"+args[i]);
            }
            data=(IntPut(""));
        }
        return data;
    }
}


