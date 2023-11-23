package org.nebrija3d.sortinghat;

public class MuggleOrWizard {
    private String phaseKey = "0";
    private String optionOne = "";
    private String optionTwo = "";
    private String mainOutput = "";
    private String[] nextPhases = new String[2];

    public String retrieveData(String phaseRequested) {
        switch (phaseRequested) {
            case "0":
                assignData("","","En esta historia encontrarás respuestas" +
                        "si eres un muggle o un mago, elije una de ellas y adentrate en este" +
                        "mundo.", new String[]{"1A", "1B"});
                updateUI();
                break;
            case "1A":
                assignData("","","Mientras te aventurabas en el Bosque Prohibido," +
                        " los antiguos árboles se cernían sobre ti, proyectando sombras inquietantes. De repente, " +
                        "tropezaste con un objeto peculiar. Era un mapa mágico que parecía revelar pasajes ocultos " +
                        "y ubicaciones secretas.\n" +
                        "A. Descartándolo como un simple mapa curioso, decides seguir explorando como un muggle." +
                        "B. Intrigado, tocas el mapa con tu varita, revelando un camino hacia el corazón del bosque." +
                        "\n", new String[]{"",""});
                updateUI();
                break;
            case "1B":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "2A":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "2B":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "2C":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "2D":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "3A":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "3B":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "3C":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "3D":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "3E":
                assignData("","","", new String[]{"",""});
                updateUI();
                break;
            case "3F":
            case "3G":
            case "3H":
            case "4A":
            case "4B":
            case "4C":
            case "4D":
            case "4E":
            case "4F":
            case "4G":
            case "4H":
            case "4I":
            case "4J":
            case "4K":
            case "4L":
            case "4M":
            case "4N":
            case "4O":
            case "4P":
            case "5A":
            case "5B":
            case "5C":
            case "5D":
            case "5E":
            case "5F":
            case "5G":
            case "5H":
            case "5I":
            case "5J":
            default:
        }
        return "e";
    }

    private void updateUI() {

    }

    public void assignData(String optionOne, String optionTwo, String mainOutput, String[] nextPhases) {
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.mainOutput = mainOutput;
        this.nextPhases[0] = nextPhases[0];
        this.nextPhases[1] = nextPhases[1];
    }
    public void Phases() {

    }
}