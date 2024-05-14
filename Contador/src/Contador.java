import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Digite um outro número inteiro: ");
        int segundoNumero = terminal.nextInt();

        terminal.close();
        try{
            contar(primeiroNumero, segundoNumero);

        }catch (ParametrosInvalidosException Exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException();
        }
        int contagem = segundoNumero - primeiroNumero;
        System.out.println(contagem);
        for(int cont = 1; cont <= contagem; cont++){
            System.out.println("Imprimindo o número " + cont);
        }
    }


}
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}