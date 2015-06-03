/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guilherme.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Guilherme Lourenço
 */
public class InicioDoJogo extends JFrame{
    JTextField numCartelasCampo;
    JButton btnEnviar;
    public InicioDoJogo(){
        super("Inicio do Jogo");
        this.setSize(600,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(false);
        JLabel texto = new JLabel("Digite o numero de Cartelas para começar: ");
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        numCartelasCampo = new JTextField();
        numCartelasCampo.setHorizontalAlignment(SwingConstants.CENTER);
        numCartelasCampo.addKeyListener(new numCartelasEvent());
        btnEnviar = new JButton("Começar");
        btnEnviar.addActionListener(new btnEnviarListener());
        this.getContentPane().setLayout(new GridLayout(3, 1, 5, 5));
        this.getContentPane().add(texto);
        this.getContentPane().add(numCartelasCampo);
        this.getContentPane().add(btnEnviar);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        InicioDoJogo novoJogo = new InicioDoJogo();
    }
    
    public void fecharTelaInicio(){
        this.dispose();
    }
    class btnEnviarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if(!"".equals(numCartelasCampo.getText())){
                    int numero = Integer.valueOf(numCartelasCampo.getText());
                    TelaPrincipal novaTelaPrincipal = new TelaPrincipal(numero);
                    fecharTelaInicio();
                }else{
                    JOptionPane.showMessageDialog(null, "Digite um número!");
                }
            }catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Numero Inválido, tente novamente!");
            }
        }
    }
    
    class numCartelasEvent implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            //Não implementado este método
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                try{
                    if(!"".equals(numCartelasCampo.getText())){
                        int numero = Integer.valueOf(numCartelasCampo.getText());
                        TelaPrincipal novaTelaPrincipal = new TelaPrincipal(numero);
                        fecharTelaInicio();
                    }else{
                        JOptionPane.showMessageDialog(null, "Digite um número!");
                    }
                }catch(Exception erro){
                    JOptionPane.showMessageDialog(null, "Numero Inválido, tente novamente!");
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //Não implementado este método
        }
        
    }
}
