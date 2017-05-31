package org.wizio.portal.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Web site Navigation Menu
 * @author airouche_m
 *
 */
@Document(collection = "menu")
public class Menu {

	/**
	 * Unique identifier
	 */
	@Id
	private String id;
	
	/**
	 * Label
	 */
	private String label;
	
	/**
	 * Navigation path
	 */
	private String path;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

}
