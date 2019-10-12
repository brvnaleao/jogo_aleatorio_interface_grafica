import javax.swing.JOptionPane;
import java.util.Random;

public class JogoNumeroAleatorio{
    public static void main (String [] args){
        Random aleat = new Random();
        int numeroAleat = aleat.nextInt(100 + 1); //vai ate 100

        boolean acertoOuErro = false;
        String respostaUsuarioString;
        int numeroUsuario;
        int numeroTentativas = 0; 

        while(!acertoOuErro){
            numeroTentativas++;
            respostaUsuarioString = JOptionPane.showInputDialog("Adivinhe o número: ");
            numeroUsuario = Integer.parseInt(respostaUsuarioString);
            if(numeroUsuario > numeroAleat){
                JOptionPane.showMessageDialog(null, numeroUsuario + " é muito alto, tente novamente");
                
            }else if (numeroUsuario < numeroAleat){
                JOptionPane.showMessageDialog(null, numeroUsuario + " é muito baixo, tente novamente");
                
            }else{
                JOptionPane.showMessageDialog(null, "acertou, mizeravi\nNúmero de tentivas: " + numeroTentativas);
                acertoOuErro = true;
            }
        }
        System.exit(0);
    }

}
