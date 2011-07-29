/*
 * Copyright 2011 WorldWide Conferencing, LLC
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
package code.form

import net.liftweb.common.Box

class StringConverter extends ValueConverter[String] {
  def asString(t: String): String = t
  def fromString(s: String): Box[String] = Box.legacyNullTest(s)
}

object StringConverter extends StringConverter {
  implicit val stringConverter:StringConverter = this
}