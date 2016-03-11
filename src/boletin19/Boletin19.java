/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        buzon buzon1 = new buzon();
        int opcion;
        int seguir;
        do {
            System.out.println("Elige que deseas hacer \n   Opcion1: Agregar nuevo correo\n   Opcion2: Ver número de correos\n  "
                    + " Opcion3:Ver cuantos quedan por leer\n   Opcion4:Leer el primero no leído\n  "
                    + " Opcion 5:Leer uno en concreto\n1   Opcion6:Borrar un correo");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Scanner contidoTecl = new Scanner(System.in);
                    System.out.println("Añade el contenido del correo");
                    String contido = contidoTecl.nextLine();
                    buzon1.engade(new correo(contido, false));
                    break;
                case 2:
                    System.out.println("El numero de correos totales es "+buzon1.numeroDeCorreos());
                    break;
                case 3:
                    buzon1.porLer();
                    break;
                case 4:
                    System.out.println(buzon1.amosaPrimerNoLeido());
                    break;
                    
                case 5:
                    Scanner eligeTecl = new Scanner(System.in);
                    System.out.println("Que correo deseas leer");
                    int numCorreo = eligeTecl.nextInt();
                    System.out.println(buzon1.amosa(numCorreo-1));
                    break;
                case 6:
                    Scanner borrarTecl = new Scanner(System.in);
                    System.out.println("Que correo deseas borrar");
                    int numCorreoB = borrarTecl.nextInt();
                        try{
                            buzon1.elimina(numCorreoB-1);
                        }catch(Exception error2){
                            System.out.println("El correo que intentas borrar no existe");
                        }
                   break;

            }
            Scanner seguirTecl = new Scanner (System.in);
            System.out.println ("¿Deseas continuar? si deseas continuar presiona 1, sino cualquier otra tecla para salir");
            seguir = seguirTecl.nextInt();
        }while(seguir == 1);
    
    
        }
    
    }

