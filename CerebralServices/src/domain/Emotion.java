package domain;

public class Emotion {
    private long id;
    private String predictiveEnvironment;
    private String predictiveEmotion;
    private String predictiveEmotionType;
    private String predictiveEmotionWeight;
    private boolean predictiveEmotionInterrupt;
    private String predictiveEmotionInterruptType;
    private String predictiveEmotionInterruptWeight;
    private String prescriptiveEnvironment;
    private String prescriptiveEmotion;
    private String prescriptiveEmotionType;
    private String prescriptiveEmotionWeight;
    private boolean prescriptiveEmotionInterrupt;
    private String prescriptiveEmotionInterruptType;
    private String prescriptiveEmotionInterruptWeight;

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

    public String getPredictiveEmotion() {
        return predictiveEmotion;
    }

    public void setPredictiveEmotion(String predictiveEmotion) {
        this.predictiveEmotion = predictiveEmotion;
    }

    public String getPredictiveEmotionType() {
        return predictiveEmotionType;
    }

    public void setPredictiveEmotionType(String predictiveEmotionType) {
        this.predictiveEmotionType = predictiveEmotionType;
    }

    public String getPredictiveEmotionWeight() {
        return predictiveEmotionWeight;
    }

    public void setPredictiveEmotionWeight(String predictiveEmotionWeight) {
        this.predictiveEmotionWeight = predictiveEmotionWeight;
    }

    public boolean isPredictiveEmotionInterrupt() {
        return predictiveEmotionInterrupt;
    }

    public void setPredictiveEmotionInterrupt(boolean predictiveEmotionInterrupt) {
        this.predictiveEmotionInterrupt = predictiveEmotionInterrupt;
    }

    public String getPredictiveEmotionInterruptType() {
        return predictiveEmotionInterruptType;
    }

    public void setPredictiveEmotionInterruptType(String predictiveEmotionInterruptType) {
        this.predictiveEmotionInterruptType = predictiveEmotionInterruptType;
    }

    public String getPredictiveEmotionInterruptWeight() {
        return predictiveEmotionInterruptWeight;
    }

    public void setPredictiveEmotionInterruptWeight(String predictiveEmotionInterruptWeight) {
        this.predictiveEmotionInterruptWeight = predictiveEmotionInterruptWeight;
    }


    public String getPrescriptiveEmotion() {
        return prescriptiveEmotion;
    }

    public void setPrescriptiveEmotion(String prescriptiveEmotion) {
        this.prescriptiveEmotion = prescriptiveEmotion;
    }

    public String getPrescriptiveEmotionType() {
        return prescriptiveEmotionType;
    }

    public void setPrescriptiveEmotionType(String prescriptiveEmotionType) {
        this.prescriptiveEmotionType = prescriptiveEmotionType;
    }

    public String getPrescriptiveEmotionWeight() {
        return prescriptiveEmotionWeight;
    }

    public void setPrescriptiveEmotionWeight(String prescriptiveEmotionWeight) {
        this.prescriptiveEmotionWeight = prescriptiveEmotionWeight;
    }

    public boolean isPrescriptiveEmotionInterrupt() {
        return prescriptiveEmotionInterrupt;
    }

    public void setPrescriptiveEmotionInterrupt(boolean prescriptiveEmotionInterrupt) {
        this.prescriptiveEmotionInterrupt = prescriptiveEmotionInterrupt;
    }

    public String getPrescriptiveEmotionInterruptType() {
        return prescriptiveEmotionInterruptType;
    }

    public void setPrescriptiveEmotionInterruptType(String prescriptiveEmotionInterruptType) {
        this.prescriptiveEmotionInterruptType = prescriptiveEmotionInterruptType;
    }

    public String getPrescriptiveEmotionInterruptWeight() {
        return prescriptiveEmotionInterruptWeight;
    }

    public void setPrescriptiveEmotionInterruptWeight(String prescriptiveEmotionInterruptWeight) {
        this.prescriptiveEmotionInterruptWeight = prescriptiveEmotionInterruptWeight;
    }

    public String getPrescriptiveEnvironment() {
        return prescriptiveEnvironment;
    }

    public void setPrescriptiveEnvironment(String prescriptiveEnvironment) {
        this.prescriptiveEnvironment = prescriptiveEnvironment;
    }

    @Override
    public String toString() {
        return "Emotion{" +
                "id=" + id +
                ", predictiveEnvironment='" + predictiveEnvironment + '\'' +
                ", predictiveEmotion='" + predictiveEmotion + '\'' +
                ", predictiveEmotionType='" + predictiveEmotionType + '\'' +
                ", predictiveEmotionWeight='" + predictiveEmotionWeight + '\'' +
                ", predictiveEmotionInterrupt=" + predictiveEmotionInterrupt +
                ", predictiveEmotionInterruptType='" + predictiveEmotionInterruptType + '\'' +
                ", predictiveEmotionInterruptWeight='" + predictiveEmotionInterruptWeight + '\'' +
                ", prescriptiveEnvironment='" + prescriptiveEnvironment + '\'' +
                ", prescriptiveEmotion='" + prescriptiveEmotion + '\'' +
                ", prescriptiveEmotionType='" + prescriptiveEmotionType + '\'' +
                ", prescriptiveEmotionWeight='" + prescriptiveEmotionWeight + '\'' +
                ", prescriptiveEmotionInterrupt=" + prescriptiveEmotionInterrupt +
                ", prescriptiveEmotionInterruptType='" + prescriptiveEmotionInterruptType + '\'' +
                ", prescriptiveEmotionInterruptWeight='" + prescriptiveEmotionInterruptWeight + '\'' +
                '}';
    }
}

