package ec.edu.ups.poo.ventanas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanas extends Frame {

    private Button btnAgregar, btnModificar, btbEliminar, btbGuardar, btbCancelar;
    private TextField txtNombre, txtCedula, txtApellido;

    public Ventanas() {
        super("Ventanas");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        Panel panelGeneral = new Panel(new BorderLayout());

        Panel panelSuperior = new Panel(new FlowLayout());
        btnAgregar = new Button("Agregar");
        btnModificar = new Button("Modificar");
        btbEliminar = new Button("Eliminar");
        panelSuperior.add(btnAgregar);
        panelSuperior.add(btnModificar);
        panelSuperior.add(btbEliminar);
        panelGeneral.add(panelSuperior, BorderLayout.NORTH);

        Panel panelCentral = new Panel(new GridLayout(3, 1));
        Label lblNombre = new Label("Nombre");
        Label lblCedula = new Label("Cedula");
        Label lblApellido = new Label("Apellido");
        txtNombre = new TextField(10);
        txtCedula = new TextField(10);
        txtApellido = new TextField(10);
        panelCentral.add(lblNombre);
        panelCentral.add(txtNombre);
        panelCentral.add(lblApellido);
        panelCentral.add(txtApellido);
        panelCentral.add(lblCedula);
        panelCentral.add(txtCedula);
        panelGeneral.add(panelCentral, BorderLayout.CENTER);


        Panel panelInferior = new Panel(new FlowLayout());
        btbGuardar = new Button("Guardar");
        btbCancelar = new Button("Cancelar");
        panelInferior.add(btbGuardar);
        panelInferior.add(btbCancelar);

        btbGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNombre.getText().isEmpty() || txtCedula.getText().isEmpty() || txtApellido.getText().isEmpty()) {
                    System.out.println("LLene los campos");
                } else {
                    System.out.println(txtNombre.getText() + " " +  txtApellido.getText() + " con cédula " +
                            txtCedula.getText());
                }
            }
        });


        panelGeneral.add(panelInferior, BorderLayout.SOUTH);
        add(panelGeneral);
    }

}
