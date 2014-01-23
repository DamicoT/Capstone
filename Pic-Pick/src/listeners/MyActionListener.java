package listeners;

import gui.VisualWindow;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class MyActionListener implements ActionListener
{
	private File file;
	private BufferedImage image;
	private int imageHeight;
	private int imageWidth;
	private VisualWindow vw;
	
	public MyActionListener(VisualWindow vw)
	{
		this.vw = vw;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{		
		JFileChooser fileChooser = new JFileChooser();
		
		fileChooser.showOpenDialog(null);
		file = fileChooser.getSelectedFile();
		
		try 
		{
			image = ImageIO.read(file);
			imageHeight = image.getHeight();
			imageWidth = image.getWidth();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		vw.repaint();
		
	}
	
	public BufferedImage getImage()
	{
		return image;
	}
	
	public int getImageHeight()
	{
		return imageHeight;
	}
	
	public int getImageWidth()
	{
		return imageWidth;
	}
	
}
