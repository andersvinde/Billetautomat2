package billetautomat2;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Billet1Screen extends JPanel {

	/**
	 * Create the panel.
	 */
	public Billet1Screen() {
		setLayout(null);
		
		JButton btnTest = new JButton("Køb");
		btnTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTest.setBounds(15, 16, 115, 29);
		add(btnTest);

	}

}
