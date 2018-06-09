import java.util.Scanner;
import javax.swing.*;

public class main {
    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);
       // System.out.println("Digite um numero");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        JOptionPane.showMessageDialog(null, romanoswitch(numero));
        /*
        int numero = entrada.nextInt();

        System.out.println("O numero digitado em romano é: " + romanoswitch(numero));
        */
    }
    

    public static String romanoswitch(int numero){

        switch(numero){
            case 10: return "X";
            case 9: return "IX";
            case 8: return "VIII";
            case 7: return "VII";
            case 6: return "VI";
            case 5: return "V";
            case 4: return "IV";
            case 3: return "III";
            case 2: return "II";
            case 1: return "I";
            default: return "Inválido";
        }
    }
}