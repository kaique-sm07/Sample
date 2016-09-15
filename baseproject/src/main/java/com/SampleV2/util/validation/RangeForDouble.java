package com.SampleV2.util.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RangeForDouble {
	double min() default Double.MIN_VALUE;
	double max() default Double.MAX_VALUE;
}
