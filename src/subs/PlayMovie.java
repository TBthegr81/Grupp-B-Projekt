package subs;

import java.util.ArrayList;

public class PlayMovie {
	private int subsDone;
	private ArrayList<Sub> subs;
	public PlayMovie(ArrayList<Sub> subs)
	{
		this.subs = subs;
		subsDone = 0;
	}
	
	public void run()
	{
		System.out.println("Movie: The Matrix");
		System.out.println("Movie starts in: ");
		for(int countdown = 5; countdown > 0; countdown--)
		{
			System.out.println(countdown);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Cant sleep! " + e.getLocalizedMessage());
			}
		}
		System.out.println("*Fanfare*");
		while(true)
		{
			//Sleep until first sub
			if(subsDone < 1)
			{
				try {
					Thread.sleep(subs.get(0).getFromTime().getTime());
				} catch (InterruptedException e) {
					System.err.println("Cant sleep! " + e.getLocalizedMessage());
				}
			}
			//Print subs
			ArrayList<String> text = subs.get(subsDone).getText();
		   	for(String lajn : text)
		   	{
		   		System.out.println(lajn);
		   	}
		   	//Sleep as long as the sub should be on screen, then remove it.
		   	try {
				Thread.sleep((subs.get(subsDone).getToTime().getTime()-subs.get(subsDone).getFromTime().getTime()));
			} catch (InterruptedException e) {
				System.err.println("Cant sleep! " + e.getLocalizedMessage());
			}
		   	// REMOVE SUB FROM SCREEN
		   	
			//Sleep untill next sub
			try {
				Thread.sleep((subs.get(subsDone+1).getFromTime().getTime()-subs.get(subsDone).getToTime().getTime()));
			} catch (InterruptedException e) {
				System.err.println("Cant sleep! " + e.getLocalizedMessage());
			}
			subsDone++;
		}
	}
}
