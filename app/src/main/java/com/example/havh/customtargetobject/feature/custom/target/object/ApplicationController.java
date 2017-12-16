package com.example.havh.customtargetobject.feature.custom.target.object;

/**
 * Created by HaVH on 12/16/17.
 */

import com.vuforia.State;

public interface ApplicationController {
    boolean doInitTrackers();

    boolean doLoadTrackersData();

    boolean doStartTrackers();

    boolean doStopTrackers();

    boolean doUnloadTrackersData();

    boolean doDeinitTrackers();

    void onInitARDone(ApplicationException e);

    void onVuforiaUpdate(State state);

    void onVuforiaResumed();

    void onVuforiaStarted();


}
