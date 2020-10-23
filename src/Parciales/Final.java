/*
 * FInal Logica de Programación (Santiago Mosquera)
 */
package Parciales;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Final {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu=0;
        
        do{
            System.out.println(" ");
            System.out.println("Bienvenido ingrese el procedimiento que desea");
            System.out.println("1. Sumatoria");
            System.out.println("2. Promedio n datos");
            System.out.println("3. Factorial");
            System.out.println("4. Raiz n-esima");
            System.out.println("5. Salir");
            
            menu = sc.nextInt();
            
            if(menu==1){
            int num,sum=0;
                    System.out.println("Ingrese el número entero");
                    num=sc.nextInt();
                    int cont = num;
                    while(cont!=0){
                        sum=sum+cont;
                        cont--;
                    }
                    System.out.println("Sumatorio de "+num+" es " + sum);
            }else if(menu==2){
                int n=0;
                double promf=0,sumn=0;
                
                System.out.println("Ingrese el promedio: ");
                n = sc.nextInt();
                
                double numeros [] = new double [n];
                for(int i = 0; i < numeros.length;i++){
                    System.out.println("Ingrese el numero");
                    numeros[i]=sc.nextDouble();
                }
                for(int i=0;i<numeros.length;i++){
                    sumn=sumn+numeros[i];
                    promf=sumn/n;
            }
                System.out.println("Promedio final: " + promf);
                
            }else if (menu==3){
                int num=0, fact=1;
                System.out.println("Ingrese el número deseado");
                num=sc.nextInt();
                
                while(num!=0){
                    fact=fact*num;
                    num--;
                }
                System.out.println("El factorial es: " + fact);
                
            }else if(menu==4){
                double n=0, radi=0, tot=0;
                
                System.out.println("Ingrese el número");
                radi = sc.nextDouble();
                System.out.println("Ingrese la raíz n-esima");
                n=sc.nextDouble();
                
                tot= Math.pow(radi,1/n);
                
                System.out.println("La raíz " + n + " de " + radi + " es: " + tot);
            }else if(menu==5){
                System.out.println("Hasta pronto");
            }else{
                System.out.println("Numero invalido");
            }
            
        }while(menu!=5);
        
    }

        
    }
   
