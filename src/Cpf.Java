package src;

public class Cpf {
  private String cpfLimpo;
  public void cpfLimpar(String cpf) {
    this.cpfLimpo = cpf.replaceAll("[^0-9]", "");
  }

  public boolean tamanhoValido() {
   return cpfLimpo.length() == 11;
  }

  public boolean temDigitosRepetidos() {
   char primeiro = cpfLimpo.charAt(0); for (int i = 1; i < cpfLimpo.length(); i++) {
     if (cpfLimpo.charAt(i) != primeiro) {
      return false;
 }
    }
    return true; 
}

  public String getCpfLimpo() {
    return cpfLimpo;
  }

  }
