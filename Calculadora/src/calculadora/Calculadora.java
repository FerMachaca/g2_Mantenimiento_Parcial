/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Christian Ramirez
 */
public class Calculadora extends javax.swing.JFrame {
    
    Operaciones op = new Operaciones();

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaNumeros = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        botonPorcentaje = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonPotenciaCuadrado = new javax.swing.JButton();
        botonPotenciaCubo = new javax.swing.JButton();
        buttonPotenciaN = new javax.swing.JButton();
        botonInversa = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonRaizCubica = new javax.swing.JButton();
        botonFactorial = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        botonSigno = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        etiquetaNumeros.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        panel.setLayout(new java.awt.GridLayout(7, 4));

        botonPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPorcentaje.setText("%");
        botonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcentajeActionPerformed(evt);
            }
        });
        panel.add(botonPorcentaje);

        botonC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        panel.add(botonC);

        botonCE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCE.setText("CE");
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        panel.add(botonCE);

        botonBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonBorrar.setText("←");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        panel.add(botonBorrar);

        botonPotenciaCuadrado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPotenciaCuadrado.setText("x²");
        botonPotenciaCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPotenciaCuadradoActionPerformed(evt);
            }
        });
        panel.add(botonPotenciaCuadrado);

        botonPotenciaCubo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPotenciaCubo.setText("x³");
        botonPotenciaCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPotenciaCuboActionPerformed(evt);
            }
        });
        panel.add(botonPotenciaCubo);

        buttonPotenciaN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonPotenciaN.setText("xⁿ");
        buttonPotenciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPotenciaNActionPerformed(evt);
            }
        });
        panel.add(buttonPotenciaN);

        botonInversa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonInversa.setText("1/x");
        botonInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInversaActionPerformed(evt);
            }
        });
        panel.add(botonInversa);

        botonRaiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRaiz.setText("√");
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });
        panel.add(botonRaiz);

        botonRaizCubica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRaizCubica.setText("³√");
        botonRaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizCubicaActionPerformed(evt);
            }
        });
        panel.add(botonRaizCubica);

        botonFactorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonFactorial.setText("x!");
        botonFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFactorialActionPerformed(evt);
            }
        });
        panel.add(botonFactorial);

        botonDivision.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        panel.add(botonDivision);

        jButton35.setBackground(new java.awt.Color(204, 204, 204));
        jButton35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton35.setText("7");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        panel.add(jButton35);

        jButton28.setBackground(new java.awt.Color(204, 204, 204));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton28.setText("8");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        panel.add(jButton28);

        jButton29.setBackground(new java.awt.Color(204, 204, 204));
        jButton29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton29.setText("9");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        panel.add(jButton29);

        botonMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMultiplicar.setText("*");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        panel.add(botonMultiplicar);

        jButton32.setBackground(new java.awt.Color(204, 204, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton32.setText("4");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        panel.add(jButton32);

        jButton33.setBackground(new java.awt.Color(204, 204, 204));
        jButton33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton33.setText("5");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        panel.add(jButton33);

        jButton34.setBackground(new java.awt.Color(204, 204, 204));
        jButton34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton34.setText("6");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        panel.add(jButton34);

        botonRestar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        panel.add(botonRestar);

        jButton37.setBackground(new java.awt.Color(204, 204, 204));
        jButton37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton37.setText("1");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        panel.add(jButton37);

        jButton40.setBackground(new java.awt.Color(204, 204, 204));
        jButton40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton40.setText("2");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        panel.add(jButton40);

        jButton38.setBackground(new java.awt.Color(204, 204, 204));
        jButton38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton38.setText("3");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        panel.add(jButton38);

        botonSumar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        panel.add(botonSumar);

        botonSigno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSigno.setText("+/-");
        botonSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSignoActionPerformed(evt);
            }
        });
        panel.add(botonSigno);

        jButton42.setBackground(new java.awt.Color(204, 204, 204));
        jButton42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton42.setText("0");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        panel.add(jButton42);

        botonPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        panel.add(botonPunto);

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        panel.add(botonIgual);

        etiquetaMuestra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 104, Short.MAX_VALUE)
                        .addComponent(etiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNumeros)
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizCubicaActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("cbrt3("+cadenaNumeros+")");
        resultado = op.raizCubica(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonRaizCubicaActionPerformed

    private void botonPotenciaCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPotenciaCuadradoActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);     
        etiquetaMuestra.setText(cadenaNumeros+"^2");
        resultado = op.potenciaCuadrado(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonPotenciaCuadradoActionPerformed

    private void botonPotenciaCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPotenciaCuboActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText(cadenaNumeros+"^3");
        resultado = op.potenciaCubo(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonPotenciaCuboActionPerformed

    private void buttonPotenciaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPotenciaNActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + "^");
            cadenaNumeros = "";
            operacion = "potenciaN";

            activado = false;
        }
    }//GEN-LAST:event_buttonPotenciaNActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double segundoNumero;
        if(operacion.equals("nula")){
            etiquetaNumeros.setText(cadenaNumeros);
        }

        else if(operacion.equals("sumar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = op.suma(primerNumero, segundoNumero);
            etiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if(operacion.equals("restar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = op.resta(primerNumero, segundoNumero);
            etiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }

        else if(operacion.equals("multiplicar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = op.multiplicacion(primerNumero, segundoNumero);
            etiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                etiquetaNumeros.setText("NoSeDividePor0");
            } else {
                resultado = op.division(primerNumero, segundoNumero);
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }
        else if (operacion.equals("potenciaN")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = op.potenciaN(primerNumero, segundoNumero);
            etiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }

        etiquetaMuestra.setText("");
        activado = true;
        punto = false;
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
        resultado = Math.sqrt(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonRaizActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";

            activado = false;
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        float tamaño = cadenaNumeros.length();
        if(tamaño > 0){
            if(tamaño == 1){
                cadenaNumeros = "0";
            }else{
                cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length() - 1);
            }
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "7";
        }else{
            cadenaNumeros += "7";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "8";
        }else{
            cadenaNumeros += "8";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "9";
        }else{
            cadenaNumeros += "9";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton29ActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";

            activado = false;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "4";
        }else{
            cadenaNumeros += "4";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "5";
        }else{
            cadenaNumeros += "5";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "6";
        }else{
            cadenaNumeros += "6";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton34ActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";

            activado = false;
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "1";
        }else{
            cadenaNumeros += "1";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "2";
        }else{
            cadenaNumeros += "2";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "3";
        }else{
            cadenaNumeros += "3";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton38ActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";

            activado = false;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSignoActionPerformed
        if(cadenaNumeros.charAt(0) != '-'){
            cadenaNumeros = "-" + cadenaNumeros;
        }else{
            cadenaNumeros = cadenaNumeros.substring(1,cadenaNumeros.length());
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_botonSignoActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "0";
        }else{
            cadenaNumeros += "0";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton42ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if(punto == true){
            if(cadenaNumeros.equals("")){
                cadenaNumeros = "0.";
            }else{
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcentajeActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        resultado = op.porcentaje(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonPorcentajeActionPerformed

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
        etiquetaNumeros.setText("0");
        cadenaNumeros = "";
        activado = true;
        punto = true;
    }//GEN-LAST:event_botonCEActionPerformed

    private void botonFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFactorialActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("("+cadenaNumeros+")"+"!");
        resultado = op.factorial(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
    }//GEN-LAST:event_botonFactorialActionPerformed

    private void botonInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInversaActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("1/"+cadenaNumeros);
        resultado = op.inversa(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
    }//GEN-LAST:event_botonInversaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonFactorial;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonInversa;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonPorcentaje;
    private javax.swing.JButton botonPotenciaCuadrado;
    private javax.swing.JButton botonPotenciaCubo;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRaizCubica;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSigno;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton buttonPotenciaN;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton42;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
