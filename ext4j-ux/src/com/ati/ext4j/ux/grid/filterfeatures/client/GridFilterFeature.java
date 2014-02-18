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

import com.ati.ext4j.client.data.Store;
import com.ati.ext4j.client.grid.column.Filter;
import com.ati.ext4j.client.grid.feature.Feature;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;

/**
 * 
 * GridFilterFeature is a grid feature that allows for a slightly more robust
 * representation of filtering than what is provided by the default store.
 * <p>
 * Filtering is adjusted by the user using the grid's column header menu (this
 * menu can be disabled through configuration). Through this menu users can
 * configure, enable, and disable filters for each column.
 * 
 */
public class GridFilterFeature extends Feature {

    public GridFilterFeature() {
        jsObj = createNativePeer();
    }

    /**
     * Adds a filter to the collection and observes it for state change.
     */
    public native void addFilter(Filter filter)/*-{
		var peer = this.@com.ati.ext4j.client.core.JsObject::getJsObj()();
		peer
				.addFilter(filter.@com.ati.ext4j.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * 
     * Changes the data store bound to this view and refreshes it.
     */
    public native void bindStore(Store s)/*-{
		var peer = this.@com.ati.ext4j.client.core.JsObject::getJsObj()();
		peer.bindStore(s.@com.ati.ext4j.client.core.JsObject::getJsObj()());
    }-*/;

    /**
     * 
     * Remove all filters, permanently destroying them.
     */
    public native void removeAll()/*-{
		var peer = this.@com.ati.ext4j.client.core.JsObject::getJsObj()();
		peer.removeAll();
    }-*/;

    /**
     * 
     Update the styles for the header row based on the active filters
     */
    public native void updateColumnHeadings()/*-{
		var peer = this.@com.ati.ext4j.client.core.JsObject::getJsObj()();
		peer.updateColumnHeadings();
    }-*/;

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "gridfilter/FilterFeatures.js")
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

    private native JavaScriptObject createNativePeer()/*-{
		var v = new $wnd.Ext.ux.grid.FiltersFeature({
			local : true
		});
		return v;
    }-*/;
}
