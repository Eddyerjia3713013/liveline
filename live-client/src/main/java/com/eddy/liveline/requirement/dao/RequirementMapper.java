package com.eddy.liveline.requirement.dao;

import com.eddy.liveline.requirement.pojo.Requirement;

import java.util.List;

public interface RequirementMapper {


    boolean batchSave(List<Requirement> requirements);

    Requirement get(Integer id);

    List<Requirement> query();

    boolean batchUpdate(List<Requirement> requirements);

    boolean deleteById(Integer id);

    boolean deleteByIds(List<Integer> ids);
}