package com.ankit.command.compositeCommand;

import com.ankit.command.fx.Command;

public class WoodenFrame implements Command {
    @Override
    public void execute() {
        System.out.println("Wooden frame applied !");
    }
}
