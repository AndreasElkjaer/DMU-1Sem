package semesterproeve;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Kamp {
	private String sted;
	private LocalDate dato;
	private LocalTime tid;
	private ArrayList<Deltagelse> deltagelser;

	public Kamp(String sted, LocalDate dato, LocalTime tid) {
		this.sted = sted;
		this.dato = dato;
		this.tid = tid;
	}

	public String getSted() {
		return sted;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}

	public LocalDate getDato() {
		return dato;
	}

	public void setDato(LocalDate dato) {
		this.dato = dato;
	}

	public LocalTime getTid() {
		return tid;
	}

	public void setTid(LocalTime tid) {
		this.tid = tid;
	}

	public ArrayList<Deltagelse> getDeltagelser() {
		return deltagelser;
	}

	public void setDeltagelser(Deltagelse d) {
		this.deltagelser.add(d);
	}

	public void removeDeltagelser(Deltagelse d) {
		this.deltagelser.remove(d);
	}

}
