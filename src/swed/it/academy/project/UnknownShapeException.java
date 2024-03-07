package swed.it.academy.project;

public class UnknownShapeException extends Exception{
    private String excMessage;

    public UnknownShapeException(String excMessage) {
        this.excMessage = excMessage;
    }

    public String getExcMessage() {
        return excMessage;
    }

    public void setExcMessage(String excMessage) {
        this.excMessage = excMessage;
    }
}
