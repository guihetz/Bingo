/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guilherme.model;

import java.util.List;

/**
 *
 * @author Guilherme Lourenço
 */
public class Cartela {
    public static int instancia;
    private final int numCartela;
    private int pontos;
    private boolean venceu;
    private final List<Integer> numerosContidosNaCartela;
    
    public Cartela(List<Integer> nums){
        this.numerosContidosNaCartela = nums;
        instancia++;
        this.numCartela = instancia;
        this.pontos = 0;
        this.venceu = false;
    }
    
    public List<Integer> getValores(){
        return this.numerosContidosNaCartela;
    }
    
    public int getNumCartela(){
        return this.numCartela;
    }
    
    public int getPontos(){
        return this.pontos;
    }
    
    public void addPonto(){
        this.pontos++;
    }
    
    public boolean getVenceu(){
        return this.venceu;
    }
    
    public void setVenceu(boolean v){
        this.venceu = v;
    }
    @Override
    public String toString(){
        return "Cartela " + this.getNumCartela();
    }
}
