package billetautomat2;

import javax.swing.JLabel;

public class Saldo {
	int saldo;
	JLabel lbl;
	public void addToSaldo (int x) {
		this.saldo = saldo + x;
		this.lbl.setText(String.valueOf(saldo + " kr"));
	}
	public Saldo (JLabel lbl, int saldo) {
		this.saldo = saldo;
		this.lbl = lbl;
		this.lbl.setText(String.valueOf(saldo + " kr"));
	}
}
