package com.example.havh.customtargetobject.feature.custom.target.object;

import com.vuforia.State;

/**
 * Created by HaVH on 12/16/17.
 */

public interface AppRendererController {
    void renderFrame(State state, float[] projectionMatrix);
}
