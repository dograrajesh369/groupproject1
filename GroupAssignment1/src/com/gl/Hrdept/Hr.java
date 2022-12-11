package com.gl.Hrdept;

import com.gl.Superdept.*;

public class Hr extends superclass {

	public String doActivity() {
		return "team Lunch";
	}

	@Override
	public String departmentName() {
		return "HR Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
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
