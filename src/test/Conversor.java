package test;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import logica.Metodos;

public class Conversor {

    public static void main(String[] args) {

        Metodos opciones = new Metodos();
        DecimalFormat df = new DecimalFormat("#.00");

        String opcion1 = "Conversor de Monedas";
        String opcion2 = "Conversor de Temperatura";
        String opcionMenu;
        boolean aux = false;

        do {
            opcionMenu = opciones.menu();

            if (opcionMenu == opcion1) {

                String OpcionMoneda = opciones.MenuConversion();

                double valorInicial;
                valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que desea convertir"));

                double valorFinal = opciones.conversion(OpcionMoneda, valorInicial);

                String valorF = df.format(valorFinal);

                JOptionPane.showMessageDialog(null, "Conversion: $" + valorF);
                
                aux = opciones.repetir();
            }

        }while(aux);

    }
}
