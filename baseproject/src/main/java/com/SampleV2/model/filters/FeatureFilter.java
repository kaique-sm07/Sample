package com.SampleV2.model.filters;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.TypedQuery;
import javax.ws.rs.QueryParam;

import com.SampleV2.model.common.Filter;
import com.SampleV2.model.common.Loader;
import com.SampleV2.model.common.MyEntityManager;
import com.SampleV2.model.entities.Feature;
import com.SampleV2.model.entities.FeatureCode;
import com.SampleV2.util.utils.QueryUtils;

public class FeatureFilter implements Filter<Feature> {

	@QueryParam("load")
	private String load;

	@QueryParam("code")
	private FeatureCode code;

	@QueryParam("visible")
	private Boolean visible;

	@Override
	public TypedQuery<Feature> buildQuery() {
		Map<String, Object> params = new HashMap<>();
		StringBuilder hql = new StringBuilder("FROM features e");
		
		hql.append(QueryUtils.loadQuery(Loader.load(load, Feature.class)));
		
		hql.append(" WHERE 1 = 1");
		
		if (code != null) {
			hql.append(" AND code = :code");
			params.put("code", code);
		}
		
		if (visible != null) {
			hql.append(" AND visible = :visible");
			params.put("visible", visible);
		}
		
		TypedQuery<Feature> query = MyEntityManager.get().createQuery(hql.toString(), Feature.class);
		QueryUtils.setParameters(query, params);
		
		return query;
	}
	
	public String getLoad() {
		return load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	public FeatureCode getCode() {
		return code;
	}
	
	public void setCode(FeatureCode code) {
		this.code = code;
	}
	
	public Boolean getVisible() {
		return visible;
	}
	
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
}
