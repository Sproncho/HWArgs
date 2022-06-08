
public class Main {
    public static void main(String[] args) {
        boolean right = false;
        if(args.length == 0 || args[0].equals("byte")  || args[0].equals("")) {
            System.out.println("byte " +Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
            right = true;
        }

        if(args.length == 0 || args[0].equals("int")  || args[0].equals("")) {
            System.out.println("int " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
            right = true;
        }

        if(args.length == 0 || args[0].equals("short")  || args[0].equals("")) {
            System.out.println("short " + Short.MAX_VALUE + " " + Short.MIN_VALUE);
            right = true;
        }

        if(args.length == 0 || args[0].equals("long")  || args[0].equals("")) {
            System.out.println("long " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
            right = true;
        }

        if(args.length == 0 || args[0].equals("char")  || args[0].equals("")) {
            System.out.println("char " + Character.MAX_VALUE + " " + Character.MIN_VALUE);
            right = true;
        }

        if(args.length == 0 || args[0].equals("float")  || args[0].equals("")) {
            System.out.println("float "+ Float.MAX_VALUE + " " + Float.MIN_VALUE);
            right = true;
        }

        if(args.length == 0 || args[0].equals("double")  || args[0].equals("")) {
            System.out.println("double " + Double.MAX_VALUE + " " + Double.MIN_VALUE);
            right = true;
        }
        if(!right)
            System.out.println("<" + args[0] + ">" + " wrong argument");
    }
}
