package com.bartekdobo;

import javax.imageio.IIOException;
import javax.swing.plaf.synth.SynthTreeUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    try {
            URL url = new URL("http://example.org");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

	    } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
