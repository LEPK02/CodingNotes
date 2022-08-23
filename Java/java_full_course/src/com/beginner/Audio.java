package com.beginner;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Audio {
    public static void play (String audioName) {        
        try {
            Scanner scanner = new Scanner(System.in);
        
                File file = new File(audioName);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
        
                String response = "";

                while (!response.equals("Q")) {
                    System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");

                    response = scanner.next();
                    response = response.toUpperCase();

                    switch (response) {
                    case ("P"): {
                        clip.start();
                        break;
                    } case ("S"): {
                        clip.stop();
                        break;
                    } case ("R"): {
                        clip.setMicrosecondPosition(0);
                        break;
                    } case ("Q"): {
                        clip.close();
                        break;
                    } default: {
                        System.out.println("Invalid input");
                        break;
                    }
                    }
                }

                clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}