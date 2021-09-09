package com.aircraft.maintaince.factory;

import com.aircraftmaintainancr.dao.IDao;
import com.aircraftmaintainancr.dao.MySqlDao;

public class MySqlFactory extend AbstractFactory {
	public IDao getDaO() {
		return new MySqlDao(); 
	}

}
