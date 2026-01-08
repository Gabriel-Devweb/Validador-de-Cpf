package src;
import app.App.java;

public class Cpf {
  public void cpfLimpar(String cpf) {
  String cpfLimpo = cpf.replaceAll("[^0-9]", "");
  }

  public boolean tamanhoValido() {
   return cpfLimpo.length() = 11;
  }

  public boolean temDigitosRepetidos() {
   char primeiro = cpfLimpo.charAt(0); for (int i = 1; i < cpfLimpo.length(); i++) {
     if (cpfLimpo.charAt(i) != primeiro) {
      return false;
 }
    }
    return true; 
}
  }
