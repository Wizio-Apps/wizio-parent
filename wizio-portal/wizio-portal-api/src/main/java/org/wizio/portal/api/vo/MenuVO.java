package org.wizio.portal.api.vo;

/**
 * Menu Value Object
 * @author airouche_m
 *
 */
public class MenuVO {

	/**
	 * Label
	 */
	private String label;
	
	/**
	 * Navigation path
	 */
	private String path;

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
