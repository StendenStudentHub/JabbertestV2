package com.nhlstenden.command;

public class CmdSlideByNumber extends Command
{
    public CmdSlideByNumber(SlideViewer slideViewer)
    {
        super(slideViewer);
    }

    @Override
    public void execute()
    {
        //How are we going to do this without changing the abstract method
        //in Command class? Because we need a number to go to the slide.
        this.getSlideViewer().goToSlideNumber();
    }
}
