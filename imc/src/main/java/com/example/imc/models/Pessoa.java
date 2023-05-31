package com.example.imc.models;

public class Pessoa {

    public Pessoa(){
        super();
    }

    public Pessoa(double altura , double peso){
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(double altura , double peso , double imc , String descricao){
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.descricao = descricao;
    }

    private double altura;
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    private double peso;
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double imc;
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    private String descricao;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void calcularImc(){
        double imc = this.getPeso() / Math.pow(this.getAltura(), 2);
        this.setImc(imc);
        var descricao = "Obesidade";
        if (imc < 18.5) descricao = "Magreza";
        else if (imc < 24.9) descricao = "Normal";
        else if (imc < 30) descricao = "Normal";

        this.setDescricao(descricao);

    }
    
}
