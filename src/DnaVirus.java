public class DnaVirus extends Virus {
    protected String singleStranded;
    protected String doubleStranded;

    public DnaVirus() {}

    public DnaVirus(String geneticMaterial, String shapeAndStructure,
                    String hostBase, String baltimoreClassification,
                    String transmissionMode, String pathogenicity,
                    String singleStranded, String doubleStranded) {
        super(geneticMaterial, shapeAndStructure,
                hostBase, baltimoreClassification,
                transmissionMode, pathogenicity);
        this.singleStranded = singleStranded;
        this.doubleStranded = doubleStranded;
    }

    @Override
    public String toString() {
        return "DnaVirus{" +
                "singleStranded='" + singleStranded + '\'' +
                ", doubleStranded='" + doubleStranded + '\'' +
                "} " + super.toString();
    }
}
