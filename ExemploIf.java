import javax.swing.JOptionPane;

public class ExemploIf{
    static public void main(String [] args){
        //declaração de variáveis
        //entrada
        double nota = Double.parseDouble
        (JOptionPane.showInputDialog(null,"Digite a nota"));

        //processamento
        //saida
        if(nota >= 70)
            JOptionPane.showMessageDialog(null,"Aprovado");
    }
}