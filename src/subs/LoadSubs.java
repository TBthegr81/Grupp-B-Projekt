package subs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class LoadSubs {
	//private static int x=0;
	private static int id = 0;
	private static String fromTime = "";
	private static String toTime = "";
	public static final String NEW_LINE = System.getProperty("line.separator");
	private static ArrayList<Sub> subs = new ArrayList<Sub>();
			
	public static ArrayList<Sub> getSubs(String filePath)
	{
		InputStream    fis = null;
		BufferedReader br = null;
		String         line = null;

		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			System.err.print("File not found." + e.getLocalizedMessage() + " " + System.getProperty("user.dir"));
			System.exit(1);
		}
		
		ArrayList<String> tempsubs = new ArrayList<String>();
		br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
		try {
			
			while ((line = br.readLine()) != null) {
				
				if( line.equals(""))
			    {
			    	subs.add(new Sub(id, fromTime, toTime, new ArrayList<String>(tempsubs)));
			    	tempsubs.clear();
			    	id = 0;
			    	fromTime = "";
			    	toTime = "";
			    }
			    else
			    {
			    	if(id <= 0)
			    	{
			    		id = Integer.parseInt(line);
			    	}
			    	else if(id > 0 && fromTime == "")
			    	{
			    		fromTime = line.split("\\s+")[0];
			    		fromTime = fromTime.replace(",", ".");
			    		toTime = line.split("\\s+")[2];
			    		toTime = toTime.replace(",", ".");
			    	}
			    	else if(id > 0 && fromTime!= "")
			    	{
			    		tempsubs.add(line);
			    	}
			    }
			}
			
		} catch (IOException e) {
			System.err.print("Cant read file" + e.getLocalizedMessage());
			System.exit(2);
		}
		// Done with the file
		try {
			br.close();
		} catch (IOException e) {
			System.err.print("Cant close file." + e.getLocalizedMessage());
			System.exit(3);
		}
		br = null;
		fis = null;
		return subs;
	}
}
