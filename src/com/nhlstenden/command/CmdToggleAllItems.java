package com.nhlstenden.command;

public class CmdToggleAllItems extends Command
{
    public CmdToggleAllItems(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().toggleShowAll();
        this.getSlideViewer().updateView();
    }
}
