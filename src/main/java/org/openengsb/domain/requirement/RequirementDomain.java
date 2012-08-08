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

import java.util.HashMap;
import java.util.List;

import org.openengsb.core.api.Domain;

/**
 * This domain allows the implementation of connectors for different editors
 * to create, edit and manage requirement documents in a semantic way.
 */
// @extract-start RequirementDomain
public interface RequirementDomain extends Domain {

    /**
     * get a list of requirements
     */
    void listRequirements(List<Requirement> requirements);

    /**
     * gets a requirement to be displayed for the user with the whole history
     */
    void displayRequirement(List<Requirement> requirementWithHistory);

    /**
     * add a comment to a requirement, specified by its id
     */
    void addComment(String id, Comment comment);

    /**
     * A requirement (id) has changed and should be updated if the user is viewing it.
     */
    void updateRequirement(String id);

    /**
     * get a list of persons
     */
    void listPersons(List<Person> persons);
}
// @extract-end
