public class Asterisk {
  public static void main(String[] args) {
    String str = "* * * * * * * *";

    for (int i = 0;i <= 8 ;i++ ) {
      if (i % 2 == 0) {
        System.out.println(str);
      }
      else {
        System.out.println(" " + str);
      }
    }
  }
}
