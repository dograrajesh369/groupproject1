package com.gl.Techdept;
import com.gl.Superdept.*;

public class Tech extends superclass{
	 String departmentName;
	 String getTodaysWork;
	 String getWorkDeadline;
	 String getTechStackInformation;
	 
	public String getTechStackInformation() {
		return "core Java";
	}

	@Override
	public String departmentName() {
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	@Override
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	 

}
