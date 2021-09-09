package com.aircraft.maintaince.factory;


import com.aircraftmaintainancr.dao.FilesSystemDao;
import com.aircraftmaintainancr.dao.IDao;

public class FileSystemFactory {
public IDao getDaO() {
		
		return new FilesSystemDao();
	}

}
