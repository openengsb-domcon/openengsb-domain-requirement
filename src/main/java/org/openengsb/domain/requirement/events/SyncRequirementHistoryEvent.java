package org.openengsb.domain.requirement.events;

import org.openengsb.core.api.Event;
import org.openengsb.domain.requirement.Requirement;

/**
 * To be raised to retrieve a list of all changes of a requirement.
 */
public class SyncRequirementHistoryEvent extends Event {
    /**
     * Requirement for which the whole history is needed.
     */
    private Requirement requirement;

    /**
     * Requirement for which the whole history is needed.
     */
    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
}
