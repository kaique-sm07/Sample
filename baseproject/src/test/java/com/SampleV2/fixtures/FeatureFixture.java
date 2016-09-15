package com.SampleV2.fixtures;

import com.SampleV2.model.entities.Feature;
import com.SampleV2.model.entities.FeatureCode;
import com.SampleV2.service.data.FeatureData;

public enum FeatureFixture {

	CREATE_COMPANY_INVALID(new Feature(null, false)),
	CREATE_COMPANY(new Feature(FeatureCode.CREATE_COMPANY, false));
	
	private Feature feature;

	private FeatureFixture(Feature feature) {
		this.feature = feature;
	}
	
	public Feature entity() {
		return FeatureData.build(data());
	}
	
	public FeatureData data() {
		return FeatureData.buildForTest(feature);
	}
	
	public boolean equivalent(Feature f) {
		boolean equivalent = true;

		equivalent = equivalent && this.entity().getCode().equals(f.getCode());
		equivalent = equivalent && this.entity().getVisible().equals(f.getVisible());
		
		return equivalent;
	}
}
