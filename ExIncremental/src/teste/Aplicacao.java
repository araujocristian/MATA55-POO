package teste;

import bar.*;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author cristian
 */
public class Aplicacao {
    public static void main(String[] args) {
        Bar bar = new Bar();
        Scanner teclado = new Scanner(System.in);
        String tipo, nome, cc;
        int id, prazo, forma;
        double taxa, diaria;
        boolean ativo;
        
        for(int i=0; i<5; i++){
            System.out.print("Qual o Tipo de Pagamento? ");
            tipo = teclado.nextLine();
            switch (tipo) {
                case "debito":
                    System.out.print("Qual o nome: ");
                    nome = teclado.nextLine();
                    System.out.println("Qual o ID? ");
                    teclado.nextLine();
                    id = teclado.nextInt();
                    System.out.print("Qual a Taxa de retenção? ");
                    teclado.nextLine();
                    taxa = teclado.nextDouble();
                    System.out.print("Qual a Conta Corrente? ");
                    teclado.nextLine();
                    cc = teclado.nextLine();
                    System.out.print("Esta ativo? ");
                    teclado.nextLine();
                    ativo = teclado.nextBoolean();
                    bar.addPagamento(new Debito(taxa, cc, id, nome, ativo));
                    break;
                case "credito":
                    System.out.print("Qual o nome: ");
                    nome = teclado.nextLine();
                    System.out.println("Qual o ID? ");
                    teclado.nextLine();
                    id = teclado.nextInt();
                    System.out.print("Qual a Taxa de retenção? ");
                    teclado.nextLine();
                    taxa = teclado.nextDouble();
                    System.out.print("Qual o prazo de pagamento? ");
                    teclado.nextLine();
                    prazo = teclado.nextInt();
                    System.out.print("Esta ativo? ");
                    teclado.nextLine();
                    ativo = teclado.nextBoolean();
                    bar.addPagamento(new Credito(taxa, prazo, id, nome, ativo));
                    break;
                case "voucher":
                    System.out.print("Qual o nome: ");
                    nome = teclado.nextLine();
                    System.out.println("Qual o ID? ");
                    teclado.nextLine();
                    id = teclado.nextInt();
                    System.out.print("Qual a Conta Corrente? ");
                    teclado.nextLine();
                    cc = teclado.nextLine();
                    System.out.print("Qual a Taxa de retenção? ");
                    teclado.nextLine();
                    diaria = teclado.nextDouble();
                    System.out.print("Qual o prazo de pagamento? ");
                    teclado.nextLine();
                    prazo = teclado.nextInt();
                    System.out.print("Esta ativo? ");
                    teclado.nextLine();
                    ativo = teclado.nextBoolean();
                    bar.addPagamento(new Voucher(diaria, prazo, cc, id, nome, ativo));
                    break;
                case "dinheiro":
                    System.out.print("Qual o nome: ");
                    nome = teclado.nextLine();
                    System.out.println("Qual o ID? ");
                    teclado.nextLine();
                    id = teclado.nextInt();
                    System.out.print("Qual a Forma? ");
                    teclado.nextLine();
                    forma = teclado.nextInt();
                    System.out.print("Esta ativo? ");
                    teclado.nextLine();
                    ativo = teclado.nextBoolean();
                    bar.addPagamento(new Dinheiro(forma, id, nome, ativo));
                    break;
            }
        }
        
        bar.ListaFormasPagamento();
        /*System.out.println("Qual o Tipo de Pagamento?");
        Debito p1 = new Debito(2.5, "5268-5", 1 ,"Maestro", true );
        Credito p2 = new Credito(2.5, 30, 2 ,"Visa", true );
        Voucher p3 = new Voucher(2.5, 60,"5268-5", 3 ,"Nutri", true );
        Dinheiro p4 = new Dinheiro(0, 4 ,"A vista", true );
        Dinheiro p5 = new Dinheiro(1, 5 ,"Deposito", true );
        /*
        Calendar c = Calendar.getInstance();

        Movimento m1 = new Movimento(c,10);
        Movimento m2 = new Movimento(c,20);
        Movimento m3 = new Movimento(c,30);
        Movimento m4 = new Movimento(c,40);
        Movimento m5 = new Movimento(c,50);
        
        
        
        Cliente c1 = new Cliente(1, 0, 0, "Cliente1");
        Especial c2 = new Especial(2, 0, 1, "Cliente2","end","878945487", "email", 'M');
        VIP c3 = new VIP(3, 0, 2, "Cliente3","end","878945487", "email", 'M', 195, "gerente");
        Cliente c4 = new Cliente(4, 0, 0, "Cliente4");
        Cliente c5 = new Cliente(5, 0, 0, "Cliente5");
        
        Produto produto1 = new Produto(25,0,"Sabão");
        Pedido pedido1 = new Pedido(1,produto1);
        Movimento movimento1 = new Movimento(c,10);
        System.out.println("Data e Hora atual:"+c.getTime());
        
        System.out.println(produto1.getNome());
        System.out.println(pedido1.getStatus());
        System.out.println(movimento1.getDataAbertura());
        */
    }
}
