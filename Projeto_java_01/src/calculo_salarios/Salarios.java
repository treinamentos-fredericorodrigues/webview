package calculo_salarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Salarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSalario;
	private JTextField txtPercentual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salarios frame = new Salarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Salarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SENAC - Treinamentos Profissionais\r\n");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 15, 424, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desenvolvimento de Sistemas - JAVA, MySQL, e Python");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(10, 41, 339, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Salário");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 87, 57, 12);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Percentual de Desconto");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 145, 150, 12);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("RESULTADOS\r\n");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 273, 434, 12);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblLiquido = new JLabel("");
		lblLiquido.setForeground(new Color(0, 0, 128));
		lblLiquido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLiquido.setBounds(10, 295, 434, 12);
		contentPane.add(lblLiquido);
		
		JLabel lblAnual = new JLabel("");
		lblAnual.setForeground(new Color(0, 0, 128));
		lblAnual.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnual.setBounds(10, 336, 434, 12);
		contentPane.add(lblAnual);
		
		JLabel lblDecimo = new JLabel("");
		lblDecimo.setForeground(new Color(0, 0, 128));
		lblDecimo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDecimo.setBounds(10, 379, 434, 12);
		contentPane.add(lblDecimo);
		
		JLabel lblFerias = new JLabel("");
		lblFerias.setForeground(new Color(0, 0, 128));
		lblFerias.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFerias.setBounds(10, 422, 434, 12);
		contentPane.add(lblFerias);
		
		txtSalario = new JTextField();
		txtSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSalario.setBounds(10, 109, 190, 26);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtPercentual = new JTextField();
		txtPercentual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPercentual.setColumns(10);
		txtPercentual.setBounds(10, 165, 126, 26);
		contentPane.add(txtPercentual);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double salario = Double.parseDouble(txtSalario.getText());
				double percentual = Double.parseDouble(txtPercentual.getText());
				
				double resultado = salario-(salario*(percentual/100));
				double anual = resultado * 12;
				double decimo = resultado;
				double ferias = (salario/3)+resultado;
				
				// formatação dos resultados
				DecimalFormat formato = new DecimalFormat("#,##0.00");
				
				String resultadoFormatado = formato.format(resultado);
				String anualFormatado = formato.format(anual);
				String decimoFormatado = formato.format(decimo);
				String feriasFormatado = formato.format(ferias);
				
				lblLiquido.setText("Valor Mensal: R$ "+ resultadoFormatado);
				lblAnual.setText("Valor Anual: R$ "+ anualFormatado);
				lblDecimo.setText("Valor 13º Salario: R$ "+ decimoFormatado);
				lblFerias.setText("Valor de Férias: R$ "+ feriasFormatado);
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBounds(154, 222, 150, 28);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1_2 = new JLabel("Prof. Frederico");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_1_2.setBounds(174, 445, 270, 12);
		contentPane.add(lblNewLabel_1_2);

	}
}
