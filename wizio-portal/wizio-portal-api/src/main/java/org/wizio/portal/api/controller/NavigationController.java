package org.wizio.portal.api.controller;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wizio.portal.api.vo.MenuVO;
import org.wizio.portal.business.service.NavigationService;
import org.wizio.portal.commons.utils.DozerUtils;


@Controller
@RequestMapping("/navs")
public class NavigationController {
	
	@Autowired
	private Mapper mapper;
	
	@Autowired
	private NavigationService navigationService;
	
	@RequestMapping(value="/mainMenus", method=RequestMethod.GET)
	@ResponseBody
	public List<MenuVO> getMainMenus() {
		return DozerUtils.map(mapper, navigationService.listMainMenus(), MenuVO.class);
	}

}
