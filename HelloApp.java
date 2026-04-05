public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // StringBuilder to build names
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String names = "";
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Final output
            System.out.println("Hello, " + names + "!");
        }
    }
}