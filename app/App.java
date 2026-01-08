package app;

import src.Cpf;
import src.CpfValidador;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF:");
        String cpfDigitado = scanner.nextLine();

        Cpf cpf = new Cpf();
        cpf.cpfLimpar(cpfDigitado);

        if (!cpf.tamanhoValido()) {
            System.out.println("CPF inválido");
            scanner.close();
            return;
        }

        if (cpf.temDigitosRepetidos()) {
            System.out.println("CPF inválido");
            scanner.close();
            return;
        }

        CpfValidador validador = new CpfValidador();
        boolean valido = validador.validar(cpf.getCpfLimpo());

        if (valido) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }

        scanner.close();
    }
}