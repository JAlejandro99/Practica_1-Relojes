package practica_1.relojes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RelojGrafico extends JPanel{
    JButton boton;
    public RelojGrafico(boolean aleatorio, int x, int y){
        this.setBounds(x,y,250,100);
        this.setBackground(new Color(38,70,95));
        this.inicializarBoton();
    }
    protected void inicializarBoton(){
        boton = new JButton();
        ImageIcon icono=new ImageIcon((new ImageIcon("editar.png").getImage()).getScaledInstance(20,20,Image.SCALE_SMOOTH));
        boton.setIcon(icono);
        boton.setSize(10,10);
        boton.setOpaque(false);
        boton.setBackground(new Color(0,0,0,0));
        boton.setBorderPainted(false);
        this.setLayout(null);
        boton.setBounds(225,5,20,20);
        this.add(boton);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRoundRect(0,0,this.getWidth()-2,this.getHeight()-2,15,15);
    }
}
