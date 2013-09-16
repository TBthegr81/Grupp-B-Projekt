package subs;

import java.util.ArrayList;

public class CheatLoadSubs {
	//private static int x=0;
	private static int id = 0;
	private static String fromTime = "";
	private static String toTime = "";
	public static final String NEW_LINE = System.getProperty("line.separator");
	private static ArrayList<Sub> subs = new ArrayList<Sub>();
	private static ArrayList<String> file = Cheating2.cheat();
			
	public static ArrayList<Sub> getSubs()
	{
		ArrayList<String> tempsubs = new ArrayList<String>();
			for(int i = 0; i < file.size(); i++) {
				if( file.get(i).equals(""))
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
			    		id = Integer.parseInt(file.get(i));
			    	}
			    	else if(id > 0 && fromTime == "")
			    	{
			    		fromTime = file.get(i).split("\\s+")[0];
			    		fromTime = fromTime.replace(",", ".");
			    		toTime = file.get(i).split("\\s+")[2];
			    		toTime = toTime.replace(",", ".");
			    	}
			    	else if(id > 0 && fromTime!= "")
			    	{
			    		tempsubs.add(file.get(i));
			    	}
			    }
			}
		return subs;
	}
}
