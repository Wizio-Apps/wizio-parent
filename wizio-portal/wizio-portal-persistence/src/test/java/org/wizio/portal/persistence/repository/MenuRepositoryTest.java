package org.wizio.portal.persistence.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.wizio.portal.persistence.commons.AbstractRepositoryTest;

import com.lordofthejars.nosqlunit.annotation.UsingDataSet;

public class MenuRepositoryTest extends AbstractRepositoryTest {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Test
	@UsingDataSet(locations = {"/data/menu-1.json"})
	public void testFindAllMenus() {
		assertFalse(CollectionUtils.isEmpty(menuRepository.findAll()));
	}
	
	@Test
	@UsingDataSet(locations = {"/data/menu-1.json"})
	public void testFindOneMenu() {
		assertEquals("Home", menuRepository.findOne("1").getLabel());
	}

}
