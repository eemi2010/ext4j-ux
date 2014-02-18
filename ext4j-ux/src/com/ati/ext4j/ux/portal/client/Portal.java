package com.ati.ext4j.ux.portal.client;

import com.ati.ext4j.client.dd.DropTargetConfig;
import com.ati.ext4j.client.events.component.AfterRenderEvent;
import com.ati.ext4j.client.events.component.AfterRenderHandler;
import com.ati.ext4j.client.layout.Layout;
import com.ati.ext4j.client.ui.Panel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/**
 * Portal class. A portal is created by instantiating this class, and adding
 * {@link PortalColumn}'s with a specified
 * {@link com.ati.ext4j.client.layout.ColumnLayoutData}.
 * 
 * <br>
 * To each PortalColumn, a Portlet is added.
 */
// credits : this class has been adapted from the Ext portal sample
public class Portal extends Panel {

    private DropTargetConfig ddConfig;

    public Portal() {
        ddConfig = new DropTargetConfig();
        setLayout(Layout.COLUMN);
        setAutoScroll(true);
        setCls("x-portal");
        this.addAfterRenderHandler(new AfterRenderHandler() {
            @Override
            public void onAfterRender(AfterRenderEvent event) {
                new PortalDropZone(Portal.this, ddConfig);
            }
        });

    }

    public static void injectPlugin() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "portal/PortalDropZone.js")
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

}
