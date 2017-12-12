package datastructures;

import java.io.FileReader;
import java.util.Comparator;
import java.util.Scanner;

import model.Aluno;

public class ListaEncadeada<T> {
	
	private Node head;
	private Node tail;
	
	public class Node {
		private T dado;
		private Node next;
		private Node previous;
		
		public Node (T dado){
			this.dado = dado;
			this.next = next;
			this.previous = previous;
		}
	}
	    
	
	public void append(T dado)
	{
		Node aluno = new Node(dado);
		if(tail != null){
			tail.next = aluno;
		}else{
			head = aluno;
		}
		aluno.previous = tail;
		tail = aluno;
	}
	public void addFirst(T dado)
	{}
	public T search(T key, Comparator<T> cmp)
	{
		return null;
	}
	public void printObjects()
	{}
	
	public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo)
	{
		
		ListaEncadeada<Aluno> listaalunos = new ListaEncadeada<>();
		
		
		Scanner scannerArquivo;

		
		scannerArquivo = new Scanner(arquivo);
		
		
		scannerArquivo.useDelimiter("[,\n]");

		while (scannerArquivo.hasNext()) {
			
			String primeiro = scannerArquivo.next();
			String nome = scannerArquivo.next();
			String email = scannerArquivo.next();
			int idade = scannerArquivo.nextInt();
			String sexo = scannerArquivo.next();
			String cidade = scannerArquivo.next();
			Aluno aluno = new Aluno(nome, email, idade, cidade);
			
			// testando
			System.out.println(email);	
			
			
		
			listaalunos.append(aluno);
		}
		
		
		return listaalunos;
	}
	

}
