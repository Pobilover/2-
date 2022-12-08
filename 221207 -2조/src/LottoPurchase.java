import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class LottoPurchase extends JDialog{
	public LottoPurchase() {
		setModal(true); // 부모 창이랑 상호작용 못하게 막음
		
		JPanel pnlBuy = new JPanel();
		
		JPanel pnlNum = new JPanel();
		pnlNum.setBackground(Color.WHITE);
		pnlNum.setLayout(new BoxLayout(pnlNum, BoxLayout.Y_AXIS));
		
		JPanel pnlNum1 = new JPanel();
		JLabel lottoImage = new JLabel();
		ImageIcon lottoIcon = new ImageIcon("lotto.png");
		lottoImage.setIcon(lottoIcon);
		pnlNum1.add(lottoImage);
		
		JPanel pnlNum2 = new JPanel();
		JLabel[] lottoNumber = new JLabel[45];
		pnlNum2.setLayout(new GridLayout(7, 7));
		for (int i = 0; i < lottoNumber.length; i++) {
			String name = "num" + (i + 1) + ".png";
			lottoNumber[i] = new JLabel(getIcon("numbers/" + name));
			pnlNum2.add(lottoNumber[i]);
		}

		JPanel pnlNum3 = new JPanel();
		pnlNum3.setLayout(new FlowLayout());
		JButton reset = new JButton("초기화");
		JButton auto = new JButton("자동선택");
		pnlNum3.add(reset);
		pnlNum3.add(auto);
		
		JPanel pnlNum4 = new JPanel();
		pnlNum4.setLayout(new FlowLayout());
		JLabel count = new JLabel("수량");
		String list[] = {"1", "2", "3", "4", "5"};
		JComboBox cList = new JComboBox(list);
		JButton ok = new JButton("확인");
		pnlNum4.add(count,"Center");
		pnlNum4.add(cList);
		pnlNum4.add(ok);
		
		JPanel pnlChoiceNum = new JPanel();
		pnlChoiceNum.setBackground(Color.WHITE);
		add(pnlChoiceNum, BorderLayout.EAST);
		
		pnlNum.add(pnlNum1);
		pnlNum.add(pnlNum2);
		pnlNum.add(pnlNum3);
		pnlNum.add(pnlNum4);
		
		add(pnlNum, BorderLayout.WEST);

		setSize(750, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	   public ImageIcon getIcon(String name) {
		      String imageName = name;
		      Toolkit kit = Toolkit.getDefaultToolkit();
		      ClassLoader classLoader = getClass().getClassLoader();
		      Image image = kit.getImage(classLoader.getResource(imageName));
		      image = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		      // 이미지크기조절
		      ImageIcon icon = new ImageIcon(image);
		      return icon;
		   }
}

