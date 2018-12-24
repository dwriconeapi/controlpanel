package org.ricone.config.response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public interface ConfigResponse<T> {
	T getData();

	void setData(T data);

	String getRequestPath();

	void setRequestPath(String requestPath);

	HttpHeaders getRequestHeaders();

	void setRequestHeaders(HttpHeaders requestHeaders);

	HttpStatus getResponseStatus();

	void setResponseStatus(HttpStatus status);

	String getResponseStatusText();

	void setResponseStatusText(String statusText);

	HttpHeaders getResponseHeaders();

	void setResponseHeaders(HttpHeaders responseHeaders);

	String getJSON();

	String getXML();
}
