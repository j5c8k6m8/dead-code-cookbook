public class AfterReturnWithIf {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Cannot enter arguments.");
            return;
        }
        System.out.println("Am I dead?");
    }
}