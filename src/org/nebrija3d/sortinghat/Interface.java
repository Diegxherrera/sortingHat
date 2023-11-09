package org.nebrija3d.sortinghat;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.font.*;
import java.awt.image.BufferedImage;

public class Interface {
	
	static JPanel imagenResultado;
	private static  JLabel imagenDeLaCasa1;
	private static  ImageIcon imagen;
	
	public static void main(String[] args) {
		JFrame ventanaDeInicio = new JFrame("Ventana de inicio");
		ventanaDeInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tamañoVentana = Toolkit.getDefaultToolkit().getScreenSize();
		// Cargar el ícono desde un archivo PNG
        ImageIcon icono = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/HarryPoterLogo.png");

        // Establecer el ícono en la ventana principal
        ventanaDeInicio.setIconImage(icono.getImage());
		
		JPanel textoDeInicio = new JPanel();
		ventanaDeInicio.add(textoDeInicio);
		textoDeInicio.setLayout(new BorderLayout());
		
		JLabel texto = new JLabel();
		texto.setText("<html>Hola bienvenido a nuestro proyecto de aventura conversacional, en el que podras elegir entre hacer un test para determinar tu casa de la conocida saga Harry Potter o vivir una aventura dentro de su mundo</html>");
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
       
        Dimension nuevoTamaño = new Dimension(100, 50);
        magoOMuggle.setPreferredSize(nuevoTamaño);
        sombreroSeleccionador.setPreferredSize(nuevoTamaño);

		magoOMuggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("Has elegido Mago o Muggle");
            }
        });

       /* sombreroSeleccionador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Funcion para que abra la ventana del sombrero seleccionador            }
        });*/
        
        ventanaDeInicio.setSize(500,600);
        ventanaDeInicio.setVisible(true);
	}
	


   public static void ventanaDePreguntas(String[] args) {
        JFrame frame = new JFrame("Ventana con Botones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        // Cargar el ícono desde un archivo PNG
        ImageIcon icono = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/HarryPoterLogo.png");

        // Establecer el ícono en la ventana principal
        frame.setIconImage(icono.getImage());
        
        // Panel principal
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new BorderLayout());
       
        //Texto 
        JLabel label = new JLabel();
        label.setText("<html>Hola aqui van las pregunta askffishfisuhfiwushfsuihf<br>wiugfeugyfiusfkushfisuhfiosefffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff<br>fffffffffgyjhszbfjshzbvhjbvkusbvkjxbvkjdhbvskjbvskjbvsjkbvsjbvjskbvjshbvcj dhj vjhvjhbjhvjvhjnv hgjv hgjvghv gnbvhgvjh</html>");
        
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        
        panel.add(label, BorderLayout.CENTER);
        label.setVerticalAlignment(SwingConstants.TOP);
       
	
       // JScrollPane scrollPane = new JScrollPane(label);
        JPanel panelLabel =new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder (79,70,70,70));
        //panel.add(scrollPane, BorderLayout.CENTER)

        // Botones
        JButton boton1 = new JButton("Opción 1");
        JButton boton2 = new JButton("Opción 2");
        JButton boton3 = new JButton("Opción 3");
        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout( new BorderLayout());
        JPanel buttonPanel =new JPanel();
        
        
        panelBotones.add(boton1, BorderLayout.WEST);
        panelBotones.add(boton2, BorderLayout.CENTER);
        panelBotones.add(boton3, BorderLayout.EAST);
        
        frame.add(panelBotones, BorderLayout.SOUTH);

        // Establecer el layout del panel como BoxLayout con eje X para separar los botones
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        // Agregar un espacio rígido entre los botones para la separación
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0))); // Ajusta el valor 10 según tus necesidades
        buttonPanel.add(boton1);
        buttonPanel.add(Box.createRigidArea(new Dimension(135, 0)));
        buttonPanel.add(boton2);
        buttonPanel.add(Box.createRigidArea(new Dimension(140, 0)));
        buttonPanel.add(boton3);

        // Agregar el panel en la región SOUTH del BorderLayout del frame
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        
        //Tamaño de los botones
        Dimension nuevoTamano = new Dimension(100, 50);
        boton1.setPreferredSize(nuevoTamano);
        boton2.setPreferredSize(nuevoTamano);
        boton3.setPreferredSize(nuevoTamano);
        

        // Agregar acciones a los botones
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Opción 1 seleccionada"); // Action listener para el boton mas a la izquierda
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Opción 2 seleccionada"); // Action listener para el boton central 
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Opción 3 seleccionada"); // Action listener para el boton mas a la derecha, esta funcion cuando se da al boton se cambia el texto
                //Añadir una funcion que cambie el texto a la siguiente pregunta y el texto de los botones a las siguientes opciones
            }
        });

       
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    
    public static void ventanaDeGryffindor(String[] args) {
    	
  
        JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel principal para contener todo
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);
        
        // Cargar el ícono desde un archivo PNG
        ImageIcon icono = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/HarryPoterLogo.png");

        // Establecer el ícono en la ventana principal
       ventanaFinal.setIconImage(icono.getImage());

        // Cargar la imagen
        ImageIcon imagen = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/gryffindor-removebg-preview.png");

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
        
        buttonPanel3.add(Box.createRigidArea(new Dimension(500, 100))); // Ajusta el valor 10 según tus necesidades
        buttonPanel3.add(comienzo);

        
        explicacionResultado.add(buttonPanel3, BorderLayout.SOUTH);
       
        Dimension nuevoTamaño = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamaño);

		comienzo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Hacer que el boton te mande a la ventana inicial
            }
        });
		
        // Ajustar el tamaño de la ventana
        ventanaFinal.pack();
        ventanaFinal.setSize(1150, 700);
        ventanaFinal.setVisible(true);
    }
    public static void ventanaDeSlytherin(String[] args) {
    	    	  
        JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);
        
        ImageIcon icono = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/HarryPoterLogo.png");
       ventanaFinal.setIconImage(icono.getImage());

        ImageIcon imagen = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/slytherin-removebg-preview.png");

        JLabel imagenDeLaCasa = new JLabel(imagen);

        Image img = imagen.getImage();
        Image newImg = img.getScaledInstance(400, -1, Image.SCALE_SMOOTH);
        ImageIcon resizedImage = new ImageIcon(newImg);
        imagenDeLaCasa.setIcon(resizedImage);

        panelPrincipal.add(imagenDeLaCasa, BorderLayout.WEST);

        JPanel explicacionResultado = new JPanel(new BorderLayout());
        panelPrincipal.add(explicacionResultado, BorderLayout.CENTER);

        JLabel explicacion = new JLabel("<html>Eres de la casa Slytherin, famosa por su astucia y ambición. <br>Slytherin valora la inteligencia, la determinación y el poder, y <br> es muy probable que seas alguien que no tiene miedo de luchar por lo que quiere.<br> Como Slytherin, tienes un sentido innato de autoconservación y <br> eres capaz de tomar decisiones difíciles cuando es necesario. <br>Eres inteligente y táctico, siempre pensando en el siguiente paso antes de actuar.<br> Este pragmatismo te ayuda a lograr tus metas,<br> aunque a veces puedas parecer un poco calculador a los demás. <br>Eso no significa que no te importen las personas: puedes ser leal a aquellos que han ganado tu confianza y<br> siempre cuidarás de los tuyos. <br>Puedes ser misterioso y a veces intimidante, pero tu ambición y<br> tu deseo de éxito son simplemente inigualables</html>");
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
       
        Dimension nuevoTamaño = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamaño);

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
    public static void ventanaDeHufflepuff(String[] args) {
    	
    	JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);
        
        ImageIcon icono = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/HarryPoterLogo.png");

       ventanaFinal.setIconImage(icono.getImage());

        ImageIcon imagen = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/hufflepuff-removebg-preview.png");

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
       
        Dimension nuevoTamaño = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamaño);

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
    public static void ventanaDeRavenclaw(String[] args) {
    	
    	JFrame ventanaFinal = new JFrame("Ventana de Resultado");
        ventanaFinal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        ventanaFinal.add(panelPrincipal);
        
        ImageIcon icono = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/HarryPoterLogo.png");

       ventanaFinal.setIconImage(icono.getImage());

        ImageIcon imagen = new ImageIcon("C:/Users/Alex/Documents/GitHub/sortingHat/src/org/nebrija3d/resources/ravenclaw-removebg-preview.png");

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
       
        Dimension nuevoTamaño = new Dimension(100, 50);
        comienzo.setPreferredSize(nuevoTamaño);

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
	


