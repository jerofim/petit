/**
 *   Copyright 2014 Nortal AS
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.nortal.petit.converter;

/**
 * @author Aleksei Lissitsin <aleksei.lissitsin@webmedia.ee>
 */
public interface Converter<F, T> {

    /**
     * This method converts a given value of the given type. It is able to
     * convert Java objects (Long, boolean, Date, Day), as well as domain
     * objects
     * 
     * @param value
     *            The converted value of the object
     */
    T convert(F value);

    Class<F> getFromType();

    Class<? extends T> getToType();
}
