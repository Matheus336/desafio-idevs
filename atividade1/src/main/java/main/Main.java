package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String palavra;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma palavra:");
        palavra = scan.next();
        System.out.println(calculaPalavra(palavra));
    }
    
    public static String calculaPalavra(String palavra){
        int pontuacao = 0, i, j;
        char letra[] = palavra.toCharArray();
        
        for(i=0; i<palavra.length(); i++){
            if(letra[i] == 'q' || letra[i] == 'Q' || letra[i] == 'z' || letra[i] == 'Z'){
                pontuacao += 10;
            }
            if(letra[i] == 'j' || letra[i] == 'J' || letra[i] == 'x' || letra[i] == 'X'){
                pontuacao += 8;
            }
            if(letra[i] == 'k' || letra[i] == 'K'){
                pontuacao += 5;
            }
            if(letra[i] == 'f' || letra[i] == 'F' || letra[i] == 'h' || letra[i] == 'H' || letra[i] == 'v' || letra[i] == 'V' || letra[i] == 'w' || letra[i] == 'W' || letra[i] == 'y' || letra[i] == 'Y'){
                pontuacao += 4;
            }
            if(letra[i] == 'b' || letra[i] == 'B' || letra[i] == 'c' || letra[i] == 'C' || letra[i] == 'm' || letra[i] == 'M' || letra[i] == 'p' || letra[i] == 'P'){
                pontuacao += 3;
            }
            if(letra[i] == 'd' || letra[i] == 'D' || letra[i] == 'g' || letra[i] == 'G'){
                pontuacao += 2;
            }
            if(letra[i] == 'a' || letra[i] == 'A' || letra[i] == 'e' || letra[i] == 'E' || letra[i] == 'i' || letra[i] == 'I' || letra[i] == 'o' || letra[i] == 'O' || letra[i] == 'u' || letra[i] == 'U' || letra[i] == 'l' || letra[i] == 'L' || letra[i] == 'n' || letra[i] == 'N' || letra[i] == 'r' || letra[i] == 'R' || letra[i] == 's' || letra[i] == 'S' || letra[i] == 't' || letra[i] == 'T'){
                pontuacao += 1;
            }
        }
        return "A palavra digitada foi: " + palavra + ". A pontuação obtida foi: " + pontuacao;
    }
}
