public class Virus {
    protected String geneticMaterial;
    protected String shapeAndStructure;
    protected String hostBase;
    protected String baltimoreClassification;
    protected String transmissionMode;
    protected String pathogenicity;

    public Virus() {}

    public Virus(String geneticMaterial, String shapeAndStructure,
                 String hostBase, String baltimoreClassification,
                 String transmissionMode, String pathogenicity) {
        this.geneticMaterial = geneticMaterial;
        this.shapeAndStructure = shapeAndStructure;
        this.hostBase = hostBase;
        this.baltimoreClassification = baltimoreClassification;
        this.transmissionMode = transmissionMode;
        this.pathogenicity = pathogenicity;
    }

    @Override
    public String toString() {
        return "Virus{" +
                "geneticMaterial='" + geneticMaterial + '\'' +
                ", shapeAndStructure='" + shapeAndStructure + '\'' +
                ", hostBase='" + hostBase + '\'' +
                ", baltimoreClassification='" + baltimoreClassification + '\'' +
                ", transmissionMode='" + transmissionMode + '\'' +
                ", pathogenicity='" + pathogenicity + '\'' +
                '}';
    }
}
