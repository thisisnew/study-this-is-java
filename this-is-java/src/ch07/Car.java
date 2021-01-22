package ch07;

public class Car {
//	Tire frontLeftTire = new Tire("앞왼쪽", 6);
//	Tire frontRighttTire = new Tire("앞오른쪽", 2);
//	Tire backLeftTire = new Tire("뒤왼쪽", 3);
//	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	int run() {
		System.out.println(" run!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
//		if(!frontLeftTire.roll()) {
//			stop();
//			return 1;
//		}
//		if(!frontRighttTire.roll()) {
//			stop();
//			return 2;
//		}
//		if(!backLeftTire.roll()) {
//			stop();
//			return 3;
//		}
//		if(!backRightTire.roll()) {
//			stop();
//			return 4;
//		}
		
		for(int i = 0; i < tires.length; i++) {
			if(!tires[i].roll()) {
				stop();
				return i+1;
			}
		}
		
		return 0;
	}
	
	void stop() {
		System.out.println(" stop!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
	}
}

