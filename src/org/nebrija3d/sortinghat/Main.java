package org.nebrija3d.sortinghat;

public class Main {
    public static void main(String[] args) {
        int griffyndor = 0;
        int hufflepuff = 0;
        int ravenclaw = 0;
        int slytherin = 0;
        int number = 0;
        String respuesta = "";

        String[][] preguntas = new String[15][5];
        preguntas[0][0] = "1. ¿Que cualidad valoras más?";
        preguntas[0][1] = "a. Lealtad."; // Gryffindor
        preguntas[0][2] = "b. Sabiduría"; // Hufflepuff
        preguntas[0][3] = "c. Ambición"; // Slytherin
        preguntas[0][4] = "d. Valentía"; // Ravenclaw

        preguntas[1][0] = "2. ¿Que tipo de mascota preferirias tener?";
        preguntas[1][1] = "a. Lechuza."; // Gryffindor
        preguntas[1][2] = "b. Gato"; // Hufflepuff
        preguntas[1][3] = "c. Rata"; // Ravenclaw
        preguntas[1][4] = "d. Serpiente"; // Slytherin

        preguntas[2][0] = "3. ¿Cuál es tu asignatura favorita en Hogwarts?";
        preguntas[2][1] = "a. Pociones."; // Gryffindor
        preguntas[2][2] = "b. Adivinación"; //Slytherin
        preguntas[2][3] = "c. Herbología"; // Hufflepuff
        preguntas[2][4] = "d. Encantamientos"; // Ravenclaw

        preguntas[3][0] = "4. ¿Cuál es tu asignatura favorita en Hogwarts?";
        preguntas[3][1] = "a. Pociones"; // Gryffindor
        preguntas[3][2] = "b. Herbología"; //Hufflepuff
        preguntas[3][3] = "c. Adivinación"; // Slytherin
        preguntas[3][4] = "d. Encantamientos"; // Ravenclaw

        preguntas[4][0] = "5. ¿Cuál es tu asignatura favorita en Hogwarts?";
        preguntas[4][1] = "a. Pociones."; // Gryffindor
        preguntas[4][2] = "b. Adivinación"; //Slytherin
        preguntas[4][3] = "c. Herbología"; // Hufflepuff
        preguntas[4][4] = "d. Encantamientos"; // Ravenclaw

        preguntas[5][0] = "6. ¿Cuál es tu asignatura favorita en Hogwarts?";
        preguntas[5][1] = "a. Pociones."; // Gryffindor
        preguntas[5][2] = "b. Adivinación"; //Slytherin
        preguntas[5][3] = "c. Herbología"; // Hufflepuff
        preguntas[5][4] = "d. Encantamientos"; // Ravenclaw

        preguntas[6][0] = "7. ¿Cuál es tu asignatura favorita en Hogwarts?";
        preguntas[6][1] = "a. Pociones."; // Gryffindor
        preguntas[6][2] = "b. Adivinación"; //Slytherin
        preguntas[6][3] = "c. Herbología"; // Hufflepuff
        preguntas[6][4] = "d. Encantamientos"; // Ravenclaw

        while(number < 2) {
            System.out.println(preguntas[number][0]);

            for (int i = 1; i < 5; i++) {
                System.out.println("\t" + preguntas[number][i]);
            }

            griffyndor = respuesta.equals("a") ? griffyndor + 1 : griffyndor;
            hufflepuff = respuesta.equals("b") ? hufflepuff + 1 : hufflepuff;
            ravenclaw = respuesta.equals("c") ? ravenclaw + 1 : ravenclaw;
            slytherin = respuesta.equals("d") ? slytherin + 1 : slytherin;

            System.out.println(respuesta);
            number++;
        }
    }
}