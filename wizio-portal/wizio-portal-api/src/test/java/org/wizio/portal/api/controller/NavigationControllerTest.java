package org.wizio.portal.api.controller;

import org.junit.Test;
import org.wizio.portal.api.commons.AbstractControllerTest;

import com.lordofthejars.nosqlunit.annotation.UsingDataSet;

public class NavigationControllerTest extends AbstractControllerTest {

	@Test
	@UsingDataSet(locations = {"/data/menu-1.json"})
	public void testGetMainMenus() throws Exception {
		this.testJsonArrayRoute("/navs/mainMenus", GET_HTTP_METHOD);
	}

}
