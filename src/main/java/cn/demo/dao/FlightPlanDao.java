package cn.demo.dao;

import cn.demo.model.FlightPlan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HDPC on 2017/7/27.
 */
@Repository
public interface FlightPlanDao {
    /**
     * 查询全部飞行计划信息
     * @return
     */
    public List<FlightPlan> getAll();

    /**
     * 按条件查询飞行计划信息
     * @return
     */
    public List<FlightPlan> getFlightPlanByChoose();
    /**
     * 查询符合条件的飞行计划记录数
     * @return
     */
    public int getCountByChoose();
}
