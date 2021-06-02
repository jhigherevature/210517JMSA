package com.example.resouces;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BreakWriter {
	private static final String FILE_NAME = "C:/Work/Resources/breaks.txt";
	private static BufferedWriter bw = null;
	
	public static void main(String[] args) {
		try {
			writeBreak("Lunch Break", 60);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public static void writeBreak(String type, int minutes) throws IOException, ParseException {
		bw = new BufferedWriter(new FileWriter(FILE_NAME));
		long hour = 60000 * 60;
		bw.write(type + "\n\n");
		bw.write("We will resume at\n");
		Date date = null;
		for (int i = 1; i > -3; i--) {
			date = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy")
					.parse(new Date(System.currentTimeMillis() + ((60000 * minutes) + (hour * i))).toString());
			
			String formatted = new SimpleDateFormat("h:mm aa").format(date);
			bw.append(formatted);
			
			switch (i) {
			case 1:
				bw.append(" ET");
				break;
			case 0:
				bw.append(" CT");
				break;
			case -1:
				bw.append(" MT");
				break;
			case -2:
				bw.append(" PT");
				break;
			}
			
			bw.append("\n");
		}
		
		if (bw != null)
			bw.close();
	}
}
