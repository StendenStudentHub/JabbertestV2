package com.nhlstenden.command;

public class CmdNextItem extends Command
{
    public CmdNextItem(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().nextItem();
        this.getSlideViewer().updateView();
    }
}
