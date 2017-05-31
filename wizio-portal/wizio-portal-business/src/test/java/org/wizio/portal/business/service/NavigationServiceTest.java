package org.wizio.portal.business.service;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wizio.portal.business.commons.AbstractServiceTest;

import com.lordofthejars.nosqlunit.annotation.UsingDataSet;

public class NavigationServiceTest extends AbstractServiceTest {
	
	@Autowired
	private NavigationService navigationService;

	@Test
	@UsingDataSet(locations = {"/data/menu-1.json"})
	public void testListMainMenus() {
		assertTrue(CollectionUtils.isNotEmpty(navigationService.listMainMenus()));
	}

}
