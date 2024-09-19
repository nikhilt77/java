import java.util.Scanner;
class Rhombus {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= 1; j--) {
        if (j > i)
          System.out.print(" ");
        else
          System.out.print(j);
      }
      for (int j = 2; j <= n; j++) {
        if (j <= i)
          System.out.print(j);
      }
      System.out.print("\n");
    }

    for (int i = n - 1; i >= 1; i--) {
      for (int j = n; j >= 1; j--) {
        if (j > i)
          System.out.print(" ");
        else
          System.out.print(j);
      }
      for (int j = 2; j <= n; j++) {
        if (j <= i)
          System.out.print(j);
      }
      System.out.print("\n");
    }
  }
}
