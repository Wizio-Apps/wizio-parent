package org.wizio.portal.commons.utils;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

/**
 * Dozer helpers
 * @author airouche_m
 *
 */
public class DozerUtils {
	
	/**
	 * Map a list of objects
	 * @param mapper
	 * @param source
	 * @param destType
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
	public static <T, U> List<U> map(final Mapper mapper, final Iterable<T> source, final Class<U> destType) {
		final ArrayList<U> resultingList = new ArrayList<U>();
		for (T element : source) {
			if (element == null) {
				continue;
			}
			resultingList.add(mapper.map(element, destType));
		}
		resultingList.removeAll(new ArrayList() {{ add(null); }});
		return resultingList;
	}
}
