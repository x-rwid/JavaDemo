package projectoop;

public class ElPC extends ElComputers {
    private String caseSize;

    public ElPC(String brand, double power, int ranGB, String processor, String caseSize) {
        super(brand, power, ranGB, processor);
        this.caseSize = caseSize;
    }

    public String getCaseSize() {
        return caseSize;
    }
    public void setCaseSize(String size) {
        this.caseSize = size;
    }
}
