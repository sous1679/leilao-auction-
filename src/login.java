import java.awt.event.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import net.miginfocom.swing.MigLayout;
import java.awt.SystemColor;
import java.awt.Font;

public class Interface {
	private JFrame janela;
	private JPanel painel;
	private JButton botaoLimpa;
	private JTextField campoTexto;
	private JPasswordField senha;
	private JLabel login, pass;
	private Checkbox checkbox;
	private JLabel label;
	private JButton btnEsqueciMinhaSenha;

	public Interface() {
		janela = new JFrame("Vidente");
		janela.setBackground(Color.WHITE);
		janela.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
		janela.setTitle("Login");
		janela.setSize(409, 214);
		janela.setResizable(false);
		painel = new JPanel();
		painel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		janela.getContentPane().add(painel, BorderLayout.SOUTH);
		painel.setLayout(new MigLayout("", "[][][166px][][][57px]", "[14px][20px][14px][20px][23px][]"));
		login = new JLabel("Usuário: ");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		painel.add(login, "cell 2 0,alignx left,aligny center");
		campoTexto = new JTextField(20);
		campoTexto.setHorizontalAlignment(SwingConstants.LEFT);
		painel.add(campoTexto, "cell 2 1,alignx left,aligny center");
		pass = new JLabel("Senha: ");
		pass.setHorizontalAlignment(SwingConstants.LEFT);
		painel.add(pass, "cell 2 2,alignx left,aligny center");
		senha = new JPasswordField(20);
		senha.setHorizontalAlignment(SwingConstants.LEFT);
		painel.add(senha, "cell 2 3,alignx left,growy");
		
		label = new JLabel("                         ");
		painel.add(label, "cell 0 4");
		
		checkbox = new Checkbox("Lembrar login");
		painel.add(checkbox, "cell 2 4,alignx left,aligny center");
		
		btnEsqueciMinhaSenha = new JButton("Esqueci minha senha !");
		btnEsqueciMinhaSenha.setFont(new Font("Tahoma", Font.ITALIC, 9));
		btnEsqueciMinhaSenha.setBackground(SystemColor.menu);
		btnEsqueciMinhaSenha.setForeground(UIManager.getColor("Button.foreground"));
		painel.add(btnEsqueciMinhaSenha, "cell 2 5");
		botaoLimpa = new JButton("Login");
		botaoLimpa.setHorizontalAlignment(SwingConstants.LEFT);
		botaoLimpa.setVerticalAlignment(SwingConstants.BOTTOM);
		painel.add(botaoLimpa, "cell 3 5,alignx left,aligny top");
		botaoLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoTexto.setText("");
				senha.setText("");
				JOptionPane.showMessageDialog(janela,"Login Efetuado ! ");
				
			}
		});
		
		janela.setVisible(true);
	
	}
	public static void main(String[] args) {
		new Interface();
	}
}