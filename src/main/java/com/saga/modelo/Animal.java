package com.saga.modelo;

public class Animal {
    private String id;
    private String raza;
    private String sexo;
    private double peso;

    public Animal(String id, String raza, String sexo, double peso) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("ID inválido");
        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"))
            throw new IllegalArgumentException("Sexo debe ser 'M' o 'F'");
        if (peso <= 0) throw new IllegalArgumentException("Peso debe ser mayor a 0");

        this.id = id;
        this.raza = raza;
        this.sexo = sexo.toUpperCase();
        this.peso = peso;
    }

    public String getId() { return id; }
    public String getRaza() { return raza; }
    public String getSexo() { return sexo; }
    public double getPeso() { return peso; }

    public void setPeso(double peso) {
        if (peso <= 0) throw new IllegalArgumentException("Peso inválido");
        this.peso = peso;
    }
}
