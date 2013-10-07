package subtitles2;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import subtitles2.Subtitle.Sub;
import tb.CLib;

public class Subtitletest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String movie = "";
		Sub sub = null;
		while(true)
		{
			movie = CLib.input("SubID");
			
			try {
				/*context = JAXBContext.newInstance(Root.class);
				File file = new File("./omdbapi_text.xml");
		        System.out.println("Unmarshaling...");
		        Root r = (Root) context.createUnmarshaller().unmarshal(file);*/
				JAXBContext jc = JAXBContext.newInstance(Subtitle.class);
			       Unmarshaller u = jc.createUnmarshaller();
			       URL url = new URL( "http://10.0.1.92/getSubs.php?movieID=" + movie );
			       Subtitle subtitle = (Subtitle) u.unmarshal(url);
		        if(subtitle != null)
		        {
		        	//item = as.getItems().item.get(i);
		        	for(int j = 0; j < subtitle.getSub().size()-800; j++)
		        	{
			        	sub = subtitle.getSub().get(j);
			        	System.out.println("\nid: " + sub.getId() + " FromTime: " + sub.getFromTime() + " ToTime: " + sub.getToTime());
			        	for(int i = 0; i < sub.getLines().getLine().size(); i++)
			        	{
			        		System.out.print("Line " + i+": " + sub.getLines().getLine().get(i));
			        	}
		        	}
		        }
			} catch (JAXBException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

}
