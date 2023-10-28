package com.mycompany.laboratoriomunicipiosycarros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

    static ArrayList<Municipio> mun = new ArrayList<>();
    static ArrayList<Auto> aut = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            String opcionStr = JOptionPane.showInputDialog(
                    "Bienvenido a este maravilloso software de gestión de vehículos:\n"
                    + "1. Ingresar Municipio\n"
                    + "2. Ingresar Vehiculo\n"
                    + "3. Ver datos de Municipios\n"
                    + "4. Ver datos de Carros\n"
                    + "5. Buscar Municipio\n"
                    + "6. Buscar Auto\n"
                    + "7. Salir");
            opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    String nmb_mnc = JOptionPane.showInputDialog(null, "Ingrese el nombre del municipio");
                    String dep = JOptionPane.showInputDialog(null, "Ingrese el nombre del departamento");
                    Municipio municipio = new Municipio(nmb_mnc, dep);
                    mun.add(municipio);
                    DatosMunicipio controlador = new DatosMunicipio();
                    controlador.grabarMunicipio(municipio);
                    JOptionPane.showMessageDialog(null, "Municipio agregado: \n" + municipio);
                    break;
                case 2:
                    String año = JOptionPane.showInputDialog(null, "Ingrese el año del auto");
                    String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del auto");
                    String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del auto");
                    String referencia = JOptionPane.showInputDialog(null, "Ingrese la referencia del auto");

                    Auto auto = new Auto(año, placa, marca, referencia);
                    aut.add(auto);
                    DatosAuto controlador2 = new DatosAuto();
                    controlador2.grabarAuto(auto);
                    JOptionPane.showMessageDialog(null, "Auto agregado:\n" + auto);
                    break;
                case 3:
                    StringBuilder muniInfo = new StringBuilder("Datos de municipios:\n");
                    for (Municipio oMun : mun) {
                        muniInfo.append(oMun.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, muniInfo.toString());
                    break;
                case 4:
                    StringBuilder autoInfo = new StringBuilder("Datos de autos: \n");
                    for (Auto oAuto : aut) {
                        autoInfo.append(oAuto.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, autoInfo.toString());
                    break;
                case 5:
                    String atributoBusquedaMunicipio = JOptionPane.showInputDialog("Ingrese el atributo para buscar el Municipio:");
                    boolean encontradoMunicipio = false;
                    for (Municipio omunicipio : mun) {
                        if (omunicipio.getNmb_mnc().equalsIgnoreCase(atributoBusquedaMunicipio) || omunicipio.getDep().equalsIgnoreCase(atributoBusquedaMunicipio)) {
                            JOptionPane.showMessageDialog(null, "Municipio encontrado:\n" + omunicipio);
                            encontradoMunicipio = true;
                            break;
                        }
                    }
                    if (!encontradoMunicipio) {
                        JOptionPane.showMessageDialog(null, "Municipio no encontrado.");
                    }
                    break;
                case 6:
                    String atributoBusquedaAuto = JOptionPane.showInputDialog("Ingrese el atributo para buscar el Auto:");
                    boolean encontradoAuto = false;
                    for (Auto oauto : aut) {
                        if (oauto.getAño().equalsIgnoreCase(atributoBusquedaAuto)
                                || oauto.getPlaca().equalsIgnoreCase(atributoBusquedaAuto)
                                || oauto.getMarca().equalsIgnoreCase(atributoBusquedaAuto)
                                || oauto.getReferencia().equalsIgnoreCase(atributoBusquedaAuto)) {
                            JOptionPane.showMessageDialog(null, "Auto encontrado:\n" + oauto);
                            encontradoAuto = true;
                            break;
                        }
                    }
                    if (!encontradoAuto) {
                        JOptionPane.showMessageDialog(null, "Auto no encontrado.");
                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }

        } while (opcion != 7);
    }
}
