import java.io.PrintWriter;

/**
 * Encode and decode a Vigenere Cipher
 */
public class VigenereCipher {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    if (args.length == 3) {
      Parameters p = new Parameters(args[1]);
      
      if (args[0].equals("encode")) {
        p.encode(args[2]);        
      }// if

      else if (args[0].equals("decode")) {
        p.decode(args[2]);
      }// else if

      else {
        pen.println("Valid options are \"encode\" or \"decode\"");
      }
      
    } // if

    else {
      pen.println("Incorrect number of parameters");
    } // else
  } // main
} // class CaesarCipher
