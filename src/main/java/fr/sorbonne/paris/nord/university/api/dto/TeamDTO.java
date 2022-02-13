package fr.sorbonne.paris.nord.university.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import fr.sorbonne.paris.nord.university.api.entity.Player;
import lombok.Data;

import java.util.List;

@Data
	public class TeamDTO {
		
		private long id;
		private String name;
		private String slogan;


	    private List<PlayerDTO> palyers;
}


