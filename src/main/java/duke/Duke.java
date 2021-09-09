package duke;

import java.util.Scanner;

/**
 * Class includes methods required for running this project.
 */
public class Duke {
    private Scanner in = new Scanner(System.in);
    private CompilationOfFiles storage;
    private ListOfTasks tasks;
    private Ui ui;

    /**
     * Constructor for creating duke.
     *
     * @param filepath refers to path of the file
     */
    public Duke (String filepath) {
        ui = new Ui();
        storage = new CompilationOfFiles(filepath);
        tasks = new ListOfTasks();
        storage.loadAndSaveFile(tasks);
    }
    /**
     * This method is required for running the file.
     */
    public void run() {
        ui.start();
        boolean isEnd = false;
        while (!isEnd) {
            String command = in.nextLine();
            isEnd = Parser.handleCommand(command,tasks);
        }
        ui.end();
    }

    /**
     * This is the main method.
     */
    public static void main (String[]args) {
        new Duke("data/duke.txt").run();
    }

}

