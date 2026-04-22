
package projeto_estacaoclima;
 
import javax.swing.JOptionPane;
 
public class Main_EstacaoClima {
 
    public static void main(String[] args) {
        Clima cel = new Clima(0);
        double valorCel = cel.buscarCelcius(0);
        menu(valorCel);
 
    }
    public static void menu(double valorCel){
        Clima base = new Clima(valorCel);                
        do {
            int esc = Integer.parseInt(JOptionPane.showInputDialog(null,"(Temperatura em Celsius "+valorCel+"°C)\n\nEscolha a opção desejada:\n\n(1) Converter a temperatura para Fahrenheit.\n\n(2) Converter a temperatura para Kelvin.\n\n(3) Informar se o clima está quente, agradável ou frio.\n\n(4) Selecionar uma nova temperatura.\n\n(5) Sair do programa.\n___________________________________________","Mini Estação do Clima",JOptionPane.QUESTION_MESSAGE));

        switch (esc) {
            case 1:
                double fahrenheit = base.buscarFahrenheit(valorCel);
                JOptionPane.showMessageDialog(null,"Converção em Fahrenheit: "+fahrenheit+"ºF.","Celsius "+valorCel+"ºC para Fahrenheit",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                double kelvin = base.buscarKelvin(valorCel);
                JOptionPane.showMessageDialog(null,"Converção em Kelvin: "+kelvin+" K.","Celsius "+valorCel+"ºC para Kelvin",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                base.buscarClima(valorCel);
                break;
            case 4:
                valorCel = base.mudar(valorCel);
                continue;
            case 5:
                base.finaliza();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Número inexistente!\nEscolha um número do Menu!","Erro!",JOptionPane.ERROR_MESSAGE);
        }
        int volta = JOptionPane.showConfirmDialog(null,"Deseja acessar o Menu novamente?","Voltar?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(volta == JOptionPane.YES_OPTION){
            continue;
        }else if(volta == JOptionPane.NO_OPTION){
            base.finaliza();
        }
        } while (true);
 
        
    }
}