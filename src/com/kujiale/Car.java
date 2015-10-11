package com.kujiale;

import java.text.ParseException;
import java.util.Date;
/**
 * 
 * @author zhangjunqiao
 *
 */
public class Car {

	private Date carInTime;
	private Date carOutTime;
	private String carNumPlate;
	
	Car(){};
	/*
	 * ��Ա��ʼ�����Խ���ʱ�̳�ʼ�������
	 */
	Car(Date intimeinput, String carNuminput)
	{
		this.carInTime = intimeinput;
		this.carNumPlate = carNuminput;
	}
	/*
	 * ��¼ʻ��ʱ�䣬ͬʱ�ж�ʻ�������Ƿ�����
	 */
	public boolean outTimeinput(Date outtimeinput, String carNuminput)
	{
		if(this.carNumPlate.equals(carNuminput))
		{
			this.carOutTime = outtimeinput;
			return true;
		}
		else
		{
			System.out.println("This car didn't exist");
			return false;
		}
	}
	
	/*
	 * ��ӡ����ͣ������¼
	 */
	public String printcatGetin() throws ParseException
	{
		String s = "Record1:"+this.getCarNumPlate()+" "+Utililtytools.Date2HHMMSS(this.getCarInTime())+" in";
		System.out.println(s);
		return s;
	}
	/*
	 * ��ӡ����ͣ������¼
	 */
	public String printcatGetout() throws ParseException
	{
		String s = "Record2:"+this.getCarNumPlate()+" "+Utililtytools.Date2HHMMSS(this.getCarOutTime())+" out";
		System.out.println(s);
		return s;
	}
	
	public Date getCarInTime() {
		return carInTime;
	}


	public void setCarInTime(Date carInTime) {
		this.carInTime = carInTime;
	}


	public Date getCarOutTime() {
		return carOutTime;
	}


	public void setCarOutTime(Date carOutTime) {
		this.carOutTime = carOutTime;
	}


	public String getCarNumPlate() {
		return carNumPlate;
	}


	public void setCarNumPlate(String carNumPlate) {
		this.carNumPlate = carNumPlate;
	}
}
