import java.io.*;

public class Main {

    private static File codigoFuente;

    public static void main(String[] args) {
        codigoFuente = new File(
                "D:\\AnalizadorLexicoPrueba\\AnalizadorLexico\\src\\analizadorlexico\\codigoFuente.txt");
        try {
            analizadorTokenManager lexicManager = new analizadorTokenManager(
                    new SimpleCharStream(new FileReader(codigoFuente)));
            Token token;
            while ((token = lexicManager.getNextToken()).kind != analizadorTokenManager.EOF) {
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
 