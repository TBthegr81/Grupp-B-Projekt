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
			System.out.println("Stuff fucked up");
			System.exit(1);
		}
		PlayMovie movie = new PlayMovie(subs);
		
		movie.run();
	}

}
