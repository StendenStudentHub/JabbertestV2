package com.nhlstenden.command;

public class CmdNew extends Command
{
    public CmdNew(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().clear();
        this.getSlideViewer().updateView();
    }
}
