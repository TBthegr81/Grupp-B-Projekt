package subs;

import java.util.ArrayList;

public class Cheating {
	private static ArrayList<Sub> subs = new ArrayList<Sub>();

	public static void main(String[] args) {
		subs = CheatLoadSubs.getSubs();
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
