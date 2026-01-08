package org.ibm.healthcare.seleniumproject;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class FullScreenCapture {

	public static void main(String[] args) {
		try {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
			driver.manage().window().maximize();
			System.out.println("The tile of the page is: " + driver.getTitle());
			captureFullScreen("full_screenshot.png");
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void captureFullScreen(String fileName) {
		try {
			Robot robot = new Robot();
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
			ImageIO.write(screenFullImage, "png", new File(fileName));
			System.out.println("A full screenshot saved!");
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
