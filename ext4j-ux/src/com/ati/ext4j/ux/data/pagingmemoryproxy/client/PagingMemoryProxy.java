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
package com.ati.ext4j.ux.data.pagingmemoryproxy.client;

import com.ati.ext4j.client.core.JsoHelper;
import com.ati.ext4j.client.data.proxy.Proxy;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/**
 * Paging Memory Proxy, allows to use paging grid with in memory dataset
 */
public class PagingMemoryProxy extends Proxy {

    public PagingMemoryProxy() {
        jsObj = JsoHelper.createObject();
        setType("pagingmemory");
    }

    public static void inject() {
        ScriptInjector.fromUrl(GWT.getModuleBaseURL() + "pagingmemory/PagingMemoryProxy.js")
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

}
