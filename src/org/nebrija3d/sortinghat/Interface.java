package org.nebrija3d.sortinghat;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
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

public class Interface {
	
	public static void main(String[] args) {
		JFrame inicio = new JFrame("Ventana de inicio");
		inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tamañoVentana = Toolkit.getDefaultToolkit().getScreenSize();
		
		JPanel inicial = new JPanel();
		inicio.add(inicial);
		inicial.setLayout(new BorderLayout());
		
		JLabel texto = new JLabel();
		texto.setText("<html>Hola bienvenido a nuestro proyecto de aventura conversacional, en el que podras elegir entre hacer un test para determinar tu casa de la conocida saga Harry Potter o vivir una aventura dentro de su mundo");
		texto.setFont(new Font("Arial", Font.BOLD, 14));
        
        inicial.add(texto, BorderLayout.CENTER);
        texto.setVerticalAlignment(SwingConstants.TOP);
        inicial.setBorder(new EmptyBorder (79,70,70,70));
        
        JButton sombreroSeleccionador = new JButton("Sombrero Seleccionador");
        JButton magoOMuggle = new JButton("Mago o Muggle");
        
        JPanel panelBotones2 = new JPanel();
        panelBotones2.setLayout( new BorderLayout());
        JPanel buttonPanel2 =new JPanel();
        
        panelBotones2.add(magoOMuggle, BorderLayout.WEST);
        panelBotones2.add(sombreroSeleccionador, BorderLayout.EAST);
        
        inicial.add(panelBotones2, BorderLayout.SOUTH);
        
        buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));
        
        buttonPanel2.add(Box.createRigidArea(new Dimension(10, 0))); // Ajusta el valor 10 según tus necesidades
        buttonPanel2.add(magoOMuggle);
        buttonPanel2.add(Box.createRigidArea(new Dimension(30, 0)));
        buttonPanel2.add(sombreroSeleccionador);
        
        inicial.add(buttonPanel2, BorderLayout.SOUTH);
       
        Dimension nuevoTamaño = new Dimension(100, 50);
        magoOMuggle.setPreferredSize(nuevoTamaño);
        sombreroSeleccionador.setPreferredSize(nuevoTamaño);

		magoOMuggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("Has elegido Mago o Muggle");
            }
        });

        sombreroSeleccionador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.setVisible(true);            }
        });
        
        inicio.setSize(500,600);
        inicio.setVisible(true);
	}
}


    public static void ventanaPrincipal(String[] args) {
        JFrame frame = new JFrame("Ventana con Botones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();


        
        // Panel principal
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new BorderLayout());
        ;
       
       
        //Texto 
        JLabel label = new JLabel();
        label.setText("<html>Hola aqui van las pregunta askffishfisuhfiwushfsuihf<br>wiugfeugyfiusfkushfisuhfiosefffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff<br>fffffffffgyjhszbfjshzbvhjbvkusbvkjxbvkjdhbvskjbvskjbvsjkbvsjbvjskbvjshbvcj dhj vjhvjhbjhvjvhjnv hgjv hgjvghv gnbvhgvjh</html>");
        
       //Font customFont=new Font("Arial", Font.BOLD, 16);

		
        label.setFont(new Font("HarryP-MVZ6w", Font.BOLD, 18));
        
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
                label.setText("Opción 1 seleccionada");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Opción 2 seleccionada");
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Opción 3 seleccionada");
            }
        });

       
        frame.setSize(600,400);
        frame.setVisible(true);
    }
}
