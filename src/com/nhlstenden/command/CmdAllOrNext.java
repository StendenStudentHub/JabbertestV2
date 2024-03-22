package com.nhlstenden.command;

public class CmdAllOrNext extends Command
{
    public CmdAllOrNext(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().showAllOrNext();
        this.getSlideViewer().updateView();
    }
}
