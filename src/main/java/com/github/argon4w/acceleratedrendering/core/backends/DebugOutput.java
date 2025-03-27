package com.github.argon4w.acceleratedrendering.core.backends;

import static org.lwjgl.opengl.GL46.*;

public class DebugOutput {

    public static void enable() {
        glEnable(GL_DEBUG_OUTPUT_SYNCHRONOUS);
    }
}
