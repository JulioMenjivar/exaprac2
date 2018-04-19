
package exaprac2;

import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: exaprac2
 * fecha: 19-04-2018
 * version: 1.0
 * CopyRight: JulioMenjivar
 * @author JulioMenjivar
 */
public class exaprac2 {
    
    public static void main(String[] args){
        
        //Vectores
        String nombre[] = new String[999];
        double salario[] = new double[999];
        int cantHTraba[] = new int[999];
        
        //Otras variables
        int menu=0;
        int cantIngre=0;
        
        do{
            //Controlador del menu
            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1)Agregar empleado\n2)Calcular planilla\n3)Salir"));
            
            switch(menu){
                case 1: //Ingresa un empleado
                    
                    JOptionPane.showMessageDialog(null, "Empleado N°"+(cantIngre+1));
                    nombre[cantIngre] = JOptionPane.showInputDialog("Ingrese el Nombre");
                    salario[cantIngre] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario por hora"));
                    cantHTraba[cantIngre] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
                    
                    cantIngre++;//verifica el total ingresados
                    
                    break;
                case 2: //Chequea planilla
                    break;
            }//fin menu
            
        }while(menu!=3);//Fin Do while
        
        
    }//Fin del Main
    
}//Fin de la Clase
