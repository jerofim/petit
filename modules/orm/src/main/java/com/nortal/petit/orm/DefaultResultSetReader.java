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
package com.nortal.petit.orm;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.nortal.petit.beanmapper.ResultSetReader;
import com.nortal.petit.converter.util.ResultSetHelper;

/**
 * @author Aleksei Lissitsin
 * 
 */
public class DefaultResultSetReader implements ResultSetReader {

    private static DefaultResultSetReader instance = new DefaultResultSetReader();

    public static ResultSetReader instance() {
        return instance;
    }

    @Override
    public <T> T get(Class<T> clazz, ResultSet rs, String column) throws SQLException {
        return ResultSetHelper.get(clazz, rs, column);
    }
}
