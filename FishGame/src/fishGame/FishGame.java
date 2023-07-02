package fishGame;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FishGame extends JFrame {
	private JButton closeBtn;
	private JLabel coinsCountLbl;
	int coins = 10;

	public FishGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Fishing game by TallJakub!");
		getContentPane().setLayout(null);

		JLabel titleLbl = new JLabel("Fishing game!");
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		titleLbl.setBounds(204, 10, 129, 21);
		getContentPane().add(titleLbl);

		JButton shopBtn = new JButton("Shop");
		shopBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JDialog dialog = new FishShopDialog();
				dialog.setVisible(true);
			}
		});
		shopBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		shopBtn.setBounds(122, 79, 85, 21);
		getContentPane().add(shopBtn);

		JLabel vLbl = new JLabel("v. beta.0.1.0");
		vLbl.setBounds(470, 303, 68, 13);
		getContentPane().add(vLbl);

		JLabel coinsLbl = new JLabel("Coins: ");
		coinsLbl.setBounds(365, 10, 47, 13);
		getContentPane().add(coinsLbl);

		JButton fishBtn = new JButton("Fish!");
		fishBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				coins = coins + 10;
				coinsCountLbl.setText(String.valueOf(coins));
			}
		});
		fishBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fishBtn.setBounds(329, 79, 85, 21);
		getContentPane().add(fishBtn);

		JButton closeBtn = new JButton("Close");
		closeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		closeBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		closeBtn.setBounds(0, 285, 85, 21);
		getContentPane().add(closeBtn);

		coinsCountLbl = new JLabel("10");
		coinsCountLbl.setBounds(424, 10, 114, 13);
		getContentPane().add(coinsCountLbl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishGame menuWindow = new FishGame();
		menuWindow.setSize(new Dimension(560, 360));
		menuWindow.setVisible(true);
	}
}
