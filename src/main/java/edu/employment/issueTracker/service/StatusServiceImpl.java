package edu.employment.issueTracker.service;

import edu.employment.issueTracker.DTO.StatusDTO;
import edu.employment.issueTracker.DTOMapper.DTOMapper;
import edu.employment.issueTracker.model.mapper.StatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatusServiceImpl implements StatusService{

    @Autowired
    StatusMapper statusMapper;

    @Autowired
    DTOMapper dtoMapper;

    @Override
    public List<StatusDTO> getAllStatuses() {
        return statusMapper
                .getAll()
                .stream()
                .map(status -> dtoMapper.statusToStatusDTO(status))
                .collect(Collectors.toList());
    }
}
