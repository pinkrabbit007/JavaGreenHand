package com.kujiale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
/**
 * 
 * @author zjq
 * @aim 监听类
 * @尚未实现：输入命令行listrecord -b 203829 -e 231033调取时间段内的停车记录
 */
public class Listen {
	public static String listen() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(s);
		return s;
	}

 
	public static void doMAINthings(String s, TotalCar park)
			throws ParseException {
		if (s.indexOf("checkin") != -1) {
			int timeidx = s.indexOf("-t=");
			String timestr = s.substring(timeidx + 3, timeidx + 9);
			int plateidx = s.indexOf("-n=");
			String platenum = s.substring(plateidx + 3);
			Car e = new Car();
			e.setCarInTime(Utililtytools.String2Date(timestr));
			e.setCarNumPlate(platenum);
			park.totalCar.add(e);
		} else if (s.indexOf("checkout") != -1) {
			int timeidx = s.indexOf("-t=");
			String timestr = s.substring(timeidx + 3, timeidx + 9);
			int plateidx = s.indexOf("-n=");
			String platenum = s.substring(plateidx + 3);
			for (Car i : park.totalCar) {
				if (i.getCarNumPlate().equals(platenum))
					i.setCarOutTime(Utililtytools.String2Date(timestr));
			}
		} else if (s.indexOf("listrecord") != -1) {
			if (s.indexOf("-all") != -1) {
				park.printall(); 
			} else if (s.indexOf("-n") != -1) {
				int plateidx = s.indexOf("-n=");
				String platenum = s.substring(plateidx + 3);
				for (Car i : park.totalCar) {
					if (i.getCarNumPlate().equals(platenum)) {
						i.printcatGetin();
						if (i.getCarOutTime() != null)
							i.printcatGetout();
					}
				}
			}
		}
	}
}
