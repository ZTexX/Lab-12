import java.io.*;

class Lab12B {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String pword, result;

    System.out.print("Enter a password: ");
    pword = br.readLine();

    result = isValid(pword) ? "Valid Password" : "Invalid Password";
    System.out.println(result);

    System.out.println("\nProgram Ends");
  }

  public static boolean isValid(String pword) {
    boolean eightChars = pword.length() >= 8, oneUpper = false, oneDigit = false;

    for (char c : pword.toCharArray()) {
      if (Character.isDigit(c)) {
        if (oneDigit) continue;
        oneDigit = true;
      } else if (Character.isUpperCase(c)) {
        if (oneUpper) continue;
        oneUpper = true;
      }
    }

    return eightChars && oneUpper && oneDigit;
  }
}