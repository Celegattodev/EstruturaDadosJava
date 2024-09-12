package aula5_ed_arquivo;

import java.io.*;
import java.util.Scanner;

public class Main {

    static FileReader fr;
    static BufferedReader br;
    static FileWriter fw;
    static BufferedWriter bw;
    static final String Arq_entrada = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\entrada.txt";
    static final String Arq_saida = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\saida.txt";

    public static void main(String[] args) throws IOException {
        fr = new FileReader(Arq_entrada);
        br = new BufferedReader(fr);
        fw = new FileWriter(Arq_saida);
        bw = new BufferedWriter(fw);

        //leitura();
        //escrita();
        //formataDataSubstring();
        //formataDataSplit();
        //UltimoNome();
        //formulario();
        //ordenarNomes();
        jogosBrasileirao();

    }

    private static void jogosBrasileirao() {
        //1São Paulo
        //2Corinthians
        //3Palmeiras
        //4Santos
        int[] pontos = {0, 1, 2, 3, 4};


    }

    private static void ordenarNomes() {
        String nomeComp = "Murilo Celegatto Oliveira dos Santos Pontes Carvalho";
        String[] nomes = nomeComp.split(" ");
        for (String nome : nomes){
            if (!nome.equals(nome.toLowerCase())){
                System.out.println(nome + "º nome: " + nome);
            }
        }
    }

    private static void formulario() {
        String respostaCorreta = "murilo celegatto oliveira";
        System.out.println("Quem é o mais lindo da FATEC?");
        Scanner scanner = new Scanner(System.in);
        String respostaUsuario = scanner.nextLine();
        respostaUsuario = respostaUsuario.trim();
        respostaUsuario = respostaUsuario.toLowerCase();

        if (respostaUsuario.equals(respostaCorreta)){
            System.out.println("Acertou!");
        } else {
            System.out.println("Errou burrão");
        }
    }

    private static void getSobrenome() {
        String nome = "Luís Gustavo Gomes Gonçalves";
        String[] nomes = nome.split(" ");

        System.out.println(nomes[nomes.length-1]);
    }

    private static void formataDataSplit() {
        String dateEUA = "2024/09/05";
        String[] datas = dateEUA.split("/");

        System.out.println(datas[2]+"/"+datas[1]+"/"+datas[0]);
    }

    private static void formataDataSubstring() throws IOException {
        String dateEUA = "2024/09/05";

        String anoBR = dateEUA.substring(0, 4);
        String mesBR = dateEUA.substring(5, 7);
        String diaBR = dateEUA.substring(8, 10);

        String dateBR = diaBR+"/"+mesBR+"/"+anoBR;
        System.out.println(dateEUA);
        System.out.println(dateBR);
    }

    private static void escrita() throws IOException {
        bw.write("Linha 1");
        bw.newLine();
        bw.write("Linha 2");
        bw.flush();//commit
    }

    private static void leitura() throws IOException {
        String linha = br.readLine();
        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
    }
}
