package com.SampleV2.test.config;

import org.junit.Rule;

import com.SampleV2.util.http.Browser;
import com.SampleV2.util.http.Response;
import com.SampleV2.util.utils.FixtureUtils;

public abstract class BaseTest {
	
    @Rule public TestResultHandler testWatcher = new TestResultHandler();
	
	protected Browser browser = new Browser();
	
	protected FixtureUtils fx = new FixtureUtils(browser);
	
	protected Long id;
	
	protected Response lastResponse() {
		return browser.lastResponse();
	}
}
