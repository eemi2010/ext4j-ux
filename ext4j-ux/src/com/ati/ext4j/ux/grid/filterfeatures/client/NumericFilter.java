/**
 * Ext4j UI Library Copyright 2014, Alain Ekambi, and individual contributors as
 * indicated by the @authors tag. See the copyright.txt in the distribution for
 * a full listing of individual contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ati.ext4j.ux.grid.filterfeatures.client;

import com.ati.ext4j.client.core.JsoHelper;
import com.ati.ext4j.client.grid.column.Filter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

public class NumericFilter extends Filter {

    public NumericFilter() {
        jsObj = JsoHelper.createObject();
        setType("numeric");
    }

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "gridfilter/Numeric.js").setWindow(ScriptInjector.TOP_WINDOW)
                        .inject();

    }

}
