package org.nebrija3d.sortinghat;

public class DataManager {
    static String[][] sortingHatQuestions = new String[10][5];

    public DataManager() {
        // Sorting Hat questions
        sortingHatQuestions[0][0] = "1. ¿Que cualidad valoras más?";
        sortingHatQuestions[0][1] = "A. Lealtad."; // Gryffindor
        sortingHatQuestions[0][2] = "B. Sabiduría"; // Ravenclaw
        sortingHatQuestions[0][3] = "C. Ambición"; // Hufflepuff
        sortingHatQuestions[0][4] = "D. Valentía"; // Slytherin

        sortingHatQuestions[1][0] = "2. ¿Que tipo de mascota preferirias tener?";
        sortingHatQuestions[1][1] = "A. Lechuza"; // Ravenclaw
        sortingHatQuestions[1][2] = "B. Gato"; // Hufflepuff
        sortingHatQuestions[1][3] = "C. Rata"; // Gryffindor
        sortingHatQuestions[1][4] = "D. Serpiente"; // Slytherin

        sortingHatQuestions[2][0] = "3. ¿Cuál es tu asignatura favorita en Hogwarts?";
        sortingHatQuestions[2][1] = "A. Pociones"; // Gryffindor
        sortingHatQuestions[2][2] = "B. Adivinación"; //Slytherin
        sortingHatQuestions[2][3] = "C. Herbología"; // Hufflepuff
        sortingHatQuestions[2][4] = "D. Encantamientos"; // Ravenclaw

        sortingHatQuestions[3][0] = "4. ¿Qué cualidad personal crees que te define más?";
        sortingHatQuestions[3][1] = "A. Coraje"; // Gryffindor
        sortingHatQuestions[3][2] = "B. Inteligencia"; // Ravenclaw
        sortingHatQuestions[3][3] = "C. Lealtad"; // Hufflepuff
        sortingHatQuestions[3][4] = "D. Astucia"; // Slytherin

        sortingHatQuestions[4][0] = "5. ¿Qué te gustaría hacer en tu tiempo libre en Hogwarts?";
        sortingHatQuestions[4][1] = "A. Explorar el castillo"; // Gryffindor
        sortingHatQuestions[4][2] = "B. Estudiar en la biblioteca"; // Ravenclaw
        sortingHatQuestions[4][3] = "C. Pasar tiempo con amigos"; // Hufflepuff
        sortingHatQuestions[4][4] = "D. Planear estrategias"; // Slytherin

        sortingHatQuestions[5][0] = "6. ¿Cuál de las siguientes criaturas mágicas te atrae más?";
        sortingHatQuestions[5][1] = "A. Hipogrifo"; // Gryffindor
        sortingHatQuestions[5][2] = "B. Trasgo"; // Ravenclaw
        sortingHatQuestions[5][3] = "C. Elfo doméstico"; // Hufflepuff
        sortingHatQuestions[5][4] = "D. Basilisco"; // Slytherin

        sortingHatQuestions[6][0] = "7. ¿En qué tipo de tarea destacas más?";
        sortingHatQuestions[6][1] = "A. Enfrentar desafíos físicos"; // Slytherin
        sortingHatQuestions[6][2] = "B. Resolver acertijos "; // Gryffindor
        sortingHatQuestions[6][3] = "C. Ayudar a los demás"; // Ravenclaw
        sortingHatQuestions[6][4] = "D. Lograr objetivos ambiciosos"; // Hufflepuff

        sortingHatQuestions[7][0] = "8. ¿Cómo decides afrontar los desafíos?";
        sortingHatQuestions[7][1] = "A. Con ayuda de tus compañeros"; // Hufflepuff
        sortingHatQuestions[7][2] = "B. Encontraré el modo de hacerlo, sólo dame tiempo"; // Slytherin
        sortingHatQuestions[7][3] = "C. Uniendo a toda mi casa en favor de solucionarlo"; // Gryffindor
        sortingHatQuestions[7][4] = "D. Teorizar sobre el tema es más rápido"; // Gryffindor

        sortingHatQuestions[8][0] = "9. Si te enfrentaras a un desafío mágico, ¿Qué hechizo utilizas?";
        sortingHatQuestions[8][1] = "A. Expelliarmus"; // Gryffindor
        sortingHatQuestions[8][2] = "B. Lumos Maxima"; // Ravenclaw
        sortingHatQuestions[8][3] = "C. Alohomora"; // Slytherin
        sortingHatQuestions[8][4] = "D. Sectumsempra"; // Hufflepuff

        sortingHatQuestions[9][0] = "10. ¿Confías más en el instinto, el análisis, conocimiento o las influencias externas?";
        sortingHatQuestions[9][1] = "A. Instinto"; // Gryffindor
        sortingHatQuestions[9][2] = "B. Análisis"; // Hufflepuff
        sortingHatQuestions[9][3] = "C. Conocimientos"; // Ravenclaw
        sortingHatQuestions[9][4] = "D. Influencias externas"; // Slytherin

        // Muggle or Wizard story assignments

    }

    public static String getSortingHatData(int question, int answer) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                return getSortingHatData(i,j);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        getSortingHatData(1,2);
    }
}