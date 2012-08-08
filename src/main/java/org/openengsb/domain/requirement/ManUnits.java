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

import org.openengsb.core.api.Constants;
import org.openengsb.core.api.model.annotation.Model;
import org.openengsb.core.api.model.annotation.OpenEngSBModelId;
import org.openengsb.labs.delegation.service.Provide;

/**
 * To define the workload of a requirement (of a project) it's measured in man-hours (-days, -months, ...)
 * Depending on the size of the project and on different companies / organisations,
 * some measurements (weeks, months, ...) are more preferred than others (hours, years, ...).
 * To allow everybody use their preferred units, this class is needed.
 * Also it couldn't be just transformed into ms or minutes because not everywhere a man-day has to equal 8 man-hours
 * or even a man hour doesn't need to mean an actual hour, ...
 */
@Provide(context = {Constants.DELEGATION_CONTEXT_MODELS})
@Model
public class ManUnits {
    @OpenEngSBModelId
    private String id;

    /**
     * The unit of the man units since the workload of a requirement can be measured in
     * Hours, Days, Weeks, Months or even Years
     */
    private TimeUnit timeUnit;

    /**
     * The actual value (number) which together with the unit tells about the workload -
     * 12 Man Months should be the same as 1 Man Year and yet there are more ways to define it (in Days or Weeks)
     */
    private int timeValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unit of the man units since the workload of a requirement can be measured in
     * Hours, Days, Weeks, Months or even Years
     */
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * The actual value (number) which together with the unit tells about the workload -
     * 12 Man Months should be the same as 1 Man Year and yet there are more ways to define it (in Days or Weeks)
     */
    public int getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(int timeValue) {
        this.timeValue = timeValue;
    }
}
