package com.github.viravain.starsector.mod.reunion.script;

import com.fs.starfarer.api.EveryFrameScript;

public class ExampleEveryFrameScript implements EveryFrameScript {

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public boolean runWhilePaused() {
        return false;
    }

    @Override
    public void advance(float v) {

    }
}
