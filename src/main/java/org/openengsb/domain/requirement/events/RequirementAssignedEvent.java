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

package org.openengsb.domain.requirement.events;

import org.openengsb.domain.requirement.Person;
import org.openengsb.domain.requirement.Requirement;

/**
 * To be raised when a requirement has been assigned to another person.
 */
public class RequirementAssignedEvent {
    /**
     * The ide of the requirement which has changed.
     */
    private Requirement requirement;

    /**
     * The new person to whom the requirement has been assigned to.
     */
    private Person assignedTo;

    /**
     * The ide of the requirement which has changed.
     */
    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
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
