package id;

import java.io.Serializable;

public class TrocaPneuID implements Serializable {

	private int codBorracharia;
	private int codPneu;
	private int codVeiculo;

	public TrocaPneuID() {
	}

	public TrocaPneuID(int codBorra, int codVei, int codPn) {
		this.codBorracharia = codBorra;
		this.codPneu = codPn;
		this.codVeiculo = codVei;
	}

	public int getCodBorracharia() {
		return codBorracharia;
	}

	public int getCodPneu() {
		return codPneu;
	}

	public int getCodVeiculo() {
		return codVeiculo;
	}

	public boolean equals(Object o) {
		return ((o instanceof TrocaPneuID)
				&& codBorracharia == (((TrocaPneuID) o).getCodBorracharia())
				&& codPneu == (((TrocaPneuID) o).getCodPneu()) && codVeiculo == (((TrocaPneuID) o)
					.getCodVeiculo()));
	}

	public int hashCode() {
		return codBorracharia + codPneu + codVeiculo;
	}
}
