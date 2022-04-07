package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i, j, num, aux;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        
        ArrayList<Integer> lista = criaVetorPrimos(num);
        somaPrimosConsecutivos(lista);
    }
    
    public static int verificaNum (int numero) {
        int i, cont=0;
        for (i=1; i<=numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }
        if (cont == 2){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public static ArrayList criaVetorPrimos (int numero){
        int i;
        ArrayList<Integer> lista = new ArrayList();
        for(i=1; i<=numero; i++){
            if(verificaNum(i) == 1){
                lista.add(i);
            }
        }

        return lista;
    }

    public static List somaPrimosConsecutivos(ArrayList<Integer> lista){
        int i, aux = 1;      
        boolean validador = true;       
        int inicio = 0;
        List<Integer> arraySoma = new ArrayList<Integer>();
             
        int lastnum = lista.get((lista.size())-aux); 
//        System.out.print(lastnum + " = ");
        while(validador){
            arraySoma.clear();
            int somaAtual = lista.get(inicio);
            arraySoma.add(lista.get(inicio));
            for (i=0; i<lista.size(); i++) {               
                if(i > inicio){
                    somaAtual += lista.get(i);
                    arraySoma.add(lista.get(i));   
                    if(somaAtual == lastnum){
                        break;
                    }                    
                }                
            }
            inicio += 1;
            if(inicio > lista.size() || somaAtual == lastnum){
                validador = false;
            }
        }     
        if(arraySoma.size()-1 < 2){
            int j;
            ArrayList<Integer> listaAux = criaVetorPrimos(lastnum-1);
            ArrayList novaLista = (ArrayList) somaPrimosConsecutivos(listaAux);
            int arrayPrint[] = new int[novaLista.size()];
            int result = 0;
            
            for(j=0; j<arrayPrint.length; j++){
                arrayPrint[j] = (int) novaLista.get(j);
                result += arrayPrint[j];
            }
            System.out.print(result + " = ");
            for(j=0; j<arrayPrint.length; j++){
                if(j == arrayPrint.length - 1){
                    System.out.print(arrayPrint[j] + " ");
                }
                else{
                    System.out.print(arrayPrint[j] + " + ");
                }
            }
        }
        else{
            int j, result = 0;
            int arrayPrint[] = new int[arraySoma.size()];
                for(j=0; j<arraySoma.size(); j++){
                    arrayPrint[j] = arraySoma.get(j);
                    result += arrayPrint[j];
                }
                System.out.print(result + " = ");
                for(j=0; j<arrayPrint.length; j++){
                    if(j == arrayPrint.length - 1){
                    System.out.print(arrayPrint[j] + " ");
                }
                else{
                    System.out.print(arrayPrint[j] + " + ");
                }
                }
            }
        return arraySoma;
    }
}
