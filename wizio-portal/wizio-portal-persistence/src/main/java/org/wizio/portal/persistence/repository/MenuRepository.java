package org.wizio.portal.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.wizio.portal.persistence.entity.Menu;

/**
 * Menu DAO
 * @author airouche_m
 *
 */
public interface MenuRepository extends MongoRepository<Menu, String>{

}
