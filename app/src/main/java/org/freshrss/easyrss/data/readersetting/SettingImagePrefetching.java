/*******************************************************************************
 * Copyright (c) 2012 Pursuer (http://pursuer.me).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Pursuer - initial API and implementation
 ******************************************************************************/

package org.freshrss.easyrss.data.readersetting;

import org.freshrss.easyrss.data.DataMgr;
import org.freshrss.easyrss.data.Setting;

public class SettingImagePrefetching extends AbsSetting<Boolean> {
    private static Boolean value;

    public SettingImagePrefetching(final DataMgr dataMgr) {
        super(dataMgr);
    }

    @Override
    protected Boolean getDefault() {
        return false;
    }

    @Override
    protected String getName() {
        return Setting.SETTING_IMAGE_PREFETCHING;
    }

    @Override
    protected Boolean getStaticValue() {
        return value;
    }

    @Override
    protected void setStaticValue(final Boolean value) {
        SettingImagePrefetching.value = value;
    }

    @Override
    protected void setStaticValue(final String value) {
        SettingImagePrefetching.value = Boolean.valueOf(value);
    }
}
