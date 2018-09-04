package domain;

public class Response {
    private long id;
    private String predictiveEnvironment;
    private String predictiveOutput;
    private String predictiveOutputType;
    private String predictiveOutputWeight;
    private boolean predictiveOutputInterrupt;
    private String predictiveOutputInterruptType;
    private String predictiveOutputInterruptWeight;
    private String prescriptiveEnvironment;
    private String prescriptiveOutput;
    private String prescriptiveOutputType;
    private String prescriptiveOutputWeight;
    private boolean prescriptiveOutputInterrupt;
    private String prescriptiveOutputInterruptType;
    private String prescriptiveOutputInterruptWeight;

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

    public String getPredictiveOutput() {
        return predictiveOutput;
    }

    public void setPredictiveOutput(String predictiveOutput) {
        this.predictiveOutput = predictiveOutput;
    }

    public String getPredictiveOutputType() {
        return predictiveOutputType;
    }

    public void setPredictiveOutputType(String predictiveOutputType) {
        this.predictiveOutputType = predictiveOutputType;
    }

    public String getPredictiveOutputWeight() {
        return predictiveOutputWeight;
    }

    public void setPredictiveOutputWeight(String predictiveOutputWeight) {
        this.predictiveOutputWeight = predictiveOutputWeight;
    }

    public boolean isPredictiveOutputInterrupt() {
        return predictiveOutputInterrupt;
    }

    public void setPredictiveOutputInterrupt(boolean predictiveOutputInterrupt) {
        this.predictiveOutputInterrupt = predictiveOutputInterrupt;
    }

    public String getPredictiveOutputInterruptType() {
        return predictiveOutputInterruptType;
    }

    public void setPredictiveOutputInterruptType(String predictiveOutputInterruptType) {
        this.predictiveOutputInterruptType = predictiveOutputInterruptType;
    }

    public String getPredictiveOutputInterruptWeight() {
        return predictiveOutputInterruptWeight;
    }

    public void setPredictiveOutputInterruptWeight(String predictiveOutputInterruptWeight) {
        this.predictiveOutputInterruptWeight = predictiveOutputInterruptWeight;
    }

    public String getPrescriptiveOutput() {
        return prescriptiveOutput;
    }

    public void setPrescriptiveOutput(String prescriptiveOutput) {
        this.prescriptiveOutput = prescriptiveOutput;
    }

    public String getPrescriptiveOutputType() {
        return prescriptiveOutputType;
    }

    public void setPrescriptiveOutputType(String prescriptiveOutputType) {
        this.prescriptiveOutputType = prescriptiveOutputType;
    }

    public String getPrescriptiveOutputWeight() {
        return prescriptiveOutputWeight;
    }

    public void setPrescriptiveOutputWeight(String prescriptiveOutputWeight) {
        this.prescriptiveOutputWeight = prescriptiveOutputWeight;
    }

    public boolean isPrescriptiveOutputInterrupt() {
        return prescriptiveOutputInterrupt;
    }

    public void setPrescriptiveOutputInterrupt(boolean prescriptiveOutputInterrupt) {
        this.prescriptiveOutputInterrupt = prescriptiveOutputInterrupt;
    }

    public String getPrescriptiveOutputInterruptType() {
        return prescriptiveOutputInterruptType;
    }

    public void setPrescriptiveOutputInterruptType(String prescriptiveOutputInterruptType) {
        this.prescriptiveOutputInterruptType = prescriptiveOutputInterruptType;
    }

    public String getPrescriptiveOutputInterruptWeight() {
        return prescriptiveOutputInterruptWeight;
    }

    public void setPrescriptiveOutputInterruptWeight(String prescriptiveOutputInterruptWeight) {
        this.prescriptiveOutputInterruptWeight = prescriptiveOutputInterruptWeight;
    }

    public String getPrescriptiveEnvironment() {
        return prescriptiveEnvironment;
    }

    public void setPrescriptiveEnvironment(String prescriptiveEnvironment) {
        this.prescriptiveEnvironment = prescriptiveEnvironment;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", predictiveEnvironment='" + predictiveEnvironment + '\'' +
                ", predictiveOutput='" + predictiveOutput + '\'' +
                ", predictiveOutputType='" + predictiveOutputType + '\'' +
                ", predictiveOutputWeight='" + predictiveOutputWeight + '\'' +
                ", predictiveOutputInterrupt=" + predictiveOutputInterrupt +
                ", predictiveOutputInterruptType='" + predictiveOutputInterruptType + '\'' +
                ", predictiveOutputInterruptWeight='" + predictiveOutputInterruptWeight + '\'' +
                ", prescriptiveEnvironment='" + prescriptiveEnvironment + '\'' +
                ", prescriptiveOutput='" + prescriptiveOutput + '\'' +
                ", prescriptiveOutputType='" + prescriptiveOutputType + '\'' +
                ", prescriptiveOutputWeight='" + prescriptiveOutputWeight + '\'' +
                ", prescriptiveOutputInterrupt=" + prescriptiveOutputInterrupt +
                ", prescriptiveOutputInterruptType='" + prescriptiveOutputInterruptType + '\'' +
                ", prescriptiveOutputInterruptWeight='" + prescriptiveOutputInterruptWeight + '\'' +
                '}';
    }
}
