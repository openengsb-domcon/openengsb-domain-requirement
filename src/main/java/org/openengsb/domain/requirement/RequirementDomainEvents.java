/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.domain.requirement;

import org.openengsb.core.api.DomainEvents;
import org.openengsb.domain.requirement.events.*;

/**
 * Necessary events for the RequirementDomain
 */
// @extract-start RequirementDomainEvents
public interface RequirementDomainEvents extends DomainEvents {

    /**
     * To be raised when a new requirement has been created.
     */
    void raiseRequirementCreatedEvent(RequirementCreatedEvent event);

    /**
     * To be raised when somebody has edited the requirement model.
     */
    void raiseRequirementChangedEvent(RequirementChangedEvent event);

    /**
     * To be raised when a requirement has been assigned to another person.
     */
    void raiseRequirementAssignedEvent(RequirementAssignedEvent event);

    /**
     * To be raised when a requirement has been deleted.
     */
    void raiseRequirementDeletedEvent(RequirementDeletedEvent event);

    /**
     * To be raised when somebody has commented to a requirement.
     */
    void raiseRequirementCommentedEvent(RequirementCommentedEvent event);

    /**
     * To be raised to retrieve a list of all requirements.
     */
    void raiseSyncRequirementsEvent(SyncRequirementsEvent event);

    /**
     * To be raised to retrieve a list of all changes of a requirement.
     */
    void raiseSyncRequirementHistoryEvent(SyncRequirementHistoryEvent event);

    /**
     * To be raised when information about a new person have been entered
     */
    void raisePersonCreatedEvent(PersonCreatedEvent event);

    /**
     * To be raised when information about a person have changed.
     */
    void raisePersonChangedEvent(PersonChangedEvent event);

    /**
     * To be raised when a person has been deleted.
     */
    void raisePersonDeletedEvent(PersonDeletedEvent event);

    /**
     * To be raised to retrieve a list of all persons.
     */
    void raiseSyncPersonsEvent(SyncPersonsEvent event);
}
// @extract-end
