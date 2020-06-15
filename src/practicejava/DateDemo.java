package practicejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//current date ..current time../
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(d.toString());
		// mm*dd*yyyy HH:MM:SS
		sdf.format(d);
		System.out.println(sdf.format(d));
		sd.format(d);
		System.out.println(sd.format(d));
		
		
	}

}
