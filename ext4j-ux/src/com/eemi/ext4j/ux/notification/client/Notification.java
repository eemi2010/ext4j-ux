package com.eemi.ext4j.ux.notification.client;

import com.eemi.ext4j.client.fx.easing.Easing;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/**
 * Notification / Toastwindow extension for Ext JS 4.x
 * 
 * 
 * To set a standard width, padding and text alignment on the notifications
 * include this css on your page:
 * 
 * <pre>
 * .ux-notification-window .x-window-body {
 *     text-align: center;
 *     padding: 15px 5px 15px 5px;
 *     width: 200px;
 * }
 * </pre>
 * 
 * If you wish to add icons to the windows title you can download the info and
 * error icons and include this css on your page:
 * 
 * <pre>
 * .ux-notification-icon-information {
 *     background-image: url('gwtModuleName/icon16_info.png');
 * }
 * 
 * .ux-notification-icon-error {
 *     background-image: url('gwtModuleName/icon16_error.png');
 * }
 * </pre>
 * 
 * Then set the iconCls property to 'ux-notification-icon-information' or
 * 'ux-notification-icon-error' to enable the icon on the notification.
 * 
 * If you wish to style the notifications as in the Demo 2 below then download
 * the fader.png and add the following css to your page:
 * 
 * <pre>
 * .ux-notification-light .x-window-header {
 *     background-color: transparent;
 * }
 * </pre>
 * 
 * body .ux-notification-light { background-image:
 * url('gwtModuleName/fader.png'); }
 * 
 * .ux-notification-light .x-window-body { text-align: center; padding: 15px 5px
 * 18px 5px; width: 200px; background-color: transparent; border: 0px solid
 * white; }
 * 
 * Then set the cls property to 'ux-notification-light'. Note that this styling
 * differs a bit between new browsers and >=IE8.
 */
public class Notification {

    private NotificationContainer container;
    private NotificationConfig config;
    private boolean wasDisplayed;

    public Notification() {
        config = new NotificationConfig();
    }

    public Notification(String title) {
        this();
        setTitle(title);
    }

    public Notification(String title, String message) {
        this(title);
        setMessage(message);
    }

    public Notification setAutoClose(boolean value) {
        this.config.setAutoClose(value);
        return this;
    }

    public Notification setAutoCloseDelay(int value) {
        this.config.setAutoCloseDelay(value);
        return this;
    }

    public Notification setAutoHeight(boolean value) {
        this.config.setAutoHeight(value);
        return this;
    }

    public void hide() {
        if (!wasDisplayed) {
            this.container = NotificationContainer.newInstance(config);
        }
        this.container.hide();
        wasDisplayed = true;
    }

    public Notification setHideDuration(int value) {
        this.config.setHideDuration(value);
        return this;
    }

    public Notification setPaddingX(int value) {
        this.config.setPaddingX(value);
        return this;
    }

    public Notification setPaddingY(int value) {
        this.config.setPaddingY(value);
        return this;
    }

    public Notification setPlain(boolean value) {
        this.config.setPlain(value);
        return this;
    }

    public Notification setPosition(String value) {
        this.config.setPosition(value);
        return this;
    }

    public Notification slideBack() {
        this.container.slideBack();
        return this;
    }

    public Notification setSlideBackAnimation(Easing easing) {
        setSlideBackAnimation(easing.getValue());
        return this;
    }

    private void setSlideBackAnimation(String value) {
        this.config.setSlideBackAnimation(value);
    }

    public Notification setSlideBackDuration(int value) {
        this.config.setSlideBackDuration(value);
        return this;
    }

    public Notification setSlideInAnimation(Easing easing) {
        this.config.setSlideInAnimation(easing);
        return this;
    }

    public Notification setSlideInDuration(int value) {
        this.config.setSlideBackDuration(value);
        return this;
    }

    public Notification setSpacing(int value) {
        this.config.setSpacing(value);
        return this;
    }

    public Notification setStickOnClick(boolean value) {
        this.config.setStickOnClick(value);
        return this;
    }

    public Notification setStickWhileOver(boolean value) {
        this.config.setStickWhileOver(value);
        return this;
    }

    public Notification setUseXAxis(boolean value) {
        this.config.setUseXAxis(value);
        return this;
    }

    public Notification setXPosition(int value) {
        this.config.setXPosition(value);
        return this;
    }

    public Notification setClosable(boolean value) {
        this.config.setClosable(value);
        return this;
    }

    public Notification setYPosition(int value) {
        this.config.setYPosition(value);
        return this;
    }

    public Notification setManager(String id) {
        this.config.setManager(id);
        return this;
    }

    public Notification setTitle(String value) {
        this.config.setTitle(value);
        return this;
    }

    public Notification setMessage(String value) {
        this.config.setHtml(value);
        return this;
    }

    public Notification setCls(String value) {
        this.config.setCls(value);
        return this;
    }

    public Notification setIconCls(String value) {
        this.config.setIconCls(value);
        return this;
    }

    public void show() {
        if (!wasDisplayed) {
            this.container = NotificationContainer.newInstance(config);
        }
        this.container.show();
        wasDisplayed = true;
    }

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "notification/Notification.js")
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

}
