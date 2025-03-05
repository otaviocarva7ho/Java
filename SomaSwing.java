import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SomaSwing {
    public static void main(String[] args) {
        // Criando a janela (JFrame)
        JFrame frame = new JFrame("Soma");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Layout absoluto (posicionamento manual dos componentes)

        JLabel l1 = new JLabel("Digite um Número:");
        l1.setBounds(20, 120, 150, 20);

        JTextField n1 = new JTextField();
        n1.setBounds(35, 145, 70, 20);

        JLabel sinal = new JLabel("+");
        sinal.setBounds(130, 140, 50, 30);
        sinal.setFont(new Font("Arial", Font.BOLD, 24)); // Definindo o tamanho e estilo da fonte

        JLabel l2 = new JLabel("Digite outro Número:");
        l2.setBounds(150, 120, 150, 20);

        JTextField n2 = new JTextField();
        n2.setBounds(170, 145, 70, 20);

        JButton soma = new JButton("Somar");
        soma.setBounds(275, 145, 75, 20);

        JLabel resultado = new JLabel("Resultado");
        resultado.setBounds(370, 145, 100, 20);
        resultado.setFont(new Font("Arial", Font.BOLD, 16));

        // Adicionando ação ao botão de soma
        soma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Pegando os números digitados e convertendo para inteiros
                    int num1 = Integer.parseInt(n1.getText());
                    int num2 = Integer.parseInt(n2.getText());
                    int soma = num1 + num2; // Calculando a soma

                    // Atualizando o rótulo do resultado com a soma
                    resultado.setText(String.valueOf(soma));
                } catch (NumberFormatException ex) {
                    // Caso o usuário digite algo inválido, exibir "Erro!"
                    resultado.setText("Erro!");
                }
            }
        });

        frame.add(l1);
        frame.add(n1);
        frame.add(sinal);
        frame.add(l2);
        frame.add(n2);
        frame.add(soma);
        frame.add(resultado);

        frame.setVisible(true);
    }
}
