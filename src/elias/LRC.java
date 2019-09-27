
package Elias;
import java.io.*;
class crc_gen
{
    
    public static void main(String args[]) throws IOException
    {
        int contadorOne = 0;
        String palabra = "";
        //j las columnas...... i las filas
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int segmentos [][], data_bits;
        int aux [] = new int[7];
        int cod [] = new int[7];
        
        System.out.print("Introduce el numero de segmentos a enviar ==>> ");
        data_bits=Integer.parseInt(br.readLine());
        segmentos = new int [data_bits][8];
        
        System.out.println("--- Introduza los bits ---");
        for(int i = 0; i < data_bits; i++){
            System.out.println("<< SEGMENTO DE DATOS " + (i+1) + " >>");
            for (int j = 0; j < 8; j++) {
                segmentos[i][j] = Integer.parseInt(br.readLine());
            }
            System.out.println("-----------------------");
        }
        
        //Imprimir matriz
        for (int i = 0; i < data_bits; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(segmentos[i][j] + " ");
            }
            System.out.println("");
        }
        
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < data_bits; j++) {
                if(segmentos[j][i] == 1){
                    contadorOne++;
                }
                
            }            
                if(contadorOne%2 == 0){
                    palabra += "0";
                }
                if (contadorOne%2 != 0){
                    palabra += "1";
                }
            contadorOne = 0;
        }
        System.out.println("Codigo LRC ==> [" + palabra + "]");
    }
}