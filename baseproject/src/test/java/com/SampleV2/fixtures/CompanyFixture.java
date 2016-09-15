package com.SampleV2.fixtures;

import com.SampleV2.model.entities.Company;
import com.SampleV2.service.data.CompanyData;

public enum CompanyFixture {

	COMPANY_INVALID(new Company()),
	ACME(new Company("acme", "Acme Ltda."));
	
	private Company company;

	private CompanyFixture(Company company) {
		this.company = company;
	}
	
	public Company entity() {
		return this.company;
	}
	
	public CompanyData data() {
		return CompanyData.buildForTest(company);
	}
	
	public boolean equivalent(Company c) {
		boolean equivalent = true;

		equivalent = equivalent && this.entity().getCode().equals(c.getCode());
		equivalent = equivalent && this.entity().getName().equals(c.getName());
		
		return equivalent;
	}
}
