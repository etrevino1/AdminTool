package mx.izzi.admintool.dto;

import java.io.Serializable;

public class MiradaNodeDTO implements Serializable{
	
	static final long serialVersionUID = 1L;
	
	private int id;
	private String node_description;
	private String node_code;
	
	public MiradaNodeDTO(int id, String node_description, String node_code){
		this.id = id;
		this.node_description = node_description;
		this.node_code = node_code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNode_description() {
		return node_description;
	}

	public void setNode_description(String node_description) {
		this.node_description = node_description;
	}

	public String getNode_code() {
		return node_code;
	}

	public void setNode_code(String node_code) {
		this.node_code = node_code;
	}

	@Override
	public String toString() {
		return "MiradaNodeDTO [id=" + id + ", node_description=" + node_description + ", node_code=" + node_code + "]";
	}

	
}
