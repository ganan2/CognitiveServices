package domain;

public class Request {
    private double inputVar;

    public double getInputVar() {
        return inputVar;
    }

    public void setInputVar(double inputVar) {
        this.inputVar = inputVar;
    }

    @Override
    public String toString() {
        return "Request{" +
                "inputVar=" + inputVar +
                '}';
    }
}
