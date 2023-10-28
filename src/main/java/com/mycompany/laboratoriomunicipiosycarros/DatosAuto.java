package com.mycompany.laboratoriomunicipiosycarros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DatosAuto {

    public DatosAuto() {
    }

    public int DeterminarLineas() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String sCadena;
        int NumeroLineas = 0;
        try {
            fileReader = new FileReader("Auto.txt");
            bufferedReader = new BufferedReader(fileReader);
            while ((sCadena = bufferedReader.readLine()) != null) {
                NumeroLineas++;
            }
        } catch (Exception exception) {
            NumeroLineas = 0;
        }
        return NumeroLineas;
    }

    public void grabarAuto(Auto pauto) {
        FileWriter fileWriter;
        PrintWriter printWriter;
        try {
            fileWriter = new FileWriter("Auto.txt", true);
            printWriter = new PrintWriter(fileWriter);

            printWriter.println(pauto.getAño());
            printWriter.println(pauto.getPlaca());
            printWriter.println(pauto.getMarca());
            printWriter.println(pauto.getReferencia());

            fileWriter.close();
        } catch (Exception exception) {
        }
    }

    public Auto cargarAuto(int pNumeroAuto) {
        Auto rauto;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i;
        rauto = new Auto();
        try {
            fileReader = new FileReader("Auto.txt");
            bufferedReader = new BufferedReader(fileReader);
            try {
                i = 1;
                while (i <= pNumeroAuto) {
                    rauto.setAño(bufferedReader.readLine());
                    rauto.setPlaca(bufferedReader.readLine());
                    rauto.setMarca(bufferedReader.readLine());
                    rauto.setReferencia(bufferedReader.readLine());
                    i++;
                }
            } catch (Exception exception) {
                rauto = new Auto();
            }
            bufferedReader.close();
        } catch (Exception exception) {
        }
        return rauto;
    }
}
