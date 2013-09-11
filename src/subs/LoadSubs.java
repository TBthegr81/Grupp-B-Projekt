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
				//System.out.println("BEFORE STUFF: Current ID: "+ id + " Current FromTime: " + fromTime +  " CF: " + fromFrame +  " Current ToTime: " + toTime + " TF: " + toFrame);
			    if( line.equals(""))
			    {
			    	//System.out.println("Line nr: " + x);
			    	//System.out.println("Current ID: "+ id + " Current FromTime: " + fromTime +  " CF: " + fromFrame +  " Current ToTime: " + toTime + " TF: " + toFrame);
			    	//System.out.println("---------------And just before we save the sub... The sub-size: " + tempsubs.size());
			    	//System.out.println("---------------Ok one more test... "+ tempsubs.get(0));
			    	subs.add(new Sub(id, fromTime, toTime, new ArrayList<String>(tempsubs)));
			    	//System.out.println("Sub integrity: " + subs.get(subs.size()-1).checkIntegrity());
			    	/*System.out.println("ID: " + subs.get(subs.size()-1).getId() + "\nFrom Time: " + subs.get(subs.size()-1).getFromTime().getSecondOfMinute()+ "\nTo Time: " +  subs.get(subs.size()-1).getToTime().getSecondOfMinute()+ "\nText: ");
			    	ArrayList<String> text = subs.get(subs.size()-1).getText();
			    	for(String lajn : text)
			    	{
			    		System.out.println(lajn);
			    	}*/
			    	tempsubs.clear();
			    	id = 0;
			    	fromTime = "";
			    	//fromFrame = 0;
			    	toTime = "";
			    	//toFrame = 0;
			    	//break;
			    }
			    else
			    {
			    	
			    	//System.out.println("Line nr: " + x + " " + line);
			    	if(id <= 0)
			    	{
			    		id = Integer.parseInt(line);
			    		//System.out.println("Cool ID: " + id);
			    	}
			    	else if(id > 0 && fromTime == "")
			    	{
			    		//System.out.println("Splitting");
			    		fromTime = line.split("\\s+")[0];
			    		fromTime = fromTime.replace(",", ".");
			    		//fromFrame = Integer.parseInt(line.split("\\s+")[0].split(",")[1]);
			    		
			    		toTime = line.split("\\s+")[2];
			    		toTime = toTime.replace(",", ".");
			    		//toFrame = Integer.parseInt(line.split("\\s+")[2].split(",")[1]);
			    	}
			    	else if(id > 0 && fromTime!= "")
			    	{
			    		//System.out.println("And here we add the subs to the shittsle");
			    		//System.out.println(line);
			    		tempsubs.add(line);
			    	}
			    }
			    //x++;
			    //System.out.println("Current ID: "+ id + " Current FromTime: " + fromTime +  " CF: " + fromFrame +  " Current ToTime: " + toTime + " TF: " + toFrame);
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
