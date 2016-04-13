package entidades;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

	private ArrayList linha = null;
	private String colunas = null;

	public ModeloTabela(ArrayList linha, String colunas) {
		setLinha(linha);
		setColunas(colunas);
	}

	public ArrayList getLinha() {
		return linha;
	}

	public void setLinha(ArrayList linha) {
		this.linha = linha;
	}

	public String getColunas() {
		return colunas;
	}

	public void setColunas(String colunas) {
		this.colunas = colunas;
	}

	@Override
	public int getColumnCount() {
		return colunas.length();
	}

	@Override
	public int getRowCount() {
		return linha.size();
	}
	
	public String getColumnName(int numCol) {

		return colunas[numCol];

	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object[] linha = (Object[]) getLinha().get(rowIndex);

		return linha[columnIndex];
	}



}
