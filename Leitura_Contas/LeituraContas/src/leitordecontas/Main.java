package leitordecontas;

import java.io.File;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String []args)throws IOException {
		Scanner scanner;
		Banco banco = new Banco();
		
		String nome = JOptionPane.showInputDialog("Entre com o nome:");
		banco.setNome(nome);
		
		String arquivo = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\Linguagem\\Leitura_Contas\\contas.txt";
		
		LeitorArquivo.leitor(arquivo);
		
		
		
	}
	
}
