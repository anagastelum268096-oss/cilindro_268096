/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import bolsa_268096.excepciones.BolsaException;
import java.util.Arrays;
import java.util.Random;

/**
 * Implementación del TDA Bolsa con enteros.
 */
public class Bolsa {
    private Integer[] elementos;
    private int numObjetos;

    public Bolsa(int tamBolsa) {
        if (tamBolsa < 0) {
            throw new BolsaException("Tamaño de la bolsa no puede ser negativo");
        }
        elementos = new Integer[tamBolsa];
        numObjetos = 0;
    }

    public int obtenNumObjetos() { return numObjetos; }
    public boolean vacia() { return numObjetos == 0; }

    public void agrega(Integer obj) {
        if (numObjetos == elementos.length) {
            throw new BolsaException("Bolsa llena");
        }
        elementos[numObjetos++] = obj;
    }

    public Integer remueve() {
        if (vacia()) throw new BolsaException("Bolsa vacía");
        Random rand = new Random();
        int idx = rand.nextInt(numObjetos);
        Integer eliminado = elementos[idx];
        for (int i = idx; i < numObjetos - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--numObjetos] = null;
        return eliminado;
    }

    public Integer remueve(Integer obj) {
        if (vacia()) throw new BolsaException("Bolsa vacía");
        for (int i = 0; i < numObjetos; i++) {
            if (elementos[i].equals(obj)) {
                Integer eliminado = elementos[i];
                for (int j = i; j < numObjetos - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                elementos[--numObjetos] = null;
                return eliminado;
            }
        }
        return null;
    }

    public void limpia() {
        Arrays.fill(elementos, 0, numObjetos, null);
        numObjetos = 0;
    }

    public int cuenta(Integer obj) {
        int c = 0;
        for (int i = 0; i < numObjetos; i++) {
            if (elementos[i].equals(obj)) c++;
        }
        return c;
    }

    public boolean contiene(Integer obj) {
        for (int i = 0; i < numObjetos; i++) {
            if (elementos[i].equals(obj)) return true;
        }
        return false;
    }

    public Integer[] obtenObjetos() {
        return Arrays.copyOf(elementos, numObjetos);
    }

    @Override
    public String toString() {
        return Arrays.toString(obtenObjetos());
    }
}

