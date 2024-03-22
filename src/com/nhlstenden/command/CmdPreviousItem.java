package com.nhlstenden.command;

public class CmdPreviousItem extends Command
{
    public CmdPreviousItem(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().previousItem();
        this.getSlideViewer().updateView();
    }
}
