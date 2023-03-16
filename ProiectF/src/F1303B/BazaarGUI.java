package F1303B;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class BazaarGUI extends JFrame {

	private JPanel contentPane;
	static Brand brn;
	private ImageIcon image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BazaarGUI frame = new BazaarGUI();
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
	public BazaarGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		image=new ImageIcon(getClass().getResource("Bazaar.jpg"));
		JLabel lblNewLabel = new JLabel(image);
        lblNewLabel.setBounds(10, 10, 566, 184);
        getContentPane().add(lblNewLabel);
        
      
		
		
		
		JRadioButton buttonGucci = new JRadioButton("Gucci");
		buttonGucci.setFont(new Font("Broadway", Font.PLAIN, 15));
		buttonGucci.setBorderPainted(true);
		buttonGucci.setBackground(new Color(255, 255, 255));
		buttonGucci.setBounds(100, 200, 150, 50);
		contentPane.add(buttonGucci);
		getContentPane().add(buttonGucci);
        buttonGucci.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                brn=new Gucci();
            }
        });
		
		JRadioButton buttonChanel = new JRadioButton("Chanel");
		buttonChanel.setFont(new Font("Broadway", Font.PLAIN, 15));
		buttonChanel.setBackground(new Color(255, 255, 255));
		buttonChanel.setBorderPainted(true);
		buttonChanel.setBounds(350, 200, 150, 50);
		contentPane.add(buttonChanel);
		getContentPane().add(buttonChanel);
        buttonChanel.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                brn=new Chanel();
            }
        });
		
		JRadioButton buttonVersace = new JRadioButton("Versace");
		buttonVersace.setFont(new Font("Broadway", Font.PLAIN, 15));
		buttonVersace.setBorderPainted(true);
		buttonVersace.setBackground(new Color(255, 255, 255));
		buttonVersace.setBounds(100, 293, 150, 50);
		contentPane.add(buttonVersace);
		getContentPane().add(buttonVersace);
        buttonVersace.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                brn=new Versace();
            }
        });
		
		JRadioButton buttonLouisVuitton = new JRadioButton("LouisVuitton");
		buttonLouisVuitton.setFont(new Font("Broadway", Font.PLAIN, 15));
		buttonLouisVuitton.setBorderPainted(true);
		buttonLouisVuitton.setBackground(new Color(255, 255, 255));
		buttonLouisVuitton.setBounds(350, 293, 150, 50);
		contentPane.add(buttonLouisVuitton);
		getContentPane().add(buttonLouisVuitton);
        buttonLouisVuitton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                brn=new LouisVuitton();
            }
        });
		
		
		JButton selectPantaloni = new JButton("Pantaloni");
		selectPantaloni.setForeground(new Color(255, 255, 255));
		selectPantaloni.setBackground(new Color(0, 0, 0));
		selectPantaloni.setFont(new Font("Broadway", Font.PLAIN, 15));
		selectPantaloni.setBounds(100, 427, 150, 66);
		contentPane.add(selectPantaloni);
		getContentPane().add(selectPantaloni);
		selectPantaloni.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null, "Ai cumparat "+ new Pantaloni (brn).tipProdus(), "Felicitari!!!", JOptionPane.CLOSED_OPTION);
            }
        });
		
		JButton selectTricou = new JButton("Tricou");
		selectTricou.setBackground(new Color(0, 0, 0));
		selectTricou.setForeground(new Color(255, 255, 255));
		selectTricou.setFont(new Font("Broadway", Font.PLAIN, 15));
		selectTricou.setBounds(350, 427, 150, 66);
		contentPane.add(selectTricou);
		getContentPane().add(selectTricou);
		selectTricou.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null, "Ai cumparat "+ new Tricou (brn).tipProdus(), "Felicitari!!!", JOptionPane.CLOSED_OPTION);
            }
        });
		
		ButtonGroup group = new ButtonGroup();
		group.add(buttonGucci);
        group.add(buttonChanel);
        group.add(buttonLouisVuitton);
        group.add(buttonVersace);
        
        
		
		
		
		
		ActionListener a = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        // If a radio button is selected, enable the selection buttons
		        if (e.getSource() == buttonGucci || e.getSource() == buttonChanel || e.getSource() == buttonVersace || e.getSource() == buttonLouisVuitton) {
		            selectPantaloni.setVisible(true);
		            selectTricou.setVisible(true);
		           
		        }
		}
		};
		
		
		setVisible(true);
		selectPantaloni.setVisible(false);
	    selectTricou.setVisible(false);
	    
	    buttonGucci.addActionListener(a);
	    buttonChanel.addActionListener(a);
        buttonLouisVuitton.addActionListener(a);
        buttonVersace.addActionListener(a);
		
		}

	private void setBackground(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
	}
	 
	 

