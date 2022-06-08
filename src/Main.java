
public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("byte " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
            System.out.println("int " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
            System.out.println("short " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
            System.out.println("long " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
            System.out.println("char " + Character.MAX_VALUE + " " + Character.MIN_VALUE);
            System.out.println("float " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
            System.out.println("double " + Double.MAX_VALUE + " " + Double.MIN_VALUE);
        }
        for (int i = 0; i < args.length; i++) {

            if (args[i].equals("byte"))
                System.out.println("byte " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
            else if (args[i].equals("int"))
                System.out.println("int " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
            else if (args[i].equals("short"))
                System.out.println("short " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
            else if (args[i].equals("long"))
                System.out.println("long " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
            else if (args[i].equals("char"))
                System.out.println("char " + Character.MAX_VALUE + " " + Character.MIN_VALUE);
            else if (args[0].equals("float"))
                System.out.println("float " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
            else if (args[i].equals("double"))
                System.out.println("double " + Double.MAX_VALUE + " " + Double.MIN_VALUE);
            else
                System.out.println("<" + args[0] + ">" + " wrong argument");
        }
    }
}
