package allSubs;

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
import allSubs.AllSubsAPI.Items.Item;

public class AllSubsTest {
	public static void main(String[] args) {
		//ObjectFactory objFact = new ObjectFactory();
		String movie = "";
		Item item = null;
		while(true)
		{

			movie = CLib.input("Movie");
			//JAXBContext context = null;
			try {
				/*context = JAXBContext.newInstance(Root.class);
				File file = new File("./omdbapi_text.xml");
		        System.out.println("Unmarshaling...");
		        Root r = (Root) context.createUnmarshaller().unmarshal(file);*/
				JAXBContext jc = JAXBContext.newInstance(AllSubsAPI.class);
			       Unmarshaller u = jc.createUnmarshaller();
			       URL url = new URL( "http://api.allsubs.org/index.php?search="+ movie +"&language=sv" );
			       AllSubsAPI as = (AllSubsAPI) u.unmarshal(url);
		        if(as != null)
		        {
		        	System.out.println("Description: " + as.getDescription() +"\nLanguage: " + as.getLanguage() + "\nResults: " + as.getResults() + "\nFound Results:" + as.getFoundResults()+"\n\n");
		        	for(int i = 0; i < as.getItems().item.size(); i++)
		        	{
		        		item = as.getItems().item.get(i);
		        		System.out.println("Title: " + item.getTitle() + "\nLink: " + item.getLink() + "\nFilename: " + item.getFilename() + "\nFiles in Archive:" + item.getFilesInArchive() + "\nLanguages: " + item.getLanguages() + "\nAdded On: " + item.getAddedOn() + "\n\n");
		        	}
		        }
		        System.out.println("Data from AllSubs API - allsubs.org");
			} catch (JAXBException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
			URL website = null;
			try {
				website = new URL("http://subsmax.com/subtitles-movie/the-matrix-en/download-subtitle/2747033/");
			} catch (MalformedURLException e1) {
				System.out.println("Stuff fucked up! " + e1.getLocalizedMessage());
			}
			ReadableByteChannel rbc;
			FileOutputStream fos;
			try {
				rbc = Channels.newChannel(website.openStream());
				fos = new FileOutputStream("supfil.zip");
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
				fos.close();
			} catch (IOException e) {
				System.out.println("Stuff fucked up! " + e.getLocalizedMessage());
			}
			
			try {
				org.apache.commons.io.FileUtils.copyURLToFile(website, new File("supfil.zip"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
