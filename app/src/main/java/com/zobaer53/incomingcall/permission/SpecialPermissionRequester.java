package com.zobaer53.incomingcall.permission;

import android.os.Build;
import android.provider.Settings;

import androidx.activity.ComponentActivity;
import androidx.annotation.RequiresApi;

public class SpecialPermissionRequester {

    private final ComponentActivity activity;

    public SpecialPermissionRequester(ComponentActivity activity) {
        this.activity = activity;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public Boolean checkSystemAlertWindowPermission() {
        return Settings.canDrawOverlays(activity);
    }

    public void requestSystemAlertWindowPermission() {
        SettingsOpener.openSettings(activity, Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
    }
}
