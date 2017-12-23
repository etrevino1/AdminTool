package mx.izzi.admintool.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.business.NodeBusiness;
import mx.izzi.admintool.dao.NodeDAO;
import mx.izzi.admintool.dto.MiradaNodeDTO;

public class NodeBusinessImpl implements NodeBusiness {

	private NodeDAO nodeDAO = null;
	

	@Override
	public List<MiradaNodeDTO> getNodes() {
		return nodeDAO.getNodes();
	}


	@Autowired
	public void setNodeDAO(NodeDAO nodeDAO) {
		this.nodeDAO = nodeDAO;
	}


}
