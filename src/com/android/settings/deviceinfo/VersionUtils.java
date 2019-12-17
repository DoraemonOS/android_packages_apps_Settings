
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getdoraemonVersion(){
        String buildDate = SystemProperties.get("ro.doraemon.build_date","");
        String buildCherish = SystemProperties.get("ro.doraemon.version","");
        String buildType = SystemProperties.get("ro.doraemon.build_type","unofficial")/*.toUpperCase()*/;
        return buildDate.equals("") ? "" : "DoraemonOS-" + buildDate + "-" + buildType;
    }
}
