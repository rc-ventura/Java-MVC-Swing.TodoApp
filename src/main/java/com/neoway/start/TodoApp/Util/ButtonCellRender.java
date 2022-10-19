
package com.neoway.start.TodoApp.Util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author RC_Ventura
 */
public class ButtonCellRender extends DefaultTableCellRenderer {
    
    private String buttonType;                      //Criamos um atributo tipo de botão pois temos o botão de editar e excluir
    
    
    //construtor
    public ButtonCellRender (String buttonType) {           //Criamos um construtor para receber o tipo de botão que queremos
        this.buttonType = buttonType;
    }

   
    
    
    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
   
    
    @Override                                                                                 //Override do método abstract
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
       
        
             JLabel label;                                                               //Criamos um objeto GUI JTable para modificá-lo
        
             label = (JLabel) super.getTableCellRendererComponent(table, value,         // Chamamos o construtor pai do renderizador
                    isSelected, hasFocus, row, column) ;
    
             label.setHorizontalAlignment(JLabel.CENTER);                                      // setamos seu alinhamento na cédula (centro)
             label.setIcon( new javax.swing.ImageIcon(getClass().
                     getResource("/" + buttonType + ".png")));                 // setamos um icon criando um objeto JAVA SWING dando o caminho da pasta
                                                                                  // esse caminho busca no resources a pasta de nome buttonType com extensão png
             
             return label;                                                          // retorna a label 
    
}
    
}
