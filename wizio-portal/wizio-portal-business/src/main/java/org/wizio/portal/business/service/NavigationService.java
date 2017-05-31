package org.wizio.portal.business.service;

import java.util.List;

import org.wizio.portal.business.dto.MenuDTO;

/**
 * Customizable Menus, Plans, links Service
 * @author airouche_m
 *
 */
public interface NavigationService {

	List<MenuDTO> listMainMenus();
}
