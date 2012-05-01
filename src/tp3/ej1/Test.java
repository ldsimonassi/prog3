package tp3.ej1;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test {
	JFrame frm;
	RectanguloColoreado rectangle = new RectanguloColoreado();
	
	JPanel pnl = new JPanel() {
		private static final long serialVersionUID = 1L;
		@Override
		public void paint(Graphics g) {
			rectangle.paint(g);
		}
	};
	
	JPanel pnlBotones = new JPanel();
	
	JButton btRotar = new JButton("Rotar");
	JButton btDoubleSize = new JButton("Duplicar");
	
	JLabel lblDesc = new JLabel();
	
	public Test(){
		frm = new JFrame("Rectangulo Coloreado!");
		frm.getContentPane().add(pnl, BorderLayout.CENTER);

		pnlBotones.add(btRotar);
		pnlBotones.add(btDoubleSize);
		
		btRotar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rectangle.rotate();
				lblDesc.setText(rectangle.toString());
				frm.repaint();
			}
		});
		
		btDoubleSize.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rectangle.doubleSize();
				lblDesc.setText(rectangle.toString());
				frm.repaint();
			}
		});
		
		lblDesc.setText(rectangle.toString());
		
		
		frm.getContentPane().add(pnlBotones, BorderLayout.SOUTH);
		frm.getContentPane().add(lblDesc, BorderLayout.NORTH);
		frm.setSize(640, 480);
		frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
