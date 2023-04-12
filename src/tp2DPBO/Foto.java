/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2DPBO;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Kristiyant Ponty Y
 */
public class Foto {
    private String path;
    private File pic;
    private ImageIcon image;
    
    public Foto(){}
    
    public void upload(){
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png", "jpeg");
        file.addChoosableFileFilter(filter);
        file.setAcceptAllFileFilterUsed(false);
        int res = file.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION){
            this.pic = file.getSelectedFile();
            this.path = pic.getName();
        }
    }
    
    public void resize(){
        ImageIcon l_path = new ImageIcon(this.path);
        Image l_img = l_path.getImage();
        Image newImg = l_img.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
        ImageIcon foto = new ImageIcon(newImg);
        this.image = foto;
    }
    
    public String getPath(){
        return this.path;
    }
    
    public File getImg(){
        return this.pic;
    }
    
    public ImageIcon getImage(){
        return this.image;
    }
    
}
