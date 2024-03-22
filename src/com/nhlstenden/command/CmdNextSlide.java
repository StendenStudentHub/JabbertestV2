package com.nhlstenden.command;

public class CmdNextSlide extends Command
{
    public CmdNextSlide(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().nextSlide();
        this.getSlideViewer().updateView();
    }
}
