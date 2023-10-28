package com.mycompany.laboratoriomunicipiosycarros;

public class Municipio {

    private int idmnc;
    private String nmb_mnc, dep;
    private static int municipiocontador = 1;

    public Municipio() {
    }

    public Municipio(String nmb_mnc, String dep) {
        this.idmnc = municipiocontador++;
        this.nmb_mnc = nmb_mnc;
        this.dep = dep;
    }

    public int getIdmnc() {
        return idmnc;
    }

    public String getNmb_mnc() {
        return nmb_mnc;
    }

    public void setNmb_mnc(String nmb_mnc) {
        this.nmb_mnc = nmb_mnc;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Municipio{" + "id=" + idmnc + ", nombre=" + nmb_mnc + ", departamento=" + dep + '}';
    }

}
