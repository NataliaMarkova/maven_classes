package ua.rd.natalia_markova;

public class App {
    public static void main( String[] args ) {
        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
            for (String str: args) {
                System.out.println(str + " World!");
            }
        }

    }
}
