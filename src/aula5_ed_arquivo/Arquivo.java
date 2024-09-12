package aula5_ed_arquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;

public class Arquivo {

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
        //getSobrenome();
        //ordenarNomes();
        //formulario();
        //ordenarNomes();
        //ordenarUsuarios();
        //usuariosAcimaMedia();
        partidasFut();

        br.close();
        bw.close();
        fr.close();
        fw.close();
    }

    private static void partidasFut() throws IOException {
        int nTimes = Integer.parseInt(br.readLine());
        String nomesTimes[] = new String [nTimes];
        int pontosTimes[] = new int[nTimes];

        //le times
        for (int i = 0; i < nTimes; i++) {
            nomesTimes[i] = br.readLine().substring(2);
        }

        //pontuação
        int nPartidas = Integer.parseInt(br.readLine());
        for (int i = 0; i < nPartidas; i++) {
            String linha = br.readLine();
            String valores[] = linha.split(" ");
            int codTime1 = Integer.parseInt(valores[0]);
            int codTime2 = Integer.parseInt(valores[1]);
            int golTime1 = Integer.parseInt(valores[2]);
            int golTime2 = Integer.parseInt(valores[3]);

            if (golTime1 > golTime2){
                pontosTimes[codTime1] +=3;
            } else if (golTime1 < golTime2) {
                pontosTimes[codTime2] +=3;
            } else {
                pontosTimes[codTime1]++;
                pontosTimes[codTime2]++;
            }
        }
        //verifica vencedor
        int indMaiorPontos = 0;
        int maiorPontos = 0;
        for (int i = 0; i < nTimes; i++) {
            if (pontosTimes[i] > maiorPontos){
                indMaiorPontos = i;
                maiorPontos = pontosTimes[i];
            }
        }
        System.out.println("Campeão: "+nomesTimes[indMaiorPontos]+" - Pontuação: "+maiorPontos);
    }

    private static void usuariosAcimaMedia() throws IOException {
        String linha = br.readLine();
        while (linha != null){

            String[] valores = linha.split(" ");
            double nota = Double.parseDouble(valores[valores.length-1]);

            if (nota >= 7) {
                fw.write(linha + "\n");
            }
            linha = br.readLine();
        }
        bw.flush();
    }

    private static void ordenarUsuarios() throws IOException {
        String linha = br.readLine();
        ArrayList<String> nomes = new ArrayList<>();
        while (linha != null){
            nomes.add(linha);
            linha= br.readLine();
        }
        Collections.sort(nomes);
        for (String nome: nomes){
            bw.write(nome +"\n");
        }
        bw.flush();
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
