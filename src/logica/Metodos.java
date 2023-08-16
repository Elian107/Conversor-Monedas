package logica;

import javax.swing.JOptionPane;

public class Metodos {

    public String menu(){                                                       // Creacion de menu

        String[] opcionesMenu = {"Conversor de Monedas", "Conversor de Temperatura"};

        // Mostrar el cuadro de diálogo con la lista desplegable y obtener la opción seleccionada
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null, // Componente padre (null para centro de la pantalla)
                "Selecciona una opción:", // Mensaje
                "Menu", // Título de la ventana
                JOptionPane.PLAIN_MESSAGE, // Tipo de mensaje (sin icono especial)
                null, // Icono personalizado (null para ninguno)
                opcionesMenu, // Opciones
                opcionesMenu[0] // Opción seleccionada por defecto
        );
        
        return opcionSeleccionada;
    }
    
    public String MenuConversion(){                                             // Creaccion de menu de conversiones
        
        String pesoDolar = "De Pesos a Dolár";
        String pesoEuro = "De Pesos a Euros";
        String pesoLibra = "De Pesos a Libras Esterlinas";
        String pesoYen = "De Pesos a Yen Japonés";
        String pesoWon = "De Pesos a Won Sus-Coreano";
        String dolarPeso = "De Dolár a Pesos";
        String euroPeso = "De Euro a Pesos";
        String libraPeso = "De Libra Esterlinas a Pesos";
        String yenPeso = "De Yen Japones a Pesos";
        String wonPeso = "De Won Sur-Coreano a Pesos";
        
        String[] opcionesConversion = {pesoDolar, pesoEuro,
            pesoLibra, pesoYen, pesoWon, dolarPeso, euroPeso,
            libraPeso, yenPeso, wonPeso};
        
        String opcionMoneda = (String) JOptionPane.showInputDialog(
                null, // Componente padre (null para centro de la pantalla)
                "Selecciona una opción:", // Mensaje
                "Menu de cambio", // Título de la ventana
                JOptionPane.PLAIN_MESSAGE, // Tipo de mensaje (sin icono especial)
                null, // Icono personalizado (null para ninguno)
                opcionesConversion, // Opciones
                opcionesConversion[0] // Opción seleccionada por defecto
        );
        
        return opcionMoneda;
    }
    
    public double conversion(String monedaConversion, double valorInicial){     //Conversiones
        
        double valorFinal = 0;
        
        double dolar = 4040;
        double euro = 4408.79;
        double libraE = 5126.21;
        double yenJPN = 27.76;  
        double wonCS = 3.02;
        
        String pesoDolar = "De Pesos a Dolár";
        String pesoEuro = "De Pesos a Euros";
        String pesoLibra = "De Pesos a Libras Esterlinas";
        String pesoYen = "De Pesos a Yen Japonés";
        String pesoWon = "De Pesos a Won Sus-Coreano";
        String dolarPeso = "De Dolár a Pesos";
        String euroPeso = "De Euro a Pesos";
        String libraPeso = "De Libra Esterlinas a Pesos";
        String yenPeso = "De Yen Japones a Pesos";
        String wonPeso = "De Won Sur-Coreano a Pesos";
        
        if(monedaConversion == pesoDolar){
            
            valorFinal = valorInicial / dolar;
        }
        
        else if(monedaConversion == pesoEuro){
            
            valorFinal = valorInicial / euro;
        }
        
        else if(monedaConversion == pesoLibra){
            
            valorFinal = valorInicial / libraE;
        }
        
        else if(monedaConversion == pesoYen){
            
            valorFinal = valorInicial / yenJPN;
        }
        
        else if(monedaConversion == pesoWon){
            
            valorFinal = valorInicial / wonCS;
        }
        
        else if(monedaConversion == dolarPeso){
            
            valorFinal = valorInicial * dolar;
        }
        
        else if(monedaConversion == euroPeso){
            
            valorFinal = valorInicial * euro;
        }
        
        else if(monedaConversion == libraPeso){
            
            valorFinal = valorInicial * libraE;
        }
        
        else if(monedaConversion == yenPeso){
            
            valorFinal = valorInicial * yenJPN;
        }
        
        else if(monedaConversion == wonPeso){
            
            valorFinal = valorInicial * wonCS;
        }
        
        return valorFinal;
    }
    
    public boolean repetir(){
        
        String[] opciones = {"SI", "No"};
        boolean aux = false;
        String seleccionOpcion = (String) JOptionPane.showInputDialog(
            null,
            "Desea Continuar?: ",
            "Seleccione una opción",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        
        if(seleccionOpcion == "SI"){
            aux = true;
        }
        else if(seleccionOpcion == "NO"){
            aux = false;
        }
        
        return aux;
    }
}


