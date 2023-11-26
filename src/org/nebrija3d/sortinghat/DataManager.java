package org.nebrija3d.sortinghat;

public class DataManager {
    static String[][] sortingHatQuestions = new String[10][5];
    static String[] nextPhases = new String[2];

    public DataManager() {
        // Sorting Hat questions
        sortingHatQuestions[0][0] = "1. ¿Que cualidad valoras más?";
        sortingHatQuestions[0][1] = "A. Lealtad."; // Gryffindor
        sortingHatQuestions[0][2] = "B. Valentía"; // Slytherin
        sortingHatQuestions[0][3] = "C. Ambición"; // Hufflepuff
        sortingHatQuestions[0][4] = "D. Sabiduría"; // Ravenclaw

        sortingHatQuestions[1][0] = "2. ¿Que tipo de mascota preferirias tener?";
        sortingHatQuestions[1][1] = "A. Rata"; // Gryffindor
        sortingHatQuestions[1][2] = "B. Serpiente"; // Slytherin
        sortingHatQuestions[1][3] = "C. Gato"; // Hufflepuff
        sortingHatQuestions[1][4] = "D. Lechuza"; // Ravenclaw

        sortingHatQuestions[2][0] = "3. ¿Cuál es tu asignatura favorita en Hogwarts?";
        sortingHatQuestions[2][1] = "A. Pociones"; // Gryffindor
        sortingHatQuestions[2][2] = "B. Adivinación"; // Slytherin
        sortingHatQuestions[2][3] = "C. Lograr objetivos ambiciosos"; // Hufflepuff
        sortingHatQuestions[2][4] = "D. Herbología"; // Ravenclaw

        sortingHatQuestions[3][0] = "4. ¿Qué cualidad personal crees que te define más?";
        sortingHatQuestions[3][1] = "A. Coraje"; // Gryffindor
        sortingHatQuestions[3][2] = "B. Astucia"; // Slytherin
        sortingHatQuestions[3][3] = "C. Lealtad"; // Hufflepuff
        sortingHatQuestions[3][4] = "D. Inteligencia"; // Ravenclaw

        sortingHatQuestions[4][0] = "5. ¿Qué te gustaría hacer en tu tiempo libre en Hogwarts?";
        sortingHatQuestions[4][1] = "A. Explorar el castillo"; // Gryffindor
        sortingHatQuestions[4][2] = "B. Planear estrategias"; // Slytherin
        sortingHatQuestions[4][3] = "C. Pasar tiempo con amigos"; // Hufflepuff
        sortingHatQuestions[4][4] = "D. Estudiar en la biblioteca"; // Ravenclaw

        sortingHatQuestions[5][0] = "6. ¿Cuál de las siguientes criaturas mágicas te atrae más?";
        sortingHatQuestions[5][1] = "A. Hipogrifo"; // Gryffindor
        sortingHatQuestions[5][2] = "B. Basilisco"; // Slytherin
        sortingHatQuestions[5][3] = "C. Elfo doméstico"; // Hufflepuff
        sortingHatQuestions[5][4] = "D. Trasgo"; // Ravenclaw

        sortingHatQuestions[6][0] = "7. ¿En qué tipo de tarea destacas más?";
        sortingHatQuestions[6][1] = "A. Resolver acertijos "; // Gryffindor
        sortingHatQuestions[6][2] = "B. Enfrentar desafíos físicos"; // Slytherin
        sortingHatQuestions[6][3] = "C. Ayudar a los demás"; // Hufflepuff
        sortingHatQuestions[6][4] = "D. Lograr objetivos ambiciosos"; // Ravenclaw

        sortingHatQuestions[7][0] = "8. ¿Cómo decides afrontar los desafíos?";
        sortingHatQuestions[7][1] = "A. Uniendo a toda mi casa en favor de solucionarlo"; // Gryffindor
        sortingHatQuestions[7][2] = "B. Encontraré el modo de hacerlo, sólo dame tiempo"; // Slytherin
        sortingHatQuestions[7][3] = "C. Con ayuda de tus compañeros"; // Hufflepuff
        sortingHatQuestions[7][4] = "D. Teorizar sobre el tema es más rápido"; // Ravenclaw

        sortingHatQuestions[8][0] = "9. Si te enfrentaras a un desafío mágico, ¿Qué hechizo utilizas?";
        sortingHatQuestions[8][1] = "A. Expelliarmus"; // Gryffindor
        sortingHatQuestions[8][2] = "B. Alohomora"; // Slytherin
        sortingHatQuestions[8][3] = "C. Sectumsempra"; // Hufflepuff
        sortingHatQuestions[8][4] = "D. Lumos Maxima"; // Ravenclaw

        sortingHatQuestions[9][0] = "10. ¿Confías más en el instinto, el análisis, conocimiento o las influencias externas?";
        sortingHatQuestions[9][1] = "A. Instinto"; // Gryffindor
        sortingHatQuestions[9][2] = "B. Influencias externas"; // Slytherin
        sortingHatQuestions[9][3] = "C. Análisis"; // Hufflepuff
        sortingHatQuestions[9][4] = "D. Conocimientos"; // Ravenclaw
    }

    public static String getSortingHatData(int question) {
        String methodOutput = "";
        for (int i = 0; i < 4; i++) {
            methodOutput += sortingHatQuestions[question][i] + "<br>";
        }
        return methodOutput;
    }
    public static String getMuggleWizardData(String phaseKey, String requestedContent) {
        switch (phaseKey) {
            case "0":
                return requestSortingHatContent("En esta historia encontrarás respuestas" +
                        " sobre si eres un muggle o un mago, elije una de ellas y adentrate en este" +
                        "mundo.", new String[]{"1A", "1B"}, requestedContent);
            case "1A":
                return requestSortingHatContent("ddd", new String[]{"2A","2B"}, requestedContent);
            case "1B":
                return requestSortingHatContent(Preguntas.preguntaUno(), new String[]{"2C","2D"}, requestedContent);
            case "2A":
                return requestSortingHatContent("", new String[]{"",""}, requestedContent);
            case "2B":
                return requestSortingHatContent("", new String[]{"",""}, requestedContent);
            case "2C":
                return requestSortingHatContent(Preguntas.preguntaUnoEleccionUno(), new String[]{"",""}, requestedContent);
            case "2D":
                return requestSortingHatContent(Preguntas.preguntaUnoEleccionDos(), new String[]{"",""}, requestedContent);
            case "3A":
                return requestSortingHatContent(Preguntas.preguntaUnoEleccionUno(), new String[]{"",""}, requestedContent);
            case "3B":
                return requestSortingHatContent("", new String[]{"",""}, requestedContent);
            case "3C":
                return requestSortingHatContent("", new String[]{"",""}, requestedContent);
            case "3D":
                return requestSortingHatContent("", new String[]{"",""}, requestedContent);
            default:
                return "Something is not working quite well in retrieveData().";
        }
    }
    public static String requestSortingHatContent(String mainOutput,
                                      String[] nextPhases, String requestedContent) {
        DataManager.nextPhases[0] = nextPhases[0];
        DataManager.nextPhases[1] = nextPhases[1];
        return mainOutput;
    }
    public static void nextPhaseKey(String option) {
        if (option.equals("optionOne")) {
            Interface.phaseKey = nextPhases[0];
        } else if (option.equals("optionTwo")) {
            Interface.phaseKey = nextPhases[1];
        }
    }
    public static String selectedGameChecker() {
        if (Interface.gameSelection.equals("muggleOrWizard")) {
            return "<html>" + DataManager.getMuggleWizardData(Interface.phaseKey,
                    "mainOutput") + "</html>";
        } else if (Interface.gameSelection.equals("sortingHat")) {
            return "<html>" + DataManager.getSortingHatData(0) + "<html>";
        } else {
            return "The Game Checker method is not woking as expected.";
        }
    }
}