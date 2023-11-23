package org.nebrija3d.sortinghat;

import javax.swing.*;

public class SortingHat {
    public static String mainOutputText;
    public static String answer1;
    public static String answer2;
    public static String answer3;
    public static String answer4;
    public static String respuesta = "";
    int griffyndor = 0;
    int hufflepuff = 0;
    int ravenclaw = 0;
    int slytherin = 0;
    public static int index = 0;

    public static String getSortingHatData() {
        String[][] preguntas = new String[10][5];
        switch(index) {
            case 0:
                mainOutputText = preguntas[0][0];
                answer1 = preguntas[0][1];
                answer2 = preguntas[0][2];
                answer3 = preguntas[0][3];
                answer4 = preguntas[0][4];
            case 1:
                mainOutputText = preguntas[1][0];
                answer1 = preguntas[1][1];
                answer2 = preguntas[1][2];
                answer3 = preguntas[1][3];
                answer4 = preguntas[1][4];
            case 2:
                mainOutputText = preguntas[2][0];
                answer1 = preguntas[2][1];
                answer2 = preguntas[2][2];
                answer3 = preguntas[2][3];
                answer4 = preguntas[2][4];
            case 3:
                mainOutputText = preguntas[3][0];
                answer1 = preguntas[3][1];
                answer2 = preguntas[3][2];
                answer3 = preguntas[3][3];
                answer4 = preguntas[3][4];
            case 4:
                mainOutputText = preguntas[4][0];
                answer1 = preguntas[4][1];
                answer2 = preguntas[4][2];
                answer3 = preguntas[4][3];
                answer4 = preguntas[4][4];
            case 5:
                mainOutputText = preguntas[5][0];
                answer1 = preguntas[5][1];
                answer2 = preguntas[5][2];
                answer3 = preguntas[5][3];
                answer4 = preguntas[5][4];
            case 6:
                mainOutputText = preguntas[6][0];
                answer1 = preguntas[6][1];
                answer2 = preguntas[6][2];
                answer3 = preguntas[6][3];
                answer4 = preguntas[6][4];
            case 7:
                mainOutputText = preguntas[7][0];
                answer1 = preguntas[7][1];
                answer2 = preguntas[7][2];
                answer3 = preguntas[7][3];
                answer4 = preguntas[7][4];
            case 8:
                mainOutputText = preguntas[8][0];
                answer1 = preguntas[8][1];
                answer2 = preguntas[8][2];
                answer3 = preguntas[8][3];
                answer4 = preguntas[8][4];
            case 9:
                mainOutputText = preguntas[9][0];
                answer1 = preguntas[9][1];
                answer2 = preguntas[9][2];
                answer3 = preguntas[9][3];
                answer4 = preguntas[9][4];
        }
        preguntas[0][0] = "1. ¿Que cualidad valoras más?";
        preguntas[0][1] = "A. Lealtad."; // Gryffindor
        preguntas[0][2] = "B. Sabiduría"; // Ravenclaw
        preguntas[0][3] = "C. Ambición"; // Hufflepuff
        preguntas[0][4] = "D. Valentía"; // Slytherin

        preguntas[1][0] = "2. ¿Que tipo de mascota preferirias tener?";
        preguntas[1][1] = "A. Lechuza"; // Ravenclaw
        preguntas[1][2] = "B. Gato"; // Hufflepuff
        preguntas[1][3] = "C. Rata"; // Gryffindor
        preguntas[1][4] = "D. Serpiente"; // Slytherin

        preguntas[2][0] = "3. ¿Cuál es tu asignatura favorita en Hogwarts?";
        preguntas[2][1] = "A. Pociones"; // Gryffindor
        preguntas[2][2] = "B. Adivinación"; //Slytherin
        preguntas[2][3] = "C. Herbología"; // Hufflepuff
        preguntas[2][4] = "D. Encantamientos"; // Ravenclaw

        preguntas[3][0] = "4. ¿Qué cualidad personal crees que te define más?";
        preguntas[3][1] = "A. Coraje"; // Gryffindor
        preguntas[3][2] = "B. Inteligencia"; // Ravenclaw
        preguntas[3][3] = "C. Lealtad"; // Hufflepuff
        preguntas[3][4] = "D. Astucia"; // Slytherin

        preguntas[4][0] = "5. ¿Qué te gustaría hacer en tu tiempo libre en Hogwarts?";
        preguntas[4][1] = "A. Explorar el castillo"; // Gryffindor
        preguntas[4][2] = "B. Estudiar en la biblioteca"; // Ravenclaw
        preguntas[4][3] = "C. Pasar tiempo con amigos"; // Hufflepuff
        preguntas[4][4] = "D. Planear estrategias"; // Slytherin

        preguntas[5][0] = "6. ¿Cuál de las siguientes criaturas mágicas te atrae más?";
        preguntas[5][1] = "A. Hipogrifo"; // Gryffindor
        preguntas[5][2] = "B. Trasgo"; // Ravenclaw
        preguntas[5][3] = "C. Elfo doméstico"; // Hufflepuff
        preguntas[5][4] = "D. Basilisco"; // Slytherin

        preguntas[6][0] = "7. ¿En qué tipo de tarea destacas más?";
        preguntas[6][1] = "A. Enfrentar desafíos físicos"; // Slytherin
        preguntas[6][2] = "B. Resolver acertijos "; // Gryffindor
        preguntas[6][3] = "C. Ayudar a los demás"; // Ravenclaw
        preguntas[6][4] = "D. Lograr objetivos ambiciosos"; // Hufflepuff

        preguntas[7][0] = "8. ¿Cómo decides afrontar los desafíos?";
        preguntas[7][1] = "A. Con ayuda de tus compañeros"; // Hufflepuff
        preguntas[7][2] = "B. Encontraré el modo de hacerlo, sólo dame tiempo"; // Slytherin
        preguntas[7][3] = "C. Uniendo a toda mi casa en favor de solucionarlo"; // Gryffindor
        preguntas[7][4] = "D. Teorizar sobre el tema es más rápido"; // Gryffindor

        preguntas[8][0] = "9. Si te enfrentaras a un desafío mágico, ¿Qué hechizo utilizas?";
        preguntas[8][1] = "A. Expelliarmus"; // Gryffindor
        preguntas[8][2] = "B. Lumos Maxima"; // Ravenclaw
        preguntas[8][3] = "C. Alohomora"; // Slytherin
        preguntas[8][4] = "D. Sectumsempra"; // Hufflepuff

        preguntas[9][0] = "10. ¿Confías más en el instinto, el análisis, conocimiento o las influencias externas?";
        preguntas[9][1] = "A. Instinto"; // Gryffindor
        preguntas[9][2] = "B. Análisis"; // Hufflepuff
        preguntas[9][3] = "C. Conocimientos"; // Ravenclaw
        preguntas[9][4] = "D. Influencias externas"; // Slytherin

        return "<br> "+ preguntas[index][1] + "<br>" +
                preguntas[index][2] + "<br> "+ preguntas[index][3] + "<br>" +
                preguntas[index][4];
    }

    public static void updateUI() {

    }
}