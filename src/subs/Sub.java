package subs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class Sub {
	private int id;
	private Date fromTime;
	private Date toTime;
	private ArrayList<String> text;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	
	public int getId()
	{
		return id;
	}
	
	
	public Date getFromTime()
	{
		return fromTime;
	}
	
	public Date getToTime()
	{
		return toTime;
	}
	
	public ArrayList<String> getText()
	{
		return text;
	}
	
	public void setText(ArrayList<String> text)
	{
		this.text = text;
	}
	
	public Sub(int id, String fromTime, String toTime,  ArrayList<String> text)
	{
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("FromTime: " + fromTime + " ToTime: " + toTime);
		this.id = id;
		this.text = text;
		try {
			this.fromTime = sdf.parse("1970-01-01 " + fromTime);
			if(this.fromTime.getTime() < 0)
			{
				System.out.println("Wtf?");
			}
			this.toTime = sdf.parse("1970-01-01 " + toTime);
		} catch (Exception e) {
			System.err.println("Cant parse time! " + fromTime + " "+ e.getLocalizedMessage());
			System.err.println("Cant parse time! " + toTime + " "+ e.getLocalizedMessage());
		}
		
		System.out.println("Sub ID: " + id + "\nfromTime: " + this.fromTime.getTime() + "\nToTime: " + this.toTime.getTime());
		for(int i = 0; i > text.size(); i++)
    	{
    		System.out.println("Line " + i + " " + text.get(i));
    	}
	}
	
	public boolean checkIntegrity()
	{
		if(text.isEmpty()) return false;
		else return true;
	}
}
