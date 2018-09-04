package domain;

public class Response {
    private double  id;
    private double inputVar;
    private double prescriptiveOutputVar;
    private double predictiveOutputVar;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getInputVar() {
        return inputVar;
    }

    public void setInputVar(double inputVar) {
        this.inputVar = inputVar;
    }

    public double getPrescriptiveOutputVar() {
        return prescriptiveOutputVar;
    }

    public void setPrescriptiveOutputVar(double prescriptiveOutputVar) {
        this.prescriptiveOutputVar = prescriptiveOutputVar;
    }

    public double getPredictiveOutputVar() {
        return predictiveOutputVar;
    }

    public void setPredictiveOutputVar(double predictiveOutputVar) {
        this.predictiveOutputVar = predictiveOutputVar;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", inputVar=" + inputVar +
                ", prescriptiveOutputVar=" + prescriptiveOutputVar +
                ", predictiveOutputVar=" + predictiveOutputVar +
                '}';
    }
}
