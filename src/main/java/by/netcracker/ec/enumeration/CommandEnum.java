package by.netcracker.ec.enumeration;

import by.netcracker.ec.annotation.Command;
import by.netcracker.ec.annotation.FirstCommandImpl;
import by.netcracker.ec.annotation.SecondCommandImpl;

public enum CommandEnum {

    FIRST_COMMAND {
        {
            this.command = new FirstCommandImpl();
        }
    },
    SECOND_COMMAND {
        {
            this.command = new SecondCommandImpl();
        }
    };

    Command command;

    public Command getCommand() { return command; }

}
