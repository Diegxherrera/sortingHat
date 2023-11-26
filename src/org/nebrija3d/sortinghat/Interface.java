package org.nebrija3d.sortinghat;

import javax.swing.*;
import javax.swing.border.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    public static String phaseKey = "0";
    public static String gameSelection = "muggleOrWizard";
    public static int sortingHatIndex = 0;
    public static int gryffindorScore = 0;
    public static int slytherinScore = 0;
    public static int hufflepuffScore = 0;
    public static int ravenclawScore = 0;

    public static void main(String[] args) {
        JFrame ventanaDeInicio = new JFrame("Sorting Hat");
        ventanaDeInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaDeInicio.setSize(500,600);
        ventanaDeInicio.setResizable(false);
        ventanaDeInicio.setLocationRelativeTo(null);

        ImageIcon icono = new ImageIcon("");
        ventanaDeInicio.setIconImage(icono.getImage());

        JPanel textoDeInicio = new JPanel();
        ventanaDeInicio.add(textoDeInicio);
        textoDeInicio.setLayout(new BorderLayout());

        JLabel texto = new JLabel();
        texto.setText("<html>Bienvenido a esta aventura conversacional," +
                " en el que podras elegir entre hacer un test para determinar tu casa de " +
                "la conocida saga Harry Potter o vivir una aventura y por el camino descubrir si eres" +
                "un mago o un muggle.</html>");
        texto.setFont(new Font("Arial", Font.BOLD, 18));

        textoDeInicio.add(texto, BorderLayout.CENTER);
        texto.setVerticalAlignment(SwingConstants.TOP);
        textoDeInicio.setBorder(new EmptyBorder (79,70,70,70));

        JButton sombreroSeleccionador = new JButton("Sombrero Seleccionador");
        JButton magoOMuggle = new JButton("Mago o Muggle");

        JPanel panelBotones2 = new JPanel();
        panelBotones2.setLayout( new BorderLayout());
        JPanel buttonPanel2 =new JPanel();

        panelBotones2.add(magoOMuggle, BorderLayout.WEST);
        panelBotones2.add(sombreroSeleccionador, BorderLayout.EAST);

        textoDeInicio.add(panelBotones2, BorderLayout.SOUTH);

        buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));

        buttonPanel2.add(Box.createRigidArea(new Dimension(10, 0))); // Ajusta el valor 10 según tus necesidades
        buttonPanel2.add(magoOMuggle);
        buttonPanel2.add(Box.createRigidArea(new Dimension(30, 0)));
        buttonPanel2.add(sombreroSeleccionador);

        textoDeInicio.add(buttonPanel2, BorderLayout.SOUTH);

        Dimension nuevoTamano = new Dimension(100, 50);
        magoOMuggle.setPreferredSize(nuevoTamano);
        sombreroSeleccionador.setPreferredSize(nuevoTamano);

        magoOMuggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameSelection = "muggleOrWizard";
                ventanaDeInicio.dispose();
                ventanaDePreguntas();
            }
        });

        sombreroSeleccionador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameSelection = "sortingHat";
                ventanaDeInicio.dispose();
                ventanaDePreguntas();
            }
        });
        ventanaDeInicio.setVisible(true);
    }
    public static void ventanaDePreguntas() {
        JFrame frame = new JFrame("Sorting Hat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Cargar el ícono desde un archivo PNG
        ImageIcon icono = new ImageIcon("");

        // Establecer el ícono en la ventana principal
        frame.setIconImage(icono.getImage());

        // Panel principal
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new BorderLayout());

        //Texto
        JLabel mainOutput = new JLabel(DataManager.selectedGameChecker());
        mainOutput.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));

        panel.add(mainOutput, BorderLayout.CENTER);
        mainOutput.setVerticalAlignment(SwingConstants.CENTER);

        panel.setBorder(new EmptyBorder (50,50,70,50));

        // Botones
        JButton boton1 = new JButton("A");
        JButton boton2 = new JButton("B");
        JButton boton3 = new JButton("C");
        JButton boton4 = new JButton("D");

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER)); // Use FlowLayout for center alignment
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(boton4);

        if (phaseKey.equals("0")) {
            boton2.setVisible(false);
            boton3.setVisible(false);
            boton4.setVisible(false);
        }

        if (gameSelection.equals("sortingHat")) {
            boton2.setVisible(true);
            boton3.setVisible(true);
            boton4.setVisible(true);
        }

        frame.add(panelBotones, BorderLayout.SOUTH);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameSelection.equals("muggleOrWizard")) {
                    DataManager.nextPhaseKey("optionOne");
                    String newContent = DataManager.getMuggleWizardData(Interface.phaseKey, "mainOutput");
                    mainOutput.setText("<html>" + newContent + "</html>");
                    if (!phaseKey.equals("0")) {
                        boton2.setVisible(true);
                    }
                } else if (gameSelection.equals("sortingHat")) {
                    gryffindorScore++;
                    sortingHatIndex++;
                    String newContent = DataManager.getSortingHatData(sortingHatIndex);
                    mainOutput.setText("<html>" + newContent + "</html>");
                }
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameSelection.equals("muggleOrWizard")) {
                    DataManager.nextPhaseKey("optionTwo");
                    String newContent = DataManager.getMuggleWizardData(Interface.phaseKey, "mainOutput");
                    mainOutput.setText("<html>" + newContent + "</html>");
                    if (!phaseKey.equals("0")) {
                        boton2.setVisible(true);
                    }
                } else if (gameSelection.equals("sortingHat")) {
                    slytherinScore++;
                    sortingHatIndex++;
                    String newContent = DataManager.getSortingHatData(sortingHatIndex);
                    mainOutput.setText("<html>" + newContent + "</html>");
                }
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hufflepuffScore++;
                sortingHatIndex++;
                String newContent = DataManager.getSortingHatData(sortingHatIndex);
                mainOutput.setText("<html>" + newContent + "</html>");
            }
        });

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ravenclawScore++;
                sortingHatIndex++;
                String newContent = DataManager.getSortingHatData(sortingHatIndex);
                mainOutput.setText("<html>" + newContent + "</html>");
            }
        });
        frame.setVisible(true);
    }
    public static void ventanaDeGryffindor() {
        JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel principal para contenerlo
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);

        // Cargar el ícono desde un archivo PNG
        ImageIcon icono = new ImageIcon("../resources/HarryPoterLogo.png");

        // Establecer el ícono en la ventana principal
        ventanaFinal.setIconImage(icono.getImage());

        // Cargar la imagen
        ImageIcon imagen = new ImageIcon("../resources/gryffindor-removebg-preview.png");

        // Crear un JLabel para mostrar la imagen
        JLabel imagenDeLaCasa = new JLabel(imagen);

        // Redimensionar la imagen
        Image img = imagen.getImage();
        Image newImg = img.getScaledInstance(400, -1, Image.SCALE_SMOOTH);
        ImageIcon resizedImage = new ImageIcon(newImg);
        imagenDeLaCasa.setIcon(resizedImage);

        // Agregar la imagen al panel principal en la izquierda
        panelPrincipal.add(imagenDeLaCasa, BorderLayout.WEST);

        // Crear un JPanel para la explicación
        JPanel explicacionResultado = new JPanel(new BorderLayout());
        panelPrincipal.add(explicacionResultado, BorderLayout.CENTER);

        // Configurar la explicación
        JLabel explicacion = new JLabel("<html>Eres de la casa Gryffindor, conocida por su bravura y su determinación. <br> La casa Gryffindor valora la osadía, el coraje y la nobleza, por lo que no es sorprendente <br> que seas alguien que se destaca por su valentía y su disposición a enfrentar los desafíos,<br> sin importar lo grandes que sean.<br> Como Gryffindor, no tienes miedo de defender tus creencias y <br>luchar por lo que crees que es correcto,<br> lo que a veces puede llevar a que te metas en situaciones peligrosas.<br> Sin embargo, tu coraje y tu audacia a menudo inspiran a aquellos que te rodean.<br>Puede que a veces seas impulsivo, <br>pero tus acciones siempre están motivadas por la justicia <br> y la lealtad hacia tus seres queridos.<br> Eres un líder natural que se pone en pie ante la adversidad y <br> siempre está listo para enfrentar cualquier amenaza con valentía y determinación.</html>");
        explicacion.setFont(new Font("Arial", Font.PLAIN, 18));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        // Crear el botón
        JButton comienzo = new JButton("Volver a intentar");

        // Agregar el botón al panel de explicación
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBotones.add(comienzo);
        explicacionResultado.add(panelBotones, BorderLayout.SOUTH);
        explicacion.setBorder(new EmptyBorder(0, 0, 0, 10));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        JPanel panelBotones3 = new JPanel();
        panelBotones3.setLayout( new BorderLayout());
        JPanel buttonPanel3 =new JPanel();

        panelBotones3.add(comienzo, BorderLayout.EAST);

        explicacionResultado.add(panelBotones3, BorderLayout.SOUTH);

        buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.X_AXIS));

        buttonPanel3.add(Box.createRigidArea(new Dimension(500, 100)));
        buttonPanel3.add(comienzo);

        explicacionResultado.add(buttonPanel3, BorderLayout.SOUTH);

        Dimension nuevoTamano = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamano);

        comienzo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Hacer que el boton te mande a la ventana inicial
            }
        });

        // Ajustar el tamano de la ventana
        ventanaFinal.pack();
        ventanaFinal.setSize(1150, 700);
        ventanaFinal.setVisible(true);
    }
    public static void ventanaDeSlytherin() {
        JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);

        ImageIcon icono = new ImageIcon("../resources/HarryPoterLogo.png");
        ventanaFinal.setIconImage(icono.getImage());

        ImageIcon imagen = new ImageIcon("../resources/slytherin-removebg-preview.png");

        JLabel imagenDeLaCasa = new JLabel(imagen);

        Image img = imagen.getImage();
        Image newImg = img.getScaledInstance(400, -1, Image.SCALE_SMOOTH);
        ImageIcon resizedImage = new ImageIcon(newImg);
        imagenDeLaCasa.setIcon(resizedImage);

        panelPrincipal.add(imagenDeLaCasa, BorderLayout.WEST);

        JPanel explicacionResultado = new JPanel(new BorderLayout());
        panelPrincipal.add(explicacionResultado, BorderLayout.CENTER);

        JLabel explicacion = new JLabel("<html>Eres de la casa Slytherin, famosa por su astucia y ambición. " +
                "<br>Slytherin valora la inteligencia, la determinación y el poder, y <br> es muy probable que seas " +
                "alguien que no tiene miedo de luchar por lo que quiere.<br> Como Slytherin, tienes un sentido " +
                "innato de autoconservación y <br> eres capaz de tomar decisiones difíciles cuando es necesario. " +
                "<br>Eres inteligente y táctico, siempre pensando en el siguiente paso antes de actuar." +
                "<br> Este pragmatismo te ayuda a lograr tus metas,<br> aunque a veces puedas parecer un " +
                "poco calculador a los demás. <br>Eso no significa que no te importen las personas: puedes ser leal a" +
                " aquellos que han ganado tu confianza y<br> siempre cuidarás de los tuyos. <br>Puedes ser misterioso" +
                " y a veces intimidante, pero tu ambición y<br> tu deseo de éxito son simplemente inigualables</html>");
        explicacion.setFont(new Font("Arial", Font.PLAIN, 18));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        JButton comienzo = new JButton("Volver a intentar");

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBotones.add(comienzo);
        explicacionResultado.add(panelBotones, BorderLayout.SOUTH);
        explicacion.setBorder(new EmptyBorder(0, 0, 0, 10));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        JPanel panelBotones3 = new JPanel();
        panelBotones3.setLayout( new BorderLayout());
        JPanel buttonPanel3 =new JPanel();

        panelBotones3.add(comienzo, BorderLayout.EAST);

        explicacionResultado.add(panelBotones3, BorderLayout.SOUTH);

        buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.X_AXIS));

        buttonPanel3.add(Box.createRigidArea(new Dimension(500, 100)));
        buttonPanel3.add(comienzo);


        explicacionResultado.add(buttonPanel3, BorderLayout.SOUTH);

        Dimension nuevoTamano = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamano);

        comienzo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Hacer que el boton te mande a la ventana inicial
            }
        });

        ventanaFinal.pack();
        ventanaFinal.setSize(1150, 700);
        ventanaFinal.setVisible(true);
    }
    public static void ventanaDeHufflepuff() {

        JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);

        ImageIcon icono = new ImageIcon("../resources/HarryPoterLogo.png");

        ventanaFinal.setIconImage(icono.getImage());

        ImageIcon imagen = new ImageIcon("../resources/hufflepuff-removebg-preview.png");

        JLabel imagenDeLaCasa = new JLabel(imagen);

        Image img = imagen.getImage();
        Image newImg = img.getScaledInstance(400, -1, Image.SCALE_SMOOTH);
        ImageIcon resizedImage = new ImageIcon(newImg);
        imagenDeLaCasa.setIcon(resizedImage);

        panelPrincipal.add(imagenDeLaCasa, BorderLayout.WEST);

        JPanel explicacionResultado = new JPanel(new BorderLayout());
        panelPrincipal.add(explicacionResultado, BorderLayout.CENTER);

        JLabel explicacion = new JLabel("<html>Eres de la casa Hufflepuff, famosa por su lealtad y su amor por el trabajo duro.<br> La casa Hufflepuff valora la paciencia, la justicia y la dedicación,<br> por lo que probablemente seas alguien conocido por tu amabilidad y tu disposición a ayudar a los demás.<br>Como Hufflepuff, siempre estás dispuesto a poner el esfuerzo necesario para conseguir lo que quieres,<br> sin importar cuánto trabajo requiera.<br> Eres confiable y digno de confianza, y tus amigos siempre pueden contar contigo en momentos de necesidad.<br>Eres modesto y a menudo subestimado, pero siempre estás listo para demostrar de lo que eres capaz.</html>");
        explicacion.setFont(new Font("Arial", Font.PLAIN, 18));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        JButton comienzo = new JButton("Volver a intentar");

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBotones.add(comienzo);
        explicacionResultado.add(panelBotones, BorderLayout.SOUTH);
        explicacion.setBorder(new EmptyBorder(0, 0, 0, 10));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        JPanel panelBotones3 = new JPanel();
        panelBotones3.setLayout( new BorderLayout());
        JPanel buttonPanel3 =new JPanel();

        panelBotones3.add(comienzo, BorderLayout.EAST);

        explicacionResultado.add(panelBotones3, BorderLayout.SOUTH);

        buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.X_AXIS));
        buttonPanel3.add(Box.createRigidArea(new Dimension(500, 100)));
        buttonPanel3.add(comienzo);

        explicacionResultado.add(buttonPanel3, BorderLayout.SOUTH);

        Dimension nuevoTamano = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamano);

        comienzo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Hacer que el boton te mande a la ventana inicial
            }
        });

        ventanaFinal.pack();
        ventanaFinal.setSize(1150, 700);
        ventanaFinal.setVisible(true);
    }
    public static void ventanaDeRavenclaw() {
        JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);

        ImageIcon icono = new ImageIcon("../resources/HarryPoterLogo.png");

        ventanaFinal.setIconImage(icono.getImage());

        ImageIcon imagen = new ImageIcon("../resources/ravenclaw-removebg-preview.png");

        JLabel imagenDeLaCasa = new JLabel(imagen);

        Image img = imagen.getImage();
        Image newImg = img.getScaledInstance(400, -1, Image.SCALE_SMOOTH);
        ImageIcon resizedImage = new ImageIcon(newImg);
        imagenDeLaCasa.setIcon(resizedImage);

        panelPrincipal.add(imagenDeLaCasa, BorderLayout.WEST);

        JPanel explicacionResultado = new JPanel(new BorderLayout());
        panelPrincipal.add(explicacionResultado, BorderLayout.CENTER);

        JLabel explicacion = new JLabel("<html>Eres de la casa Ravenclaw, conocida por su amor por el aprendizaje y la sabiduría.<br> La casa Ravenclaw valora la inteligencia, el ingenio y la creatividad,<br> por lo que probablemente seas alguien que siempre está buscando nuevas ideas y conocimientos. <br>Como Ravenclaw, tienes una mente inquisitiva y siempre estás dispuesto a explorar y<br> aprender cosas nuevas.<br> Te encantan los desafíos intelectuales y siempre estás buscando formas de ampliar tus horizontes <br>y conocer más sobre el mundo que te rodea.<br>Eres un pensador original que no tiene miedo de ser diferente</html>");
        explicacion.setFont(new Font("Arial", Font.PLAIN, 18));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        JButton comienzo = new JButton("Volver a intentar");

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBotones.add(comienzo);
        explicacionResultado.add(panelBotones, BorderLayout.SOUTH);
        explicacion.setBorder(new EmptyBorder(0, 0, 0, 10));
        explicacionResultado.add(explicacion, BorderLayout.EAST);

        JPanel panelBotones3 = new JPanel();
        panelBotones3.setLayout( new BorderLayout());
        JPanel buttonPanel3 =new JPanel();

        panelBotones3.add(comienzo, BorderLayout.EAST);

        explicacionResultado.add(panelBotones3, BorderLayout.SOUTH);

        buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.X_AXIS));

        buttonPanel3.add(Box.createRigidArea(new Dimension(500, 100))); // Ajusta el valor 10 según tus necesidades
        buttonPanel3.add(comienzo);

        explicacionResultado.add(buttonPanel3, BorderLayout.SOUTH);

        Dimension nuevoTamano = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamano);

        comienzo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Hacer que el boton te mande a la ventana inicial
            }
        });

        ventanaFinal.pack();
        ventanaFinal.setSize(1150, 700);
        ventanaFinal.setVisible(true);
    }
}