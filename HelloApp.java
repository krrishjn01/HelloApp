public class HelloApp {
    public static void main(String[] args) {

        // Default value
        String name = "World";

        // If user gives input, override default
        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }
}