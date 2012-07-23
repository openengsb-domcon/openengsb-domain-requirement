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

// @extract-start RequirementDomainEvents
public interface RequirementDomainEvents extends DomainEvents {

    String raiseRequirementCreatedEvent(RequirementCreatedEvent event);

    void raiseRequirementChangedEvent(RequirementChangedEvent event);

    void raiseRequirementAssignedEvent(RequirementStatusChangedEvent event);

    void raiseRequirementDeletedEvent(RequirementDeletedEvent event);

    void raiseRequirementCommentedEvent(RequirementCommentedEvent event);

    void raiseListRequiremntsEvent(ListRequirementsEvent event);

    String raisePersonCreatedEvent(PersonCreatedEvent event);

    void raisePersonEditedEvent(PersonChangedEvent event);

    void raisePersonDeletedEvent(PersonDeletedEvent event);

    void raiseListPersonssEvent(ListPersonsEvent event);
}
// @extract-end
