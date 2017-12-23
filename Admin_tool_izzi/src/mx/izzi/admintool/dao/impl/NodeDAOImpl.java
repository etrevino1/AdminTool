package mx.izzi.admintool.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import mx.izzi.admintool.dao.NodeDAO;
import mx.izzi.admintool.dao.sp.MiradaNodeSPR;
import mx.izzi.admintool.dto.MiradaNodeDTO;

public class NodeDAOImpl implements NodeDAO {

	private MiradaNodeSPR miradaNodeSPR = null;
	
	@Override
	public List<MiradaNodeDTO> getNodes() {
		Map<?, ?> data = miradaNodeSPR.execute();
		return (List<MiradaNodeDTO>)data.get("RESULT_LIST");
	}

	@Autowired
	public void setMiradaNodeSPR(MiradaNodeSPR miradaNodeSPR) {
		this.miradaNodeSPR = miradaNodeSPR;
	}

	
}
