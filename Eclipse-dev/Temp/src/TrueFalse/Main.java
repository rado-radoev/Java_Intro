package TrueFalse;

public class Main {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = a; // Wow
        String d = c; // Wow

        boolean b1 = a != b; // true == true = false
        boolean b2 = b.equals(a); 
        boolean b3 = c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
