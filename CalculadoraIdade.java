import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class CalculadoraIdade {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Idade");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel txt1 = new JLabel("Ano Atual:");
        txt1.setBounds(10, 0, 100, 30);
        txt1.setFont(new Font("Arial", Font.BOLD, 16));

        // Obtém o ano atual
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear(); // Extrai o ano atual
        JLabel ano = new JLabel(String.valueOf(anoAtual)); // Exibe o ano atual como texto
        ano.setBounds(95, 0, 100, 30);
        ano.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel txt2 = new JLabel("Ano de Nascimento:");
        txt2.setBounds(10, 40, 170, 30);
        txt2.setFont(new Font("Arial", Font.BOLD, 16));

        // Cria um modelo para o spinner (caixa de entrada numérica) com o valor inicial igual ao ano atual
        SpinnerNumberModel modelo = new SpinnerNumberModel(anoAtual, 1900, anoAtual, 1);
        JSpinner spinner = new JSpinner(modelo); // Cria o JSpinner com o modelo
        spinner.setFont(new Font("Arial", Font.PLAIN, 18));
        spinner.setBounds(180, 40, 70, 30);

        // Adiciona um ícone ao botão
        ImageIcon icon = new ImageIcon("img\\image-removebg-preview.png");
        ImageIcon iconRedimensionado = new ImageIcon(icon.getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH)); // Redimensiona o ícone
        JButton calcIdade = new JButton("Calcular Idade", iconRedimensionado); // Cria o botão com o texto e ícone
        calcIdade.setBounds(25, 100, 200, 50); // Define a posição e tamanho do botão
        calcIdade.setFont(new Font("Arial", Font.BOLD, 16)); // Define a fonte e o estilo do botão
        calcIdade.setIconTextGap(-20); // Ajusta o espaçamento entre o texto e o ícone

        JLabel txt3 = new JLabel("No final desse ano, sua idade será");
        txt3.setBounds(10, 200, 260, 30);
        txt3.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel idade = new JLabel("0");
        idade.setBounds(290, 200, 260, 30);
        idade.setFont(new Font("Arial", Font.BOLD, 16));

        // Adiciona um evento de clique ao botão
        calcIdade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém o valor do ano de nascimento do spinner
                int anoNascimento = (int) spinner.getValue();
                // Calcula a idade subtraindo o ano de nascimento do ano atual
                int idadeCalculada = anoAtual - anoNascimento;
                // Atualiza o rótulo com a idade calculada
                idade.setText(String.valueOf(idadeCalculada));
            }
        });

        // Adiciona um ícone ao usuário na interface
        ImageIcon iconUser = new ImageIcon("img\\child_person_people_guy_1721.png");
        ImageIcon iconRedimensionadoUser = new ImageIcon(iconUser.getImage().getScaledInstance(400, 300, java.awt.Image.SCALE_SMOOTH)); // Redimensiona o ícone
        JLabel userIcon = new JLabel(iconRedimensionadoUser);
        userIcon.setBounds(270, 0, 400, 300);

        frame.add(txt1);
        frame.add(ano);
        frame.add(txt2);
        frame.add(spinner);
        frame.add(calcIdade);
        frame.add(txt3);
        frame.add(idade);
        frame.add(userIcon);
        
        frame.setVisible(true);
    }
}
