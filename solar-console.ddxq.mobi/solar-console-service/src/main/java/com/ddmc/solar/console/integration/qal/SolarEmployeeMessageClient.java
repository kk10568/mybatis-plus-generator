package com.ddmc.solar.console.integration.qal;

import com.ddmc.solar.console.employee.EmployeeInfoSyncVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author : liuhao
 * @date : 2020/7/11 17:38
 * @apiNote : 员工队列消息发送
 */
@Slf4j
@EnableBinding(IEmployeeMessageChannel.class)
@Component
public class SolarEmployeeMessageClient {

    @Autowired
    private IEmployeeMessageChannel iEmployeeMessageChannel;

    /**
     * 新增员工-消息发送
     *
     * @param syncEmployee 员工信息
     */
    public void sendEmployeeAddMsg(EmployeeInfoSyncVo syncEmployee) {
        try {
            this.iEmployeeMessageChannel.outputSolarEmployeeAddInfo().send(MessageBuilder.withPayload(syncEmployee).build());
            log.info("send add employee message success. addEmployeeNo:{}", syncEmployee.getEmpNo());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("send add employee message failure. addEmployeeNo:{}", syncEmployee.getEmpNo());
        }
    }

    /**
     * 更新员工-消息发送
     *
     * @param syncEmployee 员工信息
     */
    public void sendEmployeeUpdateMsg(EmployeeInfoSyncVo syncEmployee) {
        try {
            this.iEmployeeMessageChannel.outputSolarEmployeeUpdateInfo().send(MessageBuilder.withPayload(syncEmployee).build());
            log.info("send update employee message success. updateEmployeeNo{}", syncEmployee.getEmpNo());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("send update employee message failure. updateEmployeeNo{}", syncEmployee.getEmpNo());
        }
    }

}
