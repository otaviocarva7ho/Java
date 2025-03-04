import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        // Obtém o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Pega a largura e a altura
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        // Exibe a resolução da tela
        System.out.println("Resolução da tela: " + width + "x" + height);
    }
}
