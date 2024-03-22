package com.nhlstenden.command;

public class CmdExit extends Command
{
    public CmdExit(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        this.getSlideViewer().exit();
    }
}
