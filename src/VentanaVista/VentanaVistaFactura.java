package VentanaVista;

import java.io.IOException;
import Controlador.TiendaControlador;
import Modelo.Producto;
import Modelo.ProductoFabrica;
import Modelo.ProductoRepositorio;
import Modelo.Venta;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VentanaVistaFactura extends javax.swing.JFrame {
    
    public String fileName = "productos.txt";
    public ProductoRepositorio repositorio = new ProductoRepositorio(fileName);
    public ProductoFabrica fabrica = new ProductoFabrica(repositorio);
    public TiendaControlador controlador = new TiendaControlador(repositorio, fabrica);
    public DefaultTableModel modeloTabla = new DefaultTableModel();
    public List<Venta> ventas = new ArrayList<>();
    public DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
    public DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    
    public VentanaVistaFactura() throws IOException {
        initComponents();
        actualizarCombo();
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Precio Unit.");
        modeloTabla.addColumn("Importe");
        jTableTablaProductos.setModel(modeloTabla);
        jTableTablaProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTableTablaProductos.getColumnModel().getColumn(1).setPreferredWidth(0);
        jTableTablaProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableTablaProductos.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTableTablaProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTableTablaProductos.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTableTablaProductos.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTableTablaProductos.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTableTablaProductos.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        actualizarTabla();
        actualizarStockPrecioEImporte();
        actualizarSubtotalIgvYTotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelImporte = new javax.swing.JLabel();
        jComboBoxProductos = new javax.swing.JComboBox<>();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jLabelStockNumber = new javax.swing.JLabel();
        jLabelPrecioNumber = new javax.swing.JLabel();
        jLabelImporteNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaProductos = new javax.swing.JTable();
        jLabelSubtotal = new javax.swing.JLabel();
        jLabelIgv = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelTotalNumber = new javax.swing.JLabel();
        jLabelIgvNumber = new javax.swing.JLabel();
        jLabelSubtotalNumber = new javax.swing.JLabel();
        jLabelTituloVentas = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonAñadir = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("TamboooO");

        jLabelProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelProducto.setText("Producto");

        jLabelCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCantidad.setText("Cantidad");

        jLabelStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelStock.setText("Stock");

        jLabelPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPrecio.setText("Precio");

        jLabelImporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelImporte.setText("Importe");

        jComboBoxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductosActionPerformed(evt);
            }
        });

        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        jSpinnerCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantidadStateChanged(evt);
            }
        });

        jLabelStockNumber.setText("0");

        jLabelPrecioNumber.setText("S/.0");

        jLabelImporteNumber.setText("S/.0");

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
        jTableTablaProductos.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTableTablaProductos);

        jLabelSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSubtotal.setText("Subtotal");

        jLabelIgv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIgv.setText("IGV");

        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTotal.setText("Total");

        jLabelTotalNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTotalNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotalNumber.setText("S/.0");

        jLabelIgvNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIgvNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelIgvNumber.setText("S/.0");

        jLabelSubtotalNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSubtotalNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSubtotalNumber.setText("S/.0");

        jLabelTituloVentas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTituloVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloVentas.setText("Ventas");

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

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelTotal)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelIgv)
                                        .addGap(28, 28, 28))
                                    .addComponent(jLabelSubtotal))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelSubtotalNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabelIgvNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTotalNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelProducto)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCantidad)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerCantidad)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jLabelStock)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelStockNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelImporte)
                                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelImporteNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrecioNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabelTituloVentas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloVentas)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPrecioNumber)
                                    .addComponent(jButtonAñadir))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFinalizar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelImporteNumber)
                                .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelStockNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStock, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSubtotalNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIgvNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTotalNumber)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRegresar)
                            .addComponent(jButtonSalir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSubtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIgv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTotal)))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        ventas.clear();
        actualizarTabla();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        for (Venta venta: ventas) {
            try {
                Producto producto = controlador.obtenerProductoPorNombre(venta.getNombre());
                if (venta.getNombre().equals(producto.getNombre())) {
                    controlador.removerStock(producto.getNombre(), venta.getStock());
                }
            } catch (IOException ex) {
                Logger.getLogger(VentanaVistaFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ventas.clear();
        actualizarStockPrecioEImporte();
        actualizarTabla();
        actualizarSubtotalIgvYTotal();
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        try {
            String nombre = jComboBoxProductos.getSelectedItem().toString();
            Producto producto = controlador.obtenerProductoPorNombre(nombre);
            int cantidad = Integer.parseInt(jSpinnerCantidad.getValue().toString());
            Venta nuevaVenta = new Venta();
            nuevaVenta.setId(producto.getId());
            nuevaVenta.setNombre(nombre);
            nuevaVenta.setPrecio(producto.getPrecio());
            nuevaVenta.setStock(cantidad);
            nuevaVenta.setImporte(producto.getPrecio()*cantidad);
            if (nuevaVenta.getStock() <= producto.getStock()) {
                if (!buscarNuevaVentaEnVentas(nuevaVenta)) {
                    ventas.add(nuevaVenta);
                }
            }
            actualizarTabla();
            actualizarSubtotalIgvYTotal();
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        dispose();
        new VentanaVistaInicio().setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jSpinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantidadStateChanged
        actualizarStockPrecioEImporte();
    }//GEN-LAST:event_jSpinnerCantidadStateChanged

    private void jComboBoxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductosActionPerformed
        actualizarStockPrecioEImporte();
    }//GEN-LAST:event_jComboBoxProductosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaVistaFactura().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaVistaFactura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxProductos;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelIgv;
    private javax.swing.JLabel jLabelIgvNumber;
    private javax.swing.JLabel jLabelImporte;
    private javax.swing.JLabel jLabelImporteNumber;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelPrecioNumber;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelStockNumber;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JLabel jLabelSubtotalNumber;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloVentas;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotalNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableTablaProductos;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla() {
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
        for (Venta venta: ventas) {
            modeloTabla.addRow(new Object[] {venta.getId(), venta.getStock(), venta.getNombre(), aMonedaSoles(venta.getPrecio()), aMonedaSoles(venta.getImporte())});
        }
    }
    
    private void actualizarCombo() throws IOException {
        String[] productos = controlador.obtenerNombresDeProductos();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(productos);
        jComboBoxProductos.setModel(modeloCombo);           
    }
    
    private void actualizarStockPrecioEImporte() {
        try {
            String nombre = jComboBoxProductos.getSelectedItem().toString();
            Producto producto = controlador.obtenerProductoPorNombre(nombre);
            int cantidad = Integer.parseInt(jSpinnerCantidad.getValue().toString());
            jLabelStockNumber.setText(String.valueOf(producto.getStock()));
            jLabelPrecioNumber.setText(aMonedaSoles(producto.getPrecio()));
            jLabelImporteNumber.setText(aMonedaSoles(producto.getPrecio() * cantidad));
        } catch (IOException ex) {
            Logger.getLogger(VentanaVistaFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void actualizarSubtotalIgvYTotal() {
        double subtotal = 0, igv, total;
        for (Venta venta: ventas) {
            subtotal += venta.getImporte();
        }
        igv = subtotal * 0.18;
        total = subtotal + igv;
        jLabelSubtotalNumber.setText(aMonedaSoles(subtotal));
        jLabelIgvNumber.setText(aMonedaSoles(igv));
        jLabelTotalNumber.setText(aMonedaSoles(total));
    }
    
    private boolean buscarNuevaVentaEnVentas(Venta nuevaVenta) throws IOException {
        Producto producto = controlador.obtenerProductoPorNombre(nuevaVenta.getNombre());
        for (Venta venta: ventas) {
            if (nuevaVenta.getNombre().equals(venta.getNombre())) {
                if ((venta.getStock() + nuevaVenta.getStock()) <= producto.getStock()) {
                    venta.setStock(venta.getStock() + nuevaVenta.getStock());
                    venta.setImporte(venta.getPrecio() * venta.getStock());   
                }  
                return true;
            }
        }
        return false;
    }
    
    private String aMonedaSoles(double precio) {
        return "S/" + Math.round(precio * 100.00) / 100.00 + " PEN";
    }
}
