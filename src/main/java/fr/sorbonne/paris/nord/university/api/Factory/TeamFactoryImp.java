package fr.sorbonne.paris.nord.university.api.Factory;

import fr.sorbonne.paris.nord.university.api.dto.TeamDTO;
import fr.sorbonne.paris.nord.university.api.entity.Team;
import org.springframework.stereotype.Service;

@Service
public class TeamFactoryImp implements TeamFactory{

    @Override
    public Team toTeam(TeamDTO dto) {
        final Team teamEntity = new Team();
        teamEntity.setId(dto.getId());
        teamEntity.setName(dto.getName());
        teamEntity.setSlogan(dto.getSlogan());
        return teamEntity;
    }

    @Override
    public TeamDTO toDTO(Team entity) {
        final TeamDTO teamDTO = new TeamDTO();
        teamDTO.setId(entity.getId());
        teamDTO.setName(entity.getName());
        teamDTO.setSlogan(entity.getSlogan());
        return teamDTO;
    }



}
