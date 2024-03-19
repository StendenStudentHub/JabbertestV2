package com.nhlstenden.command;

public abstract class Command
{
    private SlideViewer slideViewer;

    public Command()
    {
        slideViewer = null;
    }

    public abstract void execute();
}