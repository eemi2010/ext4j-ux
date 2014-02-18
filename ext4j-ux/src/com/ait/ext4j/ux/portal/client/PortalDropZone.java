package com.ait.ext4j.ux.portal.client;

import com.ait.ext4j.client.core.JsObject;
import com.ait.ext4j.client.dd.DropTargetConfig;
import com.google.gwt.core.client.JavaScriptObject;

// credits : this class has been adapted from the Ext portal sample
class PortalDropZone extends JsObject {

    public PortalDropZone(Portal portal, DropTargetConfig config) {
        jsObj = createNativePeer(portal.getOrCreateJsObj(), config.getJsObj());

    }

    private native JavaScriptObject createNativePeer(JavaScriptObject portal, JavaScriptObject config)/*-{
		return new $wnd.Ext.app.PortalDropZone(portal, config);
    }-*/;

}
