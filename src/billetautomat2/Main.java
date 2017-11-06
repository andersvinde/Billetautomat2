package billetautomat2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Saldo saldo;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {

		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(694, 8, 69, 20);
		Saldo saldo = new Saldo(lblSaldo, 0);
		initialize(lblSaldo);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(JLabel lblSaldo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Billet1Screen billet1Screen = new Billet1Screen();
		billet1Screen.setBounds(0, 39, 778, 267);
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 778, 38);
		frame.getContentPane().add(topPanel);
		topPanel.setLayout(null);
		
		JLabel lblClock = new JLabel("Clock");
		lblClock.setBounds(15, 0, 69, 36);
		topPanel.add(lblClock);
		Clock clock = new Clock();
		clock.updateTime(true, lblClock);

		//JLabel lblSaldo = new JLabel("Saldo");
		//lblSaldo.setBounds(694, 8, 69, 20);
		topPanel.add(lblSaldo);
		
		JPanel startPanel = new JPanel();
		startPanel.setBounds(0, 39, 778, 267);
		frame.getContentPane().add(startPanel);
		startPanel.setLayout(null);
		
		JButton btnBillet = new JButton("Billet1");
		btnBillet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().remove(startPanel);
				frame.getContentPane().add(billet1Screen);
				billet1Screen.updateUI();
			}
		});
		btnBillet.setBounds(15, 16, 115, 29);
		startPanel.add(btnBillet);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 313, 778, 31);
		frame.getContentPane().add(bottomPanel);
		bottomPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Tilbage til hovedmenu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.getContentPane().remove(billet1Screen);
				//frame.getContentPane().remove(startPanel); fjern alle paneler der kan være der.
				//frame.getContentPane().remove(startPanel);
				
				frame.getContentPane().add(startPanel);
				startPanel.updateUI();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 778, 29);
		bottomPanel.add(btnNewButton);
	}
}
