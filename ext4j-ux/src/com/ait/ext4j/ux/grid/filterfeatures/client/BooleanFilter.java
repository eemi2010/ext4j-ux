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
package com.ait.ext4j.ux.grid.filterfeatures.client;

import com.ait.ext4j.client.core.JsoHelper;
import com.ait.ext4j.client.grid.column.Filter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/**
 * Boolean filters use unique radio group IDs (so you can have more than one!)
 */
public class BooleanFilter extends Filter {

    public BooleanFilter() {
        jsObj = JsoHelper.createObject();
        setType("boolean");
    }

    /**
     * Set this to null if you do not want either option to be checked by
     * default. Defaults to false.
     */
    public void setDefaultValue(boolean value) {
        JsoHelper.setAttribute(jsObj, "defaultValue", value);
    }

    public void setNoText(String value) {
        JsoHelper.setAttribute(jsObj, "noText", value);
    }

    public void setYesText(String value) {
        JsoHelper.setAttribute(jsObj, "yesText", value);
    }

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "gridfilter/BooleanFilter.js")
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

}
