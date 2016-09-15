package com.SampleV2.model.common;

import javax.persistence.TypedQuery;

public interface Filter<E> {

	TypedQuery<E> buildQuery();
}
