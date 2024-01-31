import java.io.PrintWriter;

public class Parameters {
  PrintWriter pen;
  String init;
  int l;
  char[] letters;
  char[] encoded;

  public Parameters(String initial){
    pen = new PrintWriter(System.out, true);
    init = initial;
    l = init.length();
    letters = init.toCharArray();
    encoded = new char[l];
  } // Parameters

  public void encode(String key) {
    int i = 0;
    for (int j = 0; j < l; j++) {
      char c = key.charAt(i);
      encoded[j] = (char) ((init.charAt(j) + c - 194) % 26 + 97);
      i = (i + 1) % key.length();
    }// for
    String fin = new String(encoded);
    pen.println(fin);
  }// encode

  public void decode(String key) {
    int i = 0;
    for (int j = 0; j < l; j++) {
      char c = key.charAt(i);
      encoded[j] = (char) ((init.charAt(j) - c + 26) % 26 + 97);
      i = (i + 1) % key.length();        
    }// for
    String fin = new String(encoded);
    pen.println(fin);
  }// decode
}// class Parameters
