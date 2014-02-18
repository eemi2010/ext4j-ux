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
package com.ait.ext4j.ux.gmaps.client;

import com.ait.ext4j.client.core.config.XType;
import com.ait.ext4j.client.events.container.AfterLayoutEvent;
import com.ait.ext4j.client.events.container.AfterLayoutHandler;
import com.ait.ext4j.client.ui.Panel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;

/**
 * Wraps a Google Maps widget inside an {@link Panel}
 */
public class GMapPanel extends Panel {

    private static JavaScriptObject configPrototype;
    private MapReadyHandler mapReadyHandler;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.GMAP_PANEL.getValue();
    }

    /**
     * Handler interface for handling the ready event on the underlying Google
     * Map
     * 
     */
    public interface MapReadyHandler {
        public void onReady();
    }

    /**
     * Create a new NotificationContainer.
     */
    public GMapPanel() {

    }

    public GMapPanel(MapReadyHandler handler) {
        this.addMapReadyHandler(handler);
    }

    public GMapPanel(String title) {
        setTitle(title);
    }

    public GMapPanel(String title, MapReadyHandler handler) {
        this(title);
        addMapReadyHandler(handler);
    }

    protected GMapPanel(JavaScriptObject obj) {
        super(obj);
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.ux.GMapPanel(config);
    }-*/;

    /**
     * Fires when the map is ready ot be displayed
     * 
     * @param handler
     */
    public void addMapReadyHandler(final MapReadyHandler handler) {
        this.addAfterLayoutHandler(new AfterLayoutHandler() {
            @Override
            public void onAfterLayout(AfterLayoutEvent event) {
                if (GMapPanel.this.mapReadyHandler == null) {
                    GMapPanel.this.mapReadyHandler = handler;
                    handler.onReady();
                }

            }
        });
    }

    /**
     * Get the underlying google maps. Should be called when the map s ready
     * 
     * @return
     */
    public native JavaScriptObject getMap()/*-{
		var component = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		return component.gmap;
    }-*/;

    public static void injectPlugin() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "gmap/GMapPanel.js").setWindow(ScriptInjector.TOP_WINDOW)
                        .inject();

    }

}
