package src;
import src.Cpf;

public class CpfValidador {
  public boolean validar(String cpfLimpo) {
   return true;
 }

 private int calcularPrimeiroDigito(String cpf) {
   int soma = 0;
   int peso = 10;
 for (int i = 0; i < 9; i++) {
   int numero = cpf.charAt(i) - '0';
  soma += numero * peso;
  peso--;
  }
 int resto = soma % 11;
  return (resto < 2) ? 0 : 11 -
  resto;                  }

  private int calcularSegundoDigito(String cpf) {
  int soma = 0;
   int peso = 11;
   for (int i = 0; i < 10; i++) {
   int numero = cpf.charAt(i) - '0';
  soma += numero * peso;
 peso--;
 }

 int resto = soma % 11;
  return (resto < 2) ? 0 : 11 - resto;                   }

  public boolean validar(String cpf) {
  int d1 = calcularPrimeiroDigito(cpf);
  int d2 = calcularSegundoDigito(cpf);
   int digito10 = cpf.charAt(9) - '0';
  int digito11 = cpf.charAt(10) - '0';
  return d1 == digito10 && d2 == digito11;
    }
  }
  
 
  
