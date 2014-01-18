package listeners;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class MyActionListener implements ActionListener
{
	private File file;
	private Image image;
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
//		System.out.println("This works");
		
		JFileChooser fileChooser = new JFileChooser();
		
		fileChooser.showOpenDialog(null);
		file = fileChooser.getSelectedFile();
		
		try 
		{
			image = ImageIO.read(file);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public Image getImage()
	{
		return image;
	}
	
}
