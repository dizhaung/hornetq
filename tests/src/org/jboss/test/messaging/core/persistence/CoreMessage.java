/*
  * JBoss, Home of Professional Open Source
  * Copyright 2005, JBoss Inc., and individual contributors as indicated
  * by the @authors tag. See the copyright.txt in the distribution for a
  * full listing of individual contributors.
  *
  * This is free software; you can redistribute it and/or modify it
  * under the terms of the GNU Lesser General Public License as
  * published by the Free Software Foundation; either version 2.1 of
  * the License, or (at your option) any later version.
  *
  * This software is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  * Lesser General Public License for more details.
  *
  * You should have received a copy of the GNU Lesser General Public
  * License along with this software; if not, write to the Free
  * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
  */
package org.jboss.test.messaging.core.persistence;

import java.io.Serializable;
import java.util.Map;

import org.jboss.messaging.core.message.MessageSupport;

/**
 * @author <a href="mailto:tim.fox@jboss.com">Tim Fox</a>
 * @version <tt>$Revision$</tt>
 *
 * $Id$
 */
public class CoreMessage extends MessageSupport
{

   private static final long serialVersionUID = -6387757311548920642L;
   
   public CoreMessage(Serializable messageID,
                      boolean reliable,
                      long expiration,
                      long timestamp,
                      int priority,
                      Map headers,
                      Serializable payload)
   {
      super(messageID, reliable, expiration, timestamp, priority, 0, 0, headers, payload);
   }

   public CoreMessage()
   {

   }
}
