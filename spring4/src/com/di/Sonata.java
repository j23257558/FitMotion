package com.di;

public class Sonata {
	String carColor = null;
	int speed = 0;
	int wheelNum = 0;
	String car = null;
	public Sonata() {
		
	}
	public Sonata(String carColor, int speed) {
		this.carColor = carColor;
		this.speed = speed;
		
	}
	public Sonata(String carColor, int speed, int wheelNum) {
		this.carColor = carColor;
		this.speed = speed;
		this.wheelNum = wheelNum;
	}
	public Sonata(String carColor, int speed, int wheelNum, String car) {
		this.carColor = carColor;
		this.speed = speed;
		this.wheelNum = wheelNum;
		this.car = car;
	}
	public String toString() {
		return " 그녀의자동차는"+this.carColor+"이고, 현재속도는" + this.speed +"바퀴수는" +this.wheelNum+"  차종은"+this.car;
	}
	
	public String toString2() {
		return "그의 자동차는"+this.carColor+"이고 , 현재속도는 " + this.speed +" 바퀴수는"+this.wheelNum+" 차종은"+this.car;
	}
	public String toString3() {
		return "나의 자동차는"+this.carColor+"이고 , 현재속도는 " + this.speed +" 바퀴수는"+this.wheelNum+" 차종은"+this.car;
	}
}
