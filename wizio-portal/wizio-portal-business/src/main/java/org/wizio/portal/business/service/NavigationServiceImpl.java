package org.wizio.portal.business.service;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wizio.portal.business.dto.MenuDTO;
import org.wizio.portal.commons.utils.DozerUtils;
import org.wizio.portal.persistence.repository.MenuRepository;

@Service
public class NavigationServiceImpl implements NavigationService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private Mapper mapper;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<MenuDTO> listMainMenus() {
		return DozerUtils.map(mapper, menuRepository.findAll(), MenuDTO.class);
	}

}
