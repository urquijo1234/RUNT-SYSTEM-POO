package com.mycompany.laboratoriomunicipiosycarros;

public class Auto {

    private int idauto;
    private String año, placa, marca, referencia;
    private static int autocontador = 1;

    public Auto() {
    }

    public Auto(String año, String placa, String marca, String referencia) {
        this.idauto = autocontador++;
        this.año = año;
        this.placa = placa;
        this.marca = marca;
        this.referencia = referencia;
    }

    public int getIdauto() {
        return idauto;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Auto{" + "idauto=" + idauto + ", año" + año + ", placa=" + placa + ", marca=" + marca + ", referencia=" + referencia + '}';
    }

}
