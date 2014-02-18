package com.ati.ext4j.ux.portal.client;

import com.ati.ext4j.client.layout.AnchorLayout;
import com.ati.ext4j.client.layout.AnchorLayoutData;
import com.ati.ext4j.client.ui.Container;

/**
 * A Portal column to which the Portlets are added.
 * 
 */
// credits : this class has been adapted from the Ext portal sample
public class PortalColumn extends Container {

    public PortalColumn() {
        setLayout(new AnchorLayout());
        setAutoEl("div");
        setCls("x-portal-column");
        setPaddings(10, 10, 0, 10);
    }

    public void add(Portlet portlet) {
        super.add(portlet, new AnchorLayoutData("100%"));
    }

}
