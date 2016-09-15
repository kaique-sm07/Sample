package com.SampleV2.service.common;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

import com.SampleV2.service.security.Token;

public abstract class BaseService {
	
	@Context
	private SecurityContext securityContext;
	
	protected Token getToken() {
		return (Token) securityContext.getUserPrincipal();
	}
}
