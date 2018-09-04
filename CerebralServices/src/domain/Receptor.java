package domain;

public class Receptor {
    private long id;
    private String predictiveEnvironment;
    private String predictiveInput;
    private String predictiveInputType;
    private String predictiveInputWeight;
    private boolean predictiveInputInterrupt;
    private String predictiveInputInterruptType;
    private String predictiveInputInterruptWeight;
    private String prescriptiveEnvironment;
    private String prescriptiveInput;
    private String prescriptiveInputType;
    private String prescriptiveInputWeight;
    private boolean prescriptiveInputInterrupt;
    private String prescriptiveInputInterruptType;
    private String prescriptiveInputInterruptWeight;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPredictiveEnvironment() {
        return predictiveEnvironment;
    }

    public void setPredictiveEnvironment(String predictiveEnvironment) {
        this.predictiveEnvironment = predictiveEnvironment;
    }

    public String getPredictiveInput() {
        return predictiveInput;
    }

    public void setPredictiveInput(String predictiveInput) {
        this.predictiveInput = predictiveInput;
    }

    public String getPredictiveInputType() {
        return predictiveInputType;
    }

    public void setPredictiveInputType(String predictiveInputType) {
        this.predictiveInputType = predictiveInputType;
    }

    public String getPredictiveInputWeight() {
        return predictiveInputWeight;
    }

    public void setPredictiveInputWeight(String predictiveInputWeight) {
        this.predictiveInputWeight = predictiveInputWeight;
    }

    public boolean isPredictiveInputInterrupt() {
        return predictiveInputInterrupt;
    }

    public void setPredictiveInputInterrupt(boolean predictiveInputInterrupt) {
        this.predictiveInputInterrupt = predictiveInputInterrupt;
    }

    public String getPredictiveInputInterruptType() {
        return predictiveInputInterruptType;
    }

    public void setPredictiveInputInterruptType(String predictiveInputInterruptType) {
        this.predictiveInputInterruptType = predictiveInputInterruptType;
    }

    public String getPredictiveInputInterruptWeight() {
        return predictiveInputInterruptWeight;
    }

    public void setPredictiveInputInterruptWeight(String predictiveInputInterruptWeight) {
        this.predictiveInputInterruptWeight = predictiveInputInterruptWeight;
    }

    public String getPrescriptiveInput() {
        return prescriptiveInput;
    }

    public void setPrescriptiveInput(String prescriptiveInput) {
        this.prescriptiveInput = prescriptiveInput;
    }

    public String getPrescriptiveInputType() {
        return prescriptiveInputType;
    }

    public void setPrescriptiveInputType(String prescriptiveInputType) {
        this.prescriptiveInputType = prescriptiveInputType;
    }

    public String getPrescriptiveInputWeight() {
        return prescriptiveInputWeight;
    }

    public void setPrescriptiveInputWeight(String prescriptiveInputWeight) {
        this.prescriptiveInputWeight = prescriptiveInputWeight;
    }

    public boolean isPrescriptiveInputInterrupt() {
        return prescriptiveInputInterrupt;
    }

    public void setPrescriptiveInputInterrupt(boolean prescriptiveInputInterrupt) {
        this.prescriptiveInputInterrupt = prescriptiveInputInterrupt;
    }

    public String getPrescriptiveInputInterruptType() {
        return prescriptiveInputInterruptType;
    }

    public void setPrescriptiveInputInterruptType(String prescriptiveInputInterruptType) {
        this.prescriptiveInputInterruptType = prescriptiveInputInterruptType;
    }

    public String getPrescriptiveInputInterruptWeight() {
        return prescriptiveInputInterruptWeight;
    }

    public void setPrescriptiveInputInterruptWeight(String prescriptiveInputInterruptWeight) {
        this.prescriptiveInputInterruptWeight = prescriptiveInputInterruptWeight;
    }

    public String getPrescriptiveEnvironment() {
        return prescriptiveEnvironment;
    }

    public void setPrescriptiveEnvironment(String prescriptiveEnvironment) {
        this.prescriptiveEnvironment = prescriptiveEnvironment;
    }

    @Override
    public String toString() {
        return "Receptor{" +
                "id=" + id +
                ", predictiveEnvironment='" + predictiveEnvironment + '\'' +
                ", predictiveInput='" + predictiveInput + '\'' +
                ", predictiveInputType='" + predictiveInputType + '\'' +
                ", predictiveInputWeight='" + predictiveInputWeight + '\'' +
                ", predictiveInputInterrupt=" + predictiveInputInterrupt +
                ", predictiveInputInterruptType='" + predictiveInputInterruptType + '\'' +
                ", predictiveInputInterruptWeight='" + predictiveInputInterruptWeight + '\'' +
                ", prescriptiveEnvironment='" + prescriptiveEnvironment + '\'' +
                ", prescriptiveInput='" + prescriptiveInput + '\'' +
                ", prescriptiveInputType='" + prescriptiveInputType + '\'' +
                ", prescriptiveInputWeight='" + prescriptiveInputWeight + '\'' +
                ", prescriptiveInputInterrupt=" + prescriptiveInputInterrupt +
                ", prescriptiveInputInterruptType='" + prescriptiveInputInterruptType + '\'' +
                ", prescriptiveInputInterruptWeight='" + prescriptiveInputInterruptWeight + '\'' +
                '}';
    }
}
