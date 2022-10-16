package DesafioPoo;

public class Curso extends Conteudo{

	public Curso() {
		
	}
	
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return xp_Padrao * cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
		
		
		

}
