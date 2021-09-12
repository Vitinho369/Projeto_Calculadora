import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.awt.SystemColor;

public class TelaCalc extends JFrame {


		private JPanel contentPane;
	    private String texto = "";
	    private float num;
	    private String numero = "";
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TelaCalc frame = new TelaCalc();
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
		public TelaCalc() {
			setBackground(Color.CYAN);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 366, 482);
			contentPane = new JPanel();
			contentPane.setBackground(Color.BLUE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel txtnum = new JLabel("0");
			txtnum.setHorizontalAlignment(SwingConstants.TRAILING);
			txtnum.setFont(new Font("Arial", Font.PLAIN, 50));
			txtnum.setForeground(Color.BLACK);
			txtnum.setBackground(Color.WHITE);
			txtnum.setBounds(20, 84, 309, 56);
			contentPane.add(txtnum);
			
			JButton btn0 = new JButton("0");
			btn0.setBackground(SystemColor.activeCaption);
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto += "0";
					numero += "0";
				   txtnum.setText(texto);;
				}
			});
			
			btn0.setBounds(20, 159, 78, 71);
			contentPane.add(btn0);
			
			JButton btn1 = new JButton("1");
			btn1.setBackground(SystemColor.activeCaption);
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto += "1";
					numero += "1";
					txtnum.setText(texto);
				}
			});
			btn1.setBounds(97, 159, 78, 71);
			contentPane.add(btn1);
			
			JButton btn2 = new JButton("2");
			btn2.setBackground(SystemColor.activeCaption);
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto += "2";
					numero += "2";
					txtnum.setText(texto);
				}
			});
			btn2.setBounds(174, 159, 78, 71);
			contentPane.add(btn2);
			
			JButton btn3 = new JButton("3");
			btn3.setBackground(SystemColor.activeCaption);
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto += "3";
					numero += "3";
					txtnum.setText(texto);
				}
			});
			btn3.setBounds(20, 229, 78, 71);
			contentPane.add(btn3);
			
			JButton btn4 = new JButton("4");
			btn4.setBackground(SystemColor.activeCaption);
			btn4.addActionListener(new  ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto += "4";
					numero += "4";
					txtnum.setText(texto);
				}
			});
			btn4.setBounds(97, 229, 78, 71);
			contentPane.add(btn4);
			
			JButton btn5 = new JButton("5");
			btn5.setBackground(SystemColor.activeCaption);
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto += "5";
					numero += "5";
					txtnum.setText(texto);
				}
			});
			btn5.setBounds(174, 229, 78, 71);
			contentPane.add(btn5);
			
			JButton btn6 = new JButton("6");
			btn6.setBackground(SystemColor.activeCaption);
			btn6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evento) {
					texto += "6";
					numero += "6";
					txtnum.setText(texto);
				}
			});
			btn6.setBounds(20, 300, 78, 71);
			contentPane.add(btn6);
			
			JButton btn7 = new JButton("7");
			btn7.setBackground(SystemColor.activeCaption);
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto += "7";
					numero += "7";
					txtnum.setText(texto);
				}
			});
			btn7.setBounds(97, 300, 78, 71);
			contentPane.add(btn7);
			
			JButton btn8 = new JButton("8");
			btn8.setBackground(SystemColor.activeCaption);
			btn8.setBounds(174, 300, 78, 71);
			contentPane.add(btn8);
			
			JButton btn9 = new JButton("9");
			btn9.setBackground(SystemColor.activeCaption);
			btn9.setBounds(251, 159, 78, 71);
			contentPane.add(btn9);
			
			JButton btnMais = new JButton("+");
			btnMais.setBackground(SystemColor.activeCaption);
			btnMais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					try {
					num = Float.parseFloat(numero);
					}catch(Exception Erro) {
						JOptionPane.showMessageDialog(null, "ERRO: " + Erro);
					};
					texto += "+";
					txtnum.setText(texto);
					System.out.println("Valor de soma: " + num);
				}
			});
			btnMais.setBounds(251, 229, 78, 71);
			contentPane.add(btnMais);
			
			JButton btnIgual = new JButton("=");
			btnIgual.setBackground(SystemColor.activeCaption);
			btnIgual.setBounds(251, 300, 78, 71);
			contentPane.add(btnIgual);
		
			JLabel titulo = new JLabel("Calculadora");
			titulo.setFont(new Font("Arial", Font.PLAIN, 40));
			titulo.setHorizontalAlignment(SwingConstants.CENTER);
			titulo.setBounds(31, 11, 309, 40);
			contentPane.add(titulo);
			
			JButton btnC = new JButton("C");
			btnC.setBackground(SystemColor.activeCaption);
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evento) {
					texto = "";
					txtnum.setText("0");
				}
			});;
			btnC.setBounds(20, 372, 78, 71);
			contentPane.add(btnC);
		}
}