package by.netcracker.ec;

import by.netcracker.ec.annotation.Command;
import by.netcracker.ec.constant.Constant;
import by.netcracker.ec.switcher.Switcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class Application {

    @Autowired
    private List<Command> listCommand;

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(Constant.FIRST_COMMAND_URL)
    public String getFirstCommand() {

        /**
         * With using annotation
         *  Command command = Util.getCommand(listCommand, Constant.FIRST_COMMAND_CLASS_NAME);
         */
        /*
         * With using enum
         *  CommandEnum commandEnum = CommandEnum.valueOf(Constant.FIRST_COMMAND);
            Command command = commandEnum.getCommand();
         */
        /**
         * With using map
         *  Command command = new CommandMap().getCommand(Constant.FIRST_COMMAND);
         */
        Command command = Switcher.getCommand(Constant.FIRST_COMMAND);
        return command.execute();
    }

    @RequestMapping(Constant.SECOND_COMMAND_URL)
    public String getSecondCommand() {
        /**
         * With using annotation
         *  Command command = Util.getCommand(listCommand, Constant.SECOND_COMMAND_CLASS_NAME);
         */
         /*
         * With using enum
         *  CommandEnum commandEnum = CommandEnum.valueOf(Constant.SECOND_COMMAND);
            Command command = commandEnum.getCommand();
         */
         /*
          * Command command = new CommandMap().getCommand(Constant.SECOND_COMMAND);
          */
        Command command = Switcher.getCommand(Constant.SECOND_COMMAND);
        return command.execute();
    }

}
