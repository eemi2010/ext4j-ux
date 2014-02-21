package com.ait.ext4j.ux.callout.client;

import com.ait.ext4j.client.core.Component;
import com.ait.ext4j.client.core.Ext;
import com.ait.ext4j.client.core.ExtElement;
import com.ait.ext4j.client.core.Function;
import com.ait.ext4j.client.ui.Container;
import com.ait.ext4j.client.util.CSS;
import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Element;

public class CallOut extends Container {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.ux.callout.Callout();
		@com.ait.ext4j.ux.callout.client.CallOut::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return "callout";
    }

    public native void setTarget(String targetId)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setTarget(targetId);
    }-*/;

    public native void setTarget(Component target)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout
				.setTarget(target.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()());
    }-*/;

    public native void setTarget(ExtElement target)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout
				.setTarget(target.@com.ait.ext4j.client.core.ExtElement::getJsObj()());
    }-*/;

    public native void setRelativePosition(String value)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setRelativePosition(value);
    }-*/;

    public native void setRelativeOffsets(JsArrayNumber value)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setRelativeOffsets(value);
    }-*/;

    public native void setCalloutArrowLocation(String value)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setCalloutArrowLocation(value);
    }-*/;

    public native void setFadeInDuration(int value)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setFadeInDuration(value);
    }-*/;

    public native void setFadeOutDuration(int value)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setFadeOutDuration(value);
    }-*/;

    public native void setAutoHide(boolean value)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setAutoHide(value);
    }-*/;

    public native void setDismissDelay(int value)/*-{
		var callout = this.@com.ait.ext4j.client.core.Component::getOrCreateJsObj()();
		callout.setDismissDelay(value);
    }-*/;

    public CallOut() {
        // init();
    }

    public CallOut(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public CallOut(Element element) {
        super(element);
    }

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.ux.callout.Callout(config);
    }-*/;

    private static CallOut instance(JavaScriptObject jsObj) {
        return new CallOut(jsObj);
    }

    public static CallOut cast(Component c) {
        return new CallOut(c.getOrCreateJsObj());
    }

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "callout/callout.js").setWindow(ScriptInjector.TOP_WINDOW)
                        .inject();
    }

    public static void inject(final Function callback) {
        inject(CalloutTheme.DEFAULT, callback);
    }

    public static void inject(CalloutTheme theme, final Function callback) {
        CSS.injectStyleSheet(GWT.getModuleBaseURL() + "callout/css/" + theme.name().toLowerCase());
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "callout/callout.js")
                        .setCallback(new Callback<Void, Exception>() {

                            @Override
                            public void onSuccess(Void result) {
                                callback.execute();
                            }

                            @Override
                            public void onFailure(Exception reason) {
                                Ext.error(reason.getMessage());
                            }
                        }).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

}
