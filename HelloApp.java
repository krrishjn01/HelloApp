public class HelloApp {
    public static void main(String[] args) {

        String name = (args.length == 0) ? "World" : String.join(", ", args);
        System.out.println("Hello, " + name + "!");
    }
}