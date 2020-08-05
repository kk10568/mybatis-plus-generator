package com.ddmc.solar.console.integration.qal;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author : liuhao
 * @date : 2020/7/11 17:35
 * @apiNote :员工同步消息处理
 */
public interface IEmployeeMessageChannel {

    /**
     * solar消息output队列 ADD
     */
    String SOLAR_EMPLOYEE_ADD_INFO = "outputSolarEmployeeAddInfo";

    /**
     * solar消息output队列 UPDATE
     */
    String SOLAR_EMPLOYEE_UPDATE_INFO = "outputSolarEmployeeUpdateInfo";

    /**
     * 发送solar ADD队列消息
     *
     * @return 发送通道
     */
    @Output(value = SOLAR_EMPLOYEE_ADD_INFO)
    MessageChannel outputSolarEmployeeAddInfo();


    /**
     * 发送solar UPDATE队列消息
     *
     * @return 发送通道
     */
    @Output(value = SOLAR_EMPLOYEE_UPDATE_INFO)
    MessageChannel outputSolarEmployeeUpdateInfo();

}
