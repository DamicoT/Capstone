package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import listeners.MyActionListener;

public class VisualWindow extends JPanel
{
	private static final long serialVersionUID = 1L;

	private JFrame frame = new JFrame();
	private JMenuBar menu = new JMenuBar();
	private JMenu fileOption = new JMenu("File");
	private JMenuItem openOption = new JMenuItem("Open File");
	private MyActionListener maListener = new MyActionListener(this);

	public VisualWindow()
	{
		fileOption.add(openOption);
		menu.add(fileOption);
		openOption.addActionListener(maListener);
		
		frame.setBounds(0, 0, 500, 500);
		frame.setJMenuBar(menu);
		frame.add(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paintComponents(g);
		
		BufferedImage image = maListener.getImage();
//		int height = maListener.getImageHeight();
//		int width = maListener.getImageWidth();
		
		g.drawImage(image, 0, 0, 500, 300, null);
	}
}
