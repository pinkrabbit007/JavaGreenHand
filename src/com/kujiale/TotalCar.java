package com.kujiale;

import java.text.ParseException;
import java.util.Date;
import java.util.Vector;

/**
 * 
 * @author zjq
 *
 */
public class TotalCar {

	public Vector<Car> totalCar; 

 
	public String checkCarParkRecord(String carNumPlate) {
		for (Car i : totalCar) {
			if (i.getCarNumPlate().equals(carNumPlate)) {
				String a = "Record1:" + carNumPlate + " " + i.getCarInTime()
						+ " in";
				String b = null;
				if (i.getCarOutTime() != null) {
					b = "Record2:" + carNumPlate + " " + i.getCarOutTime()
							+ " out";
				}
				return a + b;
			}
		}
		return "Car not found";
	}

 
	public Vector<String> checkCarRecordByTime(Date inTimeinput,
			Date outTimeinput) throws ParseException {
		Vector<String> result = new Vector<String>();
		for (Car i : totalCar) {
			if (i.getCarInTime().after(inTimeinput)
					&& i.getCarInTime().before(outTimeinput))
				result.add(i.printcatGetin());
			else if (i.getCarOutTime().after(inTimeinput)
					&& i.getCarOutTime().before(outTimeinput))
				result.add(i.printcatGetout());
		}
		return result;
	}

	public void printall() throws ParseException {
		if(totalCar.size()== 0)
			System.out.println("No car inside");
		for (Car i : totalCar) {
			i.printcatGetin();
			if (i.getCarOutTime() != null)
				i.printcatGetout();
		}
	}

	public Vector<Car> getTotalCar() {
		return totalCar;
	}

	public void setTotalCar(Vector<Car> totalCar) {
		this.totalCar = totalCar;
	}

}
