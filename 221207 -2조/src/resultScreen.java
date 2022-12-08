import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class resultScreenSet extends JDialog{
	public resultScreenSet() {
		JPanel pnlBox = new JPanel();
		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel();
		JPanel pnl4 = new JPanel();
		JPanel pnl5 = new JPanel();
		
		pnlBox.setLayout(new BoxLayout(pnlBox, BoxLayout.Y_AXIS));
		
		JLabel turn = new JLabel("-");
		JLabel title = new JLabel("회 당첨결과");
		turn.setFont(new Font("휴먼편지체", Font.BOLD, 30));
		title.setFont(new Font("휴먼편지체", Font.BOLD, 30));
		pnl1.add(turn);
		pnl1.add(title);
		
		pnl2.setLayout(new FlowLayout());
		JLabel num1 = new JLabel();
		JLabel num2 = new JLabel();
		JLabel num3 = new JLabel();
		JLabel num4 = new JLabel();
		JLabel num5 = new JLabel();
		JLabel num6 = new JLabel();
		JLabel plus = new JLabel("+");
		plus.setFont(new Font("바탕", Font.BOLD, 20));
		JLabel bonus = new JLabel();
		num1.setIcon(getIcon("balls/ball1.png"));
		num2.setIcon(getIcon("balls/ball2.png"));
		num3.setIcon(getIcon("balls/ball3.png"));
		num4.setIcon(getIcon("balls/ball4.png"));
		num5.setIcon(getIcon("balls/ball5.png"));
		num6.setIcon(getIcon("balls/ball6.png"));
		bonus.setIcon(getIcon("balls/ball7.png"));
		pnl2.add(num1);
		pnl2.add(num2);
		pnl2.add(num3);
		pnl2.add(num4);
		pnl2.add(num5);
		pnl2.add(num6);
		pnl2.add(Box.createHorizontalGlue());
		pnl2.add(plus);
		pnl2.add(Box.createHorizontalGlue());
		pnl2.add(bonus);
		
		JPanel pnl3_1 = new JPanel();
		pnl3_1.setPreferredSize(new Dimension(450, 80));
		pnl3_1.setBackground(Color.LIGHT_GRAY);
		JLabel resultWord = new JLabel("축하합니다! 총 ");
		JLabel resultWord2 = new JLabel("원 당첨입니다!");
		JLabel resultMoney = new JLabel("-");
		resultWord.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		resultWord2.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		resultMoney.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		resultWord.setForeground(Color.white);
		resultWord2.setForeground(Color.white);
		resultMoney.setForeground(Color.white);
		pnl3_1.add(Box.createVerticalStrut(70));
		pnl3_1.add(resultWord);
		pnl3_1.add(resultMoney);		
		pnl3_1.add(resultWord2);
		pnl3.add(Box.createHorizontalStrut(5));
		pnl3.add(pnl3_1);
		
		
		
		JButton before = new JButton("<<<");
		JButton after = new JButton(">>>");		
		JTable resultTable = new JTable(5,4);		
		//table 값 만들기
		DefaultTableModel model = (DefaultTableModel)resultTable.getModel();
		String[] record = new String[4];
		record[0] = "A";
		record[1] = "자동";
		record[2] = "1등";
		record[3] = "2 3 5 6 7 9";
		model.addRow(record);
		
		before.setPreferredSize(new Dimension(55,40));
		before.setBackground(Color.LIGHT_GRAY);
		after.setPreferredSize(new Dimension(55,40));
		after.setBackground(Color.LIGHT_GRAY);
		resultTable.setPreferredSize(new Dimension(300,150));
		resultTable.setRowHeight(30);
		pnl4.add(before);
		pnl4.add(Box.createHorizontalStrut(30));
		pnl4.add(resultTable);
		pnl4.add(Box.createHorizontalStrut(30));
		pnl4.add(after);
		
		JLabel lbl1 = new JLabel("구매: ");
		JLabel lbl2 = new JLabel("장");
		JLabel lbl2_1 = new JLabel(", ");		
		JLabel lbl3 = new JLabel("게임: ");
		JLabel lbl4 = new JLabel("게임");
		pnl5.add(lbl1);
		pnl5.add(lbl2);
		pnl5.add(lbl2_1);
		pnl5.add(lbl3);
		pnl5.add(lbl4);
		
		pnlBox.add(pnl1);
		pnlBox.add(pnl2);
		pnlBox.add(pnl3);
		pnlBox.add(pnl4);
		pnlBox.add(pnl5);
		
		add(pnlBox);
		setSize(700,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public ImageIcon getIcon(String name) {
		String imageName = name;
		Toolkit kit = Toolkit.getDefaultToolkit();
		ClassLoader classLoader = getClass().getClassLoader();
		Image image = kit.getImage(classLoader.getResource(imageName));
		image = image.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(image);
		return icon;
	}
}
