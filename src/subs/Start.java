package subs;

import java.util.ArrayList;

public class Start {
	private static ArrayList<Sub> subs = new ArrayList<Sub>();

	public static void main(String[] args) {
		subs = LoadSubs.getSubs("The Matrix 1999 720p BRRip XviD AC3-FLAWL3SS-eng.srt");
		if(!subs.isEmpty())
		{
			System.out.println("\nSubs loaded!");
		}
		else
		{
			System.out.println("Shit fucked up!");
			System.exit(1);
		}
		int subsId = getSubIDFromLine("But eventually, it'll crack...").get(0);
		System.out.println("Starting movie at: " + subs.get(subsId).getFromTime());
		PlayMovie movie = new PlayMovie(subs,subsId);
		
		movie.run();
	}
	
	private static ArrayList<Integer> getSubIDFromLine(String line)
	{
		int id = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < subs.size(); i++)
		{
			ArrayList<String> words = subs.get(i).getText();
			for(int j = 0; j < words.size(); j++)
			//if(subs.get(i).getText().contains(line))
			{
				if(words.get(j).contains(line))
				{
					result.add(id = subs.get(i).getId());
				}
				
			}
		}
		if(id == 0)
		{
			System.out.println("Could not find line in Subsfile");
		}
		return result;
	}

}
