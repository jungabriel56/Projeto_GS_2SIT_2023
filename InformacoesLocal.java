import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class InformacoesLocal implements Comparable <InformacoesLocal>{
	
	
	
	private LocalDate diaDaAnalise;
	private String coordenada;
	private int temperaturaMedia;
	private int area;
	private String nomeProjeto;
	
	
	
	public InformacoesLocal( LocalDate diaDaAnalise, String coordenada, int temperaturaMedia, int area, String nomeProjeto) {
		
		this.diaDaAnalise = diaDaAnalise;
		this.coordenada = coordenada;
		this.temperaturaMedia = temperaturaMedia;
		this.area = area;
		this.nomeProjeto =  nomeProjeto;
	}

	
 
	public String toString() {
		return " Dia : " + diaDaAnalise + ", coordenada: " + coordenada +  ", temperatura: " + temperaturaMedia + ", area: " + area + ", nome do projeto: " + nomeProjeto;
	}
	
	

	public String getNomeProjeto() {
		return nomeProjeto;
	}


	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}


	public int toCompare (InformacoesLocal info) {
		return nomeProjeto.compareTo(info.getNomeProjeto());
	}

	public LocalDate getDiaDaAnalise() {
		return diaDaAnalise;
	}


	public void setDiaDaAnalise(LocalDate diaDaAnalise) {
		this.diaDaAnalise = diaDaAnalise;
	}


	public String getCoordenada() {
		return coordenada;
	}


	public void setCoordenada(String coordenada) {
		this.coordenada = coordenada;
	}


	public int getTemperaturaMedia() {
		return temperaturaMedia;
	}


	public void setTemperaturaMedia(int temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	@Override
	public int compareTo(InformacoesLocal o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}

