package com.gl.Admindept;
import com.gl.Superdept.*;

public class Admindepartment extends superclass{
	

	public String departmentName() {
		
		return "Admin Department";
	}

	@Override
	public String getTodaysWork() {
		
		return "Complete your documents Submission";
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
