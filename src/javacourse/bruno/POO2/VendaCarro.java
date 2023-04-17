/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacourse.bruno.POO2;

/**
 *
 * @author katerinelindawitkoski
 */
public class VendaCarro {

    private double preco = 0;
    private String modelo ="";
    private String cor ="";
    private int ano = 0;
    private int km = 0;

    public VendaCarro(){
    }

    // método construtor
    public void setCor(String cor){ // argumento cor
        this.cor = cor; // cor = referenciando a declaração cor anterior
    }

    public String getCor(){
        return this.cor;
    }

    private boolean testaModelo(String modelo){
        if (modelo.equalsIgnoreCase("A") ||
                modelo.equalsIgnoreCase("B") ||
                modelo.equalsIgnoreCase("C")){
            return true;
        } else {
            return false;
        }
    }

    public boolean setModelo(String modelo){
        if(testaModelo(modelo)){
            this.modelo = modelo;
            return true;
        } else {
            return false;
        }
    }// 'set' e 'get' são publicos

    public String getModelo(){
        return modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setKm(int km){
        this.km = km;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    public int getAno(){
        return ano;
    }
    public int getkm(){
        return km;
    }

    public void imprime(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Km: " + this.km);
        System.out.println("Preço: " + this.preco);
    }
    }