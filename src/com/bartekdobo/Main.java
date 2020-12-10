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
//            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//
//            URI baseUri = new URI("http://username:password@myserver.com:5000");
//            URI uriRelative = new URI("/catalogue/phones?os=android#samsung");
//            URI resolvedUri = baseUri.resolve(uriRelative); // combine base URI and relative URI
//
//            System.out.println(uri.getScheme());
//            System.out.println(uri.getSchemeSpecificPart());
//            System.out.println(uri.getAuthority());
//            System.out.println(uri.getUserInfo());
//            System.out.println(uri.getHost());
//            System.out.println(uri.getPort());
//            System.out.println(uri.getPath());
//            System.out.println(uri.getQuery());
//            System.out.println(uri.getFragment());
//
//            // Convert URI to URL
//            URL url = uri.toURL();
//            System.out.println("\nURL = " + url);
// -------------------- -------------------- -------------------- --------------------

            URL url = new URL("http://example.org");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

// -------------------- -------------------- -------------------- --------------------
//            URLConnection urlConnection = url.openConnection();
//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//
//            BufferedReader inputStream = new BufferedReader( new InputStreamReader(urlConnection.getInputStream()));
//
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//            for(Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
//                String key = entry.getKey();
//                List<String> value = entry.getValue();
//
//                System.out.println("------key: "+key);
//                for(String string : value) {
//                    System.out.println("Value: " + value);
//                }
//            }
//
//            String line = "";
//            while(line != null) {
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();
// -------------------- -------------------- -------------------- --------------------
//            BufferedReader inputStream = new BufferedReader( new InputStreamReader(url.openStream()));
//
//            String line = "";
//            while(line != null) {
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();

	    } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
//        } catch (URISyntaxException e) {
//            System.out.println("URI bad syntax: " + e.getMessage());
//        } catch (MalformedURLException e) {
//            System.out.println("Malformed URL: " + e.getMessage());
//        }
    }
}
