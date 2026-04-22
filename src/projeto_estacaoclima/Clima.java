
package projeto_estacaoclima;
 
import javax.swing.JOptionPane;
 
public class Clima {
    private double Celcius;
 
    public Clima(double Celcius00) {
        this.Celcius = Celcius00;
    }
 
    public double getCelcius() {
        return Celcius;
    }
 
    public void setCelcius(double Celcius) {
        this.Celcius = Celcius;
    }
    
    public static double buscarCelcius(double cel00){
        return Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a temperatura em Graus Celsius ?","Mini Estação do Clima",JOptionPane.QUESTION_MESSAGE));  
    }
    
    public static double buscarFahrenheit(double cel00){
        double fahr = (cel00* 1.8)+32;
        return fahr;
    }
    
    public static double buscarKelvin(double cel00){
        double kelv = cel00 + 273.15;
        return kelv;
    }
    
    public static void buscarClima(double cel00){
        if (cel00<=15){
            JOptionPane.showMessageDialog(null,"O clima está Frio!","Celsius "+cel00+"ºC",JOptionPane.INFORMATION_MESSAGE);
        } else if (cel00 >= 16 && cel00 <=25) {
            JOptionPane.showMessageDialog(null,"O clima está Agradável!","Celsius "+cel00+"ºC",JOptionPane.INFORMATION_MESSAGE);
        } else if (cel00 >=26) {
            JOptionPane.showMessageDialog(null,"O clima está Quente!","Celsius "+cel00+"ºC",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void finaliza(){
        JOptionPane.showMessageDialog(null,"Programa finalizado.","Encerrando",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}