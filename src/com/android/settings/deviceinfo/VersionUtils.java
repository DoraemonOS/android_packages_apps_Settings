
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getDoraemonOSVersion(){
        return SystemProperties.get("ro.doraemon.version.display","");
    }
}
