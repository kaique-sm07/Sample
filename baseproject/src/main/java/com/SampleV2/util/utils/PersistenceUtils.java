package com.SampleV2.util.utils;

import com.SampleV2.model.common.MyEntityManager;

public class PersistenceUtils {

	public static boolean isLoaded(Object object) {
		return MyEntityManager.getPersistenceUnitUtil().isLoaded(object);
	}
}
