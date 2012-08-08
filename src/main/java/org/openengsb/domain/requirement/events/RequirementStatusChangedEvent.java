package org.openengsb.domain.requirement.events;

import org.openengsb.domain.requirement.Person;

/**
 * To be raised when the status of a requirement has changed or when it has been assigned to another person.
 */
public class RequirementStatusChangedEvent {
    /**
     * The ide of the requirement which has changed.
     */
    private String id;

    /**
     * The new status.
     */
    private Status status;

    /**
     * The new person to whom the requirement has been assigned to.
     */
    private Person assignedTo;

    /**
     * The ide of the requirement which has changed.
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The new status.
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The new person to whom the requirement has been assigned to.
     */
    public Person getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Person assignedTo) {
        this.assignedTo = assignedTo;
    }
}
