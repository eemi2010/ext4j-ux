package com.eemi.extj.ux.notification.client;

import com.eemi.ext4j.client.core.JsObject;
import com.eemi.ext4j.client.core.JsoHelper;
import com.eemi.ext4j.client.fx.easing.Easing;

class NotificationConfig extends JsObject {

    NotificationConfig() {
        jsObj = JsoHelper.createObject();
    }

    native void setAutoClose(boolean value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.autoClose = value;
    }-*/;

    native void setAutoCloseDelay(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.autoCloseDelay = value;

    }-*/;

    native void setAutoHeight(boolean value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.autoHeight = value;
    }-*/;

    native void hide() /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.hide();
    }-*/;

    native void setHideDuration(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.hideDuration = value;
    }-*/;

    native void setPaddingX(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.paddingX = value;
    }-*/;

    native void setPaddingY(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.paddingY = value;
    }-*/;

    native void setPlain(boolean value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.plain = value;

    }-*/;

    native void setPosition(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.position = value;

    }-*/;

    native void slideBack(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.slideBack(value);
    }-*/;

    void setSlideBackAnimation(Easing easing) {
        setSlideBackAnimation(easing.getValue());
    }

    native void setSlideBackAnimation(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.slideBackAnimation = value;
    }-*/;

    native void setSlideBackDuration(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.slideBackDuration = value;

    }-*/;

    void setSlideInAnimation(Easing easing) {
        setSlideInAnimation(easing.getValue());
    }

    native void setSlideInAnimation(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.slideInAnimation = value;
    }-*/;

    native void setSlideInDuration(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.slideInDuration = value;
    }-*/;

    native void setSpacing(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.spacing = value;
    }-*/;

    native void setStickOnClick(boolean value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.stickOnClick = value;
    }-*/;

    native void setStickWhileOver(boolean value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.stickWhileOver = value;
    }-*/;

    native void setUseXAxis(boolean value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.useXAxis = value;
    }-*/;

    native void setXPosition(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.xPos = value;
    }-*/;

    native void setYPosition(int value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.yPos = value;
    }-*/;

    native void setManager(String id) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.manager = id;
    }-*/;

    native void setHtml(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.html = value;
    }-*/;

    native void setTitle(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.title = value;
    }-*/;

    native void setClosable(boolean value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.closable = value;
    }-*/;

    native void setCls(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.cls = value;
    }-*/;

    native void setIconCls(String value) /*-{
		var notification = this.@com.eemi.ext4j.client.core.JsObject::getJsObj()();
		notification.iconCls = value;
    }-*/;

}
