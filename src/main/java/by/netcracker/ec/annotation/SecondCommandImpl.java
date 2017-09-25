package by.netcracker.ec.annotation;

import org.springframework.stereotype.Component;

@Component
public class SecondCommandImpl implements Command {
    @Override
    public String execute() {
        return "SecondCommand";
    }
}
