package com.ait.ext4j.ux.layout.crossfacecard.client;

import com.ait.ext4j.client.core.Ext;
import com.ait.ext4j.client.core.Function;
import com.ait.ext4j.client.layout.CardLayout;
import com.ait.ext4j.client.layout.ContainerLayout;
import com.ait.ext4j.client.layout.FitLayout;
import com.google.gwt.core.client.Callback;
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
public class CrossfadeCardLayout extends CardLayout {

    public CrossfadeCardLayout() {

    }

    protected CrossfadeCardLayout(JavaScriptObject obj) {
        super(obj);
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return {
			type : 'layout.crossfadecard'
		};
    }-*/;

    @Override
    protected native void create() /*-{
		var jso = {
			type : 'layout.crossfadecard'
		};
		this.@com.ait.ext4j.client.layout.ContainerLayout::jsObj = jso;
    }-*/;

    public static CrossfadeCardLayout cast(ContainerLayout layout) {
        return new CrossfadeCardLayout(layout.getJsObj());
    }

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "crossfadecard/crossfadecard.js")
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

    public static void inject(final Function callback) {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "crossfadecard/crossfadecard.js")
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
