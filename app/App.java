package app;
import src.Cpf;
import java.util.Scanner;

public class App {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o CPF");
    String cpfDigitado = scanner.nextLine();
    Cpf cpf = new Cpf();
    cpf.CpfLimpar(cpfDigitado);
    scanner.close();
  }
}