package org.ricone.config.response.model;

import java.util.List;

public interface ListWrapper<T> {
	List<T> getList();
	void setList(List<T> data);
}
