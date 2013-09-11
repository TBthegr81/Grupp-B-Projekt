package subs;

import java.util.ArrayList;

public class PlayMovie {
	//private long startMs;
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
		//.out.println("Subs size: " + subs.size());
		//System.out.println("Random SubSize:" + subs.get(5).getText().size());
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
		 /*try {  String str_date=subs.get(0).getFromTime();
		 DateFormat formatter ; 
		 Date date ; 
		  formatter = new SimpleDateFormat("kk:mm:ss");
		  date = (Date)formatter.parse(str_date);  
		 System.out.println("Today is " +date );
		  } catch (ParseException e)
		  {System.out.println("Exception :"+e);
		 }*/
		//startMs = System.currentTimeMillis();
		while(true)
		{
			//System.out.println((System.currentTimeMillis()-startMs)/1000);
			//System.out.println("Before sleep: " + System.currentTimeMillis());
			if(subsDone < 1)
			{
				/*DateTime dt = subs.get(0).getFromTime();
				System.out.println("Sleep Time: " + dt.getYear() + "-"+ dt.getMonthOfYear() +"-"+ dt.getDayOfMonth() +" "+ dt.getHourOfDay() + ":" + dt.getMinuteOfHour() + ":" + dt.getSecondOfMinute() + "." + dt.getMillisOfSecond());
				System.out.println("My MS: " + dt.toDate().getTime());*/
				
				try {
					Thread.sleep(subs.get(0).getFromTime().getTime());
				} catch (InterruptedException e) {
					System.err.println("Cant sleep! " + e.getLocalizedMessage());
				}
			}
			//System.out.println("Sub integrity: " + subs.get(subsDone).checkIntegrity());
			//System.out.println("Subs ID: " + subs.get(subsDone).getId());
			System.out.println(subs.get(subsDone).getFromTime().toString());
			ArrayList<String> text = subs.get(subsDone).getText();
		   	for(String lajn : text)
		   	{
		   		System.out.println(lajn);
		   	}
			//Sleep untill next sub
			try {
				Thread.sleep((subs.get(subsDone+1).getFromTime().getTime()-subs.get(subsDone).getFromTime().getTime()));
			} catch (InterruptedException e) {
				System.err.println("Cant sleep! " + e.getLocalizedMessage());
			}
			subsDone++;
		}
	}
}
