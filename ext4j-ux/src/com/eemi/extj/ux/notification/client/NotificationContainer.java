package com.eemi.extj.ux.notification.client;

import com.eemi.ext4j.client.ui.Panel;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

class NotificationContainer extends Panel {

    private static JavaScriptObject configPrototype;

    private native NotificationContainer init()/*-{
		var c = new $wnd.Ext.ux.window.Notification();
		@com.eemi.ext4j.ux.notification.client.NotificationContainer::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return "uxNotification";
    }

    /**
     * Create a new NotificationContainer.
     */
    NotificationContainer() {

    }

    static NotificationContainer newInstance(NotificationConfig config) {
        return new NotificationContainer(_createPeer(config));
    }

    /**
     * Construct a new NotificationContainer with the given title.
     * 
     * @param title
     *            the title
     */
    NotificationContainer(String title) {
        setTitle(title);
    }

    NotificationContainer(JavaScriptObject jsObj) {
        super(jsObj);
    }

    /**
     * Applys the NotificationContainer to an existing element.
     * 
     * @param element
     *            the element
     */
    NotificationContainer(Element element) {
        super(element);
    }

    private static native JavaScriptObject _createPeer(NotificationConfig config) /*-{
		var c = config.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		c.manager = "Ext4j-StateManager";
		var n = $wnd.Ext.create('widget.uxNotification', c);
		return n;
    }-*/;

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.ux.window.Notification(config);
    }-*/;

    native void slideBack() /*-{
		var notification = this.@com.eemi.ext4j.client.core.Component::getOrCreateJsObj()();
		notification.slideBack();
    }-*/;

    @Override
    public native void show() /*-{
		var component = this.@com.eemi.ext4j.client.core.Component::getOrCreateJsObj()();
		component.show();
    }-*/;

}
