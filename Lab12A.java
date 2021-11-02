import java.io.*;

class Lab12A {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int choice;
    boolean rerun = false;

    do {
      if (rerun) System.out.println();
      System.out.println("Menu");

      System.out.println("0 - Hello World");
      System.out.println("1 - Goodbye Moon");
      System.out.println("2 - Walking on Sunshine");

      do {
        System.out.print("\nWhat would you like to do: ");
        choice = Integer.parseInt(br.readLine());
      } while (choice < 0 && choice > 2);

      switch (choice) {
        case 0:
          System.out.println("\nHello!");
          break;

        case 1:
          System.out.println("\nOk, bye.");
          break;

        case 2:
          System.out.println("\nWHOA!");
          break;
      }

      System.out.print("\nType \"YES\" to rerun. ");
      rerun = br.readLine().equalsIgnoreCase("YES");
    } while (rerun);

    System.out.println("\nProgram Ends");
  }
}