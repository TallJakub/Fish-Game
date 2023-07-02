package fishGame;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FishShopDialog extends JDialog {
	
	public FishShopDialog() {
		setTitle("Shop");
		setLayout(null);
		this.setSize(new Dimension(500,300));

		JLabel titleLbl = new JLabel("Shop");
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		titleLbl.setBounds(188, 10, 59, 19);
		add(titleLbl);

		JLabel coinsLbl = new JLabel("Coins:");
		coinsLbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		coinsLbl.setBounds(342, 10, 84, 13);
		add(coinsLbl);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FishShopDialog.this.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(0, 242, 85, 21);
		add(btnNewButton);
	}

}
