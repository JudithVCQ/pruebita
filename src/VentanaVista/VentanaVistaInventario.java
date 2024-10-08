package VentanaVista;

import java.io.IOException;
import Controlador.TiendaControlador;
import Modelo.Producto;
import Modelo.ProductoFabrica;
import Modelo.ProductoRepositorio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class VentanaVistaInventario extends javax.swing.JFrame {
    
    public String fileName = "productos.txt";
    public ProductoRepositorio repositorio = new ProductoRepositorio(fileName);
    public ProductoFabrica fabrica = new ProductoFabrica(repositorio);
    public TiendaControlador controlador = new TiendaControlador(repositorio, fabrica);
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public VentanaVistaInventario() throws IOException {
        initComponents();
        actualizarCombo();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Stock");
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaProductos = new javax.swing.JTable();
        jLabelNombreAñadirProducto = new javax.swing.JLabel();
        jTextFieldNombreAñadirProducto = new javax.swing.JTextField();
        jLabelStockAñadirProducto = new javax.swing.JLabel();
        jTextFieldStockAñadirProducto = new javax.swing.JTextField();
        jButtonAñadirProducto = new javax.swing.JButton();
        jButtonAgregarStock = new javax.swing.JButton();
        jLabelProductoAgregarStock = new javax.swing.JLabel();
        jComboBoxProductoEditarProductos = new javax.swing.JComboBox<>();
        jLabelCantidadAgregarStock = new javax.swing.JLabel();
        jButtonRemoverStock = new javax.swing.JButton();
        jLabelMenu = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelPrecioAñadirProducto = new javax.swing.JLabel();
        jTextFieldPrecioAñadirProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombreEditarNombre = new javax.swing.JLabel();
        jLabelPrecioEditarPrecio = new javax.swing.JLabel();
        jTextFieldNombreEditarNombre = new javax.swing.JTextField();
        jTextFieldPrecioEditarPrecio = new javax.swing.JTextField();
        jButtonEditarNombre = new javax.swing.JButton();
        jButtonEditarPrecio = new javax.swing.JButton();
        jSpinnerCantidadEditarStock = new javax.swing.JSpinner();
        jButtonEliminarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Tambito");

        jTableTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableTablaProductos);

        jLabelNombreAñadirProducto.setText("Nombre");

        jLabelStockAñadirProducto.setText("Stock inicial");

        jButtonAñadirProducto.setText("Añadir nuevo producto");
        jButtonAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirProductoActionPerformed(evt);
            }
        });

        jButtonAgregarStock.setText("Agregar stock");
        jButtonAgregarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarStockActionPerformed(evt);
            }
        });

        jLabelProductoAgregarStock.setText("Seleccionar producto:");

        jComboBoxProductoEditarProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2 ", "Item 3", "Item 4", " " }));
        jComboBoxProductoEditarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductoEditarProductosActionPerformed(evt);
            }
        });

        jLabelCantidadAgregarStock.setText("Cantidad");

        jButtonRemoverStock.setText("Remover stock");
        jButtonRemoverStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverStockActionPerformed(evt);
            }
        });

        jLabelMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenu.setText("Inventario");

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelPrecioAñadirProducto.setText("Precio inicial");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Editar producto");

        jLabelNombreEditarNombre.setText("Nuevo nombre");

        jLabelPrecioEditarPrecio.setText("Nuevo precio");

        jButtonEditarNombre.setText("Editar nombre");
        jButtonEditarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarNombreActionPerformed(evt);
            }
        });

        jButtonEditarPrecio.setText("Editar precio");
        jButtonEditarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPrecioActionPerformed(evt);
            }
        });

        jSpinnerCantidadEditarStock.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jButtonEliminarProducto.setText("Eliminar producto");
        jButtonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelProductoAgregarStock)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxProductoEditarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonRegresar)
                                .addGap(24, 24, 24)
                                .addComponent(jButtonSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecioEditarPrecio)
                                    .addComponent(jLabelNombreEditarNombre)
                                    .addComponent(jLabelCantidadAgregarStock))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombreEditarNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPrecioEditarPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSpinnerCantidadEditarStock, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonEditarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEditarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAgregarStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRemoverStock, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrecioAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldPrecioAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(jLabelStockAñadirProducto)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldStockAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldNombreAñadirProducto))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(51, 51, 51))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelMenu)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(257, 257, 257))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreAñadirProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecioAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecioAñadirProducto)
                            .addComponent(jLabelStockAñadirProducto)
                            .addComponent(jTextFieldStockAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonAñadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProductoEditarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductoAgregarStock))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidadAgregarStock)
                    .addComponent(jButtonAgregarStock)
                    .addComponent(jButtonRemoverStock)
                    .addComponent(jSpinnerCantidadEditarStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreEditarNombre)
                    .addComponent(jTextFieldNombreEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioEditarPrecio)
                    .addComponent(jTextFieldPrecioEditarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarProducto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegresar)
                    .addComponent(jButtonSalir))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProductoEditarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductoEditarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProductoEditarProductosActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirProductoActionPerformed
        try {
            String nombre = jTextFieldNombreAñadirProducto.getText();
            double precio = Double.parseDouble(jTextFieldPrecioAñadirProducto.getText());
            int stock = Integer.parseInt(jTextFieldStockAñadirProducto.getText());
            controlador.crearProducto(nombre, precio, stock);
            actualizarCombo();
            actualizarTabla();
            jTextFieldNombreAñadirProducto.setText("");
            jTextFieldPrecioAñadirProducto.setText("");
            jTextFieldStockAñadirProducto.setText("");
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAñadirProductoActionPerformed

    private void jButtonAgregarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarStockActionPerformed
        try {
            String nombre = jComboBoxProductoEditarProductos.getSelectedItem().toString();
            int cantidad = Integer.parseInt(jSpinnerCantidadEditarStock.getValue().toString());
            controlador.añadirStock(nombre, cantidad);
            actualizarTabla();
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAgregarStockActionPerformed

    private void jButtonRemoverStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverStockActionPerformed
        try {
            String nombre = jComboBoxProductoEditarProductos.getSelectedItem().toString();
            int cantidad = Integer.parseInt(jSpinnerCantidadEditarStock.getValue().toString());
            controlador.removerStock(nombre, cantidad);
            actualizarTabla();
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRemoverStockActionPerformed

    private void jButtonEditarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarNombreActionPerformed
        try {
            String nombre = jComboBoxProductoEditarProductos.getSelectedItem().toString();
            String nuevoNombre = jTextFieldNombreEditarNombre.getText();
            controlador.editarNombreProducto(nombre, nuevoNombre);
            actualizarTabla();
            actualizarCombo();
            jTextFieldNombreEditarNombre.setText(" ");
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_jButtonEditarNombreActionPerformed

    private void jButtonEditarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPrecioActionPerformed
        try {
            String nombre = jComboBoxProductoEditarProductos.getSelectedItem().toString();
            double nuevoPrecio = Double.parseDouble(jTextFieldPrecioEditarPrecio.getText());
            controlador.editarPrecioProducto(nombre, nuevoPrecio);
            actualizarTabla();
            jTextFieldPrecioEditarPrecio.setText("");
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditarPrecioActionPerformed

    private void jButtonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProductoActionPerformed
        try {
            String nombre = jComboBoxProductoEditarProductos.getSelectedItem().toString();
            controlador.eliminarProducto(nombre);
            actualizarTabla();
            actualizarCombo();
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarProductoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
        new VentanaVistaInicio().setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaVistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaVistaInventario().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaVistaInventario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarStock;
    private javax.swing.JButton jButtonAñadirProducto;
    private javax.swing.JButton jButtonEditarNombre;
    private javax.swing.JButton jButtonEditarPrecio;
    private javax.swing.JButton jButtonEliminarProducto;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonRemoverStock;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxProductoEditarProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCantidadAgregarStock;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelNombreAñadirProducto;
    private javax.swing.JLabel jLabelNombreEditarNombre;
    private javax.swing.JLabel jLabelPrecioAñadirProducto;
    private javax.swing.JLabel jLabelPrecioEditarPrecio;
    private javax.swing.JLabel jLabelProductoAgregarStock;
    private javax.swing.JLabel jLabelStockAñadirProducto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCantidadEditarStock;
    private javax.swing.JTable jTableTablaProductos;
    private javax.swing.JTextField jTextFieldNombreAñadirProducto;
    private javax.swing.JTextField jTextFieldNombreEditarNombre;
    private javax.swing.JTextField jTextFieldPrecioAñadirProducto;
    private javax.swing.JTextField jTextFieldPrecioEditarPrecio;
    private javax.swing.JTextField jTextFieldStockAñadirProducto;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla() throws IOException {
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
        for (Producto producto: controlador.obtenerProductos()) {
            modeloTabla.addRow(new Object[] {producto.getId(), producto.getNombre(), producto.getPrecio(), producto.getStock()});
        }
        jTableTablaProductos.setModel(modeloTabla);
    }
    
    private void actualizarCombo() throws IOException {
        String[] productos = controlador.obtenerNombresDeProductos();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(productos);
        jComboBoxProductoEditarProductos.setModel(modeloCombo);           
    }
}
