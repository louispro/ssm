package com.louis.ssm.dao;

import com.louis.ssm.bean.Actor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorDao {

    /**
     * 查询所有演员
     * @return
     */
    List<Actor> getAllActors();

    /**
     * 通过id获取演员
     * @return
     */
    Actor getActorById(@Param("actorId")Integer actorId);
}
