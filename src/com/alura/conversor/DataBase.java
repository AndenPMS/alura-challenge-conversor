package com.alura.conversor;

import java.util.HashMap;

public class DataBase {

    private HashMap<Integer, Float> valores = new HashMap<>();

    public float consultarValor(int codigo, String moneda, String moneda2){

        //En caso de no encontrarse, se procede a obtenerlo y guardarlo antes de retornarlo
        if(!valores.containsKey(codigo)){
            guardarValor(codigo, moneda, moneda2);
            System.out.println("(Fuente: API fetch)");
        }else{
            System.out.println("(Fuente: Base de Datos)");
        }
        return retornarValor(codigo);
    }

    private void guardarValor(int codigo, String moneda, String moneda2){
        Api api = new Api();
        //pide datos de API
        float val = api.fetchApi(moneda, moneda2);

        //guarda datos en HashMap
        valores.put(codigo, val);
    }

    private float retornarValor(int codigo){
        return valores.get(codigo);
    }
}
