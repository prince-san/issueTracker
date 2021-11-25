package edu.employment.issueTracker.service;

import edu.employment.issueTracker.DTO.StatusDTO;

import java.util.List;

public interface StatusService {

    List<StatusDTO> getAllStatuses();
}
