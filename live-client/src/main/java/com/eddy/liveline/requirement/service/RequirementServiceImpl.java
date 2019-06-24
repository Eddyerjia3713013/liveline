package com.eddy.liveline.requirement.service;

import com.eddy.liveline.requirement.dao.RequirementMapper;
import com.eddy.liveline.requirement.pojo.Requirement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by eddy on 2019/6/23.
 */

@Service
@Transactional
public class RequirementServiceImpl implements RequirementService {

    @Resource
    private RequirementMapper requirementMapper;


    @Override
    public boolean batchSave(List<Requirement> requirements) {
        return requirementMapper.batchSave(requirements);
    }

    @Override
    public boolean deleteById(Integer id) {
        return requirementMapper.deleteById(id);
    }

    @Override
    public boolean deleteByIds(List<Integer> ids) {
        return requirementMapper.deleteByIds(ids);
    }

    @Override
    public Requirement get(Integer id) {
        return requirementMapper.get(id);
    }

    @Override
    public List<Requirement> query() {
        return requirementMapper.query();
    }

    @Override
    public boolean batchUpdate(List<Requirement> requirements) {
        return requirementMapper.batchUpdate(requirements);
    }
}
