package com.mycompany.laboratoriomunicipiosycarros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DatosMunicipio {

    public DatosMunicipio() {
    }

    public int DeterminarLineas() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String sCadena;
        int NumeroLineas = 0;
        try {
            fileReader = new FileReader("Municipio.txt");
            bufferedReader = new BufferedReader(fileReader);
            while ((sCadena = bufferedReader.readLine()) != null) {
                NumeroLineas++;
            }
        } catch (Exception exception) {
            NumeroLineas = 0;
        }
        return NumeroLineas;
    }

    public void grabarMunicipio(Municipio pmunicipio) {
        FileWriter fileWriter;
        PrintWriter printWriter;
        try {
            fileWriter = new FileWriter("Municipio.txt", true);
            printWriter = new PrintWriter(fileWriter);

            printWriter.println(pmunicipio.getNmb_mnc());
            printWriter.println(pmunicipio.getDep());

            fileWriter.close();
        } catch (Exception exception) {
        }
    }

    public Municipio cargarMunicipio(int pNumeroMunicipio) {
        Municipio rmunicipio;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i;
        rmunicipio = new Municipio();
        try {
            fileReader = new FileReader("Municipio.txt");
            bufferedReader = new BufferedReader(fileReader);
            try {
                i = 1;
                while (i <= pNumeroMunicipio) {

                    rmunicipio.setNmb_mnc(bufferedReader.readLine());
                    rmunicipio.setDep(bufferedReader.readLine());

                    i++;
                }
            } catch (Exception exception) {
                rmunicipio = new Municipio();
            }
            bufferedReader.close();
        } catch (Exception exception) {
        }
        return rmunicipio;
    }

}
