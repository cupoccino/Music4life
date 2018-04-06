package com.oreallyoreilly.pythia.music;

import java.util.Scanner;

import com.oreallyoreilly.pythia.menu.ConsoleControls;
import com.oreallyoreilly.pythia.menu.IExecuatable;

public class MusicViewMenuItem implements IExecuatable {

	Scanner input = new Scanner(System.in);
	 
	public MusicViewMenuItem() {}

	@Override
	public void execute() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... MUSIC VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n"+ MusicViewMenuItem.class.getName() + " has no MVC implementation.");
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
	}

}
