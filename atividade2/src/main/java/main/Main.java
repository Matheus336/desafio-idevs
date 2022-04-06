package main;

public class Main {
    public static void main(String[] args){
        divisores();
    }
    
            private static void divisores() {
            int j, i, k, m, aux=0;
            int div[] = new int[10000];
            int vet[] = new int[10000];
            for(k=0; k<10000; k++){
            vet[k] = k+1;		
        }
	
        for(i=0; i<10000; i++){
            for(j=1; j<=vet[i]; j++){
                if(vet[i]%j == 0){
                    aux++;
                }
            }
            div[i] = aux;
            aux = 0;		
        }
	
        for(m=1; m<=10000; m++){
            if(div[m] == div[m+1]){
                System.out.printf("%d\n", vet[m]);
            }
        }
    }
}
