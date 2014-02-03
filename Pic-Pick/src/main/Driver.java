package main;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.*;

import org.opencv.imgproc.*;

import gui.VisualWindow;

public class Driver 
{
	String myImageString = "C:\\Users\\tdamico\\Pictures\\tire.jpg";
	static String myWindowNameString = "TestWindow";
	static char[] windowName = myWindowNameString.toCharArray();
	char[] imageChar = myImageString.toCharArray();
	Mat src;
	Mat dst;
	int DELAY_BLUR = 100;
	int MAX_KERNAL_LENGTH = 31;
	int DELAY_CAPTION = 1500;

	public static void main(String[] args) 
	{
//		VisualWindow window = new VisualWindow();
		
//		System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
//		Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
//		System.out.println( "mat = " + mat.dump() );
		
//		namedWindow(windowName, CV_WINDOW_AUTOSIZE);
	}

}
