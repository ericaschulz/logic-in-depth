public class Product {

    //Product attributes
    private String title = "LunchAtLocal22";
    private String desc = "Great place";
    private double price = 22.09;
    public static void main(String[] arguments) {
        String msg = "Whooo!";
        System.out.println(msg);
        //System.out.println(this.toString());
        if (arguments.length > 0) {
            System.out.println("We have beer!");

            } else {
            System.out.println("I need beer!");
        }
        logSillymessage();
        sayYourName();

        }

    //Java methods must define the type they return
    //OR they can be VOID
    //and return NOTHING
    public String toString() {
        String data = "Product: " + this.title;
        return data;
    }
    public static void logSillymessage() {
        System.out.println("Local 22 was a GREAT recommendation!! Beer, Burgers and 80's music!");

    }
    public static void sayYourName () {
        System.out.println("(says Erica)");
    }
}