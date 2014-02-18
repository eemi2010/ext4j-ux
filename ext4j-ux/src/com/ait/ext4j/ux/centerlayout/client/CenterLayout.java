package com.ait.ext4j.ux.centerlayout.client;

import com.ait.ext4j.client.layout.ContainerLayout;
import com.ait.ext4j.client.layout.FitLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;

/**
 * This layout manager is used to center contents within a container. As a
 * subclass of {@link FitLayout}, CenterLayout expects to have one child item;
 * multiple items will be placed overlapping. The layout does not require any
 * config options. Items in the container can use percentage width or height
 * rather than be fit to the full size of the container.
 */
public class CenterLayout extends FitLayout {

    public CenterLayout() {

    }

    protected CenterLayout(JavaScriptObject obj) {
        super(obj);
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return {
			type : 'ux.center'
		};
    }-*/;

    @Override
    protected native void create() /*-{
		var jso = {
			type : 'ux.center'
		};
		this.@com.ait.ext4j.client.layout.ContainerLayout::jsObj = jso;
    }-*/;

    public static CenterLayout cast(ContainerLayout layout) {
        return new CenterLayout(layout.getJsObj());
    }

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "centerlayout/centerlayout.js")
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

}
