package leitordecontas;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;	

public class LeitorArquivo {
		
	public static void leitor(String path) throws IOException{
		String arquivo = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\Linguagem\\Leitura_Contas\\contas.txt";
		FileReader lerArquivo = new FileReader(arquivo);
		BufferedReader bufferedReader = new BufferedReader(lerArquivo);
		String linha = "";		
		Banco banco = new Banco();
		
		while((linha = bufferedReader.readLine())!=null ) {
			linha = bufferedReader.readLine();
			String [] partes = linha.split(",");
			if(linha!=null) {
				String agencia = partes[0];
				String conta = partes[1];
				Double saldo = Double.parseDouble(partes[2]);
				Conta aux = new Conta(agencia,conta,saldo);
				banco.getConta().add(aux);
			}
			
			banco.SaldoTotal();
			banco.imprimirSaldoTotal();
		}
	}
}
	
	
		
	
