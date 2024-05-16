public class ComputerSet {
    private ComputerSet computer;
    private String keyboard, mouse, speaker, monitor;

    public ComputerSet getComputer() {
        return computer;
    }

    public void setComputer(ComputerSet computer) {
        this.computer = computer;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

}

class ComputerSetBuilder {
    private ComputerSet computerSet;

    public ComputerSetBuilder() {
        this(new ComputerSet());
    }

    public ComputerSetBuilder(ComputerSet computerSet) {
        this.computerSet = computerSet;
    }

    public void computer(ComputerSet computer) {
        computerSet.setComputer(computer);
    }

    public void keyboard(String keyboard) {
        computerSet.setKeyboard(keyboard);
    }

    public void mouse(String mouse) {
        computerSet.setMouse(mouse);
    }

    public void speaker(String speaker) {
        computerSet.setSpeaker(speaker);
    }

    public void monitor(String monitor) {
        computerSet.setMonitor(monitor);
    }


    public ComputerSet getResult() {
        return computerSet;
    }

    public void resetBuilder() {
        computerSet = new ComputerSet();
    }

}