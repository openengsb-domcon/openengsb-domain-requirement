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

import java.util.List;

import org.openengsb.core.api.Constants;
import org.openengsb.core.api.model.annotation.Model;
import org.openengsb.core.api.model.annotation.OpenEngSBModelId;
import org.openengsb.labs.delegation.service.Provide;

/**
 * The requirement model has properties to store all necessary information about a requirement
 * - who has changed it, what's the content, what's the priority -
 * to be able to handle it in a process and treat it as a project artifact.
 */
@Provide(context = {Constants.DELEGATION_CONTEXT_MODELS})
@Model
public class Requirement {

    @OpenEngSBModelId
    private String id;

    /**
     * The title of the document / name of the requirement
     */
    private String title;

    /**
     * A very short description (abstract)
     */
    private String shortDescription;

    /**
     * The description of the requirement in the domain language
     */
    private String description;

    /**
     * A technical description how it should be implemented, which can be used for issue trackers.
     * Also necessary if the developer doesn't have a clue about the domain.
     */
    private String technicalDescription;

    /**
     * The person to whom the requirement has been assigned to, to create / edit / review it.
     */
    private Person assignedTo;

    /**
     * The priority of the requirement is also the priority in which it should be finished.
     */
    private Priority priority;

    /**
     * The current status of the requirement.
     */
    private Status status;

    /**
     * The type of the requirement (New feature, improvement, ...)
     */
    private Type type;

    /**
     * The time estimated to develop the requirement starting from when it has been approved.
     * Can be defined as man-days, man-weeks, ...
     */
    private ManUnits estimatedTime;

    /**
     * Comments added to the document.
     */
    private List<Comment> comments;

    /**
     * When was the document changed the last time. (Comments aren't changes.
     */
    private long lastChange;

    /**
     * By whom has it been changed? (maybe not the person to whom it has been assigned to)
     */
    private Person lastChangeBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The title of the document / name of the requirement
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * A very short description (abstract)
     */
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * The description of the requirement in the domain language
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A technical description how it should be implemented, which can be used for issue trackers.
     * Also necessary if the developer doesn't have a clue about the domain.
     */
    public String getTechnicalDescription() {
        return technicalDescription;
    }

    public void setTechnicalDescription(String technicalDescription) {
        this.technicalDescription = technicalDescription;
    }

    /**
     * The person to whom the requirement has been assigned to, to create / edit / review it.
     */
    public Person getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Person assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * The priority of the requirement is also the priority in which it should be finished.
     */
    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * The current status of the requirement.
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The type of the requirement (New feature, improvement, ...)
     */
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * The time estimated to develop the requirement starting from when it has been approved.
     * Can be defined as man-days, man-weeks, ...
     */
    public ManUnits getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(ManUnits estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    /**
     * Comments added to the document.
     */
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    /**
     * When was the document changed the last time. (Comments aren't changes.
     */
    public long getLastChange() {
        return lastChange;
    }

    public void setLastChange(long lastChange) {
        this.lastChange = lastChange;
    }

    /**
     * By whom has it been changed? (maybe not the person to whom it has been assigned to)
     */
    public Person getLastChangeBy() {
        return lastChangeBy;
    }

    public void setLastChangeBy(Person lastChangeBy) {
        this.lastChangeBy = lastChangeBy;
    }
}
