/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.webbeans.test.unit.lookup.wbri293;

import org.jboss.testharness.impl.packaging.Artifact;
import org.jboss.webbeans.test.AbstractWebBeansTest;
import org.testng.annotations.Test;

/**
 * 
 * @author Jozef Hartinger
 *
 */
@Artifact
public class ContextualReferenceTest extends AbstractWebBeansTest
{
   @Test(groups = "broken")
   public void testReferencesEqual() {
      Sheep sheep = getCurrentManager().getInstanceByType(Sheep.class);
      sheep.setAge(10);
      Sheep sheep2 = getCurrentManager().getInstanceByType(Sheep.class);
      assert sheep.getAge() == sheep2.getAge();
      assert sheep.equals(sheep2);
   }
   
}
