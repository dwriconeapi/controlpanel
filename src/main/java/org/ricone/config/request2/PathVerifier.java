package org.ricone.config.request2;

/**
 * @project: client
 * @author: Dan on 6/28/2018.
 */
abstract class PathVerifier {
	boolean isInvalidPath(ConfigPathBase request) {
		return false;
	}
	boolean isMissingId(ConfigPathBase request) {
		return false;
	}
	boolean isUnsupportedHttpMethod(ConfigPathBase request) {return false;}
}
