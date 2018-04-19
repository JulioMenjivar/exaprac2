
package exaprac2;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
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
        double salarioxHora[] = new double[999];
        double descRenta[] = new double[999];
        double salario[] = new double[999];
        double salarioF[]= new double[999];
        double bonoPerso[] = new double[999];
        int cantHTraba[] = new int[999];
        
        //Otras variables
        int menu=0;
        int cantIngre=0;
        int cantESM=0;
        double bonoT =0;
        double totalPlanilla=0;
        String infoTotal="";
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        
        do{
            //Controlador del menu
            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1)Agregar empleado\n2)Calcular planilla\n3)Salir"));
            
            switch(menu){
                case 1: //Ingresa un empleado
                    
                    JOptionPane.showMessageDialog(null, "Empleado N°"+(cantIngre+1));
                    nombre[cantIngre] = JOptionPane.showInputDialog("Ingrese el Nombre");
                    salarioxHora[cantIngre] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario por hora"));
                    cantHTraba[cantIngre] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
                    
                   
                    salario[cantIngre] = salarioxHora[cantIngre]*cantHTraba[cantIngre]; //salario
                    descRenta[cantIngre] = salario[cantIngre]*0.1;
                   
                    
                    //PARTE DE ASIGNACION DE BONOS
                    if(salario[cantIngre]>0 && salario[cantIngre]<=350){
                        bonoPerso[cantIngre] = 100;
                        bonoT= bonoT+100;
                    }
                    else if(salario[cantIngre]>350 && salario[cantIngre]<700){
                        bonoPerso[cantIngre] = 200;
                        bonoT= bonoT+200;
                    }
                    else if(salario[cantIngre]>=700){
                        bonoPerso[cantIngre] = 250;
                        bonoT= bonoT+250;   
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ingrese un salario aceptable","ERROR",0);
                        cantIngre--;
                    }
                    
                    salarioF[cantIngre] = salario[cantIngre]+bonoPerso[cantIngre]-descRenta[cantIngre];
                    
                    if(salarioF[cantIngre]>=700){
                        cantESM++;
                    }
                    
                    infoTotal = infoTotal+"Empleado #"+(cantIngre+1)+
                                "\nNombre: "+nombre[cantIngre]+
                                "\nSalario x Hora: "+nf.format(salarioxHora[cantIngre])+
                                "\nCantidad Horas: "+cantHTraba[cantIngre]+
                                "\nSalario: "+nf.format(salario[cantIngre])+
                                "\nBono: "+nf.format(bonoPerso[cantIngre])+
                                "\nDescuento: "+nf.format(descRenta[cantIngre])+
                                "\nSalario Final: "+nf.format(salarioF[cantIngre])+"\n-\n";
                    
                    cantIngre++;//verifica el total ingresados
                    
                    break;
                case 2: //Chequea planilla
                    
                    JOptionPane.showMessageDialog(null, "PLANILLA:\n");
                    JOptionPane.showMessageDialog(null, infoTotal+
                                "\nBonos total: "+nf.format(bonoT)+
                                "\nEmpleados con Salario mayor a $700: "+cantESM);
           
                    break;
            }//fin menu
            
        }while(menu!=3);//Fin Do while
        
        
    }//Fin del Main
    
}//Fin de la Clase
