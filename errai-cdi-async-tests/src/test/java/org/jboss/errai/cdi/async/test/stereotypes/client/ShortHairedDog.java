/*
 * Copyright 2013 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.cdi.async.test.stereotypes.client;

import javax.enterprise.context.Dependent;
import java.io.Serializable;

@AnimalStereotype
@Dependent
public class ShortHairedDog implements Animal, Serializable {

    /**
	 *
	 */
    private static final long serialVersionUID = 1859229950272574260L;

}