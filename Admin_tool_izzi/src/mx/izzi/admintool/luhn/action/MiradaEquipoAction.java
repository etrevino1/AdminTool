package mx.izzi.admintool.luhn.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import mx.izzi.admintool.luhn.business.MiradaEquipoBusiness;
import mx.izzi.admintool.luhn.dto.Equipment;

public class MiradaEquipoAction extends ActionSupport implements ServletRequestAware{

	static final long serialVersionUID = 1L;

	private MiradaEquipoBusiness miradaEquipoBusiness;
	private String equipo, ecm, equipoValido, equipoInicial, equipoFinal;
	private Integer cantidad;

	private List<Long> lista = null;
	private List<Equipment> equipmentList = null;

	private Logger log = Logger.getLogger(this.getClass()); 

	private HttpServletRequest request = null;

	public String execute (){
		if(request.isUserInRole("equipment")){
			lista = null;
			equipoValido = null;
			log.error(equipo + ", " + equipoInicial + " - " + equipoFinal);
			if(this.getEquipo() != null && this.getEquipo().length()==15){
				log.error("one multiple Action");
				log.error(equipo + " - " + ecm + " - " + cantidad);

				equipmentList = this.getMiradaEquipoBusiness().getEquipmentList("", "", equipo, cantidad);

				equipoValido = this.getMiradaEquipoBusiness().getFinalCAID(equipo);
				log.error(equipoValido);
			}
			if((this.getEquipoInicial() != null && this.getEquipoFinal() != null) && (this.getEquipoInicial().length() == 15 && this.getEquipoFinal().length() == 15)){
				log.error("multiple Action");
				lista  = this.getMiradaEquipoBusiness().getFinalCAIDs(equipoInicial, equipoFinal);
				log.error("Lista: " + lista.size());
			}
			return SUCCESS;
		}else{
			log.debug(request.getUserPrincipal().getName() + ": has no equipment access");
			return ERROR;
		}
	}

	public String getEquipoInicial() {
		return equipoInicial;
	}


	public void setEquipoInicial(String equipoInicial) {
		this.equipoInicial = equipoInicial;
	}


	public String getEquipoFinal() {
		return equipoFinal;
	}


	public void setEquipoFinal(String equipoFinal) {
		this.equipoFinal = equipoFinal;
	}

	public String getEquipoValido() {
		return equipoValido;
	}

	public void setEquipoValido(String equipoValido) {
		this.equipoValido = equipoValido;
	}

	public String getEquipo() {
		return equipo;
	}

	public List<Long> getLista() {
		return lista;
	}

	public void setLista(List<Long> lista) {
		this.lista = lista;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	public MiradaEquipoBusiness getMiradaEquipoBusiness() {
		return miradaEquipoBusiness;
	}

	public void setMiradaEquipoBusiness(MiradaEquipoBusiness miradaEquipoBusiness) {
		this.miradaEquipoBusiness = miradaEquipoBusiness;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getEcm() {
		return ecm;
	}

	public void setEcm(String ecm) {
		this.ecm = ecm;
	}

	public List<Equipment> getEquipmentList() {
		return equipmentList;
	}

	public void setEquipmentList(List<Equipment> equipmentList) {
		this.equipmentList = equipmentList;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
