package Jsoup.Examples;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class printtitleofanurl 
{
    public static void main( String[] args ) throws IOException
    {
    	Document doc = Jsoup.connect("http://192.168.2.17:5000/client").get();  
        String title = doc.title();  
        System.out.println("title is: " + title);  

    }
}
