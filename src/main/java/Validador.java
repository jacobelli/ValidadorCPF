import java.util.Scanner;

public class Validador {
    public static void main(String[] args) {
        System.out.println("Validador de CPF iniciado...\n");

        Scanner entrada = new Scanner(System.in);
        String cpf;

        while (true) { // loop até CPF válido
            System.out.print("Digite o CPF para verificar: ");
            cpf = entrada.nextLine();

            String resultado = validarCPF(cpf);
            System.out.println(resultado);

            System.out.println("Tente novamente.\n");
        }

    }

    public static String validarCPF(String cpf) {
        cpf = cpf.trim();

        // Parte 1 Verificação
        // 1.1 - Campo vazio
        if (cpf.isEmpty()) {
            return "O campo CPF não pode estar vazio.";
        }

        // 1.2 - Caracteres inválidos
        if (!cpf.matches("^[0-9]+$")) {
            return "O CPF não pode conter símbolos, espaços ou letras. Digite apenas números (ex: 12345678909).";
        }

        // 1.3 - Tamanho incorreto
        if (cpf.length() != 11) {
            return "O CPF deve conter exatamente 11 dígitos. Você digitou " + cpf.length() + ".";
        }

        // 1.4 - Dígitos iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return "Este CPF é inválido: todos os dígitos são iguais.";
        }

        try {
            // Parte 2 Verifição (Oficial Receita Federal)
            // 2.1 - Cálculo do 1º dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int resto = soma % 11;
            int digito1 = (resto < 2) ? 0 : 11 - resto;

            // 2.2 - Cálculo do 2º dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            resto = soma % 11;
            int digito2 = (resto < 2) ? 0 : 11 - resto;

            // 2.3 - Verificação final
            if (digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0')) {
                return "Este CPF é válido! (" + cpf + ")";
            } else {
                return "Este CPF é inválido: os dígitos verificadores não conferem.";
            }

        } catch (Exception e) {
            return "Ocorreu um erro ao validar o CPF.";
        }
    }

}
