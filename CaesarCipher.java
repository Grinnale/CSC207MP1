import java.io.PrintWriter;

/**
 * Encode and decode a Caesar Cipher
 */
public class CaesarCipher {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};//Is there a better way to do this?    
    if (args.length == 2) {
      Parameters p = new Parameters(args[1]);
        
      if (args[0].equals("encode")) {
        for (int i = 0; i < 26; i++) {
        System.out.print("n = " + i + ": ");
        p.encode(alphabet[i]);
        }
      }// if

      else if (args[0].equals("decode")) {
          for (int i = 0; i < 26; i++) {
          System.out.print("n = " + i + ": ");
          p.decode(alphabet[i]);
          }          
      }// else if

      else {
        pen.println("Valid options are \"encode\" or \"decode\"");
      }// else
      
    } // if
    else {
      pen.println("Incorrect number of parameters");
    } // else
  } // main
} // class CaesarCipher
