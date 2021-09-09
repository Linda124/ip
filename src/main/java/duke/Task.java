package duke;

/**
 * Class includes methods required for creating a task and obtaining information relating to it.
 */
public class Task {
    protected String information;
    protected Boolean isCompletedTask;
    protected String type;

    /**
     * Constructor for creating a task.
     *
     * @param information refers to details of task
     */
    public Task(String information) {
        this.information = information;
        this.isCompletedTask = false;
    }

    /**
     * Method marks task as done.
     */
    public void markDone() {
        this.isCompletedTask = true;
    }

    /**
     * Returns information relevant to the task.
     *
     * @return task information
     */
    public String getInformation() {
        return information;
    }

    /**
     * Returns type of task.
     *
     * @return task type
     */
    public String getType(){
        return this.type;
    }

    /**
     * Returns details relevant to the task.
     *
     * @return task details
     */
    public String getDetails() {
        return null;
    }

    /**
     * Returns task in a string format.
     *
     * @return task formatted as a string
     */
    public String toString() {
        return getStatusIcon() + this.information;
    }

    /**
     * Returns status of task pertaining to whether it has been completed.
     *
     * @return task status
     */
    public String getStatusIcon() {
        if (isCompletedTask) {
            return "[X] ";
        } else {
            return  "[ ] ";
        }
    }
}