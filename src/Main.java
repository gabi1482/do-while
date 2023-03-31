import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //quero que a ervilha seja a instancia do produto, ou seja, o objeto
        Produto produto;

        boolean encerrar = false;

        String nome = "";

        double valor = 0;

        double total = 0;



        do {

            nome = JOptionPane.showInputDialog("Nome do produto");


            //leitor, pega o proximo double que a pessoa digitar
            valor = Double.parseDouble(
                    JOptionPane
                            .showInputDialog("Valor do produto"));

            //criei a instancia de um produto
            produto =  new Produto(nome, valor);

            System.out.println(produto);


            total = total + produto.getValor();


            int opcao = Integer.parseInt(
                    JOptionPane.showInputDialog("Deseja mais alguma coisa? " +
                            "[1] = para sim" +
                            "[0] = para não"));


            encerrar = opcao == 1 ? false: true;

        }while (encerrar == false);


        System.out.printf("Total da compra:" + total);

    }
}