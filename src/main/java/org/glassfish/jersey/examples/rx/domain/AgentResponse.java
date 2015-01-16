/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2014-2015 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package org.glassfish.jersey.examples.rx.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Gajdos (michal.gajdos at oracle.com)
 */
public class AgentResponse {

    private List<Destination> visited = new ArrayList<>();
    private List<Recommendation> recommended;
    private long processingTime;

    public AgentResponse() {
    }

    public AgentResponse(List<Destination> visited, List<Recommendation> recommended) {
        this.visited = visited;
        this.recommended = recommended;
    }

    public List<Destination> getVisited() {
        return visited;
    }

    public void setVisited(final List<Destination> visited) {
        this.visited = visited;
    }

    public void setRecommended(final List<Recommendation> recommended) {
        this.recommended = recommended;
    }

    public List<Recommendation> getRecommended() {
        return recommended;
    }

    public void setProcessingTime(final long processingTime) {
        this.processingTime = processingTime;
    }

    public long getProcessingTime() {
        return processingTime;
    }

    public AgentResponse visited(final List<Destination> visited) {
        setVisited(visited);
        return this;
    }

    public AgentResponse recommended(final List<Recommendation> recommended) {
        setRecommended(recommended);
        return this;
    }
}
