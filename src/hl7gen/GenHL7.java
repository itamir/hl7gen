package hl7gen;

import java.util.Random;

public class GenHL7 {
	
	public static void main(String[] args) {
		
		while(true) {
		int frequenciaCardiaca = new Random().nextInt(120);
		int extraVentriculares = new Random().nextInt(2);
		int segmento = new Random().nextInt(1);
		int saturacaoOxigenio = new Random().nextInt(100);
		int frequenciaCardiacaOxi = new Random().nextInt(120);
		int pressaoSistolica = new Random().nextInt(150);
		int pressaoDiastolica = new Random().nextInt(100);
		int pressaoMedia = new Random().nextInt(125);
		int temperatura = new Random().nextInt(45);
		int frequenciaRespiratoria = new Random().nextInt(40);
		
		 String texto = "MSH|^~\\&|Monitor X||Monitor X||20190903115048.190||ORU^R01^ORU_R01|MSG0094|P^T|2.6|||NE|NE||8859/1|\r\n" + 
		 		"PID|11|\r\n" + 
		 		"PV1||N|^^501\r\n" + 
		 		"OBR|1||0093|1^Envio periódico de parâmetros numêricos^L||||||||||||||||||||ICU|||||||||||||||||||||||VIT^Vital signs monitor^HL70261^^^^2.6\r\n" + 
		 		"OBX|1|NM|1-001^Frequência Cardíaca^L^8867-4^HEART RATE^LN^1.0^2.36||"+ frequenciaCardiaca + "|1/min|(40.00) - (120.00)|N|||R|||20190903115048.190|||ECG^FC\r\n" + 
		 		"OBX|2|NM|1-002^Extrassístoles ventriculares/min^L^^^^1.0||" + extraVentriculares + "|1/min|(---) - (---)|N|||R|||20190903115048.197|||ECG^EV\r\n" + 
		 		"OBX|3|NM|1-003^Segmento ST^L^^^^1.0||" + segmento + "|mV|(---) - (---)|N|||R|||20190903115048.203|||ECG^ST\r\n" + 
		 		"OBX|4|NM|2-002^Saturação de Oxigênio^L^59408-5^OXYGEN SATURATION^LN^1.0^2.36||" + saturacaoOxigenio +  "|%|(90.00) - (---)|N|||R|||20190903115048.206|||Oximetria^Sat\r\n" + 
		 		"OBX|5|NM|2-001^Frequência Cardíaca^L^8867-4^HEART RATE^LN^1.0^2.36||" + frequenciaCardiacaOxi + "|1/min|(---) - (---)|N|||R|||20190903115048.212|||Oximetria^FC\r\n" + 
		 		"OBX|6|NM|4-002^Pressão Sistólica^L^8480-6^INTRAVASCULAR SYSTOLIC:PRES^LN^1.0^2.36||" + pressaoSistolica + "|mmHg|(---) - (---)|N|||R|||20190903115048.215|||Pressão Não-Invasiva^Psis\r\n" + 
		 		"OBX|7|NM|4-001^Pressão Diastólica^L^8462-4^INTRAVASCULAR DIASTOLIC:PRES^LN^1.0^2.36||" + pressaoDiastolica + "|mmHg|(---) - (---)|N|||R|||20190903115048.221|||Pressão Não-Invasiva^Pdia\r\n" + 
		 		"OBX|8|NM|4-003^Pressão Média^L^8478-0^8478-0^LN^1.0^2.36||" + pressaoMedia + "|mmHg|(---) - (---)|N|||R|||20190903115048.224|||Pressão Não-Invasiva^Pmed\r\n" + 
		 		"OBX|9|NM|5-001^Temperatura^L^^^^1.0||" + temperatura + "|oC|(---) - (---)|N|||R|||20190903115048.230|||Temperatura^Temp\r\n" + 
		 		"OBX|10|NM|8-001^Frequência Respiratória^L^9279-1^RESPIRATORY RATE^LN^1.0^2.36||" + frequenciaRespiratoria + "|1/min|(---) - (---)|N|||R|||20190903115048.233|||Respiração^FR\r\n" + 
		 		"\r\n" + 
		 		"";
		 		
		 		System.out.println(texto);
		 	
		 	try {;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
	}	
}
