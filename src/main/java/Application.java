public class Application {
    public static void main(final String[] arguments) {
        final Application application = new Application();

        if (arguments.length == 0) {
            application.printHelpText();

        }
        for (final String argument : arguments) {
            if (argument.equals("-h")) {
                // They are asking for help
                application.printHelpText();
            }

        }
    }

    private void printHelpText() {
        System.out.println("Help Me");
        System.exit(0);
    }
}
