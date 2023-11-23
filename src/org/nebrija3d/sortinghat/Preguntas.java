package org.nebrija3d.sortinghat;

public class Preguntas {

    public String introduccion(String nombre, int edad) {

        String result = "Eres " + nombre + " un@ joven de " + edad + " con una vida bastante ordinaria."
                + " Tus días transcurren entre \nla escuela,"
                + " los amigos y tu pasión secreta: los rompecabezas y los enigmas."
                + " Aunque nunca \nte ha ocurrido nada extraordinario, "
                + "en el fondo de tu ser hay un sentimiento que te dice que\nestás destinado "
                + "a algo grande, algo... mágico.\n"
                + "Un sábado lluvioso, mientras ayudas en la limpieza "
                + "de la antigua biblioteca del pueblo, \nun libro cubierto de polvo cae de una "
                + "estantería directamente a tus pies.\n"
                + "La tapa es de cuero y parece más antiguo que la propia biblioteca.\n"
                + "Al tocarlo, sientes un cosquilleo que recorre tus dedos.";

        return result;
    }

    public String preguntaUno() {

        String result = "Pregunta 1: El Encuentro con el Libro\n"
                + "1) ¿Sientes la emoción burbujear dentro de ti? "
                + "Tomas el libro y lo abres con una mezcla \nde anticipación y un poco de temor.\n"
                + "2) ¿La sorpresa te deja paralizado un momento,"
                + "pero luego te inclinas por la precaución \ny decides colocar el libro en el carrito "
                + "de devoluciones?";

        return result;
    }

    public String preguntaUnoEleccionUno() {

        String result = "El libro se abre en una página que parece brillar con "
                + "luz propia. Las letras danzan ante \ntus ojos y una voz suave, "
                + "casi como un susurro, te invita a adentrarte en sus secretos.\n "
                + "Sientes que este es el momento que has estado esperando toda tu vida.";

        return result;
    }

    public String preguntaUnoEleccionDos() {

        String result = "Mientras te alejas, el libro se cae del carrito y se "
                + "abre en una página que emite un brillo tenue. \nNo puedes evitar "
                + "sentirte intrigado. Es como si el libro se negara a ser ignorado.\n "
                + "¿Será la curiosidad más fuerte que tu cautela?";

        return result;
    }

    public String preguntaDos() {

        String result = "Pregunta 2: La Desición de investigar\n"
                + "1) ¿Decides seguir el llamado de la aventura y leer lo que el "
                + "libro tiene para mostrarte?\n"
                + "2) ¿Prefieres ser prudente y buscar "
                + "ayuda para entender mejor el fenómeno?\n";

        return result;
    }

    public String preguntaDosEleccionUno() {

        String result = "Cada palabra que lees te hace sentir más vivo, más vibrante. \n"
                + "Y con un poco de temor y adrenalina decides llevarlo contigo a casa.\n"
                + "Noche tras noche, el libro aparece en tus sueños.";

        return result;
    }

    public String preguntaDosEleccionDos() {

        String result = "Optas por buscar ayuda, pero justo antes de hablar con "
                + "el bibliotecario te das cuenta de que una parte "
                + "de ti anhela saber \nqué secretos esconde ese libro y decides"
                + "llevarlo a casa. Noche tras noche, el libro aparece en tus sueños, "
                + "llamándote.";

        return result;
    }

    public String preguntaTresOpcionUno() {

        String result = "Pregunta 3: La Invitación Onírica\n"
                + "Finalmente llegas a la última página que está en blanco, te quedas "
                + "mirando fijamente y tras \nunos segundos aparecen letras, el libro "
                + "te escribe!, y te dice \n-quieres saber un poco más acerca de la magia. \n"
                + "1) Si, cedes a la llamada de tus sueños y decides adentrarte en "
                + "una aventura y sumergirte en misterios.\n"
                + "2) No, te resistes a la tentación y llevas el libro al bibliotecario.\n";

        return result;
    }

    public String preguntaTresOpcionDos() {

        String result = "Pregunta 3: La Invitación Onírica\n"
                + "1) ¿Cedes a la llamada de tus sueños y decides estudiar el "
                + "libro por tu cuenta, dispuesto a sumergirte en sus misterios?\n"
                + "2) ¿Te resistes a la tentación y llevas el libro al bibliotecario\n "
                + "del pueblo?";

        return result;
    }
}