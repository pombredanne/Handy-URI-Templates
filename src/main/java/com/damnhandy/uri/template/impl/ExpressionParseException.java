/*
 * Copyright 2012, Ryan J. McDonough
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.damnhandy.uri.template.impl;

/**
 * This {@link RuntimeException} is raised when the the template processor
 * encounters an issue parsing the URI template expression. It indicates
 * the expression is malformed.
 *
 * @author <a href="ryan@damnhandy.com">Ryan J. McDonough</a>
 * @version $Revision: 1.1 $
 * @since 1.0
 */
public class ExpressionParseException extends UriTemplateParseException
{

   /** The serialVersionUID */
   private static final long serialVersionUID = -3912835265423887511L;

   /**
    * Create a new InvalidExpressionException.
    *
    */
   public ExpressionParseException()
   {
      super();
   }

   /**
    * Create a new InvalidExpressionException.
    *
    * @param message
    * @param cause
    */
   public ExpressionParseException(String message, Throwable cause)
   {
      super(message, cause);
   }

   /**
    * Create a new InvalidExpressionException.
    *
    * @param message
    */
   public ExpressionParseException(String message)
   {
      super(message);
   }

   /**
    * Create a new InvalidExpressionException.
    *
    * @param cause
    */
   public ExpressionParseException(Throwable cause)
   {
      super(cause);
   }


}
