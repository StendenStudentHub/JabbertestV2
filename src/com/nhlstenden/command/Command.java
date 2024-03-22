package com.nhlstenden.command;

public abstract class Command
{
    private SlideViewer slideViewer;

    public Command(SlideViewer slideViewer)
    {
        this.slideViewer = slideViewer;
    }

    public SlideViewer getSlideViewer()
    {
        return this.slideViewer;
    }

    public void setSlideViewer(SlideViewer slideviewer)
    {
        this.slideViewer = slideviewer;
    }

    public abstract void execute();

}