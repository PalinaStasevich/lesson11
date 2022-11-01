package lt.lhu.lesson11.main;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public Time(int hour, int minute, int second) {
		if ((hour < 0) || (hour > 24)) {
			hour = 0;
		} else
			this.hour = hour;
		if ((minute < 0) || (minute > 60)) {
			minute = 0;
		} else
			this.minute = minute;
		if ((second < 0) || (second > 60)) {
			second = 0;
		} else
			this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if ((hour < 0) || (hour > 24)) {
			hour = 0;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if ((minute < 0) || (minute > 60)) {
			minute = 0;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if ((second < 0) || (second > 60)) {
			second = 0;
		}
		this.second = second;
	}

	public void increase(int hour, int minute, int second) {

		if (hour < 0 || hour > 23) {
			throw new RuntimeException("Hour is incorrect");
		}
		if (minute < 0 || minute > 60) {
			throw new RuntimeException("Minute is incorrect");
		}
		if (second < 0 || second > 60) {
			throw new RuntimeException("Second is incorrect");
		}

		this.hour = this.hour + hour;
		this.minute = this.minute + minute;
		this.second = this.second + second;

		if (this.second >= 60) {
			int tempSecond = this.second / 60;
			this.second = this.second % 60;
			this.minute = this.minute + tempSecond;
		}

		if (this.minute >= 60) {
			int tempMinute = this.minute / 60;
			this.minute = this.minute % 60;
			this.hour = this.hour + tempMinute;
		}

		if (this.hour >= 60) {
			this.hour = this.hour % 24;
		}

	}

}
