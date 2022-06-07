package com.automation.utills;

import com.automation.base.BaseClass;

public class WaitUtils extends BaseClass {
	
	public void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
