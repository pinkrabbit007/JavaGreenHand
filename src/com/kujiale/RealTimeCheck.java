package com.kujiale;

import java.text.ParseException;
import java.util.Vector;

/**
 * 
 * @author zjq
 * @aim 主程序入口
 * 这个程序是要记录停车场车辆进入和出去的记录，可以通过时间和车牌进行记录查询
 */
public class RealTimeCheck {

	public static void main(String[] args) throws ParseException {
		System.out
				.println("请输入命令行,示例：checkin -t=101010 -n=AT3749 或者 checkout -t=201314 -n=VF3749 ");
		System.out
		.println("查询语句为listrecord -all 或者listrecord -n=AT3749 或者 listrecord -b 203829 -e 231033 ");
		
		
		TotalCar park = new TotalCar();
		Vector<Car> totalcar = new Vector<Car>();
		park.setTotalCar(totalcar);
		while (true) {
			Listen.doMAINthings(Listen.listen(), park);
		}
	}
}
