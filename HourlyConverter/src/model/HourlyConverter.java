package model;

import java.text.NumberFormat;
import java.util.Locale;

public class HourlyConverter {
	
	private double hourly;
	private int hours;
	private double moSalary;
	private double ySalary;
	private double tax;
	private String moSalaryFormat;
	private String ySalaryFormat;
	
	public HourlyConverter() {
		super();
	}
	
	public HourlyConverter(double hourly, double tax, int hours) {
		super();
		this.hourly = hourly;
		setSalary(hourly, tax, hours);
	}
	
	public void setHourly(double hourly) {
		this.hourly = hourly;
		setSalary(hourly, tax, hours);
	}
	
	public double getHourly() {
		return hourly;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
		setSalary(hourly, tax, hours);
	}
	
	public double getTax() {
		return tax;
	}

	public void setHours(int hours) {
		this.hours = hours;
		setSalary(hourly, tax, hours);
	}
	
	public double getMoSalary() {
		return moSalary;
	}

	public void setMoSalary(double moSalary) {
		this.moSalary = moSalary;
	}

	public double getySalary() {
		
		return ySalary;
	}

	public void setySalary(double ySalary) {
		this.ySalary = ySalary;
	}
	
	public void setySalaryFormat(double ySalary) {
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		
		this.ySalaryFormat = format.format(ySalary);
		
	}
	
	public String getySalaryFormat() {
		return ySalaryFormat;
	}
	
	public void setMoSalaryFormat(double moSalary) {
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		
		this.moSalaryFormat = format.format(moSalary);
	}
	
	public String getMoSalaryFormat() {
		return moSalaryFormat;
	}
	
	public void setSalary(double hourly, double tax, int hours) {
		
		final int MONTHDIV = 4;
		final int YEARDIV = 52;
		
		double taxAmt = hourly * tax;
		double hourlyWithTax = hourly - taxAmt;
		setMoSalaryFormat((hourlyWithTax * hours) * MONTHDIV);
		setySalaryFormat((hourlyWithTax * hours) * YEARDIV);
		
	}

	@Override
	public String toString() {
		return "HourlyConverter [hourly=" + hourly + ", hours:" + hours + ", moSalary=" + moSalary + ", ySalary=" + ySalary + ", tax=" + tax
				+ "]";
	}

}
