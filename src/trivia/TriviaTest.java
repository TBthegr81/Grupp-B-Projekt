package trivia;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import tb.CLib;
import trivia.Trivia.TrivPost;
import allSubs.AllSubsAPI;

public class TriviaTest {
	public static void main(String[] args) {
		//ObjectFactory objFact = new ObjectFactory();
		String movie = "";
		TrivPost item = null;
		while(true)
		{

			movie = CLib.input("Movie ID:");
			//JAXBContext context = null;
			try {
				/*context = JAXBContext.newInstance(Root.class);
				File file = new File("./omdbapi_text.xml");
		        System.out.println("Unmarshaling...");
		        Root r = (Root) context.createUnmarshaller().unmarshal(file);*/
				JAXBContext jc = JAXBContext.newInstance(Trivia.class);
			       Unmarshaller u = jc.createUnmarshaller();
			       URL url = new URL( "http://10.0.1.92/getData.php?movieID=" + movie);
			       Trivia as = (Trivia) u.unmarshal(url);
		        if(as != null)
		        {
		        	for(int i = 0; i < as.trivPost.size(); i++)
		        	{
		        		TrivPost tp = as.getTrivPost().get(i);
		        		System.out.println("ID: " + tp.getId() + " FromTime: " + tp.getFromTime() + " ToTime: " + tp.getToTime() + " Text: Did you know... " + tp.getTriviaText());
		        	}
		        }
		        System.out.println("Data my API");
			} catch (JAXBException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
