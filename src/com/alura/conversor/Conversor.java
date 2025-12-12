    package com.alura.conversor;

    import java.util.InputMismatchException;
    import java.util.Scanner;
    import java.text.DecimalFormat;

    public class Conversor {

        private String moneda;
        private String moneda2;
        private int codigo;
        //static para garantizar que db no sea sobreescrito, aun al crear multiples objetos db o reinicializar db.
        private static DataBase db = new DataBase();

        public Conversor(int codigo, String moneda, String moneda2){
            this.moneda = moneda;
            this.moneda2 = moneda2;
            this.codigo = codigo;
        }

        private void mostrarValor(float val){
            DecimalFormat valueFormat = new DecimalFormat("0.00000000");
            System.out.println("1"+this.moneda+" = "+valueFormat.format(val)+this.moneda2);
        }

        public void convertir() {
            Scanner input = new Scanner(System.in);
            float val = db.consultarValor(this.codigo, this.moneda, this.moneda2);

            mostrarValor(val);

            int cantidad;
            do {
                cantidad = -1;
                try{
                    System.out.println("Ingrese cantidad deseada a convertir: ");
                    cantidad = input.nextInt();
                    if(cantidad<0){
                        System.out.println("ERROR: Ingrese una cantidad positiva");
                    }
                }catch (InputMismatchException e){
                    input.next();
                    System.out.println("ERROR: Ingrese un numero");
                    continue;
                }

            }while(cantidad<0);
            DecimalFormat moneyFormat = new DecimalFormat("0.00");
            System.out.println(cantidad+" "+this.moneda+" = "+moneyFormat.format(cantidad*val)+" "+this.moneda2);
        }
    }
