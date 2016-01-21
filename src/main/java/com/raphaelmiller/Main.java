package com.raphaelmiller;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main {

    public static String DESTINATION = "/home/raphael/IdeaProjects/webcam/hello-world.png";

    public static void main(String[] args) {
	// write your code here
        Webcam webcam = Webcam.getDefault();

        webcam.open();

        try {
            System.out.println("Attempting to take picture...");
            ImageIO.write(webcam.getImage(), "PNG", new File("hello-world.png"));

            if(new File(DESTINATION).exists())
                System.out.println("file found");

            //todo get the webcapture to create an interface with a camera stream, detect a face and display
            //todo information regarding that face.



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
