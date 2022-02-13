package fr.sorbonne.paris.nord.university.api.Factory;

import fr.sorbonne.paris.nord.university.api.dto.PlayerDTO;
import fr.sorbonne.paris.nord.university.api.dto.TeamDTO;
import fr.sorbonne.paris.nord.university.api.entity.Player;
import fr.sorbonne.paris.nord.university.api.entity.Team;
import org.springframework.stereotype.Service;

@Service
public class PlayerFactoryImp implements PlayerFactory{
    @Override
    public Player toPlayer(PlayerDTO dto) {
        final Player playerEntity = new Player();
        playerEntity.setId(dto.getId());
        playerEntity.setName(dto.getName());
        playerEntity.setPosition(dto.getPosition());
        playerEntity.setNumber(dto.getNumber());
        // playerEntity.setTeam(dto.getTeam());
        return playerEntity;
    }

    @Override
    public PlayerDTO toDTO(Player entity) {
        final PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setId(entity.getId());
        playerDTO.setName(entity.getName());
        playerDTO.setNumber(entity.getNumber());
       // playerDTO.setTeam(entity.getTeam());
        playerDTO.setPosition(entity.getPosition());
        return playerDTO;
    }
}
