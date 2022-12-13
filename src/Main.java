import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num;

        num=Integer.parseInt(JOptionPane.showInputDialog("Teclee 1 o 2"));

        if (num==1){
            JOptionPane.showMessageDialog(null,"Eres una persona genial");
        }

        else if(num==2){
            JOptionPane.showMessageDialog(null,"Eres buena gente");
        }

        else{
            JOptionPane.showMessageDialog(null,"Eres mala persona por no hacer lo que he dicho");
        }

        // cambio de mi colaboracion a las 14:20

        if (num == 1) {
            System.out.println("Te quiero");
        }
        else {
            System.out.println("hueles mal");
        }
    }
}
