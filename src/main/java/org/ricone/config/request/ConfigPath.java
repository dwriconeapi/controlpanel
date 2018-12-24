package org.ricone.config.request;

/**
 * @project: client
 * @author: Dan on 6/28/2018.
 */
public interface ConfigPath {
    ServicePath getServicePath();

    String getId();

    String getPredicateId();

    boolean hasId();

    boolean hasPredicateId();

    boolean isServicePathType(ServicePathType servicePathType);
}
