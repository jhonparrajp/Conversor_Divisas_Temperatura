package co.conversor.main;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
	
	
	/**
	 * Programa para convertir de pesos colombianos
	 * a diferentes devisas internacionales
	 * implementamos java swing
	 * implementamos para la interfaz dos metodos if con sus respectivos ifs aninados
	 * y un metodo while por cada ciclo if
	 * 
	 * @param args
	 */

	
	public static void main(String[] args) {
		
		Object[] options = {"Conversor Divisas","Convertir Temperatura","Salir"};
		int elige=JOptionPane.showOptionDialog(null,"BIENVENIDO... ¿Que Deseas Hacer?","Conversor Divisa/Temp",JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
		if(elige==2) {
			JOptionPane.showMessageDialog(null, "Programa Cerrado");
			System.exit(0);
		}
		if(elige==0) {
			DecimalFormat formatearDivisa = new DecimalFormat("#,##");
			boolean continuarPrograma =true;
			while(continuarPrograma) {
				String[] opciones = {"Pesos Colombianos a Euros","Pesos Colombianos a Dolares",
						"Pesos Colombianos a Libras Esterlinas","Pesos Colombianos a Yen","Pesos Colombianos a Won"};
				String cambio =(String) JOptionPane.showInputDialog(null,"Elija una opcion","Conversor de moneda",
						JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
				
				String input= JOptionPane.showInputDialog(null,"Ingrese la cantidad de Pesos");
				double pesos = 0.00;
				try {
					 pesos = Double.parseDouble(input);
				}catch(NumberFormatException e) {
					JOptionPane.showConfirmDialog(null,"Valor no valido");
				}
				
				if (cambio.equals("Pesos Colombianos a Euros")) {
					double euros =  pesos /4565.96;
					JOptionPane.showMessageDialog(null,  pesos + " Pesos Colombianos Son: "+ formatearDivisa.format(euros)+ " Euros.");
				}else if(cambio.equals("Pesos Colombianos a Dolares")) {
					double dolares =  pesos /3851.90;
					JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos Son : "+ formatearDivisa.format(dolares)+ " Dolares.");
			    }else if(cambio.equals("Pesos Colombianos a Libras Esterlinas")) {
					double libras =  pesos /5297.97;
					JOptionPane.showMessageDialog(null,  pesos + " Pesos Colombianos Son: "+ formatearDivisa.format(libras)+ " Libras.");
			    }else if(cambio.equals("Pesos Colombianos a Yen")) {
					double yen =  pesos /29.23;
					JOptionPane.showMessageDialog(null,  pesos + " Pesos Colombianos Son : "+ formatearDivisa.format(yen)+ " Yen.");	
			    }else if(cambio.equals("Pesos Colombianos a Won")) {
					double won =  pesos /3.18;
					JOptionPane.showMessageDialog(null,  pesos + " Pesos Colombianos Son : "+ formatearDivisa.format(won)+ " Won.");	
			    }
				
				int confirma = JOptionPane.showConfirmDialog(null, "Desea Continuar usando el programa? ", "Confirmar",
						JOptionPane.YES_NO_OPTION);
						
						if(confirma==JOptionPane.NO_OPTION || confirma== JOptionPane.CANCEL_OPTION) {
							continuarPrograma=false;
							JOptionPane.showConfirmDialog(null, "Programa Finalizado");
						 }
		       }
		
	         }
		/**
		 * Aqui comienza las estructura de interfaz y logica para 
		 * acceder al conversor de temperatura 
		 */
		
		if (elige==1) {
			boolean seguirPrograma=true;
			while(seguirPrograma) {
				String[] opciones = {"Celsius a Fahrenheit" , "Fahrenheit a Celsius"};
				int opcion = JOptionPane.showOptionDialog(null,"Elija una opcion","Conversor de Temperatura",
						JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
				
				String valornominal =JOptionPane.showInputDialog(null,"ingrese valor a convertir");
				double valor=0.0;
				try {
					valor = Double.parseDouble(valornominal);
				}catch(NumberFormatException e) {
					JOptionPane.showConfirmDialog(null, "Valor no valido");
				  System.exit(0);
				}
				double resultado = 0;
				if(opcion==0) {
					resultado=(valor*9/5)+32;
					JOptionPane.showMessageDialog(null, valor + "Grados Celsius son: " + resultado + "Grados Fahrenheit");
				}else if(opcion==1) {
					resultado=(valor-32)*5/9;
					JOptionPane.showMessageDialog(null, valor + "Grados Fahrenheit son: " + resultado + "Grados celsius");
				}
				int confirma = JOptionPane.showConfirmDialog(null, "Desea Continuar usando el programa? ", "",
						JOptionPane.YES_NO_OPTION);
						
						if(confirma==JOptionPane.NO_OPTION || confirma== JOptionPane.CANCEL_OPTION) {
							seguirPrograma=false;
							JOptionPane.showConfirmDialog(null, "Programa Finalizado");
						 }
			}
		}
		
		
  }
}
