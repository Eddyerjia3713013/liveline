package com.eddy.liveline.requirement.service;

import com.eddy.liveline.requirement.pojo.Requirement;

import java.util.List;

/**
 * Created by eddy on 2019/6/23.
 */
public interface RequirementService {

    public boolean batchSave(List<Requirement> requirements);

    public boolean deleteById(Integer id);

    public boolean deleteByIds(List<Integer> ids);

    public Requirement get(Integer id);

    public List<Requirement> query();

    public boolean batchUpdate(List<Requirement> requirements);


}
