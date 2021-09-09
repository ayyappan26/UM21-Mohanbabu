package com.aircraft.maintaince.factory;

import com.aircraftmaintainancr.dao.IDao;
import com.aircraftmaintainancr.dao.OracleDao;

public class OracleFactory {
	public IDao getDaO() {

		return new OracleDao();
	}


}
