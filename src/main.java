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

    public static String romanoif (int numero){
        String romano = null;

        if(numero == 10){
            romano = "X";
        }else if (numero == 9){
            romano = "IX";
        }else if (numero == 8){
            romano = "VIII";
        }else if (numero == 7){
            romano = "VII";
        }else if (numero == 6){
            romano = "VI";
        }else if (numero == 5){
            romano = "V";
        }else if (numero == 4){
            romano = "IV";
        }else if (numero == 3){
            romano = "III";
        }else if (numero == 2){
            romano = "II";
        }else if (numero == 1){
            romano = "I";
        }else{
            romano = "Inválido";
        }
        return romano;
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