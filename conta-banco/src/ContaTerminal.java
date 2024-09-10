import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        // Conhecer e importar a classe Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ;
            // Exibir as mensagens para o nosso usuario
            System.out.println("bem vindo ao seu banco digital");

            // Obter pela scanner os valores digitados no terminal
            System.out.println("Digite seu nome completo");
            String nome = scanner.next();

            System.out.println("Digite seu CPF");
            int cpf = scanner.nextInt();

            System.out.println("Digite seu RG");
            int rg = scanner.nextInt();
   
            
            // Exibir a mensagem conta criada
            System.out.println("Conta criada para:" + nome);
            System.out.println("CPF:"+ cpf);
            System.out.println("RG:" + rg );
            System.out.println("Sua agencia:0002 e conta: 054669-9:");
        }

        


        
    }


