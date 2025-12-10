package com.alura.conversor;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu app = new Menu();
        app.menu();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);

        String mensajeMenu = """
                
                ======================================
                1) US Dolar => Peso argentino
                2) Peso argentino => US Dolar
                3) US Dolar => Real brasileño
                4) Real Brasilenño => US Dolar
                5) US Dolar => Peso colombiano
                6) Peso colombiano => US Dolar
                7) US Dolar => Euro
                8) Euro => US Dolar
                9) Peso argentino => Euro
                10) Euro => Peso argentino
                [Otro num] = salir
                ======================================
                Ingrese una opcion valida.
                """;

        Conversor con = null;
        int opc=0;

        System.out.print("\n\n       Conversor de Monedas");


        while(opc!=11){
            System.out.println(mensajeMenu);
            try {
                opc = input.nextInt();
                switch (opc) {
                    case 1:
                        con = new Conversor(opc, "USD", "ARS");
                        con.convertir();
                        break;
                    case 2:
                        con = new Conversor(opc, "ARS", "USD");
                        con.convertir();
                        break;
                    case 3:
                        con = new Conversor(opc, "USD", "BRL");
                        con.convertir();
                        break;
                    case 4:
                        con = new Conversor(opc, "BRL", "USD");
                        con.convertir();
                        break;
                    case 5:
                        con = new Conversor(opc, "USD", "COP");
                        con.convertir();
                        break;
                    case 6:
                        con = new Conversor(opc, "COP", "USD");
                        con.convertir();
                        break;
                    case 7:
                        con = new Conversor(opc, "USD", "EUR");
                        con.convertir();
                        break;
                    case 8:
                        con = new Conversor(opc, "EUR", "USD");
                        con.convertir();
                        break;
                    case 9:
                        con = new Conversor(opc, "ARS", "EUR");
                        con.convertir();
                        break;
                    case 10:
                        con = new Conversor(opc, "EUR", "ARS");
                        con.convertir();
                        break;
                    case 11:
                        break;
                    default:
                        System.out.println("ERROR: Ingrese un numero valido");
                        continue;
                }
            } catch(InputMismatchException e) {
                System.out.println("ERROR: No se permiten letras");
                input.next();
                continue;
            }
            catch (Exception e) {
                System.out.println("ERROR:");
            }
        }
        System.out.print("Cerrando programa...");
    }
}