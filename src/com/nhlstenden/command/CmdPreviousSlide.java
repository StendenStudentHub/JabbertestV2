package com.nhlstenden.command;

public class CmdPreviousSlide extends Command
{
    public CmdPreviousSlide(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().prevSlide();
        this.getSlideViewer().updateView();
    }
}
